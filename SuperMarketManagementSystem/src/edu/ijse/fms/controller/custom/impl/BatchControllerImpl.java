/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.BatchController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.BatchDAO;
import edu.ijse.fms.dto.BatchDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class BatchControllerImpl implements BatchController{
    private BatchDAO batchDao;

    public BatchControllerImpl() {
    batchDao = (BatchDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.BATCH);
    }
    
    
    @Override
    public boolean add(BatchDTO dto) throws Exception {
        return batchDao.add(dto);
    }

    @Override
    public BatchDTO search(String key) throws Exception {
        return batchDao.search(key);
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(BatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
        return batchDao.getAll();
    }

    @Override
    public String searchBatchId(String itemId) throws Exception {
        return batchDao.serchBatchId(itemId);
    }

    @Override
    public boolean batchUpdate(String[] update) throws Exception {
        return batchDao.batchUpdate(update);
    }
         
}
