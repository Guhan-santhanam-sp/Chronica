/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.business.role;

import java.util.ArrayList;

/**
 *
 * @author Gooqe
 */
public class RoleDirectory {

    ArrayList<Role> role;

    public RoleDirectory() {
        role = new ArrayList();
    }

    public Role newRole(String n) {
        Role r = new Role(n);
        role.add(r);
        return r;

    }

    public Role findRole(String rolename) {
        for (Role r : getRolelist()) {
            if (r.getName().equalsIgnoreCase(rolename)) {
                return r;
            }
        }
        return null;
    }

    public ArrayList<Role> getRolelist() {
        return role;
    }

    @Override
    public String toString() {
        return "RoleDirectory{" + "role=" + role + '}';
    }

}
