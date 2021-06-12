package view;

import controller.PharmacistController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Pharmacist;

/**
 *
 * @author THAONGAN
 */
public class AddPharmacistFrm extends javax.swing.JFrame {

    /**
     * Creates new form AddPharmacist
     */
    private boolean isEditing = false;
    private int index;

    public AddPharmacistFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        isEditing = false;

    }

    public AddPharmacistFrm(int index) {
        this();
        isEditing = true;
        this.addEditInfo(PharmacistController.getInstance().getList().get(index));
        this.index = index;
    }

    public void addEditInfo(Pharmacist p) {
        // set tung text field tuong ung voi tung getter
        txtPharmacistID.setText(p.getsMaNV());
        txtPharmacistName.setText(p.getsHoTen());
        txtPharmacistDOB.setText(Integer.valueOf(p.getiNamSinh()).toString());
        cmbPharmacistSex.setSelectedIndex(
                (p.getsGioiTinh().equals("Nam")) ? 0
                : (p.getsGioiTinh().equals("Nữ")) ? 1
                : 2
        );
        txtPharmacistPhone.setText(p.getSDT());
        txtPharmacistAddress.setText(p.getsDiaChi());
        txtYearWork.setText(Integer.valueOf(p.getiNamVaoLam()).toString());
        cmbPharmacistShift.setSelectedIndex(p.getiCALV() - 1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPharmacistID = new javax.swing.JTextField();
        txtPharmacistName = new javax.swing.JTextField();
        cmbPharmacistSex = new javax.swing.JComboBox<>();
        txtPharmacistDOB = new javax.swing.JTextField();
        txtPharmacistPhone = new javax.swing.JTextField();
        txtPharmacistAddress = new javax.swing.JTextField();
        txtYearWork = new javax.swing.JTextField();
        cmbPharmacistShift = new javax.swing.JComboBox<>();
        btnAddPharmacist = new javax.swing.JButton();
        btnClearPharmacist = new javax.swing.JButton();
        btnCancelPharmacist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm/Sửa Nhân viên dược sĩ");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nhân viên Dược Sĩ");

        jLabel9.setText("Mã nhân viên");

        jLabel6.setText("Giới tính:");

        jLabel4.setText("Năm sinh:");

        jLabel5.setText("Địa chỉ:");

        jLabel7.setText("SDT");

        jLabel3.setText("Năm vào làm:");

        jLabel8.setText("Ca:");

        jLabel2.setText("Họ tên Nhân viên");

        cmbPharmacistSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));

        cmbPharmacistShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        btnAddPharmacist.setText("Lưu");
        btnAddPharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPharmacistActionPerformed(evt);
            }
        });

        btnClearPharmacist.setText("Làm mới");
        btnClearPharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearPharmacistActionPerformed(evt);
            }
        });

        btnCancelPharmacist.setText("Huỷ");
        btnCancelPharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPharmacistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(btnAddPharmacist))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClearPharmacist)
                        .addGap(58, 58, 58)
                        .addComponent(btnCancelPharmacist))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPharmacistID)
                        .addComponent(txtPharmacistName)
                        .addComponent(cmbPharmacistSex, 0, 206, Short.MAX_VALUE)
                        .addComponent(txtPharmacistDOB)
                        .addComponent(txtPharmacistPhone)
                        .addComponent(txtPharmacistAddress)
                        .addComponent(txtYearWork)
                        .addComponent(cmbPharmacistShift, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPharmacistID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPharmacistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPharmacistSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPharmacistDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPharmacistPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPharmacistAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtYearWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbPharmacistShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPharmacist)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelPharmacist)
                        .addComponent(btnClearPharmacist)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearPharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearPharmacistActionPerformed
        // TODO add your handling code here:
        txtPharmacistID.setText("");
        txtPharmacistName.setText("");
        cmbPharmacistSex.setSelectedIndex(0);
        txtPharmacistDOB.setText("");
        txtPharmacistPhone.setText("");
        txtPharmacistAddress.setText("");
        txtYearWork.setText("");
        cmbPharmacistShift.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearPharmacistActionPerformed

    private void btnAddPharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPharmacistActionPerformed

        try {
            String sMaNV = txtPharmacistID.getText();
            String sHoTen = txtPharmacistName.getText();
            String sGioiTinh = (String) cmbPharmacistSex.getSelectedItem();
            int iNamSinh = Integer.parseInt(txtPharmacistDOB.getText());
            String SDT = txtPharmacistPhone.getText();
            String sDiaChi = txtPharmacistAddress.getText();
            int iNamVaoLam = Integer.parseInt(txtYearWork.getText());
            int iCALV = Integer.valueOf(cmbPharmacistShift.getSelectedItem().toString());
            Pharmacist pharmacist = new Pharmacist(sMaNV, sHoTen, sGioiTinh, iNamSinh,
                    SDT, sDiaChi, iNamVaoLam, iCALV);

            if (isEditing) {
                //System.out.println(this.index);
                PharmacistController.getInstance().getList().set(this.index, pharmacist);
                this.setVisible(true);

            } else {
                // thêm vào arraylist trong Controller 1 thằng pharmacist mới
                PharmacistController.getInstance().getList().add(pharmacist);
            }

            // lấy ra table tblListPharmacist từ Panel truyền vào dữ liệu từ Controller
            PanelPharmacist.getInstance().getTable().setModel(
                    PharmacistController.getInstance().toTable()
            );
            
            // Clear thông tin sau mỗi lần thêm thành công
//            txtPharmacistID.setText("");
//            txtPharmacistName.setText("");
//            cmbPharmacistSex.setSelectedIndex(0);
//            txtPharmacistDOB.setText("");
//            txtPharmacistPhone.setText("");
//            txtPharmacistAddress.setText("");
//            txtYearWork.setText("");
//            cmbPharmacistShift.setSelectedIndex(0);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Nhập sai thông tin", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnAddPharmacistActionPerformed

    private void btnCancelPharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPharmacistActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelPharmacistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPharmacist;
    private javax.swing.JButton btnCancelPharmacist;
    private javax.swing.JButton btnClearPharmacist;
    private javax.swing.JComboBox<String> cmbPharmacistSex;
    private javax.swing.JComboBox<String> cmbPharmacistShift;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtPharmacistAddress;
    private javax.swing.JTextField txtPharmacistDOB;
    private javax.swing.JTextField txtPharmacistID;
    private javax.swing.JTextField txtPharmacistName;
    private javax.swing.JTextField txtPharmacistPhone;
    private javax.swing.JTextField txtYearWork;
    // End of variables declaration//GEN-END:variables
}
