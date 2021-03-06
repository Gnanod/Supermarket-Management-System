/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.view.panel;

/*import edc.ijse.fms.comman.IDGenarater;
 import edu.ijse.fms.controller.ItemController;
 import edu.ijse.fms.controller.SupplierController;
 import edu.ijse.fms.models.Item;
 import edu.ijse.fms.models.Supplier;*/
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import com.sun.jmx.remote.util.OrderClassLoaders;
import edu.ijse.fms.common.IDGenerator;
import edu.ijse.fms.controller.ControllerFactory;
import edu.ijse.fms.controller.custom.ItemController;
import edu.ijse.fms.controller.custom.SupplierController;
import edu.ijse.fms.controller.custom.SupplierOrderController;
import edu.ijse.fms.dao.custom.ItemDAO;
import edu.ijse.fms.dao.custom.SupplierDAO;
import edu.ijse.fms.dto.ItemDTO;
import edu.ijse.fms.dto.SupplierDTO;
import edu.ijse.fms.dto.SupplierOrderDTO;
import edu.ijse.fms.dto.SupplierOrderDetailDTO;
import edu.ijse.fms.view.AddBatchFrame;
import edu.ijse.fms.view.AddSupplierFrame;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Gnanod
 */
public class SupplierOrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierOrderPanel
     */
    private SupplierController supplierController;
    private ItemController itemController;
    private DefaultTableModel dtm;
    private SupplierOrderController supplierOrderController;
    public SupplierOrderPanel() {
        initComponents();
        
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setOrderDate();
        dtm = (DefaultTableModel) supplierOrdertable.getModel();
        supplierController = (SupplierController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.SUPPLIER);
        itemController = (ItemController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.ITEM);
        supplierOrderController= (SupplierOrderController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.SUPPLIERORDER);
        loadSupplierCompanies();
        loadSupplierNames();
        loadItemNames();
        AutoCompleteDecorator.decorate(cmbSupplierCompany);
        AutoCompleteDecorator.decorate(cmbSupplierName);
        AutoCompleteDecorator.decorate(cmbItemName);
        getID();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel34 = new javax.swing.JLabel();
        txtSupplierOrderId = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtOrderDate = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        supplierOrdertable = new javax.swing.JTable();
        btnSave = new javax.swing.JLabel();
        btnRemove = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtBuyingPrice = new javax.swing.JTextField();
        cmbItemName = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        cmbSupplierCompany = new javax.swing.JComboBox();
        cmbSupplierName = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1070, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(53, 126, 120));
        jLabel34.setText("                        Supplier Order");
        jLabel34.setToolTipText("");
        jLabel34.setOpaque(true);
        add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 520, 50));

        txtSupplierOrderId.setEditable(false);
        txtSupplierOrderId.setBackground(new java.awt.Color(255, 255, 255));
        txtSupplierOrderId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSupplierOrderId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSupplierOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierOrderIdActionPerformed(evt);
            }
        });
        txtSupplierOrderId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSupplierOrderIdKeyPressed(evt);
            }
        });
        add(txtSupplierOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 170, 30));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(27, 157, 175));
        jLabel25.setText(" Total Amount");
        jLabel25.setToolTipText("");
        jLabel25.setOpaque(true);
        jLabel25.setRequestFocusEnabled(false);
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 120, 30));

        txtOrderDate.setEditable(false);
        txtOrderDate.setBackground(new java.awt.Color(255, 255, 255));
        txtOrderDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtOrderDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOrderDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrderDateKeyPressed(evt);
            }
        });
        add(txtOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, 30));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(27, 157, 175));
        jLabel26.setText("Order Date");
        jLabel26.setToolTipText("");
        jLabel26.setOpaque(true);
        jLabel26.setRequestFocusEnabled(false);
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 30));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(27, 157, 175));
        jLabel28.setText("Supplier Company");
        jLabel28.setToolTipText("");
        jLabel28.setOpaque(true);
        jLabel28.setRequestFocusEnabled(false);
        add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 30));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(27, 157, 175));
        jLabel29.setText("Item Name");
        jLabel29.setToolTipText("");
        jLabel29.setOpaque(true);
        jLabel29.setRequestFocusEnabled(false);
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 110, 30));

        txtTotalAmount.setEditable(false);
        txtTotalAmount.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAmountActionPerformed(evt);
            }
        });
        add(txtTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 170, 30));

        txtQty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtQty.setToolTipText("Press Enter");
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 150, 30));

        supplierOrdertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SupplierOrderId", "Supplier Name", "Item Name", "Date", "Quantity", "BuyingPrice", "Amount"
            }
        ));
        jScrollPane3.setViewportView(supplierOrdertable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 1050, 300));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(27, 157, 175)));
        btnSave.setOpaque(true);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, 130, 40));

        btnRemove.setBackground(new java.awt.Color(255, 255, 255));
        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRemove.setText("Remove Item");
        btnRemove.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(27, 157, 175)));
        btnRemove.setOpaque(true);
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveMouseExited(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 140, 30));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(27, 157, 175));
        jLabel30.setText("Quantity");
        jLabel30.setToolTipText("");
        jLabel30.setOpaque(true);
        jLabel30.setRequestFocusEnabled(false);
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 120, 30));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(27, 157, 175));
        jLabel31.setText("Buying Price");
        jLabel31.setToolTipText("");
        jLabel31.setOpaque(true);
        jLabel31.setRequestFocusEnabled(false);
        add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 120, 30));

        txtBuyingPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBuyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuyingPriceActionPerformed(evt);
            }
        });
        add(txtBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 150, 30));

        cmbItemName.setEditable(true);
        cmbItemName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbItemName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cmbItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbItemNameActionPerformed(evt);
            }
        });
        add(cmbItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 170, 30));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(27, 157, 175));
        jLabel32.setText("Supplier Name");
        jLabel32.setToolTipText("");
        jLabel32.setOpaque(true);
        jLabel32.setRequestFocusEnabled(false);
        add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 110, 30));

        cmbSupplierCompany.setEditable(true);
        cmbSupplierCompany.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbSupplierCompany.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cmbSupplierCompany.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSupplierCompanyItemStateChanged(evt);
            }
        });
        cmbSupplierCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierCompanyActionPerformed(evt);
            }
        });
        add(cmbSupplierCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 170, 30));

        cmbSupplierName.setEditable(true);
        add(cmbSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 190, 30));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(27, 157, 175));
        jLabel33.setText("Supplier Order Id");
        jLabel33.setToolTipText("");
        jLabel33.setOpaque(true);
        jLabel33.setRequestFocusEnabled(false);
        add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 140, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/fms/images/Add Batch.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/fms/images/Add Batch.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSupplierOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierOrderIdActionPerformed

    private void txtSupplierOrderIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSupplierOrderIdKeyPressed

    }//GEN-LAST:event_txtSupplierOrderIdKeyPressed

    private void txtOrderDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderDateKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderDateKeyPressed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        String supplierName = (String) cmbSupplierName.getSelectedItem();
        String itemName = (String) cmbItemName.getSelectedItem();
        double quantity = Double.parseDouble(txtQty.getText());
        double buyingPrice = Double.parseDouble(txtBuyingPrice.getText());
        String date = txtOrderDate.getText();
        //String orderDetailId = txtSupplierOrderDetailId.getText();
        String supplierOrderId = txtSupplierOrderId.getText();
        DefaultTableModel dtm = (DefaultTableModel) supplierOrdertable.getModel();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String name = (String) dtm.getValueAt(i, 1);
            if (itemName.equals(name)) {
                double qty = (double) dtm.getValueAt(i, 3);
                quantity += qty;
                dtm.removeRow(i);
                totalAmount -= qty * buyingPrice;
            }
        }
        double amount = buyingPrice * quantity;
        totalAmount += amount;
        txtTotalAmount.setText("" + totalAmount);
        if(cmbSupplierCompany.getItemCount()==0 && cmbSupplierName.getItemCount()==0 && cmbItemName.getItemCount()==0 && txtBuyingPrice.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this,"Added Fail");
        }else{
        Object[] rowData = {supplierOrderId,supplierName, itemName, date, quantity, buyingPrice, amount};

        dtm.addRow(rowData);
        }

    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void txtBuyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuyingPriceActionPerformed
//        String supplierName = (String) cmbSupplierName.getSelectedItem();
//        String itemName = (String) cmbItemName.getSelectedItem();
//        double quantity = Double.parseDouble(txtQty.getText());
//        double buyingPrice = Double.parseDouble(txtBuyingPrice.getText());
//        String date = txtOrderDate.getText();
//        DefaultTableModel dtm = (DefaultTableModel) supplierOrdertable.getModel();
//        for (int i = 0; i < dtm.getRowCount(); i++) {
//            String name = (String) dtm.getValueAt(i, 1);
//            if (itemName.equals(name)) {
//                double qty = (double) dtm.getValueAt(i, 3);
//                quantity += qty;
//                dtm.removeRow(i);
//                totalAmount -= qty * buyingPrice;
//            }
//        }
//        double amount = buyingPrice * quantity;
//        totalAmount += amount;
//        txtTotalAmount.setText("" + totalAmount);
//        Object[] rowData = {supplierName, itemName, date, quantity, buyingPrice, amount};
//
//        dtm.addRow(rowData);


    }//GEN-LAST:event_txtBuyingPriceActionPerformed

    private void cmbItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbItemNameActionPerformed

    private void cmbSupplierCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSupplierCompanyActionPerformed

    private void cmbSupplierCompanyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSupplierCompanyItemStateChanged
        String companyName = (String) cmbSupplierCompany.getSelectedItem();
        try {
            SupplierDTO serchName = supplierController.searchName(companyName);

            if (serchName != null) {

                cmbSupplierName.removeAllItems();
                cmbSupplierName.addItem(serchName.getSupplierName());

            }

        } catch (Exception ex) {
            Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbSupplierCompanyItemStateChanged

    private void btnRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseClicked
    // DefaultTableModel dtm = (DefaultTableModel) supplierOrdertable.getModel();
        if(dtm.getRowCount()==0){
            JOptionPane.showMessageDialog(this,"Please Select a Row");
        }else{
        int index = supplierOrdertable.getSelectedRow();
        double amount = (double) dtm.getValueAt(index, 6);
        dtm.removeRow(index);
        totalAmount -= amount;
        txtTotalAmount.setText("" + totalAmount);
        }
        
    }//GEN-LAST:event_btnRemoveMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        SupplierOrderDTO supplierOrderDto = new SupplierOrderDTO();
        String supplierOrderId = txtSupplierOrderId.getText();
        //String supplierOrderDetailId = txtSupplierOrderDetailId.getName();
        String supplierName = (String) cmbSupplierName.getSelectedItem();
        String supplierId = null;
        try {
            supplierId = supplierController.searchSupplierId(supplierName);
            
        } catch (Exception ex) {
            Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        supplierOrderDto.setSupplierId(supplierId);
        supplierOrderDto.setSupplierOrderId(supplierOrderId);
        
        
        ArrayList<SupplierOrderDetailDTO> orderDetail = new ArrayList<>();
       // getSupplierOrderDetailID();
        double totalAmount = Double.parseDouble(txtTotalAmount.getText());
        for (int i = 0; i < dtm.getRowCount(); i++) {
            SupplierOrderDetailDTO supplierOrderDetail = new SupplierOrderDetailDTO();
            
            supplierOrderDetail.setSupplierOrderId(supplierOrderId);
            supplierOrderDetail.setTotalAmount(totalAmount);
            String itemName = (String) dtm.getValueAt(i, 2);
            
            String itemId = null;
            try {
                itemId = itemController.getItemId(itemName);
                System.out.println(itemId);
            } catch (Exception ex) {
                Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            String date = (String) dtm.getValueAt(i, 3);
            String supplierOrderlId = (String) dtm.getValueAt(i, 0);
            
            double quantity = (double) dtm.getValueAt(i, 4);
            double buyingPrice = (double) dtm.getValueAt(i, 5);
            supplierOrderDetail.setItemId(itemId);
            //supplierOrderDetail.setSupplierOrderId(supplierOrderId);
            supplierOrderDetail.setDate(date);
            supplierOrderDetail.setQuantity(quantity);
            supplierOrderDetail.setBuyingPrice(buyingPrice);
            orderDetail.add(supplierOrderDetail);
            
        }
        
        try{
            boolean isAdded = supplierOrderController.add(supplierOrderDto,orderDetail);
            if(isAdded){
                JOptionPane.showMessageDialog(this,"Added Successfully");
            }else{
                JOptionPane.showMessageDialog(this,"Added Fail");
            }
        } catch (Exception ex) {
            Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AddBatchFrame f1 = new AddBatchFrame(null, true);
        f1.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       AddSupplierFrame f2 = new AddSupplierFrame(null, true);
       f2.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseEntered
       btnRemove.setBackground(new Color(40, 202, 204));
    }//GEN-LAST:event_btnRemoveMouseEntered

    private void btnRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseExited
        btnRemove.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnRemoveMouseExited

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(new Color(40, 202, 204));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(new Color(255, 255, 255));                            
        
    }//GEN-LAST:event_btnSaveMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRemove;
    private javax.swing.JLabel btnSave;
    private javax.swing.JComboBox cmbItemName;
    private javax.swing.JComboBox cmbSupplierCompany;
    private javax.swing.JComboBox cmbSupplierName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable supplierOrdertable;
    private javax.swing.JTextField txtBuyingPrice;
    private javax.swing.JTextField txtOrderDate;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSupplierOrderId;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
     private double totalAmount;

    public void setOrderDate() {
        java.util.Date d1 = new java.util.Date();
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        String formatDate = df.format(d1);
        txtOrderDate.setText(formatDate);
    }

    /* private void getID() {
     String newID;
     try {
     newID = IDGenarater.getNewID("supplierOrder", "supplierOrderId", "SOI");
     txtSupplierOrderId.setText(newID);

     } catch (ClassNotFoundException | SQLException e) {
     }
     }*/

    /* private void loadSupplierNames() {
     try {
     cmbSupplierName.removeAllItems();
     ArrayList<Supplier> supplierList = SupplierController.getAllSupplier();
     for (Supplier supplier : supplierList) {
     cmbSupplierName.addItem(supplier.getSupplierName());
     }
     } catch (SQLException ex) {
     Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
     Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
     }
     }*/
    /* private void loadItemName() {
     try {
     cmbItemName.removeAllItems();
     ArrayList<Item> ItemList = ItemController.getAllItem();
     for (Item item : ItemList) {
     cmbItemName.addItem(item.getItemName());
     }
     } catch (ClassNotFoundException ex) {
     Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
     Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
     }
     }*/

    /* private void supplierCompanny() {
     try {
     cmbSupplierName.removeAllItems();
     ArrayList<Supplier>companyList = SupplierController.getAllCompanies();
     for(Supplier supplier : companyList){
     cmbSupplierCompany.addItem(supplier.getSupplierCompanyName());
     }} catch (SQLException ex) {
     Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
     Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
     }
     }*/
    private void loadSupplierCompanies() {
        try {
            cmbSupplierCompany.removeAllItems();
            ArrayList<SupplierDTO> supplierList = supplierController.getAll();
            for (SupplierDTO supplierDto : supplierList) {
                // System.out.println(supplierDto);
                cmbSupplierCompany.addItem(supplierDto.getSupplierCompanyName());
                //  System.out.println(supplierDto.getSupplierCompanyName());
            }
        } catch (Exception ex) {
            Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    private void loadSupplierNames() {
//        try {
//            //cmbSupplierName.removeAllItems();
//            ArrayList<SupplierDTO> supplierList = supplierController.getAll();
//            //cmbSupplierName.removeAllItems();
//            //System.out.println(supplierList);
//            for (SupplierDTO supplierList1 : supplierList) {
//                int itemCount = cmbSupplierName.getItemCount();
//                for (int i = 0; i < itemCount; i++) {
//                    String toString = cmbSupplierName.getItemAt(i).toString();
//
//                    if (toString.equals(supplierList1.getSupplierName())) {
//
//                    } else {
//                        cmbSupplierName.addItem(supplierList1.getSupplierName());
//                    }
//                }
//
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
    private void loadSupplierNames(){
    try{
        cmbSupplierName.removeAllItems();
        ArrayList<SupplierDTO> supplierList = supplierController.getAll();
        for (SupplierDTO supplierList1 : supplierList) {
            cmbSupplierName.addItem(supplierList1.getSupplierName());
        }
    }   catch (Exception ex) {
            Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadItemNames() {
        try {
            cmbItemName.removeAllItems();
            ArrayList<ItemDTO> itemList = itemController.getAll();
            for (ItemDTO itemDto : itemList) {
                cmbItemName.addItem(itemDto.getItemName());
            }
        } catch (Exception ex) {
            Logger.getLogger(SupplierOrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getID() {
        String newID;
        try {
            newID = IDGenerator.getNewID("supplierOrder", "supplierOrderId", "SOI");
            txtSupplierOrderId.setText(newID);

        } catch (ClassNotFoundException | SQLException e) {
        }
    }
     
}
