/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.business;

import chronica.model.event.EventDirectory;
import chronica.model.role.RoleDirectory;
import chronica.model.user.UserDirectory;

/**
 *
 * @author Gooqe
 */
public class Business {

    String name;
    RoleDirectory roleDirectory;
    UserDirectory userDirectory;
    EventDirectory eventDirectory;

    public Business(String businessName) {
        this.name = businessName;
        this.roleDirectory = new RoleDirectory();
        this.userDirectory = new UserDirectory();
        this.eventDirectory = new EventDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleDirectory getRoleDirectory() {
        return roleDirectory;
    }

    public void setRoleDirectory(RoleDirectory roleDirectory) {
        this.roleDirectory = roleDirectory;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public EventDirectory getEventDirectory() {
        return eventDirectory;
    }

    public void setEventDirectory(EventDirectory eventDirectory) {
        this.eventDirectory = eventDirectory;
    }
    
    

}
