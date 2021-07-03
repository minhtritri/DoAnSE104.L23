package prj.view.dialog;

import prj.view.panel.PanelImportVoucher;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import prj.controller.ImportVoucherController;
import prj.controller.PharmacistController;
import prj.controller.SupplierController;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import prj.model.ImportVoucher;
import prj.model.ImportVoucherDetail;
import prj.model.Pharmacist;
import prj.model.Supplier;

/**
 *
 * @author THAONGAN
 */
public class AddImportVoucherFrm extends javax.swing.JFrame {

    private boolean isEditing = false;
    private int index = -1;

    private void addPlaceHolder(JTextField txt, String placeHolder) {
        if (!txt.getText().equals(placeHolder)) {
            txt.setForeground(Color.BLACK);
        } else {
            txt.setForeground(Color.GRAY);
        }

        txt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txt.getText().equals(placeHolder)) {
                    txt.setText("");
                    txt.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txt.getText().isEmpty()) {
                    txt.setText(placeHolder);
                    txt.setForeground(Color.GRAY);
                }
            }
        });
    }

    private void setPlaceHolder() {
        addPlaceHolder(txtPharmacistID, "NV001");
        addPlaceHolder(txtPharmacistName, "tự động");
        addPlaceHolder(txtSupplierID, "NCC001");
        addPlaceHolder(txtSupplierName, "tự động");
    }

    private void setTxtImportId(String string) {
        txtImportID.setText(string);
    }

    private void generateId() {
        txtImportID.setEditable(false);
        txtSupplierName.setEditable(false);
        txtPharmacistName.setEditable(false);

        ArrayList<ImportVoucher> list = ImportVoucherController.getInstance().getList();
        int rowCount = list.size();
        if (rowCount == 0) {
            txtImportID.setText("PN0" + (rowCount + 1) + "");
            return;
        } else {
            String lastId = list.get(list.size() - 1).getsMaPN().trim();
            int numberId = Integer.parseInt(lastId.replace("PN", ""));
            txtImportID.setText("PN0" + (numberId + 1) + "");
        }
    }

    public AddImportVoucherFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        isEditing = true;
        this.lockAll(isEditing);
        this.setPlaceHolder();
        this.generateId();
        this.testPrint();
    }

    public AddImportVoucherFrm(int index, boolean editable) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        isEditing = editable;
        this.index = index;
        this.addEditInfo(ImportVoucherController.getInstance().getList().get(index));
        this.lockAll(editable);

        txtImportID.setEditable(false);
        txtSupplierName.setEditable(false);
        txtPharmacistName.setEditable(false);
        this.testPrint();
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
        txtDateImport.setDate(java.sql.Date.valueOf(dNgayNhapPhieu));
        tblDrugList.setModel(i.toDetailTable());
        txtSum.setText(Float.toString(i.getfTongTien()));
    }

    public void lockAll(boolean editable) {
        txtImportID.setEditable(editable);
        txtPharmacistID.setEditable(editable);
        txtPharmacistName.setEditable(editable);
        txtSupplierID.setEditable(editable);
        txtSupplierName.setEditable(editable);
        txtDateImport.setEnabled(editable);
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
        txtPharmacistID = new javax.swing.JTextField();
        txtSupplierID = new javax.swing.JTextField();
        btnDeleteDrugRow = new javax.swing.JButton();
        btnInsertDrugRow = new javax.swing.JButton();
        txtDateImport = new com.toedter.calendar.JDateChooser();
        btnFindPharmacisName = new javax.swing.JButton();
        btnFindSupplierName = new javax.swing.JButton();

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

        lbBuyReceipt.setBackground(new java.awt.Color(79, 102, 107));
        lbBuyReceipt.setDisplayedMnemonic('T');
        lbBuyReceipt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbBuyReceipt.setForeground(new java.awt.Color(255, 255, 255));
        lbBuyReceipt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBuyReceipt.setText("Phiếu nhập thuốc");
        lbBuyReceipt.setToolTipText("");
        lbBuyReceipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbBuyReceipt.setOpaque(true);

        lbBuyID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbBuyID.setText("Mã phiếu nhập");

        txtImportID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtImportID.setText("sinh mã tự động");

        lbPharmacistID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbPharmacistID.setText("Mã nhân viên");

        lbPharmacistName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbPharmacistName.setText("Tên nhân viên");

        txtPharmacistName.setEditable(false);
        txtPharmacistName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPharmacistName.setText("tự động");

        lbSupplierID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbSupplierID.setText("Mã nhà cung cấp");

        lbSupplierName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbSupplierName.setText("Nhà cung cấp");

        txtSupplierName.setEditable(false);
        txtSupplierName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtSupplierName.setText("tự động");

        lbDateBuy.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDateBuy.setText("Ngày lập phiếu (dd/mm/yyyy)");

        lbDrugList.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDrugList.setText("Danh sách sản phẩm");

        tblDrugList.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
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

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Tổng tiền");

        txtSum.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtSum.setText("hàm tính tổng");

        btnAddImport.setBackground(new java.awt.Color(49, 72, 77));
        btnAddImport.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAddImport.setForeground(new java.awt.Color(255, 255, 255));
        btnAddImport.setText("Lưu");
        btnAddImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImportActionPerformed(evt);
            }
        });

        btnClearImport.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnClearImport.setText("Làm mới");
        btnClearImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearImportActionPerformed(evt);
            }
        });

        btnCancelImport.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnCancelImport.setText("Huỷ");
        btnCancelImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelImportActionPerformed(evt);
            }
        });

        txtPharmacistID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPharmacistID.setText("NV001");
        txtPharmacistID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPharmacistIDKeyReleased(evt);
            }
        });

        txtSupplierID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtSupplierID.setText("NCC001");
        txtSupplierID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSupplierIDKeyReleased(evt);
            }
        });

        btnDeleteDrugRow.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnDeleteDrugRow.setText("Xoá SP");
        btnDeleteDrugRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDrugRowActionPerformed(evt);
            }
        });

        btnInsertDrugRow.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnInsertDrugRow.setText("Thêm SP");
        btnInsertDrugRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertDrugRowActionPerformed(evt);
            }
        });

        txtDateImport.setDate(new Date());
        txtDateImport.setDateFormatString("dd'/'MM'/'yyyy");

        btnFindPharmacisName.setText("Tìm");
        btnFindPharmacisName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPharmacisNameActionPerformed(evt);
            }
        });

        btnFindSupplierName.setText("Tìm");
        btnFindSupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindSupplierNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSum, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbBuyID)
                                    .addComponent(lbPharmacistID)
                                    .addComponent(lbPharmacistName)
                                    .addComponent(lbSupplierID)
                                    .addComponent(lbSupplierName)
                                    .addComponent(lbDateBuy)
                                    .addComponent(lbDrugList))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSupplierName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPharmacistName)
                                    .addComponent(txtImportID)
                                    .addComponent(txtDateImport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnInsertDrugRow)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDeleteDrugRow))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSupplierID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFindSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPharmacistID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFindPharmacisName, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAddImport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClearImport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelImport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
            .addComponent(lbBuyReceipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbBuyReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuyID)
                    .addComponent(txtImportID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFindPharmacisName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPharmacistID)
                        .addComponent(txtPharmacistID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPharmacistName)
                    .addComponent(txtPharmacistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSupplierID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSupplierName)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDateImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteDrugRow)
                            .addComponent(btnInsertDrugRow)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDateBuy)
                        .addGap(21, 21, 21)
                        .addComponent(lbDrugList)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearImport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddImport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelImport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearImportActionPerformed
        //txtImportID.setText("");
        txtPharmacistID.setText("");
        txtPharmacistName.setText("");
        txtSupplierID.setText("");
        txtSupplierName.setText("");
        txtDateImport.setDate(new Date());
        txtSum.setText("");
        txtPharmacistID.requestFocus();

        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã thuốc", "Số lượng", "Đơn giá", "Thành tiền"});
        tblDrugList.setModel(tblModel);
    }//GEN-LAST:event_btnClearImportActionPerformed

    private void btnCancelImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelImportActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelImportActionPerformed

    private ArrayList<String> generateDetailId() {
        this.testPrint();
        String maCtpn = "";
        
        ArrayList<String> results = new ArrayList<>();

        ArrayList<ImportVoucher> list = ImportVoucherController.getInstance().getList();
        System.out.println("list detail size: " + list.size());
        
        // trường hợp thêm phiếu nhập đầu tiên và chi tiết đầu tiên
        if (list.isEmpty()) {
            results.add("CTPN0" + (this.tblDrugList.getRowCount())); 
            return results;
        }

        // trường hợp sai vị trí
        int counter = 0;
        for (ImportVoucher iv : list) {
            for (ImportVoucherDetail detail : iv.getDetailList()) {
                counter += 1;
                String ctpn = detail.getsMaCTPN().trim();
                System.out.println("GET-ID:" + ctpn);
                //chỉ lấy số 
                int comparator = Integer.parseInt(ctpn.replace("CTPN0", "").trim());
                System.out.println("COMPARE: " + comparator + " " + counter);
                String t = "CTPN0" + counter;
                if (this.notExist(t)) {
                    System.out.println("NOT-EXISTED: " + t);
                    results.add(t);
                    counter += 1;
                }
                
            }
        }
        // trường hợp thêm nhiều phần tử
        for (int i = 0; i < tblDrugList.getRowCount(); i++) {
            counter += 1;
            results.add("CTPN0" + counter);
        }
        return results;
    }
    
    public boolean notExist(String t) {
         for (ImportVoucher iv : ImportVoucherController.getInstance().getList()) {
            for (ImportVoucherDetail detail : iv.getDetailList()) {
                if (detail.getsMaCTPN().trim().equals(t)) return false;
            }
         }    
         return true;
    }
    
    public void testPrint() {
        for (ImportVoucher iv : ImportVoucherController.getInstance().getList()) {
            System.out.print(iv.getsMaPN().trim() + " : { ");
            for (ImportVoucherDetail detail : iv.getDetailList()) {
                System.out.print(detail.getsMaCTPN().trim() + " ");
            }
            System.out.println(" };");
        }
    }


    private void btnAddImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImportActionPerformed
        try {
            this.testPrint();
            String sMaPN = txtImportID.getText();
            String sMaNV = txtPharmacistID.getText();
            String STenNV = txtPharmacistName.getText();
            String sMaNCC = txtSupplierID.getText();
            String sTenNCC = txtSupplierName.getText();
            float fTongTien = 0;
            LocalDate dNgayLapPhieu = txtDateImport.getDate().toInstant()
                    .atZone(ZoneId.systemDefault()).toLocalDate();

            ImportVoucher importVoucher = new ImportVoucher(sMaPN, sMaNV, STenNV, sMaNCC,
                    sTenNCC, dNgayLapPhieu, fTongTien);

            ArrayList<String> values = this.generateDetailId();
            DefaultTableModel tblModel = (DefaultTableModel) tblDrugList.getModel();
            for (int i = 0; i < tblModel.getRowCount(); i++) {
                try {
                    // khởi tạo Detail
                    String sMaCTPN = values.get(i);
                    System.out.println("GEN: " + sMaCTPN);
                    String sMATHUOC = tblModel.getValueAt(i, 0).toString();
                    int iSL = Integer.valueOf(tblModel.getValueAt(i, 1).toString());
                    float fDonGia = Float.valueOf(tblModel.getValueAt(i, 2).toString());
                    float fThanhTien = this.calculatePrice(iSL, fDonGia);
                    tblModel.setValueAt(Float.toString(fThanhTien), i, 3);

                    ImportVoucherDetail importDetail = new ImportVoucherDetail(
                            sMaCTPN, sMaPN, sMATHUOC, iSL, fDonGia, fThanhTien
                    );
                    importVoucher.getDetailList().add(importDetail);
                    //ImportVoucherController.getInstance().InsertImportVoucherDetails(sMaCTPN, sMaPN, sMATHUOC, iSL, fDonGia, fThanhTien);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            fTongTien = this.calculateTotal();
            importVoucher.setfTongTien(fTongTien);

            if (this.index != -1 & isEditing) {
                ImportVoucherController.getInstance().getList().set(this.index, importVoucher);
                ImportVoucherController.getInstance().deleteFromDatabase(
                        ImportVoucherController.getInstance().getList().get(index)
                );
                this.setVisible(true);
                ImportVoucherController.getInstance().insertToDatabase(importVoucher);

            } else {
                // thêm vào arraylist trong Controller 1 thằng  mới
                ImportVoucherController.getInstance().getList().add(importVoucher);
                ImportVoucherController.getInstance().insertToDatabase(importVoucher);

            }

            // lấy ra table tblListReceipt từ Panel truyền vào dữ liệu từ Controller
            PanelImportVoucher.getInstance().getTable().setModel(
                    ImportVoucherController.getInstance().toTable());

            //ImportVoucherController.getInstance().UpdateImportVoucher(sMaPN, fTongTien);
            
            if (this.index != -1 & isEditing) {
                this.dispose();
                return;
            }

            // clear info after adding successfully
            this.btnClearImportActionPerformed(evt);
            this.setPlaceHolder();
            //generate new ID
            this.generateId();

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
                txtPharmacistName.setForeground(Color.BLACK);
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
                txtSupplierName.setForeground(Color.BLACK);
                txtSupplierName.setText(s.getsTenNCC());
                return;
            } else {
                txtSupplierName.setText("");
            }
        }
    }//GEN-LAST:event_txtSupplierIDKeyReleased

    private void btnFindPharmacisNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPharmacisNameActionPerformed
        String temp = ImportVoucherController.getInstance().getPharmacisName(txtPharmacistID.getText());
        txtPharmacistName.setForeground(Color.BLACK);
        txtPharmacistName.setText(temp);
    }//GEN-LAST:event_btnFindPharmacisNameActionPerformed

    private void btnFindSupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindSupplierNameActionPerformed
        String temp = ImportVoucherController.getInstance().getSupplierName(txtSupplierID.getText());
        txtSupplierName.setForeground(Color.BLACK);
        txtSupplierName.setText(temp);
    }//GEN-LAST:event_btnFindSupplierNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddImport;
    private javax.swing.JButton btnCancelImport;
    private javax.swing.JButton btnClearImport;
    private javax.swing.JButton btnDeleteDrugRow;
    private javax.swing.JButton btnFindPharmacisName;
    private javax.swing.JButton btnFindSupplierName;
    private javax.swing.JButton btnInsertDrugRow;
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
    private javax.swing.JTable tblDrugList;
    private com.toedter.calendar.JDateChooser txtDateImport;
    private javax.swing.JTextField txtImportID;
    private javax.swing.JTextField txtPharmacistID;
    private javax.swing.JTextField txtPharmacistName;
    private javax.swing.JTextField txtSum;
    private javax.swing.JTextField txtSupplierID;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables

}
