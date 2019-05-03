/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.ValubleCustomerController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.ValubleCustomerDAO;
import edu.ijse.fms.dto.ValubleCustomerDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class ValubleCustomerControllerImpl implements ValubleCustomerController{

    private ValubleCustomerDAO valubleCustomerDao;

    public ValubleCustomerControllerImpl() {
        valubleCustomerDao = (ValubleCustomerDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.VALUBLECUSTOMER);
                
    }
    
    @Override
    public boolean add(ValubleCustomerDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ValubleCustomerDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ValubleCustomerDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ValubleCustomerDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ValubleCustomerDTO> serchNumber(int number) throws Exception {
        return valubleCustomerDao.searchNumber(number);
    }
    
}
