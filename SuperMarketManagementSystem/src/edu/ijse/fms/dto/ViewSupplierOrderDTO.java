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
public class ViewSupplierOrderDTO extends SuperDTO{
     private String itemName;
     private String supplierOrderDate;
     private String supplierName;
     private String SupplierCompany;
     private double quantity;
     private double buyingPrice;
     private String supplierOrderId;

    public ViewSupplierOrderDTO() {
    }

    public ViewSupplierOrderDTO(String itemName, String supplierOrderDate, String supplierName, String SupplierCompany, double quantity, double buyingPrice, String supplierOrderId) {
        this.itemName = itemName;
        this.supplierOrderDate = supplierOrderDate;
        this.supplierName = supplierName;
        this.SupplierCompany = SupplierCompany;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.supplierOrderId = supplierOrderId;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the supplierOrderDate
     */
    public String getSupplierOrderDate() {
        return supplierOrderDate;
    }

    /**
     * @param supplierOrderDate the supplierOrderDate to set
     */
    public void setSupplierOrderDate(String supplierOrderDate) {
        this.supplierOrderDate = supplierOrderDate;
    }

    /**
     * @return the supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * @param supplierName the supplierName to set
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * @return the SupplierCompany
     */
    public String getSupplierCompany() {
        return SupplierCompany;
    }

    /**
     * @param SupplierCompany the SupplierCompany to set
     */
    public void setSupplierCompany(String SupplierCompany) {
        this.SupplierCompany = SupplierCompany;
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
     
     
}
