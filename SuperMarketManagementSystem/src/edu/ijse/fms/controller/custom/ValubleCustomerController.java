/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.ValubleCustomerDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface ValubleCustomerController extends SuperController<ValubleCustomerDTO> {

    public ArrayList<ValubleCustomerDTO> serchNumber(int number)throws Exception;
    
}
