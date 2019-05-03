/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.ViewSupplierOrderDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface ViewSupplierOrderController extends SuperController<ViewSupplierOrderDTO>{

    //public ViewSupplierOrderDTO serchType(String type)throws Exception;

    public ArrayList<ViewSupplierOrderDTO> searchType(String type) throws Exception;
    
}
