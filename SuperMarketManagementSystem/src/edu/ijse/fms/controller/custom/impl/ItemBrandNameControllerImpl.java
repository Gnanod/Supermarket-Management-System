/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.ItemBrandNameController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.ItemBrandNameQueryDAO;
import edu.ijse.fms.dto.ItemBrandNameDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class ItemBrandNameControllerImpl implements ItemBrandNameController{
    ItemBrandNameQueryDAO itemBrandDao;
    
    public ItemBrandNameControllerImpl(){
        itemBrandDao = (ItemBrandNameQueryDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.ITEMBRANDNAME);
    }
    @Override
    public boolean add(ItemBrandNameDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemBrandNameDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ItemBrandNameDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ItemBrandNameDTO> getAll() throws Exception {
        return itemBrandDao.getAll();
    }

    //@Override
    //public ArrayList<ItemBrandNameDTO> searchItemBrandName(String name) throws Exception {
    //    return itemBrandDao.searchBrandName(name);
   // }

    @Override
    public ItemBrandNameDTO searchItemBrandName(String name) throws Exception {
    return itemBrandDao.searchBrandName(name);
    }
    
}
