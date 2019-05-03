/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.ViewSupplierOrderController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.ViewSupplierOrderQueryDao;
import edu.ijse.fms.dto.ViewSupplierOrderDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class ViewSupplierOrderControllerImpl implements ViewSupplierOrderController{
    private ViewSupplierOrderQueryDao viewSupplierOrderQueryDao;
    public ViewSupplierOrderControllerImpl(){
        viewSupplierOrderQueryDao = (ViewSupplierOrderQueryDao) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.VIEWSUPPLIERORDER);
    }
//    @Override
//    public boolean add(ViewSupplierOrderDTO dto) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public ViewSupplierOrderDTO search(String key) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean delete(String key) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean update(ViewSupplierOrderDTO dto) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public ArrayList<ViewSupplierOrderDTO> getAll() throws Exception {
//        return viewSupplierOrderQueryDao.getAll();
//    }
//
//    @Override
//    public ViewSupplierOrderDTO serchType(String type) throws Exception {
//        return viewSupplierOrderQueryDao.serchType (type);
//    }

    @Override
    public ArrayList<ViewSupplierOrderDTO> searchType(String type) throws Exception {
        return viewSupplierOrderQueryDao.searchType(type);
    }

    @Override
    public boolean add(ViewSupplierOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewSupplierOrderDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ViewSupplierOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewSupplierOrderDTO> getAll() throws Exception {
        return viewSupplierOrderQueryDao.getAll();
    }
    
}
