/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author anhha
 */
public class AddSupplierFrm extends javax.swing.JFrame {

    /**
     * Creates new form AddSupplierFrm
     */
    public AddSupplierFrm() {
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

        jLabel_title = new javax.swing.JLabel();
        jLabel_supplierid = new javax.swing.JLabel();
        jLabel_supplername = new javax.swing.JLabel();
        jLabel_supplieraddress = new javax.swing.JLabel();
        jLabel_supplierphonenumber = new javax.swing.JLabel();
        jLabel_bankaccnumber = new javax.swing.JLabel();
        jTextField_supplierid = new javax.swing.JTextField();
        jTextField_suppliername = new javax.swing.JTextField();
        jTextField_supplieraddress = new javax.swing.JTextField();
        jTextField_supplierphonenumber = new javax.swing.JTextField();
        jTextField_supplierbankaccnumber = new javax.swing.JTextField();
        jButton_add = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_title.setText("Nhà Cung Cấp");

        jLabel_supplierid.setText("Mã nhà cung cấp:");

        jLabel_supplername.setText("Tên nhà cung cấp:");

        jLabel_supplieraddress.setText("Địa chỉ:");

        jLabel_supplierphonenumber.setText("Điện thoại:");

        jLabel_bankaccnumber.setText("Số TK:");

        jTextField_supplieraddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_supplieraddressActionPerformed(evt);
            }
        });

        jButton_add.setText("Thêm");

        jButton_reset.setText("Reset");

        jButton_cancel.setText("Huỷ");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_supplername)
                    .addComponent(jLabel_supplierid)
                    .addComponent(jLabel_supplieraddress)
                    .addComponent(jLabel_supplierphonenumber)
                    .addComponent(jLabel_bankaccnumber))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_title)
                        .addGap(0, 128, Short.MAX_VALUE))
                    .addComponent(jTextField_supplierphonenumber)
                    .addComponent(jTextField_supplierbankaccnumber)
                    .addComponent(jTextField_supplierid)
                    .addComponent(jTextField_suppliername)
                    .addComponent(jTextField_supplieraddress))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jButton_reset)
                .addGap(50, 50, 50)
                .addComponent(jButton_cancel)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel_title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_supplierid)
                    .addComponent(jTextField_supplierid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_supplername)
                    .addComponent(jTextField_suppliername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_supplieraddress)
                    .addComponent(jTextField_supplieraddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_supplierphonenumber)
                    .addComponent(jTextField_supplierphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_bankaccnumber)
                    .addComponent(jTextField_supplierbankaccnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add)
                    .addComponent(jButton_reset)
                    .addComponent(jButton_cancel))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_supplieraddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_supplieraddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_supplieraddressActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddSupplierFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSupplierFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSupplierFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSupplierFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupplierFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel_bankaccnumber;
    private javax.swing.JLabel jLabel_supplername;
    private javax.swing.JLabel jLabel_supplieraddress;
    private javax.swing.JLabel jLabel_supplierid;
    private javax.swing.JLabel jLabel_supplierphonenumber;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JTextField jTextField_supplieraddress;
    private javax.swing.JTextField jTextField_supplierbankaccnumber;
    private javax.swing.JTextField jTextField_supplierid;
    private javax.swing.JTextField jTextField_suppliername;
    private javax.swing.JTextField jTextField_supplierphonenumber;
    // End of variables declaration//GEN-END:variables
}