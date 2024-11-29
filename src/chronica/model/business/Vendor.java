/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model.business;

/**
 *
 * @author Gooqe
 */
public class Vendor {

    private String vendorId;
    private String name;
    private String serviceType;

    public Vendor(String vendorId, String name, String serviceType) {
        this.vendorId = vendorId;
        this.name = name;
        this.serviceType = serviceType;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;

    }
}
