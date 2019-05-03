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
public class ValubleCustomerDTO  extends SuperDTO{
    private String customerName;
    private String date;
    private double grocessAmount;
    private String address;
    private String telePhoneNumber;

    public ValubleCustomerDTO() {
    }

    public ValubleCustomerDTO(String customerName, String date, double grocessAmount, String address, String telePhoneNumber) {
        this.customerName = customerName;
        this.date = date;
        this.grocessAmount = grocessAmount;
        this.address = address;
        this.telePhoneNumber = telePhoneNumber;
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
     * @return the grocessAmount
     */
    public double getGrocessAmount() {
        return grocessAmount;
    }

    /**
     * @param grocessAmount the grocessAmount to set
     */
    public void setGrocessAmount(double grocessAmount) {
        this.grocessAmount = grocessAmount;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telePhoneNumber
     */
    public String getTelePhoneNumber() {
        return telePhoneNumber;
    }

    /**
     * @param telePhoneNumber the telePhoneNumber to set
     */
    public void setTelePhoneNumber(String telePhoneNumber) {
        this.telePhoneNumber = telePhoneNumber;
    }
    
           
}
