package chronica.model.business;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private String eventId;
    private String name;
    private String date;
    private String location;
    private List<Task> tasks;
    private List<Attendee> attendees;
    private double budget;

    public Event(String eventId, String name, String date, String location, double budget) {
        this.eventId = eventId;
        this.name = name;
        this.date = date;
        this.location = location;
        this.budget = budget;
        this.tasks = new ArrayList<>();
        this.attendees = new ArrayList<>();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void addAttendee(Attendee attendee) {
        this.attendees.add(attendee);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
