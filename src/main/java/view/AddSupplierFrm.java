
package view;

import controller.SupplierController;
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
import model.Supplier;
/**
 *
 * @author THAONGAN
 */
public class AddSupplierFrm extends javax.swing.JFrame {

    /**
     * Creates new form AddSupplier
     */
    
    private boolean isEditing = false;
    private int index;
    
    public AddSupplierFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        isEditing = false;
        
    }
    
    public AddSupplierFrm(int index) {
        this();
        isEditing = true;
        this.addEditInfo(SupplierController.getInstance().getList().get(index));
        this.index = index;
    }
    
    public void addEditInfo(Supplier p) {
        // set tung text field tuong ung voi tung getter
        txtSupplierID.setText(p.getsMaNCC());
        txtSupplierName.setText(p.getsTenNCC());
        txtSupplierPhone.setText(p.getSDT());
        txtSupplierAddress.setText(p.getsDiaChi());
        txtSupplierEmail.setText(p.getsEmail());
        txtContractSignDate.setText(p.getdNgayDangKyHD().format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy")));
        txtContractExpiredDate.setText(String.valueOf(p.gettThoiHanHD()));//Date or day?
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel_title = new javax.swing.JLabel();
        jLabel_supplierid = new javax.swing.JLabel();
        jLabel_supplername = new javax.swing.JLabel();
        jLabel_supplieraddress = new javax.swing.JLabel();
        jLabel_supplierphonenumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAddSupplier = new javax.swing.JButton();
        btnClearSupplier = new javax.swing.JButton();
        btnCancelSupplier = new javax.swing.JButton();
        txtSupplierID = new javax.swing.JTextField();
        txtSupplierName = new javax.swing.JTextField();
        txtSupplierPhone = new javax.swing.JTextField();
        txtSupplierAddress = new javax.swing.JTextField();
        txtSupplierEmail = new javax.swing.JTextField();
        txtContractSignDate = new javax.swing.JTextField();
        txtContractExpiredDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm/Sửa Nhà cung cấp");
        setResizable(false);

        jLabel_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_title.setText("Nhà Cung Cấp");

        jLabel_supplierid.setText("Mã nhà cung cấp:");

        jLabel_supplername.setText("Tên nhà cung cấp:");

        jLabel_supplieraddress.setText("Địa chỉ:");

        jLabel_supplierphonenumber.setText("Điện thoại:");

        jLabel1.setText("Email");

        jLabel2.setText("Ngày ký hợp đồng");

        jLabel3.setText("Thời hạn hợp đồng");

        btnAddSupplier.setText("Lưu");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });

        btnClearSupplier.setText("Làm mới");
        btnClearSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSupplierActionPerformed(evt);
            }
        });

        btnCancelSupplier.setText("Huỷ");
        btnCancelSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel_title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnAddSupplier)
                                .addGap(44, 44, 44)
                                .addComponent(btnClearSupplier)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(btnCancelSupplier)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_supplierid)
                                    .addComponent(jLabel_supplername)
                                    .addComponent(jLabel_supplierphonenumber)
                                    .addComponent(jLabel_supplieraddress)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSupplierID)
                                    .addComponent(txtSupplierName)
                                    .addComponent(txtSupplierPhone)
                                    .addComponent(txtSupplierAddress)
                                    .addComponent(txtSupplierEmail)
                                    .addComponent(txtContractSignDate)
                                    .addComponent(txtContractExpiredDate, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel_title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_supplierid)
                    .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_supplername)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_supplierphonenumber)
                    .addComponent(txtSupplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_supplieraddress)
                    .addComponent(txtSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContractSignDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContractExpiredDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSupplier)
                    .addComponent(btnClearSupplier)
                    .addComponent(btnCancelSupplier))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    private static final Logger LOG = Logger.getLogger(AddSupplierFrm.class.getName());    

    private void btnClearSupplierActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        txtSupplierID.setText("");
        txtSupplierName.setText("");
        txtSupplierEmail.setText("");
        txtSupplierPhone.setText("");
        txtSupplierAddress.setText("");
        txtContractSignDate.setText("");
        txtContractExpiredDate.setText("");
    }                                                
    
    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {                                                 

        try {
            String sMaNCC = txtSupplierID.getText();
            String sTenNCC = txtSupplierName.getText();
            String SDT = txtSupplierPhone.getText();
            String sDiaChi = txtSupplierAddress.getText();
            String sEmail = txtSupplierEmail.getText();
            LocalDate dNgayDangKyHD = LocalDate.parse(txtContractSignDate.getText(), DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy"));
            int tThoiHanHD = Integer.parseInt(txtContractExpiredDate.getText());
            Supplier supplier = new Supplier(sMaNCC, sTenNCC,
                    SDT, sDiaChi,sEmail, dNgayDangKyHD, tThoiHanHD);

            if (isEditing) {
                System.out.println(this.index);
                SupplierController.getInstance().getList().set(this.index, supplier);
                this.setVisible(false);
                
            } else {
                SupplierController.getInstance().getList().add(supplier);
            }

            SupplierPanel.getInstance().getTable().setModel(
                    SupplierController.getInstance().toTable()
            );
            // Clear thông tin sau mỗi lần thêm thành công
        //txtSupplierID.setText("");
        //txtSupplierName.setText("");
        //txtSupplierPhone.setText("");
        //txtSupplierAddress.setText("");
        //txtSupplierEmail.setText("");
        //txtContractSignDate.setText("");
        //txtContractExpiredDate.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Nhập sai thông tin", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }


    }
    
    private void btnCancelSupplierActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnCancelSupplier;
    private javax.swing.JButton btnClearSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_supplername;
    private javax.swing.JLabel jLabel_supplieraddress;
    private javax.swing.JLabel jLabel_supplierid;
    private javax.swing.JLabel jLabel_supplierphonenumber;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JTextField txtContractExpiredDate;
    private javax.swing.JTextField txtContractSignDate;
    private javax.swing.JTextField txtSupplierAddress;
    private javax.swing.JTextField txtSupplierEmail;
    private javax.swing.JTextField txtSupplierID;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtSupplierPhone;
    // End of variables declaration                   
}
