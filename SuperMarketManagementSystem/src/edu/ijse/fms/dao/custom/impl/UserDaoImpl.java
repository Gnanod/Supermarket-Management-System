/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.UserDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.SupplierDTO;
import edu.ijse.fms.dto.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class UserDaoImpl implements UserDAO {

    private Connection connection;

    public UserDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(UserDTO user) throws Exception {
        String SQL = "Insert into user Values(?,?,?,?,?,?,?)";

        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, user.getUserName());
        stm.setObject(2, user.getUserId());
        stm.setObject(3, user.getUserType());
        stm.setObject(4, user.getUserGender());
        stm.setObject(5, user.getUserPassword());
        stm.setObject(6, user.getUserTelNumber());
        stm.setObject(7, user.getUserAddress());
        int res = stm.executeUpdate();
        System.out.println(stm + "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        return res > 0;
    }

    @Override
    public boolean update(UserDTO dto) throws Exception {
        String SQL = "Update user set userName='" + dto.getUserName() + "',userType ='" + dto.getUserType() + "',gender='" + dto.getUserGender() + "',address='" + dto.getUserAddress() + "',telNumber='" + dto.getUserTelNumber() + "',password='" + dto.getUserPassword() + "'  where userId='" + dto.getUserId() + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL = "Delete From User where userId= '" + key + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }

    @Override
    public UserDTO search(String key) throws Exception {

        String SQL = "Select * from user where userId = '" + key + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            UserDTO company = new UserDTO(rst.getString("userId"), rst.getString("userName"), rst.getString("userType"), rst.getString("gender"), rst.getString("password"), rst.getString("telNumber"), rst.getString("address"));
            return company;
        }
        return null;
    }

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        String SQL = "Select * from user";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<UserDTO> user = new ArrayList<>();
        while (rst.next()) {
            UserDTO userDto = new UserDTO(rst.getString("userName"), rst.getString("userId"), rst.getString("userType"), rst.getString("gender"), rst.getString("password"), rst.getString("telNumber"), rst.getString("address"));
            user.add(userDto);
        }
        return user;

    }

    @Override
    public ArrayList<UserDTO> searchSuppliers(String type) throws Exception {
        String SQL = "Select * from user where UserName like '%"+type+"%' || userId like '%"+type +"%' || gender like '%"+type+"%'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<UserDTO> userList = new ArrayList<>();
        while (rst.next()) {
            UserDTO company = new UserDTO(rst.getString("userId"), rst.getString("userName"), rst.getString("userType"), rst.getString("gender"), rst.getString("password"), rst.getString("telNumber"), rst.getString("address"));
            userList.add(company);

        }
        return userList;
    }
}
