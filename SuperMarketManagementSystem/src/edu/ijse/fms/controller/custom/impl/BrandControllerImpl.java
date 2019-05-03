/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import com.sun.javafx.sg.prism.GrowableDataBuffer;
import edu.ijse.fms.controller.custom.BrandController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.BrandDAO;
import edu.ijse.fms.dto.BrandDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class BrandControllerImpl implements BrandController{
    private BrandDAO brandDao;
    
    public BrandControllerImpl(){
        brandDao =(BrandDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.BRAND);
    }
    @Override
    public boolean add(BrandDTO dto) throws Exception {
       return brandDao.add(dto);
    }

    @Override
    public BrandDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(BrandDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BrandDTO> getAll() throws Exception {
        return brandDao.getAll();
    }

    @Override
    public String getItemCode(String name) throws Exception {
       
        return brandDao.getItemCode(name);
    }
    
}
