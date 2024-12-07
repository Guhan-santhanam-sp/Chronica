package chronica.model.business.event;

import chronica.model.business.Task.Task;
import chronica.model.business.User.User;
import chronica.model.business.role.Role;
import chronica.model.event.Event;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EventDirectory {

    ArrayList<Event> event;

    public EventDirectory() {
        event = new ArrayList<>();
    }

    public Event newEvent(String eventName, String eventDate, String eventLocation, double budget, int attendees, User currentUser, double ticketPrice) {
        Event newEvent = new Event(eventName, eventDate, eventLocation, budget, attendees, currentUser, ticketPrice);
        this.event.add(newEvent);
        return newEvent;
    }

    public ArrayList<Event> getEvents() {
        return event;
    }

    /**
     * Retrieve events created by a specific user.
     *
     * @param user The user whose events are to be retrieved.
     * @return List of events created by the user.
     */
    public ArrayList<Event> getEventsByUser(User user) {
        ArrayList<Event> userEvents = new ArrayList<>();
        for (Event e : event) {
            if (e.getCreatedBy() != null && e.getCreatedBy().equals(user)) {
                userEvents.add(e);
            }
        }
        return userEvents;
    }

    public ArrayList<Event> getEventsRegisteredByUser(User user) {
        ArrayList<Event> registeredEvents = new ArrayList<>();
        for (Event e : event) {
            if (e.getRegisteredUsers().contains(user)) {
                registeredEvents.add(e);
            }
        }
        return registeredEvents;
    }

    public double getTotalEventBudgetRevenue() {
        double totalBudget = 0;
        for (Event e : event) {
            totalBudget = totalBudget + e.getBudget();
        }
        return totalBudget;
    }

    /**
     * Remove an event by ID.
     *
     * @param eventId The ID of the event to remove.
     * @return True if the event was removed, false otherwise.
     */
    public boolean removeEvent(int eventId) {
        for (Event e : event) {
            if (e.getEventId() == eventId) {
                event.remove(e);
                return true;
            }
        }
        return false;
    }

    /**
     * Edit an event by ID.
     *
     * @param eventId The ID of the event to edit.
     * @param newName The new name for the event.
     * @param newDate The new date for the event.
     * @param newLocation The new location for the event.
     * @param newBudget The new budget for the event.
     * @param newAttendees The new number of attendees.
     * @return True if the event was updated, false otherwise.
     */
    public boolean editEvent(int eventId, String newName, String newDate, String newLocation, double newBudget, int newAttendees) {
        for (Event e : event) {
            if (e.getEventId() == eventId) {
                e.setName(newName);
                e.setDate(newDate);
                e.setLocation(newLocation);
                e.setBudget(newBudget);
                e.setTotalattendees(newAttendees);
                return true;
            }
        }
        return false;
    }

    /**
     * Get the total number of events.
     *
     * @return Total number of events.
     */
    public int getTotalNumberOfEvents() {
        return event.size();
    }

    /**
     * Get the total number of tickets sold across all events.
     *
     * @return Total number of tickets sold.
     */
    public int getTotalNumberOfTicketsSold() {
        int totalTicketsSold = 0;
        for (Event e : event) {
            totalTicketsSold += (e.getTotalattendees() - e.getAvailableTicket());
        }
        return totalTicketsSold;
    }

    /**
     * Get the total number of attendees across all events.
     *
     * @return Total number of attendees.
     */
    public int getTotalNumberOfAttendees() {
        int totalAttendees = 0;
        for (Event e : event) {
            totalAttendees += e.getRegisteredUsers().size();
        }
        return totalAttendees;
    }

    /**
     * Get the total number of customers (unique registered users across all
     * events).
     *
     * @return Total number of customers.
     */
    /**
     * Get the total number of vendors involved in all events.
     *
     * @return Total number of vendors.
     */
    public int getTotalNumberOfVendors() {
        Set<Role> uniqueVendors = new HashSet<>();
        for (Event e : event) {
            for (Task t : e.getTaskDirectory().getAllTasks()) {
                uniqueVendors.add(t.getRole());
            }
        }
        return uniqueVendors.size();
    }

    /**
     * Get the total number of tasks across all events.
     *
     * @return Total number of tasks.
     */
    public int getTotalNumberOfTasks() {
        int totalTasks = 0;
        for (Event e : event) {
            totalTasks += e.getTaskDirectory().getAllTasks().size();
        }
        return totalTasks;
    }
}
