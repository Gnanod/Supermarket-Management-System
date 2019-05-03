/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.controller.custom.ItemNameBatchIdController;
import edu.ijse.fms.dao.custom.ItemNameBatchIdDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.ItemNameBatchIdDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class ItemNameBatchIdDaoImpl implements ItemNameBatchIdDAO{

    private Connection connection;

    public ItemNameBatchIdDaoImpl() {
    connection = ConnectionFactory.getInstance().getConnection();
    }
    
    
    @Override
    public boolean add(ItemNameBatchIdDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ItemNameBatchIdDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemNameBatchIdDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ItemNameBatchIdDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String searchBatchId(String name) throws Exception {
        String SQL ="select  batchId,itemName from item i,batch b where i.itemId = b.itemId and itemName = '"+name+"' ";
         Statement stm = connection.createStatement();
         ResultSet rst = stm.executeQuery(SQL);
         if(rst.next()){
          return rst.getString("batchId");
         }
         return null;
    }
    
}
