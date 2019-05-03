/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.ItemBrandNameDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface ItemBrandNameController extends SuperController<ItemBrandNameDTO>{

    public ItemBrandNameDTO searchItemBrandName(String name)throws Exception;;

    

    //public ArrayList<ItemBrandNameDTO> searchItemBrandName(String name)throws Exception;

    //public ArrayList<ItemBrandNameDTO> viewAllBrandItem();
    
}
