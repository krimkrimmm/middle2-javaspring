package vn.scrip.middle.service;

import vn.scrip.middle.model.dto.FavoriteDTO;
import vn.scrip.middle.model.request.AddFavoriteRequest;

import java.util.List;

public interface FavoriteService {
    List<FavoriteDTO> getFavoritesByUserId(Integer userId);
    void addFavorite(AddFavoriteRequest addFavoriteRequest);
    void removeFavorite(Integer userId, Integer movieId);
}
