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
public class CustomerOrderPaymentDTO extends SuperDTO {
    private String customerOrderId;
    private String paymentId;
    private String paymentType;
    private String date;

    public CustomerOrderPaymentDTO() {
    }

    public CustomerOrderPaymentDTO(String customerOrderId, String paymentId, String paymentType, String date) {
        this.customerOrderId = customerOrderId;
        this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.date = date;
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
     * @return the paymentId
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
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
