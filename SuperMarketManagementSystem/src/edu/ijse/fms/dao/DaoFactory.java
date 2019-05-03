/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao;

import edu.ijse.fms.dao.custom.SupplierOrderDetailDAO;
import edu.ijse.fms.dao.custom.impl.BatchDaoImpl;
import edu.ijse.fms.dao.custom.impl.BrandDaoImpl;
import edu.ijse.fms.dao.custom.impl.CustomerDaoImpl;
import edu.ijse.fms.dao.custom.impl.CustomerOrderDaoImpl;
import edu.ijse.fms.dao.custom.impl.CustomerOrderDetailDaoImpl;
import edu.ijse.fms.dao.custom.impl.CustomerOrderPaymentImpl;
import edu.ijse.fms.dao.custom.impl.GrnDaoImpl;
import edu.ijse.fms.dao.custom.impl.GrnDetailDaoImpl;
import edu.ijse.fms.dao.custom.impl.ItemBrandNameQueryDaoImpl;
import edu.ijse.fms.dao.custom.impl.ItemDaoImpl;
import edu.ijse.fms.dao.custom.impl.ItemNameBatchIdDaoImpl;
import edu.ijse.fms.dao.custom.impl.SupplierDaoImpl;
import edu.ijse.fms.dao.custom.impl.SupplierOrderDaoImpl;
import edu.ijse.fms.dao.custom.impl.SupplierOrderDetailDaoImpl;
import edu.ijse.fms.dao.custom.impl.SupplierOrderPaymentDaoImpl;
import edu.ijse.fms.dao.custom.impl.UserDaoImpl;
import edu.ijse.fms.dao.custom.impl.ValubleCustomerDaoImpl;
import edu.ijse.fms.dao.custom.impl.ViewItemNameBatchDaoImpl;
import edu.ijse.fms.dao.custom.impl.ViewSupplierOrderQueryDaoImpl;

/**
 *
 * @author Gnanod
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    public enum DAOTypes {

        SUPPLIER, USER, CUSTOMER, BRAND, BATCH, ITEM, SUPPLIERORDER,ITEMBRANDNAME,SUPPLIERORERDETAIL,VIEWSUPPLIERORDER,GRN,GRNDETAIL,CUSTOMERORDER,CUSTOMRORDERDETAIL,CUSTOMERPAYMENT,ITEMNAMEBATCHID,ITEMNAMEBATCH,SUPPLIERORDERPAYMENT,VALUBLECUSTOMER;
    }

    private DaoFactory(){

    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoTypes){
        switch(daoTypes){
            case SUPPLIER:
                return  new SupplierDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            case BRAND:
                return new BrandDaoImpl();
            case ITEM:
                return new ItemDaoImpl();
            case USER:
                return new UserDaoImpl();
            case ITEMBRANDNAME:
                return new ItemBrandNameQueryDaoImpl();
            case SUPPLIERORDER:
                return new SupplierOrderDaoImpl();
            case SUPPLIERORERDETAIL:
                return new SupplierOrderDetailDaoImpl();
            case VIEWSUPPLIERORDER:
                return new ViewSupplierOrderQueryDaoImpl();
            case BATCH:
                return new BatchDaoImpl();
            case GRN:
                return new GrnDaoImpl();
            case GRNDETAIL:
                return new GrnDetailDaoImpl();
            case CUSTOMERORDER:
                return new CustomerOrderDaoImpl();
            case CUSTOMRORDERDETAIL:
                return new CustomerOrderDetailDaoImpl();
            case CUSTOMERPAYMENT:
                return new CustomerOrderPaymentImpl();
            case ITEMNAMEBATCHID:
                return new ItemNameBatchIdDaoImpl();
            case ITEMNAMEBATCH:
                return new ViewItemNameBatchDaoImpl();
            case SUPPLIERORDERPAYMENT:
                return new SupplierOrderPaymentDaoImpl();
            case VALUBLECUSTOMER:
                return new ValubleCustomerDaoImpl();
            default:
                return null;
        }
    }
}
