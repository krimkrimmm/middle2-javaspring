package vn.scrip.middle.controller.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.scrip.middle.entity.Episode;
import vn.scrip.middle.model.request.UpsertEpisodeRequest;
import vn.scrip.middle.service.EpisodeService;

@RestController
@RequestMapping("/api/admin/episodes")
@RequiredArgsConstructor
public class AdminEpisodeController {

    private final EpisodeService episodeService;

    // Lấy tất cả các episode với phân trang
    @GetMapping
    public Page<Episode> getAllEpisodes(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int pageSize
    ) {
        return episodeService.getAllEpisodes(page, pageSize);
    }

    // Tạo mới một episode
    @PostMapping
    public ResponseEntity<Episode> createEpisode(@RequestBody UpsertEpisodeRequest request) {
        return ResponseEntity.ok(episodeService.createEpisode(request));
    }

    // Cập nhật một episode
    @PutMapping("/{id}")
    public ResponseEntity<Episode> updateEpisode(
            @PathVariable Integer id,
            @RequestBody UpsertEpisodeRequest request
    ) {
        return ResponseEntity.ok(episodeService.updateEpisode(id, request));
    }

    // Xóa một episode
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEpisode(@PathVariable Integer id) {
        episodeService.deleteEpisode(id);
        return ResponseEntity.ok().build();
    }
}
