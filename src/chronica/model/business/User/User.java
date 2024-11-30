/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.business.User;

/**
 *
 * @author Gooqe
 */
import chronica.model.business.role.Role;

public class User {

    private int userId;
    private String username;
    private String email;
    private String password;
    private Role role;
    private int count = 0;
    
    

    public User(String username, String pwd, String email, Role role) {
        count++;
        this.userId = count;
        this.username = username;
        this.password = pwd;
        this.email = email;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", username=" + username + ", email=" + email + ", password=" + password + ", role=" + role + ", count=" + count + '}';
    }

}
