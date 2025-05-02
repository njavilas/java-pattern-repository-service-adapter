package service;

import java.util.List;
import java.util.Optional;

import model.User;
import repository.UserRepository;

public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repo) {

        this.repository = repo;
    }
    
    public void create(User user) {
        this.repository.save(user);
    }

    public Optional<User> getByEmail(String email) {

        return this.repository.findByEmail(email);
    }

    public List<User> findAll() {

        return this.repository.findAll();
    }

    public boolean deleteByEmail(String email) {

        Optional<User> instance = this.repository.findByEmail(email);

        if (instance.isPresent()) {
            this.repository.deleteByEmail(email);

            return true;
        }

        return false;
    }
}
