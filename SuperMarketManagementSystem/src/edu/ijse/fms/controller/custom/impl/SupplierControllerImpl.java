/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.SupplierController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.SupplierDAO;
import edu.ijse.fms.dto.SupplierDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class SupplierControllerImpl implements SupplierController {

    private SupplierDAO supplierDao;

    public SupplierControllerImpl() {
        supplierDao = (SupplierDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.SUPPLIER);
    }

    @Override
    public boolean add(SupplierDTO dto) throws Exception {
        return supplierDao.add(dto);
    }

    @Override
    public boolean update(SupplierDTO dto) throws Exception {
        return supplierDao.update(dto);
    }

    @Override
    public ArrayList<SupplierDTO> getAll() throws Exception {
        return supplierDao.getAll();
    }

    @Override
    public SupplierDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierDTO> searchSuppliers(String type) throws Exception {
        return supplierDao.searchSupplier(type);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return supplierDao.delete(key);
    }

    @Override
    public SupplierDTO searchName(String companyName) throws Exception {
        return supplierDao.searchName(companyName);
    }

    @Override
    public SupplierDTO searchSupplierName(String supName) throws Exception {
        return supplierDao.serchSupplierName(supName);
    }

    @Override
    public String searchSupplierId(String supplierName) throws Exception {
        return supplierDao.searchSupplierId(supplierName);
    }

}
