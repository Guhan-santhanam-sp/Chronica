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
import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

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
            String suppliers = prop.getProperty("Enterprise");

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

    public void readAdmin(UserDirectory userDirectory, Role adminRole) throws FileNotFoundException, IOException, DecoderException {

        FileInputStream configFileReader = new FileInputStream(file);
        prop.load(configFileReader);
        String userName = prop.getProperty("usernameAdmin");
        String passkey = prop.getProperty("passwordAdmin").trim();
        byte[] passwordBytes = Hex.decodeHex(passkey);
        String decodedPassword = new String(passwordBytes);
        String email = prop.getProperty("emailAdmin");
        userDirectory.newUser(userName, decodedPassword, email, adminRole);

    }

    public void createDummy(UserDirectory userDirectory, RoleDirectory roleDirectory, EventDirectory eventDirectory) {

        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 1; i <= 5; i++) {

            String userName = faker.name().username();
            String pwd = "pwd";
            String email = userName + "@" + "northeastern.dup";
            String desc = faker.commerce().productName();
            String eventName = faker.options().option("Conference", "Expo", "Summit", "Workshop", "Festival");;
            Role customerRole = null;
            int budget = faker.number().numberBetween(1000, 10000);

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
            Date date = faker.date().future(365, java.util.concurrent.TimeUnit.DAYS);

            Event dummyEvent = eventDirectory.newEvent(eventName, date, faker.address().city(), budget, faker.number().numberBetween(10, 50) * 10, dummyUser, faker.number().numberBetween(10, 50) * 10); //String eventName, String eventDate, String eventLocation, double budget, int attendees, User currentUser, double ticketPrice
            dummyEvent.setTaskDirectory(td);

        }

    }

}
