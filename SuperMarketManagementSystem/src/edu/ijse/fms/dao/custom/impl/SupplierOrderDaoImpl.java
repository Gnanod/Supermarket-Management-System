/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.SupplierOrderDao;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.SupplierOrderDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class SupplierOrderDaoImpl implements SupplierOrderDao{
    private Connection connection;
    
    public  SupplierOrderDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }
    @Override
    public boolean add(SupplierOrderDTO dto) throws Exception {
        String SQL = "Insert into SupplierOrder values (?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getSupplierId());
        stm.setObject(2, dto.getSupplierOrderId());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(SupplierOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierOrderDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierOrderDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
