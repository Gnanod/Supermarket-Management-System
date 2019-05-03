/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.SupplierOrderController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.SupplierOrderDao;
import edu.ijse.fms.dao.custom.SupplierOrderDetailDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.SupplierOrderDTO;
import edu.ijse.fms.dto.SupplierOrderDetailDTO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class SupplierOrderControllerImpl implements SupplierOrderController{

    private SupplierOrderDao supplierOrderDao;
    private SupplierOrderDetailDAO supplierOrderDetailDAO;
    public SupplierOrderControllerImpl(){
        supplierOrderDao = (SupplierOrderDao) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.SUPPLIERORDER);
        supplierOrderDetailDAO= (SupplierOrderDetailDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.SUPPLIERORERDETAIL);
    }
    @Override
    public boolean add(SupplierOrderDTO dto) throws Exception {
        return supplierOrderDao.add(dto);
    }

    @Override
    public SupplierOrderDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SupplierOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierOrderDTO> getAll() throws Exception {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(SupplierOrderDTO supplierOrderDto, ArrayList<SupplierOrderDetailDTO> orderDetail) throws Exception {
        Connection connection = ConnectionFactory.getInstance().getConnection();
        
        connection.setAutoCommit(false);
        boolean result = supplierOrderDao.add(supplierOrderDto);
       // System.out.println(result);
        if(result){
            for (SupplierOrderDetailDTO orderDetail1 : orderDetail) {
               result = supplierOrderDetailDAO.add(orderDetail1);
               
                if(!result){
                    connection.rollback();
                    connection.setAutoCommit(true);
                    return false;
                }
            }
            connection.setAutoCommit(true);
            return true;
        }else{
            connection.setAutoCommit(true);
            return false;
        }
    }
    
}
