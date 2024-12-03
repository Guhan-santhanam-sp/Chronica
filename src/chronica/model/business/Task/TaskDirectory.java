package chronica.model.business.Task;

import chronica.model.business.role.Role;
import chronica.model.business.User.User;
import java.util.ArrayList;

public class TaskDirectory {

    private ArrayList<Task> tasks;

    public TaskDirectory() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Add a new task to the directory.
     *
     * @param description Description of the task.
     * @param role Role responsible for the task.
     * @param cost Cost of the task.
     * @param user User assigned to the task.
     * @return The newly created task.
     */
    public Task addTask(String description, Role role, double cost, User user) {
        Task newTask = new Task(description, role, cost, user);
        tasks.add(newTask);
        return newTask;
    }

    /**
     * Remove a task by ID.
     *
     * @param taskId ID of the task to remove.
     * @return True if the task was removed, false otherwise.
     */
    public boolean removeTask(int taskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                tasks.remove(task);
                return true;
            }
        }
        return false;
    }

    /**
     * Edit a task by ID.
     *
     * @param taskId ID of the task to edit.
     * @param newDescription New description for the task.
     * @param newRole New role for the task.
     * @param newCost New cost for the task.
     * @param newUser New user assigned to the task.
     * @return True if the task was edited, false otherwise.
     */
    public boolean editTask(int taskId, String newDescription, Role newRole, double newCost, User newUser) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                task.setDescription(newDescription);
                task.setRole(newRole);
                task.setCost(newCost);
                task.setAssignedUser(newUser);
                return true;
            }
        }
        return false;
    }

    /**
     * Retrieve a task by ID.
     *
     * @param taskId ID of the task to retrieve.
     * @return The task if found, null otherwise.
     */
    public Task getTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                return task;
            }
        }
        return null;
    }

    /**
     * Retrieve all tasks assigned to a specific role.
     *
     * @param role Role responsible for the tasks.
     * @return A list of tasks for the given role.
     */
    public ArrayList<Task> getTasksByRole(Role role) {
        ArrayList<Task> roleTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getRole().equals(role)) {
                roleTasks.add(task);
            }
        }
        return roleTasks;
    }

    /**
     * Retrieve all tasks assigned to a specific user.
     *
     * @param user User responsible for the tasks.
     * @return A list of tasks for the given user.
     */
    public ArrayList<Task> getTasksByUser(User user) {
        ArrayList<Task> userTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getAssignedUser().equals(user)) {
                userTasks.add(task);
            }
        }
        return userTasks;
    }

    /**
     * Retrieve all tasks.
     *
     * @return A list of all tasks.
     */
    public ArrayList<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskDirectory{" + "tasks=" + tasks + '}';
    }
}