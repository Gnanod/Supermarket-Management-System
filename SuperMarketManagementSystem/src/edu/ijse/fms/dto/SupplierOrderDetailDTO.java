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
public class SupplierOrderDetailDTO extends SuperDTO {
   
    private String supplierOrderId;
    private String itemId;
    private String date;
    private double quantity;
    private double buyingPrice;
    private double totalAmount;

    public SupplierOrderDetailDTO() {
    }

    public SupplierOrderDetailDTO(String supplierOrderId, String itemId, String date, double quantity, double buyingPrice, double totalAmount) {
        this.supplierOrderId = supplierOrderId;
        this.itemId = itemId;
        this.date = date;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.totalAmount = totalAmount;
    }

    /**
     * @return the supplierOrderId
     */
    public String getSupplierOrderId() {
        return supplierOrderId;
    }

    /**
     * @param supplierOrderId the supplierOrderId to set
     */
    public void setSupplierOrderId(String supplierOrderId) {
        this.supplierOrderId = supplierOrderId;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the buyingPrice
     */
    public double getBuyingPrice() {
        return buyingPrice;
    }

    /**
     * @param buyingPrice the buyingPrice to set
     */
    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    /**
     * @return the totalAmount
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    

    
    
    
}
