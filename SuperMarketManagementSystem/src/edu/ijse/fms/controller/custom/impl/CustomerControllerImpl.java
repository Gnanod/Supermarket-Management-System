/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.CustomerController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.CustomerDAO;
import edu.ijse.fms.dto.CustomerDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class CustomerControllerImpl implements CustomerController{
    private CustomerDAO customerDao;
    public CustomerControllerImpl(){
        customerDao= (CustomerDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.CUSTOMER);
    }
    
    @Override
    public boolean add(CustomerDTO dto) throws Exception {
        return customerDao.add(dto);
    }

    @Override
    public CustomerDTO search(String key) throws Exception {
        return customerDao.search(key);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return customerDao.delete(key);
    }

    @Override
    public boolean update(CustomerDTO dto) throws Exception {
        return customerDao.update(dto);
    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {
        return customerDao.getAll();
    }

    @Override
    public ArrayList<CustomerDTO> searchCustomers(String type) throws Exception {
        return customerDao.searchCustomers(type);
    }

   

   
    
}
