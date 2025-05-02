package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import model.User;

public class InMemoryUserRepository implements UserRepository {
    private final HashMap<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getEmail(), user);
    }

    @Override
    public Optional<User> findByEmail(String email) {

        if (users.containsKey(email)) {
            return Optional.ofNullable(users.get(email));
        }

        return null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values()); // defensive copy
    }

    @Override
    public void deleteByEmail(String email) {
        users.remove(email);
    }

}
