/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.BatchDTO;
import edu.ijse.fms.dto.GrnDto;
import edu.ijse.fms.dto.GrnOrdeDetailDTO;
import edu.ijse.fms.dto.SupplierOrderPaymentDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface GrnController extends SuperController<GrnDto>{

    public boolean add(GrnDto dto, ArrayList<GrnOrdeDetailDTO> grnDetailList, ArrayList<BatchDTO> batchList, SupplierOrderPaymentDTO supplierPayment)throws Exception;

   // public boolean add(GrnDto dto, ArrayList<GrnOrdeDetailDTO> grnDetailList, ArrayList<BatchDTO> batchList, ArrayList<SupplierOrderPaymentDTO> supplierList)throws Exception;

   // public boolean add(GrnDto dto, ArrayList<GrnOrdeDetailDTO> grnDetailList, ArrayList<BatchDTO> batchList)throws Exception;

   // public boolean add(GrnDto dto, ArrayList<GrnOrdeDetailDTO> grnDetail)throws Exception;
    
}
