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
public class BatchDTO extends SuperDTO {

    private String batchId;
    private String itemId;
    private String grnId;
    private double unitPrice;
    private double ammount;

    public BatchDTO(String batchId, String itemId, String grnId, double unitPrice, double ammount) {
        this.batchId = batchId;
        this.itemId = itemId;
        this.grnId = grnId;
        this.unitPrice = unitPrice;
        this.ammount = ammount;
    }

//    private String grnId;
//    private String batchId;
//    private double unitPrice;
//    private double amount;
//    private String itemId;
//
//    public BatchDTO() {
//    }
//    public BatchDTO( String itemId, String batchId){
//        
//        this.itemId =itemId;
//        this.batchId = batchId;
//    }
//
//    public BatchDTO(String grnId, String batchId, double unitPrice, double amount, String itemId) {
//        this.grnId = grnId;
//        this.batchId = batchId;
//        this.unitPrice = unitPrice;
//        this.amount = amount;
//        this.itemId = itemId;
//    }
//
//    /**
//     * @return the grnId
//     */
//    public String getGrnId() {
//        return grnId;
//    }
//
//    /**
//     * @param grnId the grnId to set
//     */
//    public void setGrnId(String grnId) {
//        this.grnId = grnId;
//    }
//
//    /**
//     * @return the batchId
//     */
//    public String getBatchId() {
//        return batchId;
//    }
//
//    /**
//     * @param batchId the batchId to set
//     */
//    public void setBatchId(String batchId) {
//        this.batchId = batchId;
//    }
//
//    /**
//     * @return the unitPrice
//     */
//    public double getUnitPrice() {
//        return unitPrice;
//    }
//
//    /**
//     * @param unitPrice the unitPrice to set
//     */
//    public void setUnitPrice(double unitPrice) {
//        this.unitPrice = unitPrice;
//    }
//
//    /**
//     * @return the amount
//     */
//    public double getAmount() {
//        return amount;
//    }
//
//    /**
//     * @param amount the amount to set
//     */
//    public void setAmount(double amount) {
//        this.amount = amount;
//    }
//
//    /**
//     * @return the itemId
//     */
//    public String getItemId() {
//        return itemId;
//    }
//
//    /**
//     * @param itemId the itemId to set
//     */
//    public void setItemId(String itemId) {
//        this.itemId = itemId;
//    }
//    
//
//   
//
//   
//    
    public BatchDTO() {
    }

    /**
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
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
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the ammount
     */
    public double getAmmount() {
        return ammount;
    }

    /**
     * @param ammount the ammount to set
     */
    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
}
