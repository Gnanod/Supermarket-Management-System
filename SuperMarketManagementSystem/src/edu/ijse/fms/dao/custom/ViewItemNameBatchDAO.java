/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom;

import edu.ijse.fms.dao.SuperDAO;
import edu.ijse.fms.dto.ViewItemNameBatchDTO;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public interface ViewItemNameBatchDAO extends SuperDAO<ViewItemNameBatchDTO> {

    public ArrayList<ViewItemNameBatchDTO> searchAll(String type)throws Exception;
    
}
