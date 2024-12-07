package chronica.model.task;

import chronica.model.role.Role;
import chronica.model.user.User;


public class Task {

    private int taskId;
    private String description;
    private boolean status;
    private double cost;
    private static int count = 0; // Use static to ensure task IDs are unique across all Task instances
    private Role role;
    private User assignedby;
    private User assignedto;// New field to track the user responsible for the task

    public Task(String description, Role role, double cost, User assignedUser) {
        this.taskId = ++count;
        this.description = description;
        this.status = false;
        this.cost = cost;
        this.role = role;
        this.assignedby = assignedUser;
        this.assignedto = null;
    }

    public Role getRole() {
        return role;
    }

    public User getAssignedto() {
        return assignedto;
    }

    public void setAssignedto(User assignedto) {
        this.assignedto = assignedto;
    }
    
    

    public void setRole(Role role) {
        this.role = role;
    }

    public User getAssignedby() {
        return assignedby;
    }

    public void setAssignedby(User assignedby) {
        this.assignedby = assignedby;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
