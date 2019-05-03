/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.view.panel;

import edu.ijse.fms.common.IDGenerator;
import edu.ijse.fms.controller.ControllerFactory;
import edu.ijse.fms.controller.custom.BrandController;
import edu.ijse.fms.controller.custom.ItemBrandNameController;
import edu.ijse.fms.controller.custom.ItemController;
import edu.ijse.fms.dto.BatchDTO;
import edu.ijse.fms.dto.BrandDTO;
import edu.ijse.fms.dto.ItemBrandNameDTO;
import edu.ijse.fms.dto.ItemDTO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Gnanod
 */
public class AddItemPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddItemPanel
     */
    private BrandController brandController;
    private ItemController itemController;
    private ItemBrandNameController itemBrandNameController;
    private DefaultTableModel dtm;

    public AddItemPanel() {
        initComponents();
        brandController = (BrandController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.BRAND);
        itemController = (ItemController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.ITEM);
        itemBrandNameController = (ItemBrandNameController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.ITEMBRANDNAME);
        dtm = (DefaultTableModel) brandItemTable.getModel();
        pnlVisible();
        //getGibID();
        loadBrandNames();
        AutoCompleteDecorator.decorate(cmbBrand);
        getBatchID();
//        AutoCompleteDecorator.decorate(jComboBox1);
        //loadBrandNames();
        //AutoCompleteDecorator.decorate(cmbItem);
        getItemID();

        loadBrandItemName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        cmbBrand = new javax.swing.JComboBox();
        txtItemId = new javax.swing.JTextField();
        btnAddNewBrand = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        AddBrandPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBrandId = new javax.swing.JTextField();
        txtBrandName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        lblSearchBrand2 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        brandItemTable = new javax.swing.JTable();
        txtSearchItemName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtBatchId = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(53, 126, 120));
        jLabel50.setText("                          Add New Item ");
        jLabel50.setToolTipText("");
        jLabel50.setOpaque(true);
        add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 780, 50));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(27, 157, 175));
        jLabel51.setText("          Item  ID");
        jLabel51.setToolTipText("");
        jLabel51.setOpaque(true);
        jLabel51.setRequestFocusEnabled(false);
        add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 270, 30));

        cmbBrand.setEditable(true);
        cmbBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbBrand.setOpaque(false);
        cmbBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBrandActionPerformed(evt);
            }
        });
        add(cmbBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 330, 30));

        txtItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemIdActionPerformed(evt);
            }
        });
        add(txtItemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 330, 30));

        btnAddNewBrand.setBackground(new java.awt.Color(255, 255, 255));
        btnAddNewBrand.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddNewBrand.setText("      Add New Brand");
        btnAddNewBrand.setToolTipText("");
        btnAddNewBrand.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(40, 202, 204)));
        btnAddNewBrand.setOpaque(true);
        btnAddNewBrand.setRequestFocusEnabled(false);
        btnAddNewBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNewBrandMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddNewBrandMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddNewBrandMouseExited(evt);
            }
        });
        add(btnAddNewBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 200, 30));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(27, 157, 175));
        jLabel58.setText("          BatchId");
        jLabel58.setToolTipText("");
        jLabel58.setOpaque(true);
        jLabel58.setRequestFocusEnabled(false);
        add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 270, 30));

        AddBrandPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddBrandPanel.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Brand");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(27, 157, 175)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        AddBrandPanel.add(jLabel3);
        jLabel3.setBounds(190, 190, 120, 30);
        AddBrandPanel.add(txtBrandId);
        txtBrandId.setBounds(140, 70, 170, 30);
        AddBrandPanel.add(txtBrandName);
        txtBrandName.setBounds(140, 120, 170, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 157, 175));
        jLabel2.setText("Brand Name");
        jLabel2.setOpaque(true);
        AddBrandPanel.add(jLabel2);
        jLabel2.setBounds(20, 120, 110, 30);

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(53, 126, 120));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel52.setText("               Add New Brand");
        jLabel52.setToolTipText("");
        jLabel52.setOpaque(true);
        AddBrandPanel.add(jLabel52);
        jLabel52.setBounds(50, 30, 170, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 157, 175));
        jLabel4.setText("  Brand Id");
        jLabel4.setOpaque(true);
        AddBrandPanel.add(jLabel4);
        jLabel4.setBounds(20, 70, 110, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(40, 202, 204)));
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        AddBrandPanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 320, 250);

        add(AddBrandPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 320, 260));
        add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 330, 30));

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(27, 157, 175));
        jLabel56.setText("          Item Name");
        jLabel56.setToolTipText("");
        jLabel56.setOpaque(true);
        jLabel56.setRequestFocusEnabled(false);
        add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 270, 30));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/fms/images/Add Item save.png"))); // NOI18N
        btnSave.setText("    Add");
        btnSave.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(27, 157, 175)));
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
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 110, 40));

        lblSearchBrand2.setBackground(new java.awt.Color(255, 255, 255));
        lblSearchBrand2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/fms/images/Search.png"))); // NOI18N
        lblSearchBrand2.setOpaque(true);
        lblSearchBrand2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchBrand2MouseClicked(evt);
            }
        });
        add(lblSearchBrand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 40, 30));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setOpaque(true);
        add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/fms/images/update Item.png"))); // NOI18N
        btnUpdate.setText("  Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(27, 157, 175)));
        btnUpdate.setOpaque(true);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 110, 40));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/fms/images/Delete_26px.png"))); // NOI18N
        btnDelete.setText("  Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(27, 157, 175)));
        btnDelete.setOpaque(true);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 110, 40));

        brandItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Item Name"
            }
        ));
        brandItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandItemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(brandItemTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, 250));

        txtSearchItemName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchItemNameMouseClicked(evt);
            }
        });
        txtSearchItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchItemNameActionPerformed(evt);
            }
        });
        txtSearchItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchItemNameKeyReleased(evt);
            }
        });
        add(txtSearchItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 160, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 202, 204)));
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 490, 80));

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(27, 157, 175));
        jLabel59.setText("          Brand");
        jLabel59.setToolTipText("");
        jLabel59.setOpaque(true);
        jLabel59.setRequestFocusEnabled(false);
        add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 270, 30));
        add(txtBatchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 330, 30));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setOpaque(true);
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel48MouseEntered(evt);
            }
        });
        add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemIdActionPerformed

    private void btnAddNewBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBrandMouseClicked
        getBrandID();
        AddBrandPanel.setVisible(true);

    }//GEN-LAST:event_btnAddNewBrandMouseClicked

    private void btnAddNewBrandMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBrandMouseEntered
        btnAddNewBrand.setBackground(new Color(40, 202, 204));
    }//GEN-LAST:event_btnAddNewBrandMouseEntered

    private void btnAddNewBrandMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBrandMouseExited
        btnAddNewBrand.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnAddNewBrandMouseExited

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited

    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        pnlVisible();
        String brandId = txtBrandId.getText();
        String brandName = txtBrandName.getText();
        BrandDTO brandDto = new BrandDTO(brandId, brandName);
        try {
            boolean isAdd = brandController.add(brandDto);

            if (isAdd) {
                JOptionPane.showMessageDialog(this, "Brand is added");
                loadBrandNames();
                getBrandID();
            } else {
                JOptionPane.showMessageDialog(this, "Oops Added Fail", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            String errorMsg;
            switch (ex.getErrorCode()) {
                case 1062:
                    errorMsg = "Duplicate entry has been found. Please enter valid Brand Id to proceed.";
                    break;
                default:
                    errorMsg = "Brand has been failed to add";
                    break;
            }
            JOptionPane.showMessageDialog(this, errorMsg, "Error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            Logger.getLogger(AddItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        String itemId = txtItemId.getText();
        String itemName = txtItemName.getText();
        String name = (String) cmbBrand.getSelectedItem();
        String batchId = txtBatchId.getText(); //

        String brandId = null;
        try {
            brandId = brandController.getItemCode(name);
        } catch (Exception ex) {
            Logger.getLogger(AddItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        ItemDTO itemDto = new ItemDTO(itemId, itemName, brandId);

        String grnId = null;
        double unitPrice = 0;
        double amount = 0;
        BatchDTO batchDto = new BatchDTO();  //
        batchDto.setBatchId(batchId);         //
        batchDto.setItemId(itemId);            //

        batchDto.setGrnId(grnId);
        batchDto.setAmmount(amount);
        batchDto.setUnitPrice(unitPrice);
        try {
            boolean isAdded = itemController.add(itemDto, batchDto);
            System.out.println(isAdded);
//boolean isAdded = itemController.add(itemDto);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Added Sucessfully");
                getItemID();
            } else {
                JOptionPane.showMessageDialog(this, "Oops Added Fail", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {

            String errorMsg;
            switch (ex.getErrorCode()) {
                case 1062:
                    errorMsg = "Duplicate entry has been found. Please enter valid Item Id to proceed.";
                    break;
                default:
                    errorMsg = "Item has been failed to add";
                    break;
            }
            JOptionPane.showMessageDialog(this, errorMsg, "Error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            Logger.getLogger(AddItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSaveMouseClicked

    private void txtSearchItemNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchItemNameMouseClicked

    }//GEN-LAST:event_txtSearchItemNameMouseClicked

    private void txtSearchItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchItemNameActionPerformed

    }//GEN-LAST:event_txtSearchItemNameActionPerformed

    private void lblSearchBrand2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchBrand2MouseClicked

    }//GEN-LAST:event_lblSearchBrand2MouseClicked

    private void brandItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandItemTableMouseClicked

    }//GEN-LAST:event_brandItemTableMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        String itemId = txtItemId.getText();
        try {
            boolean isDeleted = itemController.delete(itemId);
            if (isDeleted) {
                JOptionPane.showMessageDialog(this, "Item is Deleted");
            } else {
                JOptionPane.showMessageDialog(this, "Item not found");
            }
        } catch (Exception ex) {
            Logger.getLogger(AddItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        String itemId = txtItemId.getText();
        String itemName = txtItemName.getText();
        String name = (String) cmbBrand.getSelectedItem();
        String brandId = null;
        try {
            brandId = brandController.getItemCode(name);
        } catch (Exception ex) {
            Logger.getLogger(AddItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        ItemDTO itemDto = new ItemDTO(itemId, itemName, brandId);
        try {
            boolean isUpdate = itemController.update(itemDto);
            if (isUpdate) {
                JOptionPane.showMessageDialog(this, "Update sucessfully");
            } else {
                JOptionPane.showMessageDialog(this, "Updated fail");
            }
        } catch (Exception ex) {
            Logger.getLogger(AddItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void txtSearchItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchItemNameKeyReleased
        searchBrandItemName();
    }//GEN-LAST:event_txtSearchItemNameKeyReleased

    private void cmbBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBrandActionPerformed

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
       btnSave.setBackground(new Color(40, 202, 204));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(new Color(40, 202, 204));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
       btnDelete.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(new Color(40, 202, 204));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void jLabel48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseEntered
        
    }//GEN-LAST:event_jLabel48MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddBrandPanel;
    private javax.swing.JTable brandItemTable;
    private javax.swing.JLabel btnAddNewBrand;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnSave;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JComboBox cmbBrand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchBrand2;
    private javax.swing.JTextField txtBatchId;
    private javax.swing.JTextField txtBrandId;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtSearchItemName;
    // End of variables declaration//GEN-END:variables

    public void pnlVisible() {
        AddBrandPanel.setVisible(false);
    }

    private void getBrandID() {
        String newID;
        try {
            newID = IDGenerator.getNewID("brand", "brandId", "B");
            txtBrandId.setText(newID);

        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    private void getItemID() {
        String newID;
        try {
            newID = IDGenerator.getNewID("item", "itemId", "I");
            txtItemId.setText(newID);

        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    private void loadBrandNames() {
        try {
            cmbBrand.removeAllItems();
            ArrayList<BrandDTO> brandList = brandController.getAll();
            System.out.println("Length " + brandList.size());
            for (BrandDTO brandDto : brandList) {
                cmbBrand.addItem(brandDto.getBrandName());
//                int itemCount = cmbBrand.getItemCount();
//                for (int i = 0; i < itemCount; i++) {
////                    String toString = cmbBrand.getItemAt(i).toString();
////                    if (!toString.equals(brandDto.getBrandName())) {
////                        cmbBrand.addItem(brandDto.getBrandName());
////                    }else{
////                         cmbBrand.addItem(brandDto.getBrandName());
////                    }
//                    System.out.println(brandDto.getBrandName());
//                     
//                }

            }
        } catch (Exception ex) {
            Logger.getLogger(AddItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchBrandItemName() {
        String name = txtSearchItemName.getText();
        try {
            ItemBrandNameDTO brandNameList = itemBrandNameController.searchItemBrandName(name);
            if (brandNameList == null) {
                JOptionPane.showMessageDialog(txtItemName, "name is not found");
            } else {
                Object[] rowData = {brandNameList.getBrandName(), brandNameList.getItemName()};
                dtm.setRowCount(0);
                dtm.addRow(rowData);

            }
        } catch (Exception ex) {
            Logger.getLogger(AddItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadBrandItemName() {
        try {
            ArrayList<ItemBrandNameDTO> brandList = itemBrandNameController.getAll();
            if (brandList == null) {
                return;
            }
            for (ItemBrandNameDTO brandNameList : brandList) {
                Object[] rowData = {brandNameList.getBrandName(), brandNameList.getItemName()};
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(AddItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getBatchID() {
        String newID;
        try {
            newID = IDGenerator.getNewID("Batch", "batchId", "B");
            txtBatchId.setText(newID);

        } catch (ClassNotFoundException | SQLException e) {
        }
    }
}
