/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.GrnDetailDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.GrnDto;
import edu.ijse.fms.dto.GrnOrdeDetailDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class GrnDetailDaoImpl implements GrnDetailDAO {

    private Connection connection;

    public GrnDetailDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();

    }

//    @Override
//    public boolean add(GrnOrdeDetailDTO grnDetail1) throws Exception {
//        String SQL = "Insert into grnDetail values (?,?,?,?,?)";
//        PreparedStatement stm = connection.prepareStatement(SQL);
//        System.out.println(grnDetail1.getGrnId() + " check");
//        System.out.println(grnDetail1.getItemId() + " check");
//        System.out.println(grnDetail1.getSellingPrice() + " check");
//        System.out.println(grnDetail1.getBuyingPrice() + " check");
//        System.out.println(grnDetail1.getQuantity() + " check");
//
//        stm.setObject(1, grnDetail1.getGrnId());
//        stm.setObject(2, grnDetail1.getItemId());
//        stm.setObject(3, grnDetail1.getSellingPrice());
//        stm.setObject(4, grnDetail1.getBuyingPrice());
//        stm.setObject(5, grnDetail1.getQuantity());
//        int res = stm.executeUpdate();
//        return res > 0;
//    }
//
//    @Override
//    public boolean add(GrnDto dto) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean update(GrnDto dto) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean delete(String key) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public GrnDto search(String key) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public ArrayList<GrnDto> getAll() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public boolean add(GrnOrdeDetailDTO grnDetail1) throws Exception {
        String SQL = "Insert into grnDetail values (?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        System.out.println(grnDetail1.getGrnId() + " check");
        System.out.println(grnDetail1.getItemId() + " check");
        System.out.println(grnDetail1.getSellingPrice() + " check");
       // System.out.println(grnDetail1.getDate()+"check");
        System.out.println(grnDetail1.getBuyingPrice() + " check");
        System.out.println(grnDetail1.getQuantity() + " check");

        stm.setObject(1, grnDetail1.getGrnId());
        stm.setObject(2, grnDetail1.getItemId());
        stm.setObject(3, grnDetail1.getDate());
        stm.setObject(4, grnDetail1.getSellingPrice());
        stm.setObject(5, grnDetail1.getBuyingPrice());
        stm.setObject(6, grnDetail1.getQuantity());
        int res = stm.executeUpdate();
        
        System.out.println(res +"afssssssssssssssssssss");
        return res > 0;
    }

    @Override
    public boolean update(GrnOrdeDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GrnOrdeDetailDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<GrnOrdeDetailDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
