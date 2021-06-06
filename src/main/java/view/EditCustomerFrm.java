/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Date;
import javax.swing.JPanel;
import model.Customer;


/**
 *
 * @author anhha
 */
public class EditCustomerFrm extends javax.swing.JFrame {

    /**
     * Creates new form AddGuestFrm
     */
    private CustomerPanel customerPanel;
    
    public EditCustomerFrm(JPanel parent) {
        initComponents();
        this.setLocationRelativeTo(null);
        customerPanel = (CustomerPanel) parent;
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
        jLabel_goestid = new javax.swing.JLabel();
        jLabel_guestname = new javax.swing.JLabel();
        jLabel_guestsex = new javax.swing.JLabel();
        jLabel_guestaddress = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerPhone = new javax.swing.JTextField();
        btnEditCustomer = new javax.swing.JButton();
        btnCancelCustomer = new javax.swing.JButton();
        cmbCustomerSex = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtCustomerDOB = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm/Sửa Khách hàng");
        setResizable(false);

        jLabel_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_title.setText("Khách Hàng");

        jLabel_goestid.setText("Mã khách hàng:");

        jLabel_guestname.setText("Họ tên:");

        jLabel_guestsex.setText("Giới tính:");

        jLabel_guestaddress.setText("Số điện thoại:");

        txtCustomerID.setEditable(false);

        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });

        btnEditCustomer.setText("Sửa");
        btnEditCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCustomerActionPerformed(evt);
            }
        });

        btnCancelCustomer.setText("Huỷ");
        btnCancelCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelCustomerActionPerformed(evt);
            }
        });

        cmbCustomerSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));

        jLabel1.setText("Năm sinh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_guestname)
                            .addComponent(jLabel_goestid)
                            .addComponent(jLabel_guestsex)
                            .addComponent(jLabel_guestaddress)
                            .addComponent(jLabel1))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerID)
                            .addComponent(txtCustomerName)
                            .addComponent(cmbCustomerSex, 0, 295, Short.MAX_VALUE)
                            .addComponent(txtCustomerDOB)
                            .addComponent(txtCustomerPhone)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditCustomer)
                        .addGap(186, 186, 186)
                        .addComponent(btnCancelCustomer)
                        .addGap(57, 57, 57)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel_title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_goestid)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_guestname))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCustomerSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_guestsex))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_guestaddress)
                    .addComponent(txtCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditCustomer)
                    .addComponent(btnCancelCustomer))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void btnEditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCustomerActionPerformed
         String sMaKH = "";
     String sHoten = "";
     String sGioiTinh = "";
     String sNamSinh = "";
     String sSdtKH = "";
     
     sMaKH = txtCustomerID.getText();
     sHoten = txtCustomerName.getText();
     sGioiTinh = cmbCustomerSex.getItemAt(cmbCustomerSex.getSelectedIndex());
     sSdtKH = txtCustomerPhone.getText();
     sNamSinh = txtCustomerDOB.getText();
     Customer customer = new Customer(sMaKH,sHoten,sGioiTinh,sNamSinh,sSdtKH);
     customerPanel.updateCustomer(customer);
     this.dispose();
    }//GEN-LAST:event_btnEditCustomerActionPerformed

    private void btnCancelCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelCustomerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelCustomer;
    private javax.swing.JButton btnEditCustomer;
    private javax.swing.JComboBox<String> cmbCustomerSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_goestid;
    private javax.swing.JLabel jLabel_guestaddress;
    private javax.swing.JLabel jLabel_guestname;
    private javax.swing.JLabel jLabel_guestsex;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JTextField txtCustomerDOB;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerPhone;
    // End of variables declaration//GEN-END:variables

    void setEditData(Customer c) {
       txtCustomerID.setText(c.getsMaKH());
       txtCustomerID.setEditable(false);
       txtCustomerName.setText(c.getsHoten());
       cmbCustomerSex.setSelectedItem(c.getsGioiTinh());
       txtCustomerDOB.setText(c.getsNamSinh());
       txtCustomerPhone.setText(c.getsSdtKH());
    }
}