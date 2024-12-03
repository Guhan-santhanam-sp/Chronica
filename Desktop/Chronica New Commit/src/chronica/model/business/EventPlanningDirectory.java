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
public class EventPlanningDirectory {
    private List<EventPlanningFirm> firmList;

    // Constructor
    public EventPlanningDirectory() {
        this.firmList = new ArrayList<>();
    }

    // Add a new event planning firm
    public void addFirm(EventPlanningFirm firm) {
        this.firmList.add(firm);
    }

    // Remove a firm by ID
    public boolean removeFirm(String firmId) {
        return firmList.removeIf(firm -> firm.getFirmId().equals(firmId));
    }

    // Get a specific firm by ID
    public EventPlanningFirm getFirmById(String firmId) {
        for (EventPlanningFirm firm : firmList) {
            if (firm.getFirmId().equals(firmId)) {
                return firm;
            }
        }
        return null; // Return null if no firm matches the ID
    }

    // Get all firms
    public List<EventPlanningFirm> getAllFirms() {
        return firmList;
    }

    // Get firms by availability
    public List<EventPlanningFirm> getAvailableFirms() {
        List<EventPlanningFirm> availableFirms = new ArrayList<>();
        for (EventPlanningFirm firm : firmList) {
            if (firm.isAvailable()) {
                availableFirms.add(firm);
            }
        }
        return availableFirms;
    }

    // Get firms within a budget range
    public List<EventPlanningFirm> getFirmsByBudget(double budget) {
        List<EventPlanningFirm> filteredFirms = new ArrayList<>();
        for (EventPlanningFirm firm : firmList) {
            if (firm.getBudget() <= budget) {
                filteredFirms.add(firm);
            }
        }
        return filteredFirms;
    }

    // Get firms by rating threshold
    public List<EventPlanningFirm> getFirmsByRating(double minRating) {
        List<EventPlanningFirm> filteredFirms = new ArrayList<>();
        for (EventPlanningFirm firm : firmList) {
            if (firm.getAverageRating() >= minRating) {
                filteredFirms.add(firm);
            }
        }
        return filteredFirms;
    }

    // Get firms by services offered
    public List<EventPlanningFirm> getFirmsByService(String service) {
        List<EventPlanningFirm> filteredFirms = new ArrayList<>();
        for (EventPlanningFirm firm : firmList) {
            if (firm.getServicesOffered().toLowerCase().contains(service.toLowerCase())) {
                filteredFirms.add(firm);
            }
        }
        return filteredFirms;
    }
}
