package model;

import model.enums.Gender;
import model.enums.Role;

public class UserWithRole extends User {

    private Role role;

    public UserWithRole(String email, String password, Gender gender) {
        super(email, password, gender); // wywołuje konstruktor klasy nadrzędnej - zawsze musi być w pierwszej lini kodu
        this.role = Role.ROLE_USER;
    }
    @Override
    public String getPassword(){
        return "#hashed password!";
    }
    @Override
    public String toString() {
        String num = "20";
        return String.format("%3d %"+num+"s %20s %20s %20s %20s %20s %d",
                super.getUserId(),                  // gdy odołujemy się do składowej klasy nadrzędnej
                super.getEmail(),
                super.getPassword(),
                this.getPassword(),
                super.getGender(),
                super.getRegistrationDateTime(),
                this.getRole(),                      // gdy odowołujemy się do skłądowej aktualnej klasy
                this.lastInsertedId
        ) ;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
