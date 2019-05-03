/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.ItemBrandNameQueryDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.ItemBrandNameDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Gnanod
 */
public class ItemBrandNameQueryDaoImpl implements ItemBrandNameQueryDAO{
    private Connection connection;
    
    public ItemBrandNameQueryDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }
    @Override
    public boolean add(ItemBrandNameDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ItemBrandNameDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemBrandNameDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ItemBrandNameDTO> getAll() throws Exception {
        String SQL = "select itemName,brandName\n"
                + "from Item i,Brand b\n"
                + "where i.brandID=b.brandID ";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<ItemBrandNameDTO> list = new ArrayList<>();
        while(rst.next()){
            ItemBrandNameDTO dto = new ItemBrandNameDTO();
                dto.setBrandName(rst.getString("brandName"));
                dto.setItemName(rst.getString("itemName"));
                list.add(dto);
        }
        return list;
    }

   /* @Override
    public ArrayList<ItemBrandNameDTO> searchBrandName(String name) throws Exception {
        String SQL = "select itemName,brandName\n"
                + "from Item i,Brand b\n"
                + "where i.brandID=b.brandID and itemName like '%" + name + "%' || brandName like '%"+name+"%'";
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<ItemBrandNameDTO> list = new ArrayList<>();
        while(rst.next()){
            ItemBrandNameDTO dto = new ItemBrandNameDTO();
                dto.setBrandName(rst.getString("brandName"));
                dto.setItemName(rst.getString("itemName"));
                list.add(dto);
        }
        return list;
    }*/

    @Override
    public ItemBrandNameDTO searchBrandName(String name) throws Exception {
    String SQL = "select itemName,brandName\n"
                + "from Item i,Brand b\n"
                + "where i.brandID=b.brandID and itemName like '%" + name + "%' || brandName like '%"+name+"%'";
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        
         if (rst.next()) {
            ItemBrandNameDTO dto = new ItemBrandNameDTO();
                dto.setBrandName(rst.getString("brandName"));
                dto.setItemName(rst.getString("itemName"));
                
                return dto;
        }
        return null;
    
    }
    
}
