package view;

import java.awt.CardLayout;

public class HomeFrm extends javax.swing.JFrame {

    static HomeFrm instance;

    CategoryPanel pnDrug = new CategoryPanel("Thuốc");
    CategoryPanel pnPharmacist = new CategoryPanel("Nhân viên dược sĩ");
    CategoryPanel pnSupplier = new CategoryPanel("Nhà cung cấp");
    CategoryPanel pnCustomer = new CategoryPanel("Khách hàng thành viên");
    CategoryPanel pnRSell = new CategoryPanel("Hoá đơn bán hàng");
    CategoryPanel pnRBuy = new CategoryPanel("Phiếu nhập hàng");
    CategoryPanel pnReport = new CategoryPanel("Báo cáo thống kê");

    public HomeFrm() {
        initComponents();
        //grpMenuBar.add(tgbtnLogin);
        grpMenuBar.add(tgbtnDrug);
        grpMenuBar.add(tgbtnPharmacist);
        grpMenuBar.add(tgbtnSupplier);
        grpMenuBar.add(tgbtnCustomer);
        grpMenuBar.add(tgbtnRBuy);
        grpMenuBar.add(tgbtnRSell);
        grpMenuBar.add(tgbtnReport);

        pnContainer.setLayout(new CardLayout());
        pnContainer.add(pnDrug);
        pnContainer.add(pnPharmacist);
        pnContainer.add(pnSupplier);
        pnContainer.add(pnCustomer);
        pnContainer.add(pnRBuy);
        pnContainer.add(pnRSell);
        pnContainer.add(pnReport);

        pnContainer.setVisible(false);
    }

    public static HomeFrm getInstance() {
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpMenuBar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();
        lbCategory = new javax.swing.JLabel();
        tgbtnDrug = new javax.swing.JToggleButton();
        tgbtnPharmacist = new javax.swing.JToggleButton();
        tgbtnSupplier = new javax.swing.JToggleButton();
        tgbtnCustomer = new javax.swing.JToggleButton();
        lbSellBuy = new javax.swing.JLabel();
        tgbtnRBuy = new javax.swing.JToggleButton();
        tgbtnRSell = new javax.swing.JToggleButton();
        lbReport = new javax.swing.JLabel();
        tgbtnReport = new javax.swing.JToggleButton();
        pnContainer = new javax.swing.JPanel();
        tgbtnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QLNT demo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbSystem.setText("Hệ thống");

        lbCategory.setText("Danh mục");

        tgbtnDrug.setText("Thuốc");
        tgbtnDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnDrugActionPerformed(evt);
            }
        });

        tgbtnPharmacist.setText("Nhân viên");
        tgbtnPharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnPharmacistActionPerformed(evt);
            }
        });

        tgbtnSupplier.setText("Nhà cung cấp");
        tgbtnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnSupplierActionPerformed(evt);
            }
        });

        tgbtnCustomer.setText("Khách hàng");
        tgbtnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnCustomerActionPerformed(evt);
            }
        });

        lbSellBuy.setText("Mua/Bán thuốc");

        tgbtnRBuy.setText("Phiếu nhập hàng");
        tgbtnRBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnRBuyActionPerformed(evt);
            }
        });

        tgbtnRSell.setText("Hoá đơn bán hàng");
        tgbtnRSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnRSellActionPerformed(evt);
            }
        });

        lbReport.setText("Thống kê báo cáo");

        tgbtnReport.setText("Thống kê doanh thu");
        tgbtnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnContainerLayout = new javax.swing.GroupLayout(pnContainer);
        pnContainer.setLayout(pnContainerLayout);
        pnContainerLayout.setHorizontalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        pnContainerLayout.setVerticalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        tgbtnLogin.setText("Đăng nhập");
        tgbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSellBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tgbtnCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tgbtnSupplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tgbtnPharmacist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tgbtnDrug, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbSystem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tgbtnReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                            .addComponent(lbReport, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tgbtnRBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgbtnRSell, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(pnContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgbtnLogin)
                .addGap(18, 18, 18)
                .addComponent(lbCategory)
                .addGap(18, 18, 18)
                .addComponent(tgbtnDrug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tgbtnPharmacist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tgbtnSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tgbtnCustomer)
                .addGap(18, 18, 18)
                .addComponent(lbSellBuy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tgbtnRSell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgbtnRBuy)
                .addGap(21, 21, 21)
                .addComponent(lbReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tgbtnReport)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tgbtnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnCustomerActionPerformed
        pnContainer.setVisible(true);
        pnDrug.setVisible(false);
        pnPharmacist.setVisible(false);
        pnSupplier.setVisible(false);
        pnCustomer.setVisible(true);
        pnRBuy.setVisible(false);
        pnRSell.setVisible(false);
        pnReport.setVisible(false);
    }//GEN-LAST:event_tgbtnCustomerActionPerformed

    private void tgbtnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnReportActionPerformed
        pnContainer.setVisible(true);
        pnDrug.setVisible(false);
        pnPharmacist.setVisible(false);
        pnSupplier.setVisible(false);
        pnCustomer.setVisible(false);
        pnRBuy.setVisible(false);
        pnRSell.setVisible(false);
        pnReport.setVisible(true);
    }//GEN-LAST:event_tgbtnReportActionPerformed

    private void tgbtnDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnDrugActionPerformed
        pnContainer.setVisible(true);
        pnDrug.setVisible(true);
        pnPharmacist.setVisible(false);
        pnSupplier.setVisible(false);
        pnCustomer.setVisible(false);
        pnRBuy.setVisible(false);
        pnRSell.setVisible(false);
        pnReport.setVisible(false);
    }//GEN-LAST:event_tgbtnDrugActionPerformed

    private void tgbtnPharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnPharmacistActionPerformed
        pnContainer.setVisible(true);
        pnDrug.setVisible(false);
        pnPharmacist.setVisible(true);
        pnSupplier.setVisible(false);
        pnCustomer.setVisible(false);
        pnRBuy.setVisible(false);
        pnRSell.setVisible(false);
        pnReport.setVisible(false);
    }//GEN-LAST:event_tgbtnPharmacistActionPerformed

    private void tgbtnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnSupplierActionPerformed
        pnContainer.setVisible(true);
        pnDrug.setVisible(false);
        pnPharmacist.setVisible(false);
        pnSupplier.setVisible(true);
        pnCustomer.setVisible(false);
        pnRBuy.setVisible(false);
        pnRSell.setVisible(false);
        pnReport.setVisible(false);
    }//GEN-LAST:event_tgbtnSupplierActionPerformed

    private void tgbtnRBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnRBuyActionPerformed
        pnContainer.setVisible(true);
        pnDrug.setVisible(false);
        pnPharmacist.setVisible(false);
        pnSupplier.setVisible(false);
        pnCustomer.setVisible(false);
        pnRBuy.setVisible(true);
        pnRSell.setVisible(false);
        pnReport.setVisible(false);
    }//GEN-LAST:event_tgbtnRBuyActionPerformed

    private void tgbtnRSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnRSellActionPerformed
        pnContainer.setVisible(true);
        pnDrug.setVisible(false);
        pnPharmacist.setVisible(false);
        pnSupplier.setVisible(false);
        pnCustomer.setVisible(false);
        pnRBuy.setVisible(false);
        pnRSell.setVisible(true);
        pnReport.setVisible(false);
    }//GEN-LAST:event_tgbtnRSellActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setEnabled(false);
        new LoginFrm().setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void tgbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnLoginActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        new LoginFrm().setVisible(true);        
    }//GEN-LAST:event_tgbtnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>       

            instance = new HomeFrm();

            instance.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grpMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCategory;
    private javax.swing.JLabel lbReport;
    private javax.swing.JLabel lbSellBuy;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JToggleButton tgbtnCustomer;
    private javax.swing.JToggleButton tgbtnDrug;
    private javax.swing.JButton tgbtnLogin;
    private javax.swing.JToggleButton tgbtnPharmacist;
    private javax.swing.JToggleButton tgbtnRBuy;
    private javax.swing.JToggleButton tgbtnRSell;
    private javax.swing.JToggleButton tgbtnReport;
    private javax.swing.JToggleButton tgbtnSupplier;
    // End of variables declaration//GEN-END:variables
}
