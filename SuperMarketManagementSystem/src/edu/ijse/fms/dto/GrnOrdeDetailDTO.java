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
public class GrnOrdeDetailDTO extends SuperDTO{
    private String grnId;
    private String itemId;
    private String date;
    private double sellingPrice ;
    private double buyingPrice;
    private double quantity;

    public GrnOrdeDetailDTO(String grnId, String itemId, String date, double sellingPrice, double buyingPrice, double quantity) {
        this.grnId = grnId;
        this.itemId = itemId;
        this.date = date;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.quantity = quantity;
    }

    public GrnOrdeDetailDTO() {
    }

    public GrnOrdeDetailDTO(String grnId, String itemId, double sellingPrice, double buyingPrice, double quantity) {
        this.grnId = grnId;
        this.itemId = itemId;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.quantity = quantity;
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
     * @return the sellingPrice
     */
    public double getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
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

    

    
    
    
}
