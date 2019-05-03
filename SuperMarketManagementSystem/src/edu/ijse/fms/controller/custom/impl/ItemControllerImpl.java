/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.ItemController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.BatchDAO;
import edu.ijse.fms.dao.custom.ItemDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.BatchDTO;
import edu.ijse.fms.dto.ItemDTO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class ItemControllerImpl implements ItemController{
    private ItemDAO itemDao;
    private BatchDAO batchDao;
    public ItemControllerImpl(){
        itemDao = (ItemDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.ITEM);
        batchDao = (BatchDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.BATCH);
    }
    @Override
    public boolean add(ItemDTO dto) throws Exception {
       return itemDao.add(dto);
    }

    @Override
    public ItemDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        return itemDao.delete(key);
    }

    @Override
    public boolean update(ItemDTO dto) throws Exception {
        return itemDao.update(dto);
    }

    @Override
    public ArrayList<ItemDTO> getAll() throws Exception {
        return itemDao.getAll();
    }

    @Override
    public String getItemId(String itemName) throws Exception {
      return itemDao.getItemId(itemName);
    }

    @Override
    public boolean add(ItemDTO itemDto, BatchDTO batchDto) throws Exception {
        Connection connection = ConnectionFactory.getInstance().getConnection();
        connection.setAutoCommit(false);
        boolean result = itemDao.add(itemDto);
       
        if(result){
            result = batchDao.add(batchDto);
             System.out.println(result +" "+ "result");
            if (!result) {
                connection.rollback();
                connection.setAutoCommit(true);
                return false;
                
            }
            connection.setAutoCommit(true);
        return true;
        }else{
             connection.setAutoCommit(true);
            return false;
        }
        
    }

    @Override
    public String getItemName(String itemId) throws Exception {
        return itemDao.getItemName(itemId);
    }
    
}
