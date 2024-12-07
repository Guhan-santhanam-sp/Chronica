/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.role;

/**
 *
 * @author Gooqe
 */
public class Role {

    private String name;

    public Role(String name) {

        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Role{" + "name=" + name + '}';
    }
    
    
}
