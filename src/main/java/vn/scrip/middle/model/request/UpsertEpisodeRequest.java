package vn.scrip.middle.model.request;

import lombok.Data;

@Data
public class UpsertEpisodeRequest {

    private String title;       // Tên tập phim
    private String description; // Mô tả tập phim
    private String releaseDate; // Ngày phát sóng
    private Integer movieId;    // ID của bộ phim mà tập này thuộc về
    private Integer seasonNumber; // Số mùa (nếu có)
    private Integer episodeNumber; // Số tập trong mùa
    private String videoUrl;    // Link video (nếu có)
}




