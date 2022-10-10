package service;

import model.User;
import repository.UserRepository;

// service - class delivers business logic
public class UserServiceImpl implements UserService{
    @Override
    public void addUser(User user) {
        UserRepository.USERS.add(user);
    }
    @Override
    public void getUsers() {
        for (User user : UserRepository.USERS) {
            System.out.println(user);
        }
    }
    @Override
    public User getUserById(int userId) {
        for (User user : UserRepository.USERS) {
            if(user.getUserId() == userId){
                return user;
            }
        }
        return null;
    }
}
