/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.CustomerOrderDetailDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.CustomerOrderDetailDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class CustomerOrderDetailDaoImpl implements CustomerOrderDetailDAO{
    private Connection connection;
    
    public CustomerOrderDetailDaoImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }
    @Override
    public boolean add(CustomerOrderDetailDTO dto) throws Exception {
        String SQL = "Insert into customerOrderDetail values(?,?,?)";
       // Insert into customerOrderDetail values('COI001','B002',23);
       // Insert into customerOrder values('C001','COI001','2017-8-9',23,56,67);
        
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1,dto.getCustomerOrderId());
        stm.setObject(2,dto.getBatchId());
        stm.setObject(3,dto.getQuantity());
        System.out.println(dto.getCustomerOrderId()+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int res = stm.executeUpdate();
        
        return res > 0;
        
    }

    @Override
    public boolean update(CustomerOrderDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerOrderDetailDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerOrderDetailDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
