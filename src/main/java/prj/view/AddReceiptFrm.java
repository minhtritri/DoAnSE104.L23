/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj.view;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import prj.controller.CustomerController;
import prj.controller.PharmacistController;
import prj.controller.ReceiptController;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import prj.model.Customer;
import prj.model.Pharmacist;
import prj.model.Receipt;
import prj.model.ReceiptDetail;

/**
 *
 * @author THAONGAN
 */
public class AddReceiptFrm extends javax.swing.JFrame {

    private boolean isEditing = false;
    private int index = -1;
    private static AddReceiptFrm instance = new AddReceiptFrm();
    public static AddReceiptFrm getInstance(){
        return instance;
    }
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
        addPlaceHolder(txtCustomerID, "KH001");
        addPlaceHolder(txtCustomerName, "tự động");
    }

    /**
     * Creates new form AddBuyReceipt
     */
    public AddReceiptFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        isEditing = true;
        this.lockAll(isEditing);
        this.setPlaceHolder();
        txtReceiptID.setEnabled(false);
        txtCustomerName.setEnabled(false);
        txtPharmacistName.setEnabled(false);
    }

    public AddReceiptFrm(int index, boolean editable) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        isEditing = editable;
        this.index = index;
        this.addEditInfo(ReceiptController.getInstance().getList().get(index));
        this.lockAll(editable);
        txtReceiptID.setEnabled(false);
        txtCustomerName.setEnabled(false);
        txtPharmacistName.setEnabled(false);
    }

    public void addEditInfo(Receipt r) {
        // set tung text field tuong ung voi tung getter
        txtReceiptID.setText(r.getsMaHD());
        txtPharmacistID.setText(r.getsMaNV());
        txtPharmacistName.setText(r.getsTenNV());
        txtCustomerID.setText(r.getsMaKH());
        txtCustomerName.setText(r.getsTenKH());
        LocalDate dNgayMuaThuoc = LocalDate.parse(r.getdNgayMuaThuoc().toString(),
                DateTimeFormatter.ofPattern("yyyy'-'MM'-'dd"));
        txtDateReceipt.setDate(java.sql.Date.valueOf(dNgayMuaThuoc));
        tblDrugList.setModel(r.toDetailTable());
        txtSumReceipt.setText(Float.toString(r.getfTongTien()));
    }

    public void lockAll(boolean editable) {
        txtReceiptID.setEditable(editable);
        txtPharmacistID.setEditable(editable);
        txtPharmacistName.setEditable(editable);
        txtCustomerID.setEditable(editable);
        txtCustomerName.setEditable(editable);
        txtDateReceipt.setEnabled(editable);
        txtSumReceipt.setEditable(editable);
        tblDrugList.setEnabled(editable);

        btnInsertDrugRow.setVisible(editable);
        btnDeleteDrugRow.setVisible(editable);
        btnAddReceipt.setVisible(editable);
        btnClearReceipt.setVisible(editable);
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
        lbSellID = new javax.swing.JLabel();
        txtReceiptID = new javax.swing.JTextField();
        lbPharmacistID = new javax.swing.JLabel();
        lbPharmacistName = new javax.swing.JLabel();
        txtPharmacistName = new javax.swing.JTextField();
        lbGuestID = new javax.swing.JLabel();
        lbGuestName = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lbDateSell = new javax.swing.JLabel();
        lbDrugList = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDrugList = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtSumReceipt = new javax.swing.JTextField();
        btnAddReceipt = new javax.swing.JButton();
        btnClearReceipt = new javax.swing.JButton();
        btnCancelReceipt = new javax.swing.JButton();
        txtPharmacistID = new javax.swing.JTextField();
        txtCustomerID = new javax.swing.JTextField();
        btnInsertDrugRow = new javax.swing.JButton();
        btnDeleteDrugRow = new javax.swing.JButton();
        txtDateReceipt = new com.toedter.calendar.JDateChooser();
        btnPharmacisName = new javax.swing.JButton();
        btnCustomerName = new javax.swing.JButton();

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
        setTitle("Thêm/Sửa Hoá đơn bán hàng");
        setResizable(false);

        lbBuyReceipt.setBackground(new java.awt.Color(79, 102, 107));
        lbBuyReceipt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbBuyReceipt.setForeground(new java.awt.Color(255, 255, 255));
        lbBuyReceipt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBuyReceipt.setText("Hoá đơn bán thuốc ");
        lbBuyReceipt.setToolTipText("");
        lbBuyReceipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbBuyReceipt.setOpaque(true);

        lbSellID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbSellID.setText("Mã hoá đơn");

        txtReceiptID.setEditable(false);
        txtReceiptID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtReceiptID.setText("sinh mã tự động");

        lbPharmacistID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbPharmacistID.setText("Mã nhân viên");

        lbPharmacistName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbPharmacistName.setText("Tên nhân viên");

        txtPharmacistName.setEditable(false);
        txtPharmacistName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPharmacistName.setText("tự động");
        txtPharmacistName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPharmacistNameCaretUpdate(evt);
            }
        });

        lbGuestID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbGuestID.setText("Mã khách hàng");

        lbGuestName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbGuestName.setText("Tên khách hàng");

        txtCustomerName.setEditable(false);
        txtCustomerName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCustomerName.setText("tự động");

        lbDateSell.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDateSell.setText("Ngày mua (dd/mm/yyyy)");

        lbDrugList.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDrugList.setText("Danh sách sản phẩm");

        tblDrugList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Thuốc", "Số lượng", "Đơn giá", "Thành tiền"
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

        txtSumReceipt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtSumReceipt.setText("hàm tính tổng");

        btnAddReceipt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAddReceipt.setText("Lưu");
        btnAddReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReceiptActionPerformed(evt);
            }
        });

        btnClearReceipt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnClearReceipt.setText("Làm mới");
        btnClearReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearReceiptActionPerformed(evt);
            }
        });

        btnCancelReceipt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnCancelReceipt.setText("Huỷ");
        btnCancelReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelReceiptActionPerformed(evt);
            }
        });

        txtPharmacistID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPharmacistID.setText("NV001");
        txtPharmacistID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPharmacistIDKeyReleased(evt);
            }
        });

        txtCustomerID.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCustomerID.setText("KH001");
        txtCustomerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerIDKeyReleased(evt);
            }
        });

        btnInsertDrugRow.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnInsertDrugRow.setText("Thêm SP");
        btnInsertDrugRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertDrugRowActionPerformed(evt);
            }
        });

        btnDeleteDrugRow.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnDeleteDrugRow.setText("Xoá SP");
        btnDeleteDrugRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDrugRowActionPerformed(evt);
            }
        });

        txtDateReceipt.setDate(new Date());
        txtDateReceipt.setDateFormatString("dd'/'MM'/'yyyy");

        btnPharmacisName.setText("Tìm");
        btnPharmacisName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPharmacisNameActionPerformed(evt);
            }
        });

        btnCustomerName.setText("Tìm");
        btnCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbBuyReceipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddReceipt)
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClearReceipt)
                                .addGap(100, 100, 100)
                                .addComponent(btnCancelReceipt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSumReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbDrugList)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                            .addComponent(btnInsertDrugRow)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDeleteDrugRow))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbSellID)
                                .addComponent(lbPharmacistID)
                                .addComponent(lbPharmacistName)
                                .addComponent(lbGuestID)
                                .addComponent(lbGuestName)
                                .addComponent(lbDateSell))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtReceiptID, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(txtPharmacistName, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(txtDateReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtPharmacistID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnPharmacisName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(10, 10, 10))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbBuyReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSellID)
                    .addComponent(txtReceiptID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPharmacisName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPharmacistID)
                        .addComponent(txtPharmacistID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPharmacistName)
                    .addComponent(txtPharmacistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCustomerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbGuestID)
                        .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGuestName)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDateSell)
                    .addComponent(txtDateReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDrugList)
                    .addComponent(btnDeleteDrugRow)
                    .addComponent(btnInsertDrugRow))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSumReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelReceipt)
                    .addComponent(btnClearReceipt)
                    .addComponent(btnAddReceipt))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearReceiptActionPerformed
        txtReceiptID.setText("");
        txtPharmacistID.setText("");
        txtPharmacistName.setText("");
        txtCustomerID.setText("");
        txtCustomerName.setText("");
        txtDateReceipt.setDate(new Date());
        txtSumReceipt.setText("");

        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã thuốc", "Số lượng", "Đơn giá", "Thành tiền"});
        tblDrugList.setModel(tblModel);
    }//GEN-LAST:event_btnClearReceiptActionPerformed

    private void btnAddReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReceiptActionPerformed
        try {
            if (this.index != -1 & isEditing) {
                //System.out.println(this.index);
                ReceiptController.getInstance().DeleteRD(ReceiptController.getInstance().getList().get(index).getsMaHD());
                ReceiptController.getInstance().Delete(ReceiptController.getInstance().getList().get(index).getsMaHD());
                
            } 
            String sMaHD = txtReceiptID.getText();
            String sMaNV = txtPharmacistID.getText();
            String STenNV = txtPharmacistName.getText();
            String sMaKH = txtCustomerID.getText();
            String sTenKH = txtCustomerName.getText();
            float fTongTien = 0;
            LocalDate dNgayMuaThuoc = txtDateReceipt.getDate().toInstant()
                    .atZone(ZoneId.systemDefault()).toLocalDate();
            Receipt receipt = new Receipt(sMaHD, sMaNV, STenNV, sMaKH, sTenKH, dNgayMuaThuoc, fTongTien);
            //add vao JDBC
            ReceiptController.getInstance().InsertReceipt(sMaHD, sMaNV, STenNV, sMaKH, sTenKH, dNgayMuaThuoc, fTongTien);
            
            DefaultTableModel tblModel = (DefaultTableModel) tblDrugList.getModel();
            for (int i = 0; i < tblModel.getRowCount(); i++) {
                try {
                    // khởi tạo receiptDetail
                    String sMaCTHD = "CTHD0" +(ReceiptController.getInstance().CountingRowRD()+1)+"";
                    String sMAHD = txtReceiptID.getText();
                    String sMATHUOC = tblModel.getValueAt(i, 0).toString();
                    int iSL = Integer.valueOf(tblModel.getValueAt(i, 1).toString());
                    float fDonGia = Float.valueOf(tblModel.getValueAt(i, 2).toString());
                    float fThanhTien = this.calculatePrice(iSL, fDonGia);

                    tblModel.setValueAt(Float.toString(fThanhTien), i, 3);

                    ReceiptDetail receiptDetail = new ReceiptDetail(
                            sMaCTHD, sMAHD, sMATHUOC, iSL, fDonGia, fThanhTien
                    );
                    receipt.getDetailList().add(receiptDetail);
                    ReceiptController.getInstance().InsertReceiptDetails(sMaCTHD, sMAHD, sMATHUOC, iSL, fDonGia, fThanhTien);
             
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            fTongTien = this.calculateTotal();
            receipt.setfTongTien(fTongTien);

            if (this.index != -1 & isEditing) {
                //System.out.println(this.index);
                ReceiptController.getInstance().getList().set(this.index, receipt);
                
            } else {
                // thêm vào arraylist trong Controller 1 thằng receipt mới
                ReceiptController.getInstance().getList().add(receipt);
            }

            // lấy ra table tblListReceipt từ Panel truyền vào dữ liệu từ Controller
            PanelReceipt.getInstance().getTable().setModel(
                    ReceiptController.getInstance().toTable());
            ReceiptController.getInstance().UpdateReceipt(sMaHD, fTongTien);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Nhập sai thông tin", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddReceiptActionPerformed

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
        txtSumReceipt.setText(TongTien);
    }//GEN-LAST:event_btnDeleteDrugRowActionPerformed

    private void tblDrugListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblDrugListPropertyChange
        String TongTien = Float.toString(this.calculateTotal());
        txtSumReceipt.setText(TongTien);

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

    private void btnCancelReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelReceiptActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelReceiptActionPerformed

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

    private void txtCustomerIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIDKeyReleased
        String sMaKH = txtCustomerID.getText();
        for (Customer c : CustomerController.getInstance().getList()) {
            if (c.getsMaKH().equals(sMaKH)) {
                txtCustomerName.setForeground(Color.BLACK);
                txtCustomerName.setText(c.getsHoten());
                return;
            } else {
                txtCustomerName.setText("");
            }
        }
    }//GEN-LAST:event_txtCustomerIDKeyReleased

    private void txtPharmacistNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPharmacistNameCaretUpdate
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPharmacistNameCaretUpdate

    private void btnPharmacisNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPharmacisNameActionPerformed
        // TODO add your handling code here:
        String temp = ReceiptController.getInstance().getPharmacisName(txtPharmacistID.getText());
        txtPharmacistName.setText(temp);
    }//GEN-LAST:event_btnPharmacisNameActionPerformed

    private void btnCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerNameActionPerformed
        // TODO add your handling code here:
        String temp = ReceiptController.getInstance().getCustomerName(txtCustomerID.getText());
        txtCustomerName.setText(temp);
    }//GEN-LAST:event_btnCustomerNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddReceipt;
    private javax.swing.JButton btnCancelReceipt;
    private javax.swing.JButton btnClearReceipt;
    private javax.swing.JButton btnCustomerName;
    private javax.swing.JButton btnDeleteDrugRow;
    private javax.swing.JButton btnInsertDrugRow;
    private javax.swing.JButton btnPharmacisName;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbBuyReceipt;
    private javax.swing.JLabel lbDateSell;
    private javax.swing.JLabel lbDrugList;
    private javax.swing.JLabel lbGuestID;
    private javax.swing.JLabel lbGuestName;
    private javax.swing.JLabel lbPharmacistID;
    private javax.swing.JLabel lbPharmacistName;
    private javax.swing.JLabel lbSellID;
    private javax.swing.JTable tblDrugList;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtCustomerName;
    private com.toedter.calendar.JDateChooser txtDateReceipt;
    private javax.swing.JTextField txtPharmacistID;
    private javax.swing.JTextField txtPharmacistName;
    private javax.swing.JTextField txtReceiptID;
    private javax.swing.JTextField txtSumReceipt;
    // End of variables declaration//GEN-END:variables

    public void settxtReceiptID(String string) {
        txtReceiptID.setText(string); //To change body of generated methods, choose Tools | Templates.
    }
}