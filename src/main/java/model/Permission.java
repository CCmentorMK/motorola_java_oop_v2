package model;

import model.enums.Role;

public class Permission {
    private Role role;
    private String permission;

    public Permission(Role role, String permission) {
        this.role = role;
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "role=" + role +
                ", permission='" + permission + '\'' +
                '}';
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
