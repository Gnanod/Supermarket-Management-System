/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.view.panel;

import edu.ijse.fms.view.AdminMainFrame;
import java.awt.Color;

/**
 *
 * @author Gnanod
 */
public class ReportsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportsPanel
     */
   AdminMainFrame main;
    public ReportsPanel(AdminMainFrame main) {
        initComponents();
      this.main= main;
    }

    public ReportsPanel() {
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlViewReports = new javax.swing.JPanel();
        lblSupplierReports = new javax.swing.JLabel();
        lblIncomeReports = new javax.swing.JLabel();
        lblSupplierPayment = new javax.swing.JLabel();
        lblCustomerPayment = new javax.swing.JLabel();
        lblStockReports = new javax.swing.JLabel();
        lblItemReports = new javax.swing.JLabel();
        lblCustomerReports = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlViewReports.setBackground(new java.awt.Color(59, 62, 77));
        pnlViewReports.setVerifyInputWhenFocusTarget(false);
        pnlViewReports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSupplierReports.setBackground(new java.awt.Color(59, 62, 77));
        lblSupplierReports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSupplierReports.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplierReports.setText("      Supplier  Reports");
        lblSupplierReports.setOpaque(true);
        lblSupplierReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSupplierReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSupplierReportsMouseExited(evt);
            }
        });
        pnlViewReports.add(lblSupplierReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 180, 40));

        lblIncomeReports.setBackground(new java.awt.Color(59, 62, 77));
        lblIncomeReports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIncomeReports.setForeground(new java.awt.Color(255, 255, 255));
        lblIncomeReports.setText("      Income Reports");
        lblIncomeReports.setOpaque(true);
        lblIncomeReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIncomeReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIncomeReportsMouseExited(evt);
            }
        });
        pnlViewReports.add(lblIncomeReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 40));

        lblSupplierPayment.setBackground(new java.awt.Color(59, 62, 77));
        lblSupplierPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSupplierPayment.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplierPayment.setText("      Supplier Payment");
        lblSupplierPayment.setOpaque(true);
        lblSupplierPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSupplierPaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSupplierPaymentMouseExited(evt);
            }
        });
        pnlViewReports.add(lblSupplierPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, 40));

        lblCustomerPayment.setBackground(new java.awt.Color(59, 62, 77));
        lblCustomerPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerPayment.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerPayment.setText("      Customer Payment");
        lblCustomerPayment.setOpaque(true);
        lblCustomerPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCustomerPaymentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCustomerPaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCustomerPaymentMouseExited(evt);
            }
        });
        pnlViewReports.add(lblCustomerPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        lblStockReports.setBackground(new java.awt.Color(59, 62, 77));
        lblStockReports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStockReports.setForeground(new java.awt.Color(255, 255, 255));
        lblStockReports.setText("      Stock Reports");
        lblStockReports.setOpaque(true);
        lblStockReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStockReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStockReportsMouseExited(evt);
            }
        });
        pnlViewReports.add(lblStockReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 40));

        lblItemReports.setBackground(new java.awt.Color(59, 62, 77));
        lblItemReports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItemReports.setForeground(new java.awt.Color(255, 255, 255));
        lblItemReports.setText("      Item Reports");
        lblItemReports.setOpaque(true);
        lblItemReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblItemReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblItemReportsMouseExited(evt);
            }
        });
        pnlViewReports.add(lblItemReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 40));

        lblCustomerReports.setBackground(new java.awt.Color(59, 62, 77));
        lblCustomerReports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerReports.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerReports.setText("      Customer Reports");
        lblCustomerReports.setOpaque(true);
        lblCustomerReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCustomerReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCustomerReportsMouseExited(evt);
            }
        });
        pnlViewReports.add(lblCustomerReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 180, 40));

        add(pnlViewReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void lblSupplierReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupplierReportsMouseEntered
        lblSupplierReports.setBackground(new Color(31, 40, 45));
    }//GEN-LAST:event_lblSupplierReportsMouseEntered

    private void lblSupplierReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupplierReportsMouseExited
        lblSupplierReports.setBackground(new Color(59, 62, 77));
    }//GEN-LAST:event_lblSupplierReportsMouseExited

    private void lblIncomeReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIncomeReportsMouseEntered
        lblIncomeReports.setBackground(new Color(31, 40, 45));
    }//GEN-LAST:event_lblIncomeReportsMouseEntered

    private void lblIncomeReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIncomeReportsMouseExited
        lblIncomeReports.setBackground(new Color(59, 62, 77));
    }//GEN-LAST:event_lblIncomeReportsMouseExited

    private void lblSupplierPaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupplierPaymentMouseEntered
        lblSupplierPayment.setBackground(new Color(31, 40, 45));
    }//GEN-LAST:event_lblSupplierPaymentMouseEntered

    private void lblSupplierPaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupplierPaymentMouseExited
        lblSupplierPayment.setBackground(new Color(59, 62, 77));
    }//GEN-LAST:event_lblSupplierPaymentMouseExited

    private void lblCustomerPaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerPaymentMouseEntered
        lblCustomerPayment.setBackground(new Color(31, 40, 45));
    }//GEN-LAST:event_lblCustomerPaymentMouseEntered

    private void lblCustomerPaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerPaymentMouseExited
        lblCustomerPayment.setBackground(new Color(59, 62, 77));
    }//GEN-LAST:event_lblCustomerPaymentMouseExited

    private void lblStockReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStockReportsMouseEntered
        lblStockReports.setBackground(new Color(31, 40, 45));
    }//GEN-LAST:event_lblStockReportsMouseEntered

    private void lblStockReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStockReportsMouseExited
        lblStockReports.setBackground(new Color(59, 62, 77));
    }//GEN-LAST:event_lblStockReportsMouseExited

    private void lblItemReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemReportsMouseEntered
        lblItemReports.setBackground(new Color(31, 40, 45));
    }//GEN-LAST:event_lblItemReportsMouseEntered

    private void lblItemReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemReportsMouseExited
        lblItemReports.setBackground(new Color(59, 62, 77));
    }//GEN-LAST:event_lblItemReportsMouseExited

    private void lblCustomerReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerReportsMouseEntered
        lblCustomerReports.setBackground(new Color(31, 40, 45));
    }//GEN-LAST:event_lblCustomerReportsMouseEntered

    private void lblCustomerReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerReportsMouseExited
        lblCustomerReports.setBackground(new Color(59, 62, 77));
    }//GEN-LAST:event_lblCustomerReportsMouseExited

    private void lblCustomerPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerPaymentMouseClicked
        CustomerPayment cust  = new CustomerPayment();
       main.MainPanel.removeAll();
        main.MainPanel.repaint();
        main.MainPanel.revalidate();
        cust.setSize(main.MainPanel.getSize());
        main.MainPanel.add(cust);
        
    }//GEN-LAST:event_lblCustomerPaymentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCustomerPayment;
    private javax.swing.JLabel lblCustomerReports;
    private javax.swing.JLabel lblIncomeReports;
    private javax.swing.JLabel lblItemReports;
    private javax.swing.JLabel lblStockReports;
    private javax.swing.JLabel lblSupplierPayment;
    private javax.swing.JLabel lblSupplierReports;
    private javax.swing.JPanel pnlViewReports;
    // End of variables declaration//GEN-END:variables
}
