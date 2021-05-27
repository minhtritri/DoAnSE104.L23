/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author THAONGAN
 */
public class AddRBuyFrm extends javax.swing.JFrame {

    /**
     * Creates new form AddBuyReceipt
     */
    public AddRBuyFrm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dateComponentFormatter1 = new org.jdatepicker.impl.DateComponentFormatter();
        jDateComponentFactory1 = new org.jdatepicker.JDateComponentFactory();
        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        sqlDateModel1 = new org.jdatepicker.impl.SqlDateModel();
        utilCalendarModel1 = new org.jdatepicker.impl.UtilCalendarModel();
        main1 = new controler.main();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        utilDateModel1 = new org.jdatepicker.impl.UtilDateModel();
        utilCalendarModel2 = new org.jdatepicker.impl.UtilCalendarModel();
        sqlDateModel2 = new org.jdatepicker.impl.SqlDateModel();
        lbBuyReceipt = new javax.swing.JLabel();
        lbBuyID = new javax.swing.JLabel();
        tfBuyID = new javax.swing.JTextField();
        lbPharmacistID = new javax.swing.JLabel();
        cboxPharmacistID = new javax.swing.JComboBox<>();
        lbPharmacistName = new javax.swing.JLabel();
        tfPharmacistName = new javax.swing.JTextField();
        lbSupplierID = new javax.swing.JLabel();
        cboxSupplierID = new javax.swing.JComboBox<>();
        lbSupplierName = new javax.swing.JLabel();
        tfSupplierName = new javax.swing.JTextField();
        lbDateBuy = new javax.swing.JLabel();
        lbDrugList = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDrugList = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton_add = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbBuyReceipt.setText("                                Hoá đơn mua thuốc (từ nhà cung cấp)");
        lbBuyReceipt.setToolTipText("");

        lbBuyID.setText("Mã mua hàng");

        tfBuyID.setText("Sinh mã randomly");

        lbPharmacistID.setText("Mã nhân viên");

        cboxPharmacistID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxPharmacistID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPharmacistIDActionPerformed(evt);
            }
        });

        lbPharmacistName.setText("Tên nhân viên");

        tfPharmacistName.setText("getPharmacistName from MANV");
        tfPharmacistName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPharmacistNameActionPerformed(evt);
            }
        });

        lbSupplierID.setText("Mã nhà cung cấp");

        cboxSupplierID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbSupplierName.setText("Nhà cung cấp");

        tfSupplierName.setText("getSupplierName from MANCC");
        tfSupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSupplierNameActionPerformed(evt);
            }
        });

        lbDateBuy.setText("Ngày mua");

        lbDrugList.setText("Danh sách sản phẩm");

        tbDrugList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MATHUOC", "SL"
            }
        ));
        jScrollPane2.setViewportView(tbDrugList);

        jLabel8.setText("Tổng");

        jTextField4.setText("hàm tính tổng trị giá");

        jButton_add.setText("Thêm");

        jButton_reset.setText("Reset");

        jButton_cancel.setText("Huỷ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBuyReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_add)
                        .addGap(61, 61, 61)
                        .addComponent(jButton_reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(117, 117, 117)
                        .addComponent(jTextField4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBuyID)
                            .addComponent(lbPharmacistID)
                            .addComponent(lbPharmacistName)
                            .addComponent(lbSupplierID)
                            .addComponent(lbSupplierName)
                            .addComponent(lbDateBuy)
                            .addComponent(lbDrugList))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPharmacistName, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(tfSupplierName)
                            .addComponent(tfBuyID)
                            .addComponent(cboxPharmacistID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxSupplierID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbBuyReceipt)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuyID)
                    .addComponent(tfBuyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPharmacistID)
                    .addComponent(cboxPharmacistID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPharmacistName)
                    .addComponent(tfPharmacistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSupplierID)
                    .addComponent(cboxSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSupplierName)
                    .addComponent(tfSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDateBuy)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbDrugList)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add)
                    .addComponent(jButton_reset)
                    .addComponent(jButton_cancel))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxPharmacistIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPharmacistIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPharmacistIDActionPerformed

    private void tfPharmacistNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPharmacistNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPharmacistNameActionPerformed

    private void tfSupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSupplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSupplierNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AddRBuyFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRBuyFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRBuyFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRBuyFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRBuyFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxPharmacistID;
    private javax.swing.JComboBox<String> cboxSupplierID;
    private org.jdatepicker.impl.DateComponentFormatter dateComponentFormatter1;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_reset;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private org.jdatepicker.JDateComponentFactory jDateComponentFactory1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lbBuyID;
    private javax.swing.JLabel lbBuyReceipt;
    private javax.swing.JLabel lbDateBuy;
    private javax.swing.JLabel lbDrugList;
    private javax.swing.JLabel lbPharmacistID;
    private javax.swing.JLabel lbPharmacistName;
    private javax.swing.JLabel lbSupplierID;
    private javax.swing.JLabel lbSupplierName;
    private controler.main main1;
    private org.jdatepicker.impl.SqlDateModel sqlDateModel1;
    private org.jdatepicker.impl.SqlDateModel sqlDateModel2;
    private javax.swing.JTable tbDrugList;
    private javax.swing.JTextField tfBuyID;
    private javax.swing.JTextField tfPharmacistName;
    private javax.swing.JTextField tfSupplierName;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel1;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel2;
    private org.jdatepicker.impl.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables
}
