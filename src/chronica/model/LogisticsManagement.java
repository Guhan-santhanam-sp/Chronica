/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronica.model;

/**
 *
 * @author arvindranganathraghuraman
 */
class LogisticsManagement {
    private String logisticsId;
    private String description;

    public LogisticsManagement(String logisticsId, String description) {
        this.logisticsId = logisticsId;
        this.description = description;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
    

