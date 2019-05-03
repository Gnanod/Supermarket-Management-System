/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.ItemNameBatchIdDAO;
import edu.ijse.fms.dao.custom.ViewItemNameBatchDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.CustomerDTO;
import edu.ijse.fms.dto.ItemNameBatchIdDTO;
import edu.ijse.fms.dto.ViewItemNameBatchDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class ViewItemNameBatchDaoImpl implements ViewItemNameBatchDAO {

    private Connection connection;

    public ViewItemNameBatchDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(ViewItemNameBatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ViewItemNameBatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewItemNameBatchDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewItemNameBatchDTO> getAll() throws Exception {
        String SQL = "select batchId,itemName,amount,unitPrice\n"
                + "from batch b,item i\n"
                + "where b.itemId = i.itemId";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<ViewItemNameBatchDTO> itemNameBatchList = new ArrayList<>();
        //System.out.println(stm +"mmmmmmmmmmmmmmmmmmmmmmmmmnnnnnnnnnnnnn");
        while (rst.next()) {
            ViewItemNameBatchDTO dto = new ViewItemNameBatchDTO(rst.getString("batchId"), rst.getString("itemName"), rst.getDouble("amount"), rst.getDouble("unitPrice"));
            itemNameBatchList.add(dto);
        }
        return itemNameBatchList;
    }

    @Override
    public ArrayList<ViewItemNameBatchDTO> searchAll(String type) throws Exception {
        String SQL = "select batchId,itemName,amount,unitPrice from batch b,item i where b.itemId = i.itemId and batchId like '%" + type + "%' || itemName like '%" + type + "%' || unitPrice like '%" + type + "%'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<ViewItemNameBatchDTO> list = new ArrayList<>();
        if (rst.next()) {
            ViewItemNameBatchDTO dto = new ViewItemNameBatchDTO();
            dto.setBatchId(rst.getString("batchId"));
            dto.setItemName(rst.getString("itemName"));
            dto.setAmount(rst.getDouble("amount"));
            dto.setUnitPrice(rst.getDouble("unitPrice"));
            list.add(dto);
        }
        return list;
    }

}
