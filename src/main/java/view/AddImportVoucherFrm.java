package view;

import controller.ImportVoucherController;
import controller.PharmacistController;
import controller.SupplierController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.ImportVoucher;
import model.ImportVoucherDetail;
import model.Pharmacist;
import model.Supplier;

/**
 *
 * @author THAONGAN
 */
public class AddImportVoucherFrm extends javax.swing.JFrame {

    private boolean isEditing = false;
    private int index = -1;

    /**
     * Creates new form AddBuyReceipt
     */
    public AddImportVoucherFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        isEditing = true;
        this.lockAll(isEditing);
    }

    public AddImportVoucherFrm(int index, boolean editable) {
        this();
        isEditing = editable;
        this.index = index;
        this.addEditInfo(ImportVoucherController.getInstance().getList().get(index));
        this.lockAll(editable);
    }

    public void addEditInfo(ImportVoucher i) {
        // set tung text field tuong ung voi tung getter
        txtImportID.setText(i.getsMaPN());
        txtPharmacistID.setText(i.getsMaNV());
        txtPharmacistName.setText(i.getsTenNV());
        txtSupplierID.setText(i.getsMaNCC());
        txtSupplierName.setText(i.getsTenNCC());
        LocalDate dNgayNhapPhieu = LocalDate.parse(i.getdNgayNhapPhieu().toString(),
                DateTimeFormatter.ofPattern("yyyy'-'MM'-'dd"));
        txtDateImport.setText(dNgayNhapPhieu.format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy")));
        tblDrugList.setModel(i.toDetailTable());
        txtSum.setText(Float.toString(i.getfTongTien()));
    }

    public void lockAll(boolean editable) {
        txtImportID.setEditable(editable);
        txtPharmacistID.setEditable(editable);
        txtPharmacistName.setEditable(editable);
        txtSupplierID.setEditable(editable);
        txtSupplierName.setEditable(editable);
        txtDateImport.setEditable(editable);
        txtSum.setEditable(editable);
        tblDrugList.setEnabled(editable);

        btnInsertDrugRow.setVisible(editable);
        btnDeleteDrugRow.setVisible(editable);
        btnAddImport.setVisible(editable);
        btnClearImport.setVisible(editable);
    }

    private float calculatePrice(int iSL, float fDonGia) {
        return iSL * fDonGia;
    }

    private float calculateTotal() {
        TableModel tmpModel = tblDrugList.getModel();
        Float sum = 0.0f;

        for (int i = 0; i < tmpModel.getRowCount(); i++) {
            Integer sl = 0;
            Float dg = 0.0f;
            try {
                sl = Integer.valueOf(tmpModel.getValueAt(i, 1).toString()); // cột SL
                dg = Float.valueOf(tmpModel.getValueAt(i, 2).toString());  // cột Đơn giá
            } catch (Exception e) {
                // e.printStackTrace();

            } finally {
                sum += (sl * dg);
            }
        }
        return sum;
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
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        utilDateModel1 = new org.jdatepicker.impl.UtilDateModel();
        utilCalendarModel2 = new org.jdatepicker.impl.UtilCalendarModel();
        sqlDateModel2 = new org.jdatepicker.impl.SqlDateModel();
        lbBuyReceipt = new javax.swing.JLabel();
        lbBuyID = new javax.swing.JLabel();
        txtImportID = new javax.swing.JTextField();
        lbPharmacistID = new javax.swing.JLabel();
        lbPharmacistName = new javax.swing.JLabel();
        txtPharmacistName = new javax.swing.JTextField();
        lbSupplierID = new javax.swing.JLabel();
        lbSupplierName = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        lbDateBuy = new javax.swing.JLabel();
        lbDrugList = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDrugList = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtSum = new javax.swing.JTextField();
        btnAddImport = new javax.swing.JButton();
        btnClearImport = new javax.swing.JButton();
        btnCancelImport = new javax.swing.JButton();
        txtDateImport = new javax.swing.JTextField();
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
        lbBuyReceipt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbBuyReceipt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBuyReceipt.setText("Phiếu nhập thuốc");
        lbBuyReceipt.setToolTipText("");

        lbBuyID.setText("Mã phiếu nhập");

        lbPharmacistID.setText("Mã nhân viên");

        lbPharmacistName.setText("Tên nhân viên");

        lbSupplierID.setText("Mã nhà cung cấp");

        lbSupplierName.setText("Nhà cung cấp");

        lbDateBuy.setText("Ngày lập phiếu (dd/mm/yyyy)");

        lbDrugList.setText("Danh sách sản phẩm");

        tblDrugList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thuốc", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblDrugList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblDrugListPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tblDrugList);

        jLabel8.setText("Tổng tiền");

        txtSum.setText("hàm tính tổng trị giá");

        btnAddImport.setText("Lưu");
        btnAddImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImportActionPerformed(evt);
            }
        });

        btnClearImport.setText("Làm mới");
        btnClearImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearImportActionPerformed(evt);
            }
        });

        btnCancelImport.setText("Huỷ");
        btnCancelImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelImportActionPerformed(evt);
            }
        });

        txtPharmacistID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPharmacistIDKeyReleased(evt);
            }
        });

        txtSupplierID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSupplierIDKeyReleased(evt);
            }
        });

        btnDeleteDrugRow.setText("Xoá SP");
        btnDeleteDrugRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDrugRowActionPerformed(evt);
            }
        });

        btnInsertDrugRow.setText("Thêm SP");
        btnInsertDrugRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertDrugRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSupplierName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(txtSupplierID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPharmacistName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPharmacistID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtImportID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDateImport))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInsertDrugRow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteDrugRow))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(btnAddImport))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClearImport)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelImport))
                            .addComponent(txtSum))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbBuyReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbBuyReceipt)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuyID)
                    .addComponent(txtImportID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPharmacistID)
                    .addComponent(txtPharmacistID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPharmacistName)
                    .addComponent(txtPharmacistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSupplierID)
                    .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSupplierName)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDateBuy)
                    .addComponent(txtDateImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddImport)
                    .addComponent(btnClearImport)
                    .addComponent(btnCancelImport))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearImportActionPerformed
        txtImportID.setText("");
        txtPharmacistID.setText("");
        txtPharmacistName.setText("");
        txtSupplierID.setText("");
        txtSupplierName.setText("");
        txtDateImport.setText("");
        txtSum.setText("");

        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã thuốc", "Số lượng", "Đơn giá", "Thành tiền"});
        tblDrugList.setModel(tblModel);
    }//GEN-LAST:event_btnClearImportActionPerformed

    private void btnCancelImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelImportActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelImportActionPerformed

    private void btnAddImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImportActionPerformed
        try {
            String sMaPN = txtImportID.getText();
            String sMaNV = txtPharmacistID.getText();
            String STenNV = txtPharmacistName.getText();
            String sMaNCC = txtSupplierID.getText();
            String sTenNCC = txtSupplierName.getText();
            float fTongTien = 0;
            LocalDate dNgayLapPhieu = LocalDate.parse(txtDateImport.getText(),
                    DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy"));
            ImportVoucher importVoucher = new ImportVoucher(sMaPN, sMaNV, STenNV, sMaNCC,
                    sTenNCC, dNgayLapPhieu, fTongTien);

            DefaultTableModel tblModel = (DefaultTableModel) tblDrugList.getModel();
            for (int i = 0; i < tblModel.getRowCount(); i++) {
                try {
                    // khởi tạo receiptDetail
                    String sMaCTPN = "từ từ code sau, hoặc ẩn nó luôn nhỉ";
                    String sMATHUOC = tblModel.getValueAt(i, 0).toString();
                    int iSL = Integer.valueOf(tblModel.getValueAt(i, 1).toString());
                    float fDonGia = Float.valueOf(tblModel.getValueAt(i, 2).toString());
                    float fThanhTien = this.calculatePrice(iSL, fDonGia);

                    tblModel.setValueAt(Float.toString(fThanhTien), i, 3);

                    ImportVoucherDetail importDetail = new ImportVoucherDetail(
                            sMaCTPN, sMaPN, sMATHUOC, iSL, fDonGia, fThanhTien
                    );
                    importVoucher.getDetailList().add(importDetail);

                    //receipt.getDetailList().stream().forEach(System.out::println);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            fTongTien = this.calculateTotal();
            importVoucher.setfTongTien(fTongTien);

            if (this.index != -1 & isEditing) {
                //System.out.println(this.index);
                ImportVoucherController.getInstance().getList().set(this.index, importVoucher);
            } else {
                // thêm vào arraylist trong Controller 1 thằng receipt mới
                ImportVoucherController.getInstance().getList().add(importVoucher);
            }

            // lấy ra table tblListReceipt từ Panel truyền vào dữ liệu từ Controller
            PanelImportVoucher.getInstance().getTable().setModel(
                    ImportVoucherController.getInstance().toTable()
            );

            System.out.println("Them thanh cong " + "size "
                    + ImportVoucherController.getInstance().getList().size());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Nhập sai thông tin", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddImportActionPerformed

    private void btnInsertDrugRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertDrugRowActionPerformed
        DefaultTableModel tmpModel = (DefaultTableModel) tblDrugList.getModel();
        tmpModel.addRow(new Object[4]);
        tblDrugList.setModel(tmpModel);
    }//GEN-LAST:event_btnInsertDrugRowActionPerformed

    private void btnDeleteDrugRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDrugRowActionPerformed
        DefaultTableModel tmpModel = (DefaultTableModel) tblDrugList.getModel();
        int selectedIndex = tblDrugList.getSelectedRow();
        // nếu không chọn dòng nào thì xoá dòng cuối
        if (selectedIndex == -1) {
            if (tblDrugList.getRowCount() == 0) {
                return; // bảng không có dòng nào thì thôi
            }
            // cho selectedIndex = dòng cuối
            selectedIndex = tblDrugList.getRowCount() - 1;
        }
        tmpModel.removeRow(selectedIndex);
        tblDrugList.setModel(tmpModel);

        String TongTien = Float.toString(this.calculateTotal());
        txtSum.setText(TongTien);
    }//GEN-LAST:event_btnDeleteDrugRowActionPerformed

    private void tblDrugListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblDrugListPropertyChange
        String TongTien = Float.toString(this.calculateTotal());
        txtSum.setText(TongTien);

        DefaultTableModel tblModel = (DefaultTableModel) tblDrugList.getModel();
        try {
            for (int i = 0; i < tblModel.getRowCount(); i++) {
                String sMATHUOC = tblModel.getValueAt(i, 0).toString();
                int iSL = Integer.valueOf(tblModel.getValueAt(i, 1).toString());
                float fDonGia = Float.valueOf(tblModel.getValueAt(i, 2).toString());
                float fThanhTien = this.calculatePrice(iSL, fDonGia);
                tblModel.setValueAt(Float.toString(fThanhTien), i, 3);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblDrugListPropertyChange

    private void txtPharmacistIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPharmacistIDKeyReleased
        String sMaNV = txtPharmacistID.getText();
        for (Pharmacist p : PharmacistController.getInstance().getList()) {
            if (p.getsMaNV().equals(sMaNV)) {
                txtPharmacistName.setText(p.getsHoTen());
                return;
            } else {
                txtPharmacistName.setText("");
            }
        }
    }//GEN-LAST:event_txtPharmacistIDKeyReleased

    private void txtSupplierIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSupplierIDKeyReleased
        String sMaNCC = txtSupplierID.getText();
        for (Supplier s : SupplierController.getInstance().getList()) {
            if (s.getsMaNCC().equals(sMaNCC)) {
                txtSupplierName.setText(s.getsTenNCC());
                return;
            } else {
                txtSupplierName.setText("");
            }
        }
    }//GEN-LAST:event_txtSupplierIDKeyReleased


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
    private org.jdatepicker.impl.SqlDateModel sqlDateModel1;
    private org.jdatepicker.impl.SqlDateModel sqlDateModel2;
    private javax.swing.JTable tblDrugList;
    private javax.swing.JTextField txtDateImport;
    private javax.swing.JTextField txtImportID;
    private javax.swing.JTextField txtPharmacistID;
    private javax.swing.JTextField txtPharmacistName;
    private javax.swing.JTextField txtSum;
    private javax.swing.JTextField txtSupplierID;
    private javax.swing.JTextField txtSupplierName;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel1;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel2;
    private org.jdatepicker.impl.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables
}
