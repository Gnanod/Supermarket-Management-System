/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom;

import edu.ijse.fms.dao.SuperDAO;
import edu.ijse.fms.dto.BatchDTO;

/**
 *
 * @author Gnanod
 */
public interface BatchDAO extends SuperDAO<BatchDTO>{

    public boolean updateBatch(BatchDTO batchList1) throws Exception;

    //public String serchBatchId()throws Exception;

    public String serchBatchId(String itemId)throws Exception;

    public boolean batchUpdate(String[] update)throws Exception;
    
}
