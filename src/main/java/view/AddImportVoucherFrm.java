
package view;

/**
 *
 * @author THAONGAN
 */
public class AddImportVoucherFrm extends javax.swing.JFrame {

    /**
     * Creates new form AddBuyReceipt
     */
    public AddImportVoucherFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        main1 = new controller.main();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        utilDateModel1 = new org.jdatepicker.impl.UtilDateModel();
        utilCalendarModel2 = new org.jdatepicker.impl.UtilCalendarModel();
        sqlDateModel2 = new org.jdatepicker.impl.SqlDateModel();
        lbBuyReceipt = new javax.swing.JLabel();
        lbBuyID = new javax.swing.JLabel();
        tfBuyID = new javax.swing.JTextField();
        lbPharmacistID = new javax.swing.JLabel();
        lbPharmacistName = new javax.swing.JLabel();
        tfPharmacistName = new javax.swing.JTextField();
        lbSupplierID = new javax.swing.JLabel();
        lbSupplierName = new javax.swing.JLabel();
        tfSupplierName = new javax.swing.JTextField();
        lbDateBuy = new javax.swing.JLabel();
        lbDrugList = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDrugList = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtSum = new javax.swing.JTextField();
        btnAddImport = new javax.swing.JButton();
        btnClearImport = new javax.swing.JButton();
        btnCancelImport = new javax.swing.JButton();
        txtDateReceipt = new javax.swing.JTextField();
        txtPharmacistID = new javax.swing.JTextField();
        txtSupplierID = new javax.swing.JTextField();
        btnDeleteDrugRow = new javax.swing.JButton();
        btnInsertDrugRow = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm/Sửa Phiếu nhập thuốc");
        setResizable(false);

        lbBuyReceipt.setDisplayedMnemonic('T');
        lbBuyReceipt.setText("                                                Phiếu nhập thuốc");
        lbBuyReceipt.setToolTipText("");

        lbBuyID.setText("Mã phiếu nhập");

        tfBuyID.setText("Sinh mã ");

        lbPharmacistID.setText("Mã nhân viên");

        lbPharmacistName.setText("Tên nhân viên");

        tfPharmacistName.setText("getPharmacistName from MANV");
        tfPharmacistName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPharmacistNameActionPerformed(evt);
            }
        });

        lbSupplierID.setText("Mã nhà cung cấp");

        lbSupplierName.setText("Nhà cung cấp");

        tfSupplierName.setText("getSupplierName from MANCC");
        tfSupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSupplierNameActionPerformed(evt);
            }
        });

        lbDateBuy.setText("Ngày lập phiếu");

        lbDrugList.setText("Danh sách sản phẩm");

        tbDrugList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MATHUOC", "SL", "Đơn giá"
            }
        ));
        jScrollPane2.setViewportView(tbDrugList);

        jLabel8.setText("Tổng");

        txtSum.setText("hàm tính tổng trị giá");

        btnAddImport.setText("Thêm");

        btnClearImport.setText("Làm mới");

        btnCancelImport.setText("Huỷ");

        btnDeleteDrugRow.setText("Xoá SP");

        btnInsertDrugRow.setText("Thêm SP");

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
                        .addComponent(btnAddImport)
                        .addGap(61, 61, 61)
                        .addComponent(btnClearImport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelImport)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(117, 117, 117)
                        .addComponent(txtSum))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBuyID)
                            .addComponent(lbPharmacistID)
                            .addComponent(lbPharmacistName)
                            .addComponent(lbSupplierID)
                            .addComponent(lbSupplierName)
                            .addComponent(lbDateBuy)
                            .addComponent(lbDrugList))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsertDrugRow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteDrugRow))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDateReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfSupplierName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtSupplierID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tfPharmacistName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtPharmacistID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfBuyID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
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
                    .addComponent(txtPharmacistID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPharmacistName)
                    .addComponent(tfPharmacistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSupplierID)
                    .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSupplierName)
                    .addComponent(tfSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDateBuy)
                    .addComponent(txtDateReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDrugList)
                    .addComponent(btnDeleteDrugRow)
                    .addComponent(btnInsertDrugRow))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddImport)
                    .addComponent(btnClearImport)
                    .addComponent(btnCancelImport))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPharmacistNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPharmacistNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPharmacistNameActionPerformed

    private void tfSupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSupplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSupplierNameActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddImport;
    private javax.swing.JButton btnCancelImport;
    private javax.swing.JButton btnClearImport;
    private javax.swing.JButton btnDeleteDrugRow;
    private javax.swing.JButton btnInsertDrugRow;
    private org.jdatepicker.impl.DateComponentFormatter dateComponentFormatter1;
    private org.jdatepicker.JDateComponentFactory jDateComponentFactory1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbBuyID;
    private javax.swing.JLabel lbBuyReceipt;
    private javax.swing.JLabel lbDateBuy;
    private javax.swing.JLabel lbDrugList;
    private javax.swing.JLabel lbPharmacistID;
    private javax.swing.JLabel lbPharmacistName;
    private javax.swing.JLabel lbSupplierID;
    private javax.swing.JLabel lbSupplierName;
    private controller.main main1;
    private org.jdatepicker.impl.SqlDateModel sqlDateModel1;
    private org.jdatepicker.impl.SqlDateModel sqlDateModel2;
    private javax.swing.JTable tbDrugList;
    private javax.swing.JTextField tfBuyID;
    private javax.swing.JTextField tfPharmacistName;
    private javax.swing.JTextField tfSupplierName;
    private javax.swing.JTextField txtDateReceipt;
    private javax.swing.JTextField txtPharmacistID;
    private javax.swing.JTextField txtSum;
    private javax.swing.JTextField txtSupplierID;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel1;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel2;
    private org.jdatepicker.impl.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables
}
