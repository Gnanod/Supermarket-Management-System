/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.ItemNameBatchIdController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.ItemNameBatchIdDAO;
import edu.ijse.fms.dto.ItemNameBatchIdDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class ItemNameBatchIdControllerImpl implements ItemNameBatchIdController{
    private ItemNameBatchIdDAO itemNameBatchIdDAO;

    public ItemNameBatchIdControllerImpl() {
        itemNameBatchIdDAO = (ItemNameBatchIdDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.ITEMNAMEBATCHID);
    }

    @Override
    public String serchBatchId(String name) throws Exception {
        return itemNameBatchIdDAO.searchBatchId(name);
    }

    @Override
    public boolean add(ItemNameBatchIdDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemNameBatchIdDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ItemNameBatchIdDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ItemNameBatchIdDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
