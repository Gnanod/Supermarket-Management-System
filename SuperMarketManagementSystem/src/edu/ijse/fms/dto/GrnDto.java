/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dto;

/**
 *
 * @author Gnanod
 */
public class GrnDto extends SuperDTO{
    private String grnId;
    private String grnDate;

    public GrnDto() {
    }

    public GrnDto(String grnId, String grnDate) {
        this.grnId = grnId;
        this.grnDate = grnDate;
    }

    /**
     * @return the grnId
     */
    public String getGrnId() {
        return grnId;
    }

    /**
     * @param grnId the grnId to set
     */
    public void setGrnId(String grnId) {
        this.grnId = grnId;
    }

    /**
     * @return the grnDate
     */
    public String getGrnDate() {
        return grnDate;
    }

    /**
     * @param grnDate the grnDate to set
     */
    public void setGrnDate(String grnDate) {
        this.grnDate = grnDate;
    }

    
    
}
