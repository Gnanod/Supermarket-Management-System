/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom;

import edu.ijse.fms.controller.SuperController;
import edu.ijse.fms.dto.ItemNameBatchIdDTO;
import edu.ijse.fms.dto.ViewItemNameBatchDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface ViewItemNameBatchController extends SuperController<ViewItemNameBatchDTO> {



    public ArrayList<ViewItemNameBatchDTO> searchAll(String type)throws Exception;
    
}
