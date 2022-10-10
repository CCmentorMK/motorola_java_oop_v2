import model.User;
import model.UserWithRole;
import model.enums.Gender;
import repository.UserRepository;
import service.UserService;
import service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // nie można utworzyć obiektu interfejsu!!!
//    UserRepository userRepository = new UserRepository();
        // polimorfizm
        UserService userService = new UserServiceImpl();
        System.out.println(userService.getClass().getName());
        // metody statyczne w interfejsie
//        UserService.callMe();

        userService.getUsers();
        System.out.println(userService.getUserById(3));
        System.out.println(userService.getUserById(30));
        userService.addUser(new User("Michał", "Kruczkowski", Gender.MAN));
        userService.getUsers();

        User user = new UserWithRole("anna@anna.pl", "moje hasło", Gender.WOMAN);
        System.out.println(user);
        UserWithRole userWithRole = new UserWithRole("x","x", Gender.WOMAN);

    }
}
