/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dao.custom.impl;

import edu.ijse.fms.common.IDGenerator;
import edu.ijse.fms.dao.custom.ViewSupplierOrderQueryDao;
import edu.ijse.fms.db.ConnectionFactory;
import edu.ijse.fms.dto.ItemBrandNameDTO;
import edu.ijse.fms.dto.ViewItemBrandDTO;
import edu.ijse.fms.dto.ViewSupplierOrderDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gnanod
 */
public class ViewSupplierOrderQueryDaoImpl implements ViewSupplierOrderQueryDao {

    private Connection connection;

    public ViewSupplierOrderQueryDaoImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(ViewSupplierOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ViewSupplierOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewSupplierOrderDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewSupplierOrderDTO> getAll() throws Exception {
//        String SQL = "select o.supplierOrderId,supplierName,supplierCompanyName,orderDate,itemName,quantity,buyingPrice \n" +
//                          "from Supplier s,supplierorder od,item i,supplierOrderDetail o\n" +
//                                   "where s.supplierId = od.supplierId and i.itemId = o.itemId";
//        String SQL ="select od.supplierOrderId,s.supplierName,s.supplierCompanyName,o.orderDate,i.itemName,o.quantity,o.buyingPrice \n" +
//                        "from Supplier s,supplierorder od,item i,supplierOrderDetail o\n" +
//                                "where s.supplierId = od.supplierId  and i.itemId = o.itemId"
//                + "\n" +
//                                        "group by s.suppliername;";
        String SQL = "SELECT supplierorder.`supplierOrderId`, supplier.supplierName, supplier.supplierCompanyName, supplierorderdetail.`orderDate`, supplierorderdetail.`buyingPrice`,supplierorderdetail.quantity, item.`itemName` FROM supplierorder \n"
                + "INNER JOIN supplier ON supplierorder.supplierId = supplier.supplierId INNER JOIN supplierorderdetail ON supplierorder.`supplierOrderId` = supplierorderdetail.`supplierOrderId` INNER JOIN item ON item.`itemId` = supplierorderdetail.`itemId`";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<ViewSupplierOrderDTO> list = new ArrayList<>();
        while (rst.next()) {
            ViewSupplierOrderDTO v1 = new ViewSupplierOrderDTO();
            v1.setSupplierOrderId(rst.getString(1));
            v1.setSupplierName(rst.getString(2));
            v1.setSupplierCompany(rst.getString(3));
            v1.setSupplierOrderDate(rst.getString(4));

            v1.setBuyingPrice(rst.getDouble(5));
            v1.setQuantity(rst.getDouble(6));
            v1.setItemName(rst.getString(7));
            list.add(v1);

        }
        return list;

    }

    @Override
    public ViewSupplierOrderDTO serchType(String type) throws SQLException {
        String SQL = "SELECT supplierorder.`supplierOrderId`, supplier.supplierName, supplier.supplierCompanyName, supplierorderdetail.`orderDate`, supplierorderdetail.`buyingPrice`,supplierorderdetail.quantity, item.`itemName` FROM supplierorder \n"
                + "INNER JOIN supplier ON supplierorder.supplierId = supplier.supplierId INNER JOIN supplierorderdetail ON supplierorder.`supplierOrderId` = supplierorderdetail.`supplierOrderId` INNER JOIN item ON item.`itemId` = supplierorderdetail.`itemId` WHERE supplierorderdetail.`supplierOrderId` like '" + type + "%' || supplierorderdetail.`orderDate` like '"+type+"%'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            ViewSupplierOrderDTO v1 = new ViewSupplierOrderDTO();
            v1.setSupplierName(rst.getString(2));
            v1.setSupplierCompany(rst.getString(3));
            v1.setSupplierOrderDate(rst.getString(4));

            v1.setBuyingPrice(rst.getDouble(5));
            v1.setQuantity(rst.getDouble(6));
            v1.setItemName(rst.getString(7));
            return v1;
            
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<ViewSupplierOrderDTO> searchType(String type) throws Exception {
//        String SQL = "SELECT supplierorder.`supplierOrderId`, supplier.supplierName, supplier.supplierCompanyName, supplierorderdetail.`orderDate`, supplierorderdetail.`buyingPrice`,supplierorderdetail.quantity, item.`itemName` FROM supplierorder \n"
//                + "INNER JOIN supplier ON supplierorder.supplierId = supplier.supplierId INNER JOIN supplierorderdetail ON supplierorder.`supplierOrderId` = supplierorderdetail.`supplierOrderId` INNER JOIN item ON item.`itemId` = supplierorderdetail.`itemId` WHERE supplierorderdetail.`supplierOrderId` like '%" + type + "%'";
        String SQL ="SELECT supplierorder.`supplierOrderId`, supplier.supplierName, supplier.supplierCompanyName, supplierorderdetail.`orderDate`, supplierorderdetail.`buyingPrice`,supplierorderdetail.quantity, item.`itemName` FROM supplierorder \n" +
                        "INNER JOIN supplier ON supplierorder.supplierId = supplier.supplierId INNER JOIN supplierorderdetail ON supplierorder.`supplierOrderId` = supplierorderdetail.`supplierOrderId` INNER JOIN item ON item.`itemId` = supplierorderdetail.`itemId` where supplierorderdetail.`supplierOrderId`='"+type+"' ";
        Statement stm = connection.createStatement();
        ArrayList<ViewSupplierOrderDTO> list = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
      
       while(rst.next()) {
            ViewSupplierOrderDTO v1 = new ViewSupplierOrderDTO();
            v1.setSupplierOrderId(rst.getString(1));
            v1.setSupplierName(rst.getString(2));
            v1.setSupplierCompany(rst.getString(3));
            v1.setSupplierOrderDate(rst.getString(4));

            v1.setBuyingPrice(rst.getDouble(5));
            v1.setQuantity(rst.getDouble(6));
            v1.setItemName(rst.getString(7));
           
            list.add(v1);
            
        }
            return list;
        
    }

}
