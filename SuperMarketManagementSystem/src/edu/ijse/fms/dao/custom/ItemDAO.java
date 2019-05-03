/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom;

import edu.ijse.fms.dao.SuperDAO;
import edu.ijse.fms.dto.BatchDTO;
import edu.ijse.fms.dto.ItemDTO;

/**
 *
 * @author Gnanod
 */
public interface ItemDAO extends SuperDAO<ItemDTO>{

    public String getItemId(String itemName)throws Exception;

    public String getItemName(String itemId) throws Exception;

    
    
}
