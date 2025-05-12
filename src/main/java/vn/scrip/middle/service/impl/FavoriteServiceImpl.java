package vn.scrip.middle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.scrip.middle.entity.Favorite;
import vn.scrip.middle.model.dto.FavoriteDTO;
import vn.scrip.middle.model.request.AddFavoriteRequest;
import vn.scrip.middle.repository.FavoriteRepository;
import vn.scrip.middle.repository.MovieRepository;
import vn.scrip.middle.service.FavoriteService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<FavoriteDTO> getFavoritesByUserId(Integer userId) {
        // Lấy danh sách các movie đã được yêu thích của userId
        List<Favorite> favorites = favoriteRepository.findByUserId(userId);

        // Chuyển đổi từ Favorite entity thành FavoriteDTO
        return favorites.stream().map(this::convertToFavoriteDTO).collect(Collectors.toList());
    }

    @Override
    public void addFavorite(AddFavoriteRequest addFavoriteRequest) {
        // Logic thêm yêu thích
        // ...
    }

    @Override
    public void removeFavorite(Integer userId, Integer movieId) {
        // Logic xoá yêu thích
        // ...
    }

    private FavoriteDTO convertToFavoriteDTO(Favorite favorite) {
        // Chuyển từ Favorite entity thành FavoriteDTO
        FavoriteDTO favoriteDTO = new FavoriteDTO();
        favoriteDTO.setMovieId(favorite.getMovieId());
        favoriteDTO.setUserId(favorite.getUserId());
        // Set thêm các trường khác nếu cần
        return favoriteDTO;
    }
}
