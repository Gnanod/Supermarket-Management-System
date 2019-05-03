/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dto;

import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class SupplierOrderDTO extends SuperDTO{
    private String supplierId;
    private String supplierOrderId;
    
    private ArrayList<SupplierOrderDetailDTO> supplierOrderDetail;

    public SupplierOrderDTO() {
    }

    public SupplierOrderDTO(String supplierId, String supplierOrderId, ArrayList<SupplierOrderDetailDTO> supplierOrderDetail) {
        this.supplierId = supplierId;
        this.supplierOrderId = supplierOrderId;
        this.supplierOrderDetail = supplierOrderDetail;
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
     * @return the supplierOrderDetail
     */
    public ArrayList<SupplierOrderDetailDTO> getSupplierOrderDetail() {
        return supplierOrderDetail;
    }

    /**
     * @param supplierOrderDetail the supplierOrderDetail to set
     */
    public void setSupplierOrderDetail(ArrayList<SupplierOrderDetailDTO> supplierOrderDetail) {
        this.supplierOrderDetail = supplierOrderDetail;
    }
    
    
}
