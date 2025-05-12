package vn.scrip.middle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.scrip.middle.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    // Thêm phương thức findByEmail
    Optional<User> findByEmail(String email);
}







