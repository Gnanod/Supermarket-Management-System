/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.SupplierDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.SupplierDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class SupplierDaoImpl implements SupplierDAO{

    private Connection connection;
    
    public SupplierDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }
    @Override
    public boolean add(SupplierDTO supplier) throws Exception {
       String SQL ="Insert into supplier Values(?,?,?,?,?,?,?)";
      
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, supplier.getSupplierName());
        stm.setObject(2, supplier.getSupplierId());
        stm.setObject(3, supplier.getSupplierGender());
        stm.setObject(4, supplier.getSupplierTelNumber());
        stm.setObject(5, supplier.getSupplierAddress());
        stm.setObject(6, supplier.getSupplierCompanyName());
        stm.setObject(7, supplier.getSupplierCompanyAddress());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(SupplierDTO dto) throws Exception {
        String SQL="Update Supplier set supplierName='"+dto.getSupplierName()+"',supplierAddress='"+dto.getSupplierAddress()+"',supplierGender='"+dto.getSupplierGender()+"',supplierTelNumber='"+dto.getSupplierTelNumber()+"',supplierCompanyName='"+dto.getSupplierCompanyName()+"',supplierCompanyAddress = '"+dto.getSupplierCompanyAddress()+"'  where supplierId='"+dto.getSupplierId()+"'";
        Statement stm=connection.createStatement();
        return stm.executeUpdate(SQL)>0;
    }

    @Override
    public boolean delete(String key) throws Exception {
       String SQL = "Delete From Supplier where supplierId= '"+key+"'";
       Statement stm = connection.createStatement();
       return stm.executeUpdate(SQL)>0;
        
    }

    @Override
    public SupplierDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierDTO> getAll() throws Exception {
    String SQL ="Select * from Supplier";
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<SupplierDTO> supplierList = new ArrayList<>();
        while(rst.next()){
            SupplierDTO company = new SupplierDTO(rst.getString("supplierName"),rst.getString("supplierId"),rst.getString("supplierGender"),rst.getString("supplierTelNumber"),rst.getString("supplierAddress"),rst.getString("supplierCompanyName"),rst.getString("supplierCompanyAddress"));
            supplierList.add(company);
           
        }
        return supplierList;
    }

   @Override
    public ArrayList<SupplierDTO> searchSupplier(String type) throws Exception{
        String SQL = "Select * From Supplier where supplierName like '%"+type+"%' || supplierId like '%"+type+"%' || supplierGender like '%"+type+"%'|| supplierTelNumber like '%"+type+"%'|| supplierAddress like '%"+type+"%'|| supplierCompanyName like '%"+type+"%'|| supplierCompanyAddress like '%"+type+"%'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<SupplierDTO> supplierList = new ArrayList<>();
        while(rst.next()){
            SupplierDTO company = new SupplierDTO(rst.getString("supplierName"),rst.getString("supplierId"),rst.getString("supplierGender"),rst.getString("supplierTelNumber"),rst.getString("supplierAddress"),rst.getString("supplierCompanyName"),rst.getString("supplierCompanyAddress"));
            supplierList.add(company);
            
        }
        return supplierList;
    }

    @Override
    public SupplierDTO searchName(String companyName) throws Exception {
        String SQL ="Select * from Supplier where supplierCompanyName = '"+companyName+"'";
        Statement stm =connection.createStatement();
        ResultSet rst =stm.executeQuery(SQL);
        if(rst.next()){
            SupplierDTO c1 = new SupplierDTO();
            
            c1.setSupplierName(rst.getString(1));
           c1.setSupplierId(rst.getString(2));
            return c1;
           
        }else{
            return null;
        }
    }

    @Override
    public SupplierDTO serchSupplierName(String supName) throws Exception {
       String SQL ="Select * from Supplier where supplierName = '"+supName+"'";
        Statement stm =connection.createStatement();
        ResultSet rst =stm.executeQuery(SQL);
        if(rst.next()){
            SupplierDTO c1 = new SupplierDTO();
            
            c1.setSupplierName(rst.getString(1));
            return c1;
           
        }else{
            return null;
        }
    }

    @Override
    public String searchSupplierId(String supplierName) throws SQLException {
     String SQL = "Select supplierId from Supplier where supplierName ='"+supplierName+"'";
     Statement stm = connection.createStatement();
     ResultSet rst = stm.executeQuery(SQL);
     if(rst.next()){
            
            return rst.getString("supplierId");
         }
        return null;
    }



    

    
    
   
    
}
