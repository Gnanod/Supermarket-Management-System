/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.BatchDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.BatchDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class BatchDaoImpl implements BatchDAO {

    private Connection connection;

    public BatchDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(BatchDTO dto) throws Exception {

        String SQL = "Insert into batch Values(?,?,?,?,?)";
        //Insert into batch Values('B001','I001','G001',0.0,0.0);
        //Insert into item Values ('I001','anchor','B001');
        //Insert into grn Values ('G001','2017-9-18')
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getBatchId());
        stm.setObject(3, dto.getGrnId());
        stm.setObject(2, dto.getItemId());
        stm.setObject(4, dto.getUnitPrice());
        stm.setObject(5, dto.getAmmount());
//        System.out.println(dto.getBatchId() + "sddsadfasf");
//        System.out.println(dto.getGrnId() + "sddsadfasf");
//        System.out.println(dto.getItemId() + "sddsadfasf");
//        System.out.println(dto.getUnitPrice() + "sddsadfasf");
//        System.out.println(dto.getAmount()+ "sddsadfasf");
        System.out.println(stm);
        int res = stm.executeUpdate();

        return res > 0;
    }

    @Override
    public boolean update(BatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO search(String key) throws Exception {
        String SQL = "select * from batch where batchId ='" + key + "'";

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            BatchDTO batchDto = new BatchDTO();
            batchDto.setItemId(rst.getString("itemId"));
            batchDto.setUnitPrice(rst.getDouble("unitPrice"));
            batchDto.setAmmount(rst.getDouble("amount"));
            return batchDto;
        }
        return null;
    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
        Statement stm = connection.createStatement();
        String SQL = "select * from batch";
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<BatchDTO> batchList = new ArrayList<>();
        while (rst.next()) {
            BatchDTO batchDTO = new BatchDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5));
            batchList.add(batchDTO);
        }
        return batchList;
    }

    @Override
    public boolean updateBatch(BatchDTO batchList1) throws Exception {
        //String SQL = "update batch set grnId = '" + batchList1.getGrnId() + "',itemId = '" + batchList1.getItemId() + "',unitPrice = '" + batchList1.getUnitPrice() + "',amount ='" + batchList1.getAmount() + "' where batchId = '" + batchList1.getBatchId() + "'";
        //String sql = "Update batch set grnId=?, itemId=? ,unitPrice=?, amount=? where batchId=?";
        String SQL = "update batch set grnId = '" + batchList1.getGrnId() + "',itemId = '" + batchList1.getItemId() + "',unitPrice = '" + batchList1.getUnitPrice() + "',amount ='" + batchList1.getAmmount()+ "' where batchId = '" + batchList1.getBatchId() + "'";
        System.out.println(batchList1.getGrnId() +"qwe");
        System.out.println(batchList1.getItemId() +"qwe");
        System.out.println(batchList1.getUnitPrice() +"qwe");
        System.out.println(batchList1.getAmmount()+"qwe");
        System.out.println(batchList1.getBatchId() +"qwe");
        
        Statement stm = connection.createStatement();
        System.out.println(stm + "[[[[[[[[[[[[[[[[[[[[[[[[[");
        int res = stm.executeUpdate(SQL);
//        
//        stm.setObject(1, batchList1.getGrnId());
//        stm.setObject(2, batchList1.getItemId());
//        
//        
//        stm.setObject(3, batchList1.getUnitPrice());
//        stm.setObject(4, batchList1.getAmount());
//        stm.setObject(5, batchList1.getBatchId());
//        int res = stm.executeUpdate();
//        System.out.println(stm.executeUpdate(sql) + "qqqqqqqqqqqqqqqqqqqq");

        return res > 0;

    }

    @Override
    public String serchBatchId(String itemId) throws Exception {
        String SQL = "Select batchId from batch where itemId='" + itemId + "'";
        Statement stm = connection.createStatement();
        System.out.println(stm + "qqqqqqqqq");
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {

            return rst.getString("batchId");
        }
        return null;
    }

    @Override
    public boolean batchUpdate(String[] update) throws Exception {
        String SQL = "update batch set amount ='" + Double.parseDouble(update[1]) + "' where batchId = '" + update[0] + "'";

        Statement stm = connection.createStatement();
        int res = stm.executeUpdate(SQL);
        return res > 0;
    }

}
