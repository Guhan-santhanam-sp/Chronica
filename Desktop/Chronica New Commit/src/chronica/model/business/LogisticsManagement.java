/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.business;

import chronica.model.business.role.Role;
import java.util.Date;

/**
 *
 * @author arvindranganathraghuraman
 */
class LogisticsManagement {
    private String logisticsId; // Unique identifier for the logistics task
    private String description; // Description of the logistics task
     // End date or expected delivery date
     // Driver responsible for the task
    private double cost; // Cost of the logistics operation
    private String status; // Status of the task (e.g., "Pending", "In Progress", "Completed")
    private int priority;
    Role role;// Priority level (e.g., 1 = High, 2 = Medium, 3 = Low)
     // Number of items in the shipment
     // Total weight of the shipment
    private boolean isFragile; // Indicates if the shipment includes fragile items
     // Name of the client for whom the logistics is arranged

    // Constructor
    public LogisticsManagement(String logisticsId,String description,String assignedVehicle,String assignedDriver,double cost,
            String status,int priority, Role role,boolean isFragile) {
        this.logisticsId = logisticsId;
        this.description = description;
        
        
        this.cost = cost;
        this.status = status;
        this.priority = priority;
        
        
        this.isFragile = isFragile;
        
    }

    // Getters and Setters
    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    

    

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    

    public boolean isFragile() {
        return isFragile;
    }

    public void setFragile(boolean isFragile) {
        this.isFragile = isFragile;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isIsFragile() {
        return isFragile;
    }

    public void setIsFragile(boolean isFragile) {
        this.isFragile = isFragile;
    }
    

    
}


