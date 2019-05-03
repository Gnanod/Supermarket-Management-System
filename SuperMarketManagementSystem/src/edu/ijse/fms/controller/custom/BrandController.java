/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.BrandDTO;

/**
 *
 * @author Gnanod
 */
public interface BrandController extends SuperController<BrandDTO>{

    public String getItemCode(String name)throws Exception;

   
    
}
