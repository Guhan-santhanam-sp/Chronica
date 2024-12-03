/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arvindranganathraghuraman
 */
public class LogisticsDirectory {
    private List<LogisticsManagement> logisticsList;

    // Constructor
    public LogisticsDirectory() {
        this.logisticsList = new ArrayList<>();
    }

    // Add a logistics task
    public void addLogisticsTask(LogisticsManagement logistics) {
        this.logisticsList.add(logistics);
    }

    // Remove a logistics task by ID
    public boolean removeLogisticsTask(String logisticsId) {
        return logisticsList.removeIf(task -> task.getLogisticsId().equals(logisticsId));
    }

    // Get a specific logistics task by ID
    public LogisticsManagement getLogisticsTaskById(String logisticsId) {
        for (LogisticsManagement task : logisticsList) {
            if (task.getLogisticsId().equals(logisticsId)) {
                return task;
            }
        }
        return null; // Return null if not found
    }

    // Get all logistics tasks
    public List<LogisticsManagement> getAllLogisticsTasks() {
        return logisticsList;
    }

    // Get logistics tasks by status
    public List<LogisticsManagement> getLogisticsTasksByStatus(String status) {
        List<LogisticsManagement> filteredTasks = new ArrayList<>();
        for (LogisticsManagement task : logisticsList) {
            if (task.getStatus().equalsIgnoreCase(status)) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    // Get logistics tasks by priority
    public List<LogisticsManagement> getLogisticsTasksByPriority(int priority) {
        List<LogisticsManagement> filteredTasks = new ArrayList<>();
        for (LogisticsManagement task : logisticsList) {
            if (task.getPriority() == priority) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    // Update logistics task status
    public boolean updateTaskStatus(String logisticsId, String newStatus) {
        LogisticsManagement task = getLogisticsTaskById(logisticsId);
        if (task != null) {
            task.setStatus(newStatus);
            return true;
        }
        return false;
    }

    // Get fragile items
    public List<LogisticsManagement> getFragileItems() {
        List<LogisticsManagement> fragileTasks = new ArrayList<>();
        for (LogisticsManagement task : logisticsList) {
            if (task.isFragile()) {
                fragileTasks.add(task);
            }
        }
        return fragileTasks;
    }
}
    

