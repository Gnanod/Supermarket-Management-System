/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.BatchDTO;

/**
 *
 * @author Gnanod
 */
public interface BatchController extends SuperController<BatchDTO>{

    public String searchBatchId(String itemId)throws Exception;

    public boolean batchUpdate(String[] update) throws Exception;
    
}
