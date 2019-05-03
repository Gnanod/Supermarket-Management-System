/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.CustomerDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.CustomerDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class CustomerDaoImpl implements CustomerDAO{
    private Connection connection;
    
    public CustomerDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }
    @Override
    public boolean add(CustomerDTO customer) throws Exception {
       String SQL ="Insert into customer Values(?,?,?,?,?)";
      
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, customer.getCustomerName());
        stm.setObject(2, customer.getCustomerId());
        stm.setObject(3, customer.getCustomerGender());
        stm.setObject(4, customer.getCustomerTelNumber());
        stm.setObject(5, customer.getCustomerAddress());
        
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(CustomerDTO dto) throws Exception {
        String SQL="Update Customer set customerName='"+dto.getCustomerName()+"',address='"+dto.getCustomerAddress()+"',customerGender='"+dto.getCustomerGender()+"',TelephoneNumber='"+dto.getCustomerTelNumber()+"'  where CustId='"+dto.getCustomerId()+"'";
        Statement stm=connection.createStatement();
        return stm.executeUpdate(SQL)>0;
    }

    @Override
    public boolean delete(String key) throws Exception {
    String SQL = "Delete From customer where CustId = '"+key+"'";
       
       Statement stm = connection.createStatement();
       return stm.executeUpdate(SQL)>0;
    }

    @Override
    public CustomerDTO search(String key) throws Exception {
        String SQL = "select customerName from customer where custId= '"+key+"'";
        Statement  stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if(rst.next()){
            CustomerDTO customerDTO = new CustomerDTO();
                customerDTO.setCustomerName(rst.getString("customerName"));
                return customerDTO;
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {
        String SQL ="Select * from Customer";
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<CustomerDTO> customerList = new ArrayList<>();
        while(rst.next()){
            CustomerDTO company = new CustomerDTO(rst.getString("CustId"),rst.getString("CustomerName"),rst.getString("CustomerGender"),rst.getString("TelephoneNumber"),rst.getString("address"));
            customerList.add(company);
            
        }
        return customerList;
    }

    @Override
    public ArrayList<CustomerDTO> searchCustomers(String type) throws Exception {
        String SQL = "Select * From Customer where CustomerName like '%"+type+"%' || CustId like '%"+type+"%' || CustomerGender like '%"+type+"%'|| TelephoneNumber like '%"+type+"%'|| address like '%"+type+"%'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<CustomerDTO> customerList = new ArrayList<>();
        while(rst.next()){
            CustomerDTO company = new CustomerDTO(rst.getString("CustomerName"),rst.getString("CustId"),rst.getString("CustomerGender"),rst.getString("TelephoneNumber"),rst.getString("address"));
            customerList.add(company);
            
        }
        return customerList;
    }
    
}
