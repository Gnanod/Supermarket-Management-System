/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.ViewItemNameBatchController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.ItemNameBatchIdDAO;
import edu.ijse.fms.dao.custom.ViewItemNameBatchDAO;
import edu.ijse.fms.dto.ItemNameBatchIdDTO;
import edu.ijse.fms.dto.ViewItemNameBatchDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class ViewItemNameBatchControllerImpl implements ViewItemNameBatchController{
    private ViewItemNameBatchDAO itemNameBatchDao;

    public ViewItemNameBatchControllerImpl() {
        itemNameBatchDao =  (ViewItemNameBatchDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.ITEMNAMEBATCH);
    }
    
    @Override
    public boolean add(ViewItemNameBatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewItemNameBatchDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ViewItemNameBatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewItemNameBatchDTO> getAll() throws Exception {
       return itemNameBatchDao.getAll();
    }

    @Override
    public ArrayList<ViewItemNameBatchDTO> searchAll(String type) throws Exception {
        return itemNameBatchDao.searchAll(type);
    }

    
    
}
