package chronica.model.business;

import java.util.List;

public class Business {

    private String businessId;
    private String name;
    private String type;
    private EventPlanningFirm eventPlanningFirm;
    private VenueManagementCompany venueManagementCompany;
    private List<VendorSuppliesGroup> vendorSuppliesGroups;
    private List<MarketingPRAgency> marketingAgencies;
    private SecurityAgency securityAgency;
    private List<LogisticsManagement> logisticsManagements;

    public Business(String businessId, String name, String type) {
        this.businessId = businessId;
        this.name = name;
        this.type = type;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EventPlanningFirm getEventPlanningFirm() {
        return eventPlanningFirm;
    }

    public void setEventPlanningFirm(EventPlanningFirm eventPlanningFirm) {
        this.eventPlanningFirm = eventPlanningFirm;
    }

    public VenueManagementCompany getVenueManagementCompany() {
        return venueManagementCompany;
    }

    public void setVenueManagementCompany(VenueManagementCompany venueManagementCompany) {
        this.venueManagementCompany = venueManagementCompany;
    }

    public List<VendorSuppliesGroup> getVendorSuppliesGroups() {
        return vendorSuppliesGroups;
    }

    public void setVendorSuppliesGroups(List<VendorSuppliesGroup> vendorSuppliesGroups) {
        this.vendorSuppliesGroups = vendorSuppliesGroups;
    }

    public List<MarketingPRAgency> getMarketingAgencies() {
        return marketingAgencies;
    }

    public void setMarketingAgencies(List<MarketingPRAgency> marketingAgencies) {
        this.marketingAgencies = marketingAgencies;
    }

    public SecurityAgency getSecurityAgency() {
        return securityAgency;
    }

    public void setSecurityAgency(SecurityAgency securityAgency) {
        this.securityAgency = securityAgency;
    }

    public List<LogisticsManagement> getLogisticsManagements() {
        return logisticsManagements;
    }

    public void setLogisticsManagements(List<LogisticsManagement> logisticsManagements) {
        this.logisticsManagements = logisticsManagements;
    }
}
