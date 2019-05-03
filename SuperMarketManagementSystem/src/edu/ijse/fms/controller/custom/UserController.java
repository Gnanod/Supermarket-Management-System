/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.SuperDTO;
import edu.ijse.fms.dto.SupplierDTO;
import edu.ijse.fms.dto.UserDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface UserController extends SuperController<UserDTO>{

    public ArrayList<UserDTO> searchSuppliers(String type)throws Exception;

    
    
}
