/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom;

import edu.ijse.fms.dao.SuperDAO;
import edu.ijse.fms.dto.ItemBrandNameDTO;

/**
 *
 * @author Gnanod
 */
public interface ItemBrandNameQueryDAO extends SuperDAO<ItemBrandNameDTO>{

    public ItemBrandNameDTO searchBrandName(String name)throws Exception;

 //   public ArrayList<ItemBrandNameDTO> searchBrandName(String name)throws Exception;
    
}
