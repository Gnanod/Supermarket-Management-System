/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.CustomerOrderPaymentDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.CustomerOrderPaymentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;



/**
 *
 * @author Gnanod
 */
public class CustomerOrderPaymentImpl implements CustomerOrderPaymentDAO{
    private Connection connection;
    
    public CustomerOrderPaymentImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }
    @Override
    public boolean add(CustomerOrderPaymentDTO dto) throws Exception {
        String SQL = "Insert  into customerPayment values(?,?,?,?)";
       // "Insert into customerPayment('COI001','P001','CreditCard','2017-05-25')";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1,dto.getCustomerOrderId());
        stm.setObject(2,dto.getPaymentId());
        stm.setObject(3,dto.getPaymentType());
        stm.setObject(4,dto.getDate());
               

        int res = stm.executeUpdate();
        System.out.println(res + "ppppppppppppppppppppppppp");
        return res > 0;
    }

    @Override
    public boolean update(CustomerOrderPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerOrderPaymentDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerOrderPaymentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
