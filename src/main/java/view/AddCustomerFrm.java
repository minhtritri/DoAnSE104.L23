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
public class AddCustomerFrm extends javax.swing.JFrame {

    /**
     * Creates new form AddGuestFrm
     */
    public AddCustomerFrm() {
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
        jLabel_goestid = new javax.swing.JLabel();
        jLabel_guestname = new javax.swing.JLabel();
        jLabel_guestsex = new javax.swing.JLabel();
        jLabel_guestaddress = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerAddress = new javax.swing.JTextField();
        btnAddCustomer = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cmbCustomerSex = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_title.setText("Khách Hàng");

        jLabel_goestid.setText("Mã khách hàng:");

        jLabel_guestname.setText("Họ tên:");

        jLabel_guestsex.setText("Giới tính:");

        jLabel_guestaddress.setText("Địa chỉ:");

        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });

        btnAddCustomer.setText("Thêm");

        btnReset.setText("Làm mới");

        btnCancel.setText("Huỷ");

        cmbCustomerSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác", " " }));

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
                            .addComponent(jLabel_guestaddress))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerID)
                            .addComponent(txtCustomerName)
                            .addComponent(txtCustomerAddress)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel_title)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbCustomerSex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnAddCustomer)
                        .addGap(62, 62, 62)
                        .addComponent(btnReset)
                        .addGap(49, 49, 49)
                        .addComponent(btnCancel)))
                .addGap(70, 70, 70))
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
                    .addComponent(jLabel_guestname)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_guestsex)
                    .addComponent(cmbCustomerSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_guestaddress)
                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustomer)
                    .addComponent(btnReset)
                    .addComponent(btnCancel))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbCustomerSex;
    private javax.swing.JLabel jLabel_goestid;
    private javax.swing.JLabel jLabel_guestaddress;
    private javax.swing.JLabel jLabel_guestname;
    private javax.swing.JLabel jLabel_guestsex;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtCustomerName;
    // End of variables declaration//GEN-END:variables
}
