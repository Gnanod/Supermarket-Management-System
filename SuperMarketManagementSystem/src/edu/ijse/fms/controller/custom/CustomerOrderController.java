/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.CustomerOrderDTO;
import edu.ijse.fms.dto.CustomerOrderDetailDTO;
import edu.ijse.fms.dto.CustomerOrderPaymentDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface CustomerOrderController extends SuperController<CustomerOrderDTO>{

    // public boolean add(ArrayList<CustomerOrderPaymentDTO> paymentList, ArrayList<CustomerOrderDetailDTO> orderDetail, ArrayList<CustomerOrderDTO> customerOrderList)throws Exception;

    //public boolean add(CustomerOrderDTO customerOrder, ArrayList<CustomerOrderDetailDTO> orderDetail, ArrayList<CustomerOrderDTO> customerOrderList)throws Exception;

    public boolean add(ArrayList<CustomerOrderPaymentDTO> paymentList, ArrayList<CustomerOrderDetailDTO> orderDetail, CustomerOrderDTO customerOrder)throws Exception;
    
}
