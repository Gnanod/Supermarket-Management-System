/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.ItemDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.ItemDTO;
import edu.ijse.fms.dto.SupplierDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.UIManager;

/**
 *
 * @author Gnanod
 */
public class ItemDaoImpl implements ItemDAO {

    private Connection connection;

    public ItemDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(ItemDTO dto) throws Exception {
        String SQL = "Insert into item Values(?,?,?)";

        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getItemId());
        stm.setObject(2, dto.getItemName());
        stm.setObject(3, dto.getBrandId());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(ItemDTO dto) throws Exception {
        String SQL = "Update Item set itemName='" + dto.getItemName() + "',brandId='" + dto.getBrandId() + "'  where itemId='" + dto.getItemId() + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL = "Delete From Item where itemId = '" + key + "'";

        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }

    @Override
    public ItemDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ItemDTO> getAll() throws Exception {
        String SQL = "Select * from Item";

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<ItemDTO> itemList = new ArrayList<>();
        while (rst.next()) {
            ItemDTO company = new ItemDTO(rst.getString("itemId"), rst.getString("itemName"), rst.getString("brandId"));
            itemList.add(company);

        }
        return itemList;
    }

//    @Override
//    public String getItemId() throws Exception {
//     String SQL = "Select itemId where itemName ='"+supplierName+"'";
//     Statement stm = connection.createStatement();
//     ResultSet rst = stm.executeQuery(SQL);
//     if(rst.next()){
//            
//            return rst.getString("supplierId");
//         }
//        return null; 
//    }
    @Override
    public String getItemId(String itemName) throws Exception {
        String SQL = "Select itemId from item where itemName ='" + itemName + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            
            
                    
            return rst.getString("itemId");
            
        }
        return null;
    }

    @Override
    public String getItemName(String itemId) throws Exception {
        String SQL = "Select itemName from item where itemId ='" + itemId + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            
            
                    
            return rst.getString("itemName");
            
        }
        return null;
    }

}
