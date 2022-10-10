package repository;

import model.User;
import model.enums.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface UserRepository {
    /**
     * List of objects of the User class
     */
    public static final List<User> USERS = new ArrayList<>(Arrays.asList(
        new User("Adam","Kowalski", Gender.MAN),
        new User("Jan","Nowak", Gender.MAN),
        new User("Krzysztof","Kot", Gender.MAN),
        new User("Anna","Niebieska", Gender.WOMAN),
        new User("Agata","Mała", Gender.WOMAN)
    ));
}
