/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.dao.custom.ValubleCustomerDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.ValubleCustomerDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class ValubleCustomerDaoImpl implements ValubleCustomerDAO {

    private Connection connection;

    public ValubleCustomerDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(ValubleCustomerDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ValubleCustomerDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ValubleCustomerDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ValubleCustomerDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ValubleCustomerDTO> searchNumber(int number) throws Exception {
        String SQL = " select customerName,date,grossAmount,address,TelephoneNumber\n"
                + "    from customer c,customerPayment p,customerOrder co\n"
                + "     where c.CustId = co.customerId and p.customerOrderId = co.customerOrderId \n"
                + "     group by c.customerName\n"
                + "order by 5 desc limit 2\n"
                + "     ";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<ValubleCustomerDTO> list = new ArrayList<>();
        while(rst.next()) {
            ValubleCustomerDTO dto = new ValubleCustomerDTO();
            dto.setCustomerName(rst.getString(1));
            dto.setDate(rst.getString(2));
            dto.setGrocessAmount(rst.getDouble(3));
            dto.setAddress(rst.getString(4));
            dto.setTelePhoneNumber(rst.getString(5));

            list.add(dto);

        }
        return list;

    }

}
