/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.controller;

import edu.ijse.fms.controller.custom.CustomerOrderController;
import edu.ijse.fms.controller.custom.SupplierOrderDetailController;
import edu.ijse.fms.controller.custom.impl.BatchControllerImpl;
import edu.ijse.fms.controller.custom.impl.BrandControllerImpl;
import edu.ijse.fms.controller.custom.impl.CustomerControllerImpl;
import edu.ijse.fms.controller.custom.impl.CustomerOrderControllerImpl;
import edu.ijse.fms.controller.custom.impl.CustomerOrderPaymentImpl;
import edu.ijse.fms.controller.custom.impl.GrnControllerImpl;
import edu.ijse.fms.controller.custom.impl.GrnDetailControllerImpl;
import edu.ijse.fms.controller.custom.impl.ItemBrandNameControllerImpl;
import edu.ijse.fms.controller.custom.impl.ItemControllerImpl;
import edu.ijse.fms.controller.custom.impl.ItemNameBatchIdControllerImpl;
import edu.ijse.fms.controller.custom.impl.SupplierControllerImpl;
import edu.ijse.fms.controller.custom.impl.SupplierOrderControllerImpl;
import edu.ijse.fms.controller.custom.impl.SupplierOrderDetailControllerImpl;
import edu.ijse.fms.controller.custom.impl.UserControllerImpl;
import edu.ijse.fms.controller.custom.impl.ValubleCustomerControllerImpl;
import edu.ijse.fms.controller.custom.impl.ViewItemNameBatchControllerImpl;
import edu.ijse.fms.controller.custom.impl.ViewSupplierOrderControllerImpl;

/**
 *
 * @author Gnanod
 */

 //Test Hack RObo
    //Test Robofest
public class ControllerFactory {

    private static ControllerFactory controllerFactory;

    public enum ControllerTypes {

        SUPPLIER, USER, ITEM, BATCH, BRAND, CUSTOMER, SUPPLIERORDER,ITEMBRANDNAME,SUPPLIERORERDETAIL,VIEWSUPPLIERORDER,GRN,GRNDETAIL,CUSTOMERORDER,CUSTOMRORDERDETAIL,CUSTOMERPAYMENT,ITEMMNAMEBATCHID,ITEMNAMEBATCH,SUPPLIERORDERPAYMENT,VALUBLECUSTOMER;
    }

    private ControllerFactory() {

    }

    public static ControllerFactory getInstance() {
        if (controllerFactory == null) {
            controllerFactory = new ControllerFactory();
        }
        return controllerFactory;
    }

    public SuperController getController(ControllerTypes controllerTypes) {
        switch (controllerTypes) {
            case SUPPLIER:
                return new SupplierControllerImpl();
            case CUSTOMER:
                return new CustomerControllerImpl();
            case BRAND:
                return new BrandControllerImpl();
            case ITEM:
                return new ItemControllerImpl();
            case USER:
                return new UserControllerImpl();
            case ITEMBRANDNAME:
                return new ItemBrandNameControllerImpl();
            case SUPPLIERORDER:
                return new SupplierOrderControllerImpl();
            case SUPPLIERORERDETAIL:
                return new SupplierOrderDetailControllerImpl();
            case VIEWSUPPLIERORDER:
                return new ViewSupplierOrderControllerImpl();
            case BATCH:
                return new BatchControllerImpl();
            case GRN:
                return new GrnControllerImpl();
            case GRNDETAIL:
                return new GrnDetailControllerImpl();
            case CUSTOMERORDER:
                return new CustomerOrderControllerImpl();
            case CUSTOMRORDERDETAIL:
                return new CustomerOrderControllerImpl();
            case CUSTOMERPAYMENT:
                return new CustomerOrderPaymentImpl();
            case ITEMMNAMEBATCHID:
                return new ItemNameBatchIdControllerImpl();
            case ITEMNAMEBATCH:
                return new ViewItemNameBatchControllerImpl();
            case SUPPLIERORDERPAYMENT:
                return new SupplierOrderDetailControllerImpl();
            case VALUBLECUSTOMER:
                return new ValubleCustomerControllerImpl();
            default:
                return null;
        }
    }
}
