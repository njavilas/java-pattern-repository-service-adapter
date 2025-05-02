package adapter;

import java.util.List;

import model.User;
import service.UserService;

public class UserAdapter {
    private final UserService service;

    public UserAdapter(UserService service) {
        this.service = service;
    }

    public void createUser(User user) {
        this.service.create(user);
    }

    public List<User> findAllUsers() {

        return this.service.findAll();
    }

    public boolean deleteUserByEmail(String email) {

        return this.service.deleteByEmail(email);
    }
}
