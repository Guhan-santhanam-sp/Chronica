/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.business.User;

import chronica.model.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Gooqe
 */
public class UserDirectory {

    ArrayList<User> user;

    public UserDirectory() {
        user = new ArrayList();
    }

    public User newUser(String username, String pwd, String email, Role role) {
        User newuser = new User(username, pwd, email, role);
        user.add(newuser);
        return newuser;

    }

    public User findUser(String id) {

        for (User u : user) {

            if (u.getUsername().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public User findUserEmail(String id) {

        for (User u : user) {

            if (u.getEmail().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public int getTotalCustomers() {
        int count = 0;
        for (User u : user) {
            if (u.getRole().getName().equalsIgnoreCase("customer")) {
                count = count + 1;

            }
        }
        return count;

    }

    public int getTotalVendors() {
        int count = 0;
        for (User u : user) {
            if (u.getRole().getName().equalsIgnoreCase("customer")) {
                count = count + 1;

            }
        }
        return count;

    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserDirectory{" + "user=" + user + '}';
    }

}
