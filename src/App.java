import java.util.List;

import adapter.UserAdapter;
import model.User;
import repository.InMemoryUserRepository;
import repository.UserRepository;
import service.UserService;

public class App {
    public static void main(String[] args) throws Exception {

        UserRepository repository = new InMemoryUserRepository();

        UserService service = new UserService(repository);

        UserAdapter adapter = new UserAdapter(service);

        adapter.createUser(new User("Javier", "Avila", 30, "njavilas.dev@gmail.com"));
        adapter.createUser(new User("Gabriel", "Avila", 30, "gnavilas@gmail.com"));

        adapter.deleteUserByEmail("njavilas.dev@gmail.com");

        List<User> users = adapter.findAllUsers();

        for (User user : users) {
            System.out.println(user.getEmail() + " " + user.getFullName());
        }
    }
}
