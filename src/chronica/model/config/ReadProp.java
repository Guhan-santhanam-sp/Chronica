/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.config;

/**
 *
 * @author Gooqe
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import chronica.model.event.Event;
import chronica.model.event.EventDirectory;
import chronica.model.role.Role;
import chronica.model.role.RoleDirectory;
import chronica.model.task.TaskDirectory;
import chronica.model.user.User;
import chronica.model.user.UserDirectory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

/**
 *
 * @author Gooqe
 */
public class ReadProp {

    public ReadProp() {

    }

    String path = System.getProperty("user.dir") + "/src/chronica/config/config.properties";
    File file = new File(path);

    Properties prop = new Properties();

    public void readprop(RoleDirectory roleDirectory) {

        try {

            FileInputStream configFileReader = new FileInputStream(file);
            prop.load(configFileReader);

            String[] rolesArray = null;
            String suppliers = prop.getProperty("roles");

            if (suppliers != null) {
                rolesArray = suppliers.split(",");
                for (String roleName : rolesArray) {
                    roleDirectory.newRole(roleName);
                }

            } else {
                System.out.println("No Roles property found.");
            }

        } catch (IOException e) {

        }
    }

    public void readAdmin(UserDirectory userDirectory, Role adminRole) throws FileNotFoundException, IOException {

        FileInputStream configFileReader = new FileInputStream(file);
        prop.load(configFileReader);
        String userName = prop.getProperty("usernameAdmin");
        String password = prop.getProperty("passwordAdmin");
        String email = prop.getProperty("emailAdmin");
        userDirectory.newUser(userName, password, email, adminRole);

    }

    public void createDummy(UserDirectory userDirectory, RoleDirectory roleDirectory, EventDirectory eventDirectory) {

        Random random = new Random();
        for (int i = 1; i <= 5; i++) {

            String userName = "customer" + i;
            String pwd = "pwd" + i;
            String email = "customer@" + i;
            String desc = "dummyDesc - " + userName;
            String eventName = "Event - " + i + " - " + userName;
            Role customerRole = null;
            int budget = 50000;

            for (Role r : roleDirectory.getRolelist()) {
                if (r.getName().equalsIgnoreCase("customer")) {
                    customerRole = r;
                }
            }
            User dummyUser = userDirectory.newUser(userName, pwd, email, customerRole);
            TaskDirectory td = new TaskDirectory();
            int roleLength = roleDirectory.getVendorRoles().size();
            int randomInt = random.nextInt(roleLength);
            Role randRole = roleDirectory.getVendorRoles().get(randomInt);
            td.addTask(desc, randRole, 5000, dummyUser);

            Event dummyEvent = eventDirectory.newEvent(eventName, "12/07/2024", "Boston", budget, 500, dummyUser, 100); //String eventName, String eventDate, String eventLocation, double budget, int attendees, User currentUser, double ticketPrice
            dummyEvent.setTaskDirectory(td);

        }

    }

}
