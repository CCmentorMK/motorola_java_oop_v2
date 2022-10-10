package model;

import model.enums.Gender;
import model.enums.Role;

import java.time.LocalDateTime;

// model - class determines structure of data
public class User extends Person{
    protected static int lastInsertedId;
    private int userId;
    private String email;
    private String password;
    private Gender gender;
    private LocalDateTime registrationDateTime;
    private Permission permission;

    public User(String email, String password, Gender gender) {
        super();
        this.userId = ++lastInsertedId;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.registrationDateTime = LocalDateTime.now();
        this.permission = new Permission(Role.ROLE_USER, "000");
    }

    @Override
    public void repr() {

    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", registrationDateTime=" + registrationDateTime +
                '}';
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }
}
