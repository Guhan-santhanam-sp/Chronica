package chronica.model.business;

public class Task {

    private String taskId;
    private String description;
    private String status;
    private double cost;

    public Task(String taskId, String description, double cost) {
        this.taskId = taskId;
        this.description = description;
        this.status = "Pending";
        this.cost = cost;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
