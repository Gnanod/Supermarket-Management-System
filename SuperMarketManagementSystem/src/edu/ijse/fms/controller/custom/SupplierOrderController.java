/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.SupplierOrderDTO;
import edu.ijse.fms.dto.SupplierOrderDetailDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface SupplierOrderController extends SuperController<SupplierOrderDTO>{

    public boolean add(SupplierOrderDTO supplierOrderDto, ArrayList<SupplierOrderDetailDTO> orderDetail)throws Exception;
    
}
