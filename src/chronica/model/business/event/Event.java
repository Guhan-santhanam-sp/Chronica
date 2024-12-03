package chronica.model.business.event;

import chronica.model.business.Task.TaskDirectory;
import chronica.model.business.Task.Task;
import chronica.model.business.User.User;
import chronica.model.business.role.Role;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Event {

    private int eventId;
    private String name;
    private String date;
    private String location;
    private TaskDirectory taskDirectory; // Connect Event with TaskDirectory
    private int totalattendees;
    private double budget;
    private User createdBy;
    private double ticketPrice;
    private int availableTicket;
    private List<User> registeredUsers; // List to hold users registered for the event
    private Map<User, Map<String, String>> feedback; // Feedback system: User -> Role -> Feedback

    private static int count = 0;

    public Event(String name, String date, String location, double budget, int totalattendees, User createdBy, double ticketPrice) {
        count++;
        this.eventId = count;
        this.name = name;
        this.date = date;
        this.location = location;
        this.budget = budget;
        this.taskDirectory = new TaskDirectory(); // Initialize TaskDirectory
        this.totalattendees = totalattendees;
        this.createdBy = createdBy;
        this.ticketPrice = ticketPrice;
        this.availableTicket = totalattendees; // Initialize available tickets
        this.registeredUsers = new ArrayList<>(); // Initialize registered users list
        this.feedback = new HashMap<>(); // Initialize feedback map
    }

    // Getter for ticket price
    public double getTicketPrice() {
        return ticketPrice;
    }

    // Setter for ticket price
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    // Getter for registered users
    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    // Method to register a user
    public void registerUser(User user) {
        if (registeredUsers.size() < totalattendees) {
            registeredUsers.add(user);
            availableTicket = availableTicket - 1;
            setAvailableTicket(availableTicket);
        } else {
            System.out.println("Registration full for this event!");
        }
    }

    // Getter for available tickets
    public int getAvailableTicket() {
        return availableTicket;
    }

    // Setter for available tickets
    public void setAvailableTicket(int availableTicket) {
        this.availableTicket = availableTicket;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter for event ID
    public int getEventId() {
        return eventId;
    }

    // Setter for event ID
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    // Getter for creator
    public User getCreatedBy() {
        return createdBy;
    }

    // Getter for event name
    public String getName() {
        return name;
    }

    // Setter for event name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for task directory
    public TaskDirectory getTaskDirectory() {
        return taskDirectory;
    }

    // Getter for total attendees
    public int getTotalattendees() {
        return totalattendees;
    }

    // Setter for total attendees
    public void setTotalattendees(int totalattendees) {
        this.totalattendees = totalattendees;
    }

    // Getter for budget
    public double getBudget() {
        return budget;
    }

    // Setter for budget
    public void setBudget(double budget) {
        this.budget = budget;
    }

    /**
     * Get all roles involved in the event based on tasks.
     *
     * @return List of roles involved in the event.
     */
    public List<Role> getRolesInEvent() {
        List<Role> roles = new ArrayList<>();
        for (Task task : taskDirectory.getAllTasks()) {
            Role role = task.getRole();
            if (!roles.contains(role)) {
                roles.add(role);
            }
        }
        return roles;
    }

    /**
     * Provide feedback for a specific role in the event.
     *
     * @param attendee The attendee providing the feedback.
     * @param role The role being reviewed.
     * @param feedbackText The feedback text.
     * @return True if feedback is added successfully, false otherwise.
     */
    public boolean giveFeedback(User attendee, String role, String feedbackText) {
        // Ensure the attendee is registered
        if (!registeredUsers.contains(attendee)) {
            System.out.println("Error: Attendee is not registered for this event.");
            return false;
        }

        // Ensure the role exists in the event
        if (!getRolesInEvent().contains(role)) {
            System.out.println("Error: The role '" + role + "' is not involved in this event.");
            return false;
        }

        // Feedback map: If attendee doesn't exist in feedback yet, add them
        feedback.putIfAbsent(attendee, new HashMap<>());

        // Add feedback for the role
        feedback.get(attendee).put(role, feedbackText);
        return true;
    }

    /**
     * Retrieve feedback given by a specific attendee.
     *
     * @param attendee The attendee whose feedback is to be retrieved.
     * @return Feedback map for the attendee.
     */
    public Map<String, String> getFeedbackByAttendee(User attendee) {
        return feedback.getOrDefault(attendee, new HashMap<>());
    }

    /**
     * Retrieve all feedback for a specific role.
     *
     * @param role The role whose feedback is to be retrieved.
     * @return A map of attendees and their feedback for the role.
     */
    public Map<User, String> getFeedbackForRole(String role) {
        Map<User, String> roleFeedback = new HashMap<>();
        for (User attendee : feedback.keySet()) {
            if (feedback.get(attendee).containsKey(role)) {
                roleFeedback.put(attendee, feedback.get(attendee).get(role));
            }
        }
        return roleFeedback;
    }

    @Override
    public String toString() {
        return getName();
    }
}
