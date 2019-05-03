/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.CustomerDTO;
import edu.ijse.fms.dto.CustomerOrderDTO;
import edu.ijse.fms.dto.CustomerOrderDetailDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface CustomerController extends SuperController<CustomerDTO>{

    public ArrayList<CustomerDTO> searchCustomers(String type)throws Exception;

    
    
}
