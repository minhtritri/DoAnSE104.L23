package view;

import java.awt.CardLayout;
import javax.swing.JToggleButton;

public class HomeFrm extends javax.swing.JFrame {

    public JToggleButton getTgbtnDrug() {
        return tgbtnDrug;
    }

    public JToggleButton getTgbtnPharmacist() {
        return tgbtnPharmacist;
    }

    public JToggleButton getTgbtnCustomer() {
        return tgbtnCustomer;
    }

    public JToggleButton getTgbtnSupplier() {
        return tgbtnSupplier;
    }

    public JToggleButton getTgbtnReceipt() {
        return tgbtnReceipt;
    }

    public JToggleButton getTgbtnImportVoucher() {
        return tgbtnImportVoucher;
    }

    public JToggleButton getTgbtnReport() {
        return tgbtnReport;
    }

    private static final HomeFrm instance = new HomeFrm();

//    CategoryPanel pnDrug = new CategoryPanel("Thuốc");
//    CategoryPanel pnPharmacist = new CategoryPanel("Nhân viên dược sĩ");
//    CategoryPanel pnSupplier = new CategoryPanel("Nhà cung cấp");
//    CategoryPanel pnCustomer = new CategoryPanel("Khách hàng thành viên");
//    CategoryPanel pnRSell = new CategoryPanel("Hoá đơn bán hàng");
//    CategoryPanel pnRBuy = new CategoryPanel("Phiếu nhập hàng");
//    CategoryPanel pnReport = new CategoryPanel("Báo cáo thống kê");
    CategoryPanel mainPanel = new CategoryPanel();

    public HomeFrm() {
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
        initComponents();
        //grpMenuBar.add(tgbtnLogin);
        grpMenuBar.add(tgbtnDrug);
        grpMenuBar.add(tgbtnPharmacist);
        grpMenuBar.add(tgbtnSupplier);
        grpMenuBar.add(tgbtnCustomer);
        grpMenuBar.add(tgbtnImportVoucher);
        grpMenuBar.add(tgbtnReceipt);
        grpMenuBar.add(tgbtnReport);

        pnContainer.setLayout(new CardLayout());
        pnContainer.add(mainPanel);
        mainPanel.setVisible(true);
        pnContainer.setVisible(false);

        this.setVisible(true);
    }

    public static HomeFrm getInstance() {
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpMenuBar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnContainer = new javax.swing.JPanel();
        pnCategory = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();
        tgbtnLogin = new javax.swing.JButton();
        lbCategory = new javax.swing.JLabel();
        tgbtnDrug = new javax.swing.JToggleButton();
        tgbtnPharmacist = new javax.swing.JToggleButton();
        tgbtnSupplier = new javax.swing.JToggleButton();
        tgbtnCustomer = new javax.swing.JToggleButton();
        lbSellBuy = new javax.swing.JLabel();
        tgbtnReceipt = new javax.swing.JToggleButton();
        tgbtnImportVoucher = new javax.swing.JToggleButton();
        lbReport = new javax.swing.JLabel();
        tgbtnReport = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QLNT demo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout pnContainerLayout = new javax.swing.GroupLayout(pnContainer);
        pnContainer.setLayout(pnContainerLayout);
        pnContainerLayout.setHorizontalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
        );
        pnContainerLayout.setVerticalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        lbSystem.setText("Hệ thống");

        tgbtnLogin.setText("Đăng nhập");
        tgbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnLoginActionPerformed(evt);
            }
        });

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

        tgbtnReceipt.setText("Hoá đơn bán hàng");
        tgbtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnReceiptActionPerformed(evt);
            }
        });

        tgbtnImportVoucher.setText("Phiếu nhập hàng");
        tgbtnImportVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnImportVoucherActionPerformed(evt);
            }
        });

        lbReport.setText("Thống kê báo cáo");

        tgbtnReport.setText("Thống kê doanh thu");
        tgbtnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCategoryLayout = new javax.swing.GroupLayout(pnCategory);
        pnCategory.setLayout(pnCategoryLayout);
        pnCategoryLayout.setHorizontalGroup(
            pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbSellBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tgbtnCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tgbtnSupplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tgbtnPharmacist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tgbtnDrug, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSystem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tgbtnReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tgbtnImportVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        pnCategoryLayout.setVerticalGroup(
            pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCategoryLayout.createSequentialGroup()
                .addContainerGap()
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
                .addComponent(tgbtnReceipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgbtnImportVoucher)
                .addGap(18, 18, 18)
                .addComponent(lbReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tgbtnReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setEnabled(false);
        new LoginFrm().setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void tgbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnLoginActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        new LoginFrm().setVisible(true);
    }//GEN-LAST:event_tgbtnLoginActionPerformed

    private void tgbtnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnReportActionPerformed
        //pnContainer.setVisible(true);
    }//GEN-LAST:event_tgbtnReportActionPerformed

    private void tgbtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnReceiptActionPerformed
        mainPanel.setTitle("Danh sách Phiếu nhập thuốc");
        pnContainer.setVisible(true);
        mainPanel.setVisible(true);
    }//GEN-LAST:event_tgbtnReceiptActionPerformed

    private void tgbtnImportVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnImportVoucherActionPerformed
        mainPanel.setTitle("Danh sách Hóa đơn bán thuốc");
        pnContainer.setVisible(true);
        mainPanel.setVisible(true);
    }//GEN-LAST:event_tgbtnImportVoucherActionPerformed

    private void tgbtnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnCustomerActionPerformed
        mainPanel.setTitle("Danh sách Khách hàng thành viên");
        pnContainer.setVisible(true);
        mainPanel.setVisible(true);
    }//GEN-LAST:event_tgbtnCustomerActionPerformed

    private void tgbtnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnSupplierActionPerformed
        mainPanel.setTitle("Danh sách Nhà cung cấp");
        pnContainer.setVisible(true);
        mainPanel.setVisible(true);
    }//GEN-LAST:event_tgbtnSupplierActionPerformed

    private void tgbtnPharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnPharmacistActionPerformed
        mainPanel.setTitle("Danh sách Nhân viên Dược sĩ");
        pnContainer.setVisible(true);
        mainPanel.setVisible(true);
    }//GEN-LAST:event_tgbtnPharmacistActionPerformed

    private void tgbtnDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnDrugActionPerformed
        mainPanel.setTitle("Danh sách Thuốc");
        pnContainer.setVisible(true);
        mainPanel.setVisible(true);
    }//GEN-LAST:event_tgbtnDrugActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        // garbage colletor : 
        HomeFrm.getInstance();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grpMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCategory;
    private javax.swing.JLabel lbReport;
    private javax.swing.JLabel lbSellBuy;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JPanel pnCategory;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JToggleButton tgbtnCustomer;
    private javax.swing.JToggleButton tgbtnDrug;
    private javax.swing.JToggleButton tgbtnImportVoucher;
    private javax.swing.JButton tgbtnLogin;
    private javax.swing.JToggleButton tgbtnPharmacist;
    public javax.swing.JToggleButton tgbtnReceipt;
    private javax.swing.JToggleButton tgbtnReport;
    private javax.swing.JToggleButton tgbtnSupplier;
    // End of variables declaration//GEN-END:variables
}
