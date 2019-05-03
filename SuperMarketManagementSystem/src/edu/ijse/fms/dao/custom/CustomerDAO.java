/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom;

import edu.ijse.fms.dao.SuperDAO;
import edu.ijse.fms.dto.CustomerDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface CustomerDAO extends SuperDAO<CustomerDTO>{

    public ArrayList<CustomerDTO> searchCustomers(String type)throws Exception;
    
}
