package repository;

import java.util.List;
import java.util.Optional;

import model.User;

public interface UserRepository {
    void save(User user);
    Optional<User> findByEmail(String email);
    List<User> findAll();
    void deleteByEmail(String email);
}
