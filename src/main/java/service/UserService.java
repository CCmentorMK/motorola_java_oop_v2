package service;

import model.User;
import repository.UserRepository;

public interface UserService  {
    /**
     * Method adds user to the list of users
     * @param user
     * @author Michal
     */
    public abstract void addUser(User user);        // metoda abstrakcyjna

    /**
     * Method prints current version of users list
     */
    void getUsers();

    /**
     * Method finds and returns user from the list of users based on userId
     * @return
     */
    User getUserById(int userId);

    // metody statyczne mogą odwoływać się tylko do składowych statycznych
    public static void callMe(){
        System.out.println("I'm called!");
        System.out.println(UserRepository.USERS);
    }
}
