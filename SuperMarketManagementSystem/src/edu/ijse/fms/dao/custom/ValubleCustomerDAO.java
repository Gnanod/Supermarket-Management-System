/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom;

import edu.ijse.fms.dao.SuperDAO;
import edu.ijse.fms.dto.ValubleCustomerDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface ValubleCustomerDAO extends SuperDAO<ValubleCustomerDTO>{

    public ArrayList<ValubleCustomerDTO> searchNumber(int number)throws Exception;
    
}
