package chronica.model.business.event;

import chronica.model.business.Task.Task;
import chronica.model.business.Task.TaskDirectory;
import chronica.model.business.User.User;

public class Event {

    private int eventId;
    private String name;
    private String date;
    private String location;
    private TaskDirectory taskDirectory; // Connect Event with TaskDirectory
    private int attendees;
    private double budget;
    private User createdBy;
    private static int count = 0;

    public Event(String name, String date, String location, double budget, int attendees, User createdBy) {
        count++;
        this.eventId = count;
        this.name = name;
        this.date = date;
        this.location = location;
        this.budget = budget;
        this.taskDirectory = new TaskDirectory(); // Initialize TaskDirectory
        this.attendees = attendees;
        this.createdBy = createdBy;
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

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
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
