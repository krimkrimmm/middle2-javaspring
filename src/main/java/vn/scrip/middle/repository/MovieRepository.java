package vn.scrip.middle.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.scrip.middle.entity.Movie;
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}