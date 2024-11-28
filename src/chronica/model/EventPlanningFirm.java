/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model;

/**
 *
 * @author arvindranganathraghuraman
 */
class EventPlanningFirm {
    private String firmId;
    private String name;

    public EventPlanningFirm(String firmId, String name) {
        this.firmId = firmId;
        this.name = name;
    }

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
}

