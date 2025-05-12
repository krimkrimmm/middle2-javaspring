package vn.scrip.middle.model.dto;

public class FavoriteDTO {
    private Integer userId;
    private Integer movieId;

    // Constructor, Getters, Setters
    public FavoriteDTO(Integer userId, Integer movieId) {
        this.userId = userId;
        this.movieId = movieId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
