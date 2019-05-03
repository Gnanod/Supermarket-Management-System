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
public class CustomerDTO extends SuperDTO{

    public static boolean addCustomer(CustomerDTO customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String customerId;
    private String customerName;
    private String customerGender;
    private String customerTelNumber;
    private String customerAddress;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerId, String customerName, String customerGender, String customerTelNumber, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.customerTelNumber = customerTelNumber;
        this.customerAddress = customerAddress;
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
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerGender
     */
    public String getCustomerGender() {
        return customerGender;
    }

    /**
     * @param customerGender the customerGender to set
     */
    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    /**
     * @return the customerTelNumber
     */
    public String getCustomerTelNumber() {
        return customerTelNumber;
    }

    /**
     * @param customerTelNumber the customerTelNumber to set
     */
    public void setCustomerTelNumber(String customerTelNumber) {
        this.customerTelNumber = customerTelNumber;
    }

    /**
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    
    
}
