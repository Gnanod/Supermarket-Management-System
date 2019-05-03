/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller.custom.impl;

import edu.ijse.fms.controller.custom.GrnController;
import edu.ijse.fms.dao.DaoFactory;
import edu.ijse.fms.dao.custom.BatchDAO;
import edu.ijse.fms.dao.custom.GrnDAO;
import edu.ijse.fms.dao.custom.GrnDetailDAO;
import edu.ijse.fms.dao.custom.SupplierOrderPaymentDAO;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.BatchDTO;
import edu.ijse.fms.dto.GrnDto;
import edu.ijse.fms.dto.GrnOrdeDetailDTO;
import edu.ijse.fms.dto.SupplierOrderPaymentDTO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class GrnControllerImpl implements GrnController {

    private GrnDAO grnDao;
    private GrnDetailDAO grnDetailDao;
    private BatchDAO batchDAO;
    private SupplierOrderPaymentDAO supplierOrderPayment;

    public GrnControllerImpl() {
        grnDao = (GrnDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.GRN);
        grnDetailDao = (GrnDetailDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.GRNDETAIL);
        batchDAO = (BatchDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.BATCH);
        supplierOrderPayment = (SupplierOrderPaymentDAO) DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.SUPPLIERORDERPAYMENT);
    }

    @Override
    public boolean add(GrnDto dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GrnDto search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(GrnDto dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<GrnDto> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public boolean add(GrnDto dto, ArrayList<GrnOrdeDetailDTO> grnDetailList, ArrayList<BatchDTO> batchList) throws Exception {
//        Connection connection = ConnectionFactory.getInstance().getConnection();
//        connection.setAutoCommit(false);
//        boolean result = grnDao.add(dto);
//        if (result) {
//            for (GrnOrdeDetailDTO grnDetail1 : grnDetailList) {
//                result = grnDetailDao.add(grnDetail1);
//                System.out.println(result + "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
//                if (result) {
//                    for (BatchDTO batchList1 : batchList) {
//                        boolean isUpdated = batchDAO.updateBatch(batchList1);
//                        System.out.println(isUpdated + "bbbbbbbbbbbbbbbbbbbbb");
//                        //System.out.println(batchList1.getGrnId() + "check");
//                        if (!isUpdated) {
//                            connection.rollback();
//                            connection.setAutoCommit(true);
//                            return false;
//                        }
//                    }
//
//                }
//
//            }
//            connection.setAutoCommit(true);
//            return true;
//
//        } else {
//            connection.setAutoCommit(true);
//            return false;
//        }
//    }
//    @Override
//    public boolean add(GrnDto dto, ArrayList<GrnOrdeDetailDTO> grnDetailList, ArrayList<BatchDTO> batchList, ArrayList<SupplierOrderPaymentDTO> supplierList) throws Exception {
////        Connection connection = ConnectionFactory.getInstance().getConnection();
//        connection.setAutoCommit(false);
//        boolean result = grnDao.add(dto);
//        if (result) {
//            for (GrnOrdeDetailDTO grnDetail1 : grnDetailList) {
//                result = grnDetailDao.add(grnDetail1);
//
//                if (result) {
//                    for (BatchDTO batchList1 : batchList) {
//                        boolean isUpdated = batchDAO.updateBatch(batchList1);
//                        if (isUpdated) {
//                            for (SupplierOrderPaymentDTO supplierList1 : supplierList) {
//                                boolean isAdded = supplierOrderPayment.add(supplierList1);
//                                if (!isAdded) {
//                                    connection.rollback();
//                                    connection.setAutoCommit(true);
//                                    return false;
//                                }
//                            }
//
//                        }
//
//                    }
//
//                }
//
//            }
//            connection.setAutoCommit(true);
//            return true;
//
//        } else {
//            connection.setAutoCommit(true);
//            return false;
//        }
//
//    }
    @Override
    public boolean add(GrnDto dto, ArrayList<GrnOrdeDetailDTO> grnDetailList, ArrayList<BatchDTO> batchList, SupplierOrderPaymentDTO supplierPayment) throws Exception {
        Connection connection = ConnectionFactory.getInstance().getConnection();
        connection.setAutoCommit(false);
        boolean result = grnDao.add(dto);
        int addedGrnCount = 0;
        if (result) {
            for (GrnOrdeDetailDTO grnDetail1 : grnDetailList) {
                result = grnDetailDao.add(grnDetail1);

                if (result) {
                    addedGrnCount++;
                    boolean isAdded = false;
                    if (addedGrnCount == 1) {
                        isAdded = supplierOrderPayment.add(supplierPayment);
                    }
                    if (isAdded) {
                        for (BatchDTO batchList1 : batchList) {
                            boolean isUpdated = batchDAO.updateBatch(batchList1);

                            if (!isAdded) {
                                connection.rollback();
                                connection.setAutoCommit(true);
                                return false;
                            }

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

    }
//        Connection connection = ConnectionFactory.getInstance().getConnection();
//        connection.setAutoCommit(false);
//        boolean result = grnDao.add(dto);
//        if (result) {
//            for (GrnOrdeDetailDTO grnDetail1 : grnDetailList) {
//                result = grnDetailDao.add(grnDetail1);
//
//                if (result) {
//                    for (BatchDTO batchList1 : batchList) {
//                        boolean isUpdated = batchDAO.updateBatch(batchList1);
//                        if (isUpdated) {
//                            for (SupplierOrderPaymentDTO supplierList1 : supplierList) {
//                                boolean isAdded = supplierOrderPayment.add(supplierList1);
//                                if (!isAdded) {
//                                    connection.rollback();
//                                    connection.setAutoCommit(true);
//                                    return false;
//                                }
//                            }
//
//                        }
//
//                    }
//
//                }
//
//            }
//            connection.setAutoCommit(true);
//            return true;
//
//        } else {
//            connection.setAutoCommit(true);
//            return false;
//        }

}
