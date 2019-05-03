/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom;

import edu.ijse.fms.dao.SuperDAO;
import edu.ijse.fms.dto.SupplierDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface SupplierDAO extends SuperDAO<SupplierDTO>{

    public ArrayList<SupplierDTO> searchSupplier(String type)throws Exception;

    public SupplierDTO searchName(String companyName)throws Exception;

    public SupplierDTO serchSupplierName(String supName)throws Exception;

    public String searchSupplierId(String supplierName)throws Exception;

 

   

    
    
}
