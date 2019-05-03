/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.BatchDTO;
import edu.ijse.fms.dto.ItemDTO;

/**
 *
 * @author Gnanod
 */
public interface ItemController extends SuperController<ItemDTO>{

    

    public String getItemId(String itemName)throws Exception;

    public boolean add(ItemDTO itemDto, BatchDTO batchDto)throws Exception;

    public String getItemName(String ItemId)throws Exception;
    
}
