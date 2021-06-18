/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CustomerController;
import javax.swing.JOptionPane;
import model.Customer;

/**
 *
 * @author anhha
 */
public class AddCustomerFrm extends javax.swing.JFrame {

    /**
     * Creates new form AddGuestFrm
     */
    private boolean isEditing = false;
    private int index;

    public AddCustomerFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        isEditing = false;
    }

    public AddCustomerFrm(int index) {
        this();
        isEditing = true;
        this.addEditInfo(CustomerController.getInstance().getList().get(index));
        this.index = index;
    }

    public void addEditInfo(Customer c) {
        // set tung text field tuong ung voi tung getter

        txtCustomerID.setText(c.getsMaKH());
        txtCustomerName.setText(c.getsHoten());
        cmbCustomerSex.setSelectedItem(c.getsGioiTinh());
        txtCustomerDOB.setText(Integer.valueOf(c.getsNamSinh()).toString());
        txtCustomerPhone.setText(c.getsSdtKH());
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
        btnAddCustomer = new javax.swing.JButton();
        btnClearCustomer = new javax.swing.JButton();
        btnCancelCustomer = new javax.swing.JButton();
        cmbCustomerSex = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtCustomerDOB = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm/Sửa Khách hàng");
        setResizable(false);

        jLabel_title.setBackground(new java.awt.Color(79, 102, 107));
        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title.setText("Khách Hàng");
        jLabel_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_title.setOpaque(true);

        jLabel_goestid.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel_goestid.setText("Mã khách hàng:");

        jLabel_guestname.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel_guestname.setText("Họ tên:");

        jLabel_guestsex.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel_guestsex.setText("Giới tính:");

        jLabel_guestaddress.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel_guestaddress.setText("Số điện thoại:");

        txtCustomerID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtCustomerName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });

        txtCustomerPhone.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        btnAddCustomer.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAddCustomer.setText("Lưu");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnClearCustomer.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnClearCustomer.setText("Làm mới");
        btnClearCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCustomerActionPerformed(evt);
            }
        });

        btnCancelCustomer.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnCancelCustomer.setText("Huỷ");
        btnCancelCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelCustomerActionPerformed(evt);
            }
        });

        cmbCustomerSex.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cmbCustomerSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Năm sinh");

        txtCustomerDOB.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

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
                            .addComponent(cmbCustomerSex, 0, 288, Short.MAX_VALUE)
                            .addComponent(txtCustomerDOB)
                            .addComponent(txtCustomerPhone)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddCustomer)
                        .addGap(56, 56, 56)
                        .addComponent(btnClearCustomer)
                        .addGap(57, 57, 57)
                        .addComponent(btnCancelCustomer)
                        .addGap(57, 57, 57)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jLabel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(btnAddCustomer)
                    .addComponent(btnClearCustomer)
                    .addComponent(btnCancelCustomer))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        try {

            String MaKH = txtCustomerID.getText();
            String Hoten = txtCustomerName.getText();
            String GioiTinh = cmbCustomerSex.getItemAt(cmbCustomerSex.getSelectedIndex());
            int NamSinh = Integer.parseInt(txtCustomerDOB.getText());
            String sSDT = txtCustomerPhone.getText();

            Customer customer = new Customer(MaKH, Hoten, GioiTinh, NamSinh, sSDT);

            if (isEditing) {
                CustomerController.getInstance().getList().set(this.index, customer);
                this.setVisible(true);

            } else {
                CustomerController.getInstance().getList().add(customer);
            }

            // lấy ra table tblListPharmacist từ Panel truyền vào dữ liệu từ Controller
            PanelCustomer.getInstance().getTable().setModel(CustomerController.getInstance().toTable());

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Nhập sai thông tin", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void btnCancelCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelCustomerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelCustomerActionPerformed

    private void btnClearCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCustomerActionPerformed
        // TODO add your handling code here:
        txtCustomerID.setText("");
        txtCustomerName.setText("");
        cmbCustomerSex.setSelectedIndex(0);
        txtCustomerPhone.setText("");
        txtCustomerDOB.setText("");
    }//GEN-LAST:event_btnClearCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnCancelCustomer;
    private javax.swing.JButton btnClearCustomer;
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
}
