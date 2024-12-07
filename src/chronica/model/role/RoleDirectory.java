/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.role;

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

    public int getTotalVendor() {
        int count = 0;
        for (Role r : role) {
            if (r.getName().equalsIgnoreCase("customer") || r.getName().equalsIgnoreCase("attendee") || r.getName().equalsIgnoreCase("admin")) {

            } else {
                count = count + 1;

            }
        }
        return count;
    }

    public ArrayList<Role> getVendorRoles() {
        ArrayList<Role> vendorRoleList = new ArrayList();
        for (Role r : role) {
            if (r.getName().equalsIgnoreCase("customer") || r.getName().equalsIgnoreCase("attendee") || r.getName().equalsIgnoreCase("admin")) {

            } else {
                vendorRoleList.add(r);

            }
        }
        return vendorRoleList;

    }

    @Override
    public String toString() {
        return "RoleDirectory{" + "role=" + role + '}';
    }

}
