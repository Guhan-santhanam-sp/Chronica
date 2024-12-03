/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.business;

/**
 *
 * @author arvindranganathraghuraman
 */
class EventPlanningFirm {
    private String firmId; // Unique identifier for the firm
    private String name; // Name of the firm
    
    private String servicesOffered; // List of services provided by the firm (e.g., "Wedding Planning", "Corporate Events")
    private double averageRating; // Average rating of the firm based on customer feedback
    private String customerReviews; // List of customer reviews
    private double budget; // Minimum budget the firm works with
     // Maximum budget the firm works with
     // Total number of events the firm has organized
    private boolean isAvailable; // Availability status of the firm for booking
    
    // Constructor
    public EventPlanningFirm(String firmId, String name, String address, String contactNumber, String email,
                              double averageRating, double budgetRangeMin,
                             double budgetRangeMax, int totalEventsOrganized, boolean isAvailable 
                              ) {
        this.firmId = firmId;
        this.name = name;
        
        this.servicesOffered = servicesOffered;
        this.averageRating = averageRating;
        this.budget = budget;
        
        
        this.isAvailable = isAvailable;
        
    }

    // Getters and Setters
    public String getFirmId() {
        return firmId;
    }

    public void setFirmId(String firmId) {
        this.firmId = firmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public String getServicesOffered() {
        return servicesOffered;
    }

    public void setServicesOffered(String servicesOffered) {
        this.servicesOffered = servicesOffered;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public String getCustomerReviews() {
        return customerReviews;
    }

    public void setCustomerReviews(String customerReviews) {
        this.customerReviews = customerReviews;
    }

    

   

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    

    
}

