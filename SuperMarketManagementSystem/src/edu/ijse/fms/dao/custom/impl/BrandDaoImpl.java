/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.BrandDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.BrandDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Gnanod
 */
public class BrandDaoImpl implements BrandDAO{
    private Connection connection;
    
    public BrandDaoImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }
    @Override
    public boolean add(BrandDTO brand) throws Exception {
        String SQL ="Insert into brand Values(?,?)";
      
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, brand.getBrandId());
        stm.setObject(2, brand.getBrandName());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(BrandDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BrandDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BrandDTO> getAll() throws Exception {
     
        Statement stm = connection.createStatement();
        String SQL = "Select * from brand ";
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<BrandDTO> brandList = new ArrayList<>();
        while(rst.next()){
            BrandDTO brand = new BrandDTO(rst.getString("brandId"),rst.getString("brandName"));
            brandList.add(brand);
        }  
        return brandList;
    }

    @Override
    public String getItemCode(String name) throws Exception {
       String SQL ="Select brandId from brand where brandName ='"+name+"' ";
         
         Statement stm = connection.createStatement();
         ResultSet rst = stm.executeQuery(SQL);
         if(rst.next()){
             //BrandDTO brand = new BrandDTO();
            // brand.setBrandId(rst.getString("id"));
            // return brand;
            return rst.getString("brandId");
         }
        return null;
    }
    
}
