/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom;

import edu.ijse.fms.dao.SuperDAO;
import edu.ijse.fms.dto.ItemNameBatchIdDTO;

/**
 *
 * @author Gnanod
 */
public interface ItemNameBatchIdDAO extends SuperDAO<ItemNameBatchIdDTO>{

    public String searchBatchId(String name)throws Exception ;
    
}
