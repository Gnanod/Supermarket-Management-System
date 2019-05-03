/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.CustomerOrderController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.CustomerOrderDAO;
import edu.ijse.fms.dao.custom.CustomerOrderDetailDAO;
import edu.ijse.fms.dao.custom.CustomerOrderPaymentDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.CustomerOrderDTO;
import edu.ijse.fms.dto.CustomerOrderDetailDTO;
import edu.ijse.fms.dto.CustomerOrderPaymentDTO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class CustomerOrderControllerImpl implements CustomerOrderController {

    private CustomerOrderDAO customerOrderDao;
    private CustomerOrderDetailDAO customerOrderDetailDao;
    private CustomerOrderPaymentDAO customerOrderPayment;

    public CustomerOrderControllerImpl() {
        customerOrderDao = (CustomerOrderDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.CUSTOMERORDER);
        customerOrderDetailDao = (CustomerOrderDetailDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.CUSTOMRORDERDETAIL);
        customerOrderPayment = (CustomerOrderPaymentDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.CUSTOMERPAYMENT);
    }

    @Override
    public boolean add(CustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerOrderDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerOrderDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

////    @Override
////    public boolean add(CustomerOrderDTO customerOrder, ArrayList<CustomerOrderDetailDTO> orderDetail, ArrayList<CustomerOrderDTO> customerOrderList) throws Exception {
//        Connection connection = ConnectionFactory.getInstance().getConnection();
//        connection.setAutoCommit(false);
//        boolean result = customerOrderDao.add(customerOrder);
//        if(result){
//                for (CustomerOrderDTO customerOrderList1 : customerOrderList) {
//                    result = 
//            }
//        }
////    }
//    @Override
//    public boolean add(ArrayList<CustomerOrderPaymentDTO> paymentList, ArrayList<CustomerOrderDetailDTO> orderDetail, ArrayList<CustomerOrderDTO> customerOrderList) throws Exception {
//        Connection connection = ConnectionFactory.getInstance().getConnection();
//        connection.setAutoCommit(false);
//        boolean asd = false;
//        for (CustomerOrderDTO customerOrderList1 : customerOrderList) {
//            System.out.println(customerOrderList1.getCustomerOrderId() + "qqqqqq");
//            boolean result = customerOrderDao.add(customerOrderList1);
//            System.out.println(result + "ssssssssssssssssssssssss");
//            if (result) {
//                for (CustomerOrderDetailDTO customerOrderList2 : orderDetail) {
//                    result = customerOrderDetailDao.add(customerOrderList2);
//                    if (result) {
//                        for (CustomerOrderPaymentDTO customerOrderList3 : paymentList) {
//                            result = customerOrderPayment.add(customerOrderList3);
//                            if (!result) {
//                                connection.rollback();
//                                connection.setAutoCommit(true);
//                                return false;
//                            }
//                        }
//                    }
//
//                }
//                connection.setAutoCommit(true);
//                asd = true;
//
//            } else {
//                connection.setAutoCommit(true);
//                asd = false;
//            }
//        }
//        return asd;
//    }
    @Override
    public boolean add(ArrayList<CustomerOrderPaymentDTO> paymentList, ArrayList<CustomerOrderDetailDTO> orderDetail, CustomerOrderDTO customerOrder) throws Exception {
        Connection connection = ConnectionFactory.getInstance().getConnection();
        connection.setAutoCommit(false);
        // boolean asd = false;
        //System.out.println(customerOrderList1.getCustomerOrderId() + "qqqqqq");
        boolean result = customerOrderDao.add(customerOrder);
        System.out.println(result + "ssssssssssssssssssssssss");
        if (result) {
            for (CustomerOrderPaymentDTO customerOrderList3 : paymentList) {
                result = customerOrderPayment.add(customerOrderList3);

                System.out.println(result + "nnnnnnnnnnnnnnnnnnnnn");
                if (result) {
                    for (CustomerOrderDetailDTO customerOrderList2 : orderDetail) {
                        result = customerOrderDetailDao.add(customerOrderList2);
                        if (!result) {
                            connection.rollback();
                            connection.setAutoCommit(true);
                            return false;
                        }
                    }
                }

            }
            connection.setAutoCommit(true);
            return true;

        } else {
            connection.setAutoCommit(true);
            return false;
        }

        //return asd;
    }
}
