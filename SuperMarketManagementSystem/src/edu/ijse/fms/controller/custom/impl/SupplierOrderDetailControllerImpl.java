/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.SupplierOrderDetailController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.SupplierOrderDetailDAO;
import edu.ijse.fms.dto.SupplierOrderDetailDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class SupplierOrderDetailControllerImpl implements SupplierOrderDetailController{
    private SupplierOrderDetailDAO supplierOrderDetailDao;

    public SupplierOrderDetailControllerImpl() {
    supplierOrderDetailDao = (SupplierOrderDetailDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.SUPPLIERORERDETAIL);
    }
    
    @Override
    public boolean add(SupplierOrderDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierOrderDetailDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SupplierOrderDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierOrderDetailDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierOrderDetailDTO searchPrice(String name) throws Exception {
        return supplierOrderDetailDao.searchPrice(name);
    }
    
}
