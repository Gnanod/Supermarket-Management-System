/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.SupplierOrderDetailDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.SupplierOrderDetailDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class SupplierOrderDetailDaoImpl implements SupplierOrderDetailDAO{
    private Connection connection;

    public SupplierOrderDetailDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }
    @Override
    public boolean add(SupplierOrderDetailDTO dto) throws Exception {
    String SQL = "Insert into  SupplierOrderDetail values(?,?,?,?,?,?)";
    PreparedStatement stm = connection.prepareStatement(SQL);
      //  stm.setObject(1, dto.getSupplierOrderDetailId());
        stm.setObject(1, dto.getSupplierOrderId());
        stm.setObject(2, dto.getItemId());
        stm.setObject(3, dto.getDate());
        stm.setObject(4, dto.getQuantity());
        stm.setObject(5, dto.getBuyingPrice());
        stm.setObject(6, dto.getTotalAmount());
        int res = stm.executeUpdate();
        
        return res > 0;
    }

    @Override
    public boolean update(SupplierOrderDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierOrderDetailDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierOrderDetailDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierOrderDetailDTO searchPrice(String id) throws Exception {
        String SQL ="select * from supplierOrderDetail where itemId = '"+id+"'";
        Statement stm =connection.createStatement();
        ResultSet rst =stm.executeQuery(SQL);
        if(rst.next()){
            SupplierOrderDetailDTO orderDto = new SupplierOrderDetailDTO();
            orderDto.setBuyingPrice(rst.getDouble(5));
            
            orderDto.setQuantity(rst.getDouble(4));
            return orderDto;
        }else{
        return null;
        }
    }
    
}
