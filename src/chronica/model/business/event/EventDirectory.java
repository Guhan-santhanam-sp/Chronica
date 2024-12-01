package chronica.model.business.event;

import chronica.model.business.User.User;
import java.util.ArrayList;

public class EventDirectory {

    ArrayList<Event> event;

    public EventDirectory() {
        event = new ArrayList<>();
    }

    public Event newEvent(String eventName, String eventDate, String eventLocation, double budget, int attendees, User currentUser) {
        Event newEvent = new Event(eventName, eventDate, eventLocation, budget, attendees, currentUser);
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
                e.setAttendees(newAttendees);
                return true;
            }
        }
        return false;
    }
}
