package vn.scrip.middle.service;

import org.springframework.data.domain.Page;
import vn.scrip.middle.entity.Episode;
import vn.scrip.middle.model.request.UpsertEpisodeRequest;

public interface EpisodeService {

    Page<Episode> getAllEpisodes(int page, int pageSize);

    Episode createEpisode(UpsertEpisodeRequest request);

    Episode updateEpisode(Integer id, UpsertEpisodeRequest request);

    void deleteEpisode(Integer id);
}
