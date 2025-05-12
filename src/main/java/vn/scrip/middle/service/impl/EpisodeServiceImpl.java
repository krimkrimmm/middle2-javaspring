package vn.scrip.middle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import vn.scrip.middle.entity.Episode;
import vn.scrip.middle.model.request.UpsertEpisodeRequest;
import vn.scrip.middle.repository.EpisodeRepository;
import vn.scrip.middle.service.EpisodeService;

@Service
public class EpisodeServiceImpl implements EpisodeService {

    @Autowired
    private EpisodeRepository episodeRepository;

    @Override
    public Page<Episode> getAllEpisodes(int page, int pageSize) {
        return episodeRepository.findAll(PageRequest.of(page - 1, pageSize));
    }

    @Override
    public Episode createEpisode(UpsertEpisodeRequest request) {
        Episode episode = new Episode();
        // Thiết lập các thuộc tính cho episode từ request
        return episodeRepository.save(episode);
    }

    @Override
    public Episode updateEpisode(Integer id, UpsertEpisodeRequest request) {
        Episode episode = episodeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Episode not found"));
        // Cập nhật episode với dữ liệu từ request
        return episodeRepository.save(episode);
    }

    @Override
    public void deleteEpisode(Integer id) {
        episodeRepository.deleteById(id);
    }
}
