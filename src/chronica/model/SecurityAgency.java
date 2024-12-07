/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model;

/**
 *
 * @author arvindranganathraghuraman
 */
class SecurityAgency {
    private String agencyId;
    private String name;

    public SecurityAgency(String agencyId, String name) {
        this.agencyId = agencyId;
        this.name = name;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
    

