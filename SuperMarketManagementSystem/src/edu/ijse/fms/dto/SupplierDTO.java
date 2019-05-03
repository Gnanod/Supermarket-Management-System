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
public class SupplierDTO extends SuperDTO {
   private String supplierName;
    private String supplierId;
    private String supplierGender;
    private String supplierTelNumber;
    private String supplierAddress;
    private String supplierCompanyName;
    private String supplierCompanyAddress;

    public SupplierDTO() {
    }

    public SupplierDTO(String supplierName, String supplierId, String supplierGender, String supplierTelNumber, String supplierAddress, String supplierCompanyName, String supplierCompanyAddress) {
        this.supplierName = supplierName;
        this.supplierId = supplierId;
        this.supplierGender = supplierGender;
        this.supplierTelNumber = supplierTelNumber;
        this.supplierAddress = supplierAddress;
        this.supplierCompanyName = supplierCompanyName;
        this.supplierCompanyAddress = supplierCompanyAddress;
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
     * @return the supplierId
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the supplierGender
     */
    public String getSupplierGender() {
        return supplierGender;
    }

    /**
     * @param supplierGender the supplierGender to set
     */
    public void setSupplierGender(String supplierGender) {
        this.supplierGender = supplierGender;
    }

    /**
     * @return the supplierTelNumber
     */
    public String getSupplierTelNumber() {
        return supplierTelNumber;
    }

    /**
     * @param supplierTelNumber the supplierTelNumber to set
     */
    public void setSupplierTelNumber(String supplierTelNumber) {
        this.supplierTelNumber = supplierTelNumber;
    }

    /**
     * @return the supplierAddress
     */
    public String getSupplierAddress() {
        return supplierAddress;
    }

    /**
     * @param supplierAddress the supplierAddress to set
     */
    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    /**
     * @return the supplierCompanyName
     */
    public String getSupplierCompanyName() {
        return supplierCompanyName;
    }

    /**
     * @param supplierCompanyName the supplierCompanyName to set
     */
    public void setSupplierCompanyName(String supplierCompanyName) {
        this.supplierCompanyName = supplierCompanyName;
    }

    /**
     * @return the supplierCompanyAddress
     */
    public String getSupplierCompanyAddress() {
        return supplierCompanyAddress;
    }

    /**
     * @param supplierCompanyAddress the supplierCompanyAddress to set
     */
    public void setSupplierCompanyAddress(String supplierCompanyAddress) {
        this.supplierCompanyAddress = supplierCompanyAddress;
    }
    
}
