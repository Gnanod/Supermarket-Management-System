/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.UserController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.UserDAO;
import edu.ijse.fms.dto.UserDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class UserControllerImpl implements UserController{
    private UserDAO userDao;

    public UserControllerImpl() {
        userDao = (UserDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.USER);
    }
    
    @Override
    public boolean add(UserDTO dto) throws Exception {
        return userDao.add(dto);
    }

    @Override
    public UserDTO search(String key) throws Exception {
        return userDao.search(key);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return userDao.delete(key);
    }

    @Override
    public boolean update(UserDTO dto) throws Exception {
        return userDao.update(dto);
    }

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        return userDao.getAll();
    
    }

    @Override
    public ArrayList<UserDTO> searchSuppliers(String type)throws Exception{
        return userDao.searchSuppliers(type);
    }
    
}
