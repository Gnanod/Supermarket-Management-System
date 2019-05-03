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
public class CustomerOrderDTO extends SuperDTO {

    private String customerOrderId;
    private String customerId;
    private String orderDate;
    private double grossAmount;
    private double discount;
    private double netAmount;

    public CustomerOrderDTO() {
    }

    public CustomerOrderDTO(String customerOrderId, String customerId, String orderDate, double grossAmount, double discount, double netAmount) {
        this.customerOrderId = customerOrderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.grossAmount = grossAmount;
        this.discount = discount;
        this.netAmount = netAmount;
    }

    /**
     * @return the customerOrderId
     */
    public String getCustomerOrderId() {
        return customerOrderId;
    }

    /**
     * @param customerOrderId the customerOrderId to set
     */
    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the grossAmount
     */
    public double getGrossAmount() {
        return grossAmount;
    }

    /**
     * @param grossAmount the grossAmount to set
     */
    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the netAmount
     */
    public double getNetAmount() {
        return netAmount;
    }

    /**
     * @param netAmount the netAmount to set
     */
    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }
    
}
