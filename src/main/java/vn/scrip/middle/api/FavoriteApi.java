package vn.scrip.middle.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.scrip.middle.model.dto.FavoriteDTO;
import vn.scrip.middle.model.request.AddFavoriteRequest;
import vn.scrip.middle.service.FavoriteService;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteApi {

    @Autowired
    private FavoriteService favoriteService;

    @GetMapping("/user/{userId}")
    public List<FavoriteDTO> getFavoritesByUserId(@PathVariable Integer userId) {
        return favoriteService.getFavoritesByUserId(userId);
    }

    @PostMapping("/add")
    public void addFavorite(@RequestBody AddFavoriteRequest addFavoriteRequest) {
        favoriteService.addFavorite(addFavoriteRequest);
    }

    @DeleteMapping("/remove/{userId}/{movieId}")
    public void removeFavorite(@PathVariable Integer userId, @PathVariable Integer movieId) {
        favoriteService.removeFavorite(userId, movieId);
    }
}
