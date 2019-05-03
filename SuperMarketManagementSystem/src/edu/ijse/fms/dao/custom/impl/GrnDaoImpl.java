/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.GrnDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.GrnDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class GrnDaoImpl implements GrnDAO {

    private Connection connection;

    public GrnDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(GrnDto dto) throws Exception {
        String SQL = "Insert into grn Values(?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getGrnId());
        stm.setObject(2, dto.getGrnDate());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(GrnDto dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GrnDto search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<GrnDto> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
