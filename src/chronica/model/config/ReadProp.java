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
import chronica.model.business.User.UserDirectory;
import chronica.model.business.role.Role;
import chronica.model.business.role.RoleDirectory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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

    public void readprop(RoleDirectory roleDirectory, UserDirectory userDirectory) {

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

}
