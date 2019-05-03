/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.SupplierOrderPaymentDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.SupplierOrderPaymentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class SupplierOrderPaymentDaoImpl implements SupplierOrderPaymentDAO {

    private Connection connection;

    public SupplierOrderPaymentDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(SupplierOrderPaymentDTO dto) throws Exception {
        String SQL = "Insert into supplierOrderPayment values(?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getPaymentId());
        stm.setObject(2, dto.getGrnId());
        stm.setObject(3, dto.getPaymentType());
        stm.setObject(4, dto.getDate());
        int res = stm.executeUpdate();
        return res > 0;
        
    }

    @Override
    public boolean update(SupplierOrderPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierOrderPaymentDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierOrderPaymentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
