package vn.scrip.middle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.scrip.middle.entity.Favorite;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {
    List<Favorite> findByUserId(Integer userId);
}
