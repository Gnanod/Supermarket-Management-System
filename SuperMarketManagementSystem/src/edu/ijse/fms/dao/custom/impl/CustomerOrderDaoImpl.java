/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.CustomerOrderDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.CustomerOrderDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class CustomerOrderDaoImpl implements CustomerOrderDAO{
    private Connection connection;
    
    public CustomerOrderDaoImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }
    @Override
    public boolean add(CustomerOrderDTO dto) throws Exception {
        String SQL ="Insert into customerOrder values(?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getCustomerId());
        stm.setObject(2, dto.getCustomerOrderId());
        stm.setObject(3, dto.getOrderDate());
        stm.setObject(4, dto.getGrossAmount());
        stm.setObject(5, dto.getDiscount());
        stm.setObject(6, dto.getNetAmount());
        System.out.println(dto.getCustomerId()+"ttttttttttttttt");
        System.out.println(dto.getCustomerOrderId()+"ttttttttttttttt");
        System.out.println(dto.getOrderDate()+"ttttttttttttttt");
        System.out.println(dto.getGrossAmount()+"ttttttttttttttt");
        System.out.println(dto.getDiscount()+"ttttttttttttttt");
        System.out.println(dto.getNetAmount()+"ttttttttttttttt");
        
        int res = stm.executeUpdate();
        return res > 0;
        
    }

    @Override
    public boolean update(CustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerOrderDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerOrderDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
