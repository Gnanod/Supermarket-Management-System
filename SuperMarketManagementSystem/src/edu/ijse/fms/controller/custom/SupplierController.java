/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.SupplierDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface SupplierController extends SuperController<SupplierDTO>{

    public ArrayList<SupplierDTO> searchSuppliers(String type)throws Exception;

    public SupplierDTO searchName(String companyName)throws Exception;

    public SupplierDTO searchSupplierName(String supName)throws Exception;

    public String searchSupplierId(String supplierName)throws Exception;

    

    
   
}
