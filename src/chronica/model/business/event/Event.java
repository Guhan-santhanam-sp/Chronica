package chronica.model.business.event;

import chronica.model.business.Task.TaskDirectory;
import chronica.model.business.User.User;
import java.util.ArrayList;
import java.util.List;

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

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    private static int count = 0;

    private List<User> registeredUsers; // List to hold users registered for the event

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
        this.registeredUsers = new ArrayList<>();
        this.ticketPrice = ticketPrice;
        this.availableTicket = totalattendees;// Initialize the list of registered users

    }

    // Getter for registered users
    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    // Method to add a user to the list of registered users
    public void registerUser(User user) {
        if (registeredUsers.size() < totalattendees) {
            registeredUsers.add(user);
            availableTicket = availableTicket - 1;
            setAvailableTicket(availableTicket);
        } else {
            System.out.println("Registration full for this event!");
        }

    }

    public int getAvailableTicket() {
        return availableTicket;
    }

    public void setAvailableTicket(int availableTicket) {
        this.availableTicket = availableTicket;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskDirectory getTaskDirectory() {
        return taskDirectory;
    }

    public int getTotalattendees() {
        return totalattendees;
    }

    public void setTotalattendees(int totalattendees) {
        this.totalattendees = totalattendees;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return getName();
    }
}
