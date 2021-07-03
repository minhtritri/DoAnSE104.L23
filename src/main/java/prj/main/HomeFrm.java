package prj.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import prj.controller.CustomerController;
import prj.controller.DrugController;
import prj.controller.ImportVoucherController;
import prj.controller.PharmacistController;
import prj.controller.ReceiptController;
import prj.controller.SupplierController;
import prj.view.panel.PanelCustomer;
import prj.view.panel.PanelDrug;
import prj.view.panel.PanelImportVoucher;
import prj.view.dialog.LoginFrm;
import prj.view.panel.PanelSupplier;
import prj.view.panel.PanelPharmacist;
import prj.view.panel.PanelReceipt;
import prj.view.panel.PanelReport;

public class HomeFrm extends javax.swing.JFrame {

    private static final HomeFrm instance = new HomeFrm();

    PanelDrug pnDrug = PanelDrug.getInstance();
    PanelPharmacist pnPharmacist = PanelPharmacist.getInstance();
    PanelCustomer pnCustomer = PanelCustomer.getInstance();
    PanelSupplier pnSupplier = PanelSupplier.getInstance();
    PanelReceipt pnReceipt = PanelReceipt.getInstance();
    PanelImportVoucher pnImportVoucher = PanelImportVoucher.getInstance();
    PanelReport pnReport = PanelReport.getInstance();

    private void setPanel(JPanel pn, String title) {
        pnContainer.removeAll();
        pnContainer.setVisible(true);
        lbTitle.setText(title);
        //pnContainer.setLayout(new CardLayout());
        pnContainer.add(pn);
        pn.setVisible(true);
        pnContainer.repaint();
        pnContainer.updateUI();

    }

    public static HomeFrm getInstance() {
        return instance;
    }

    private void setIcon() {
        String directResource = System.getProperty("user.dir") + "\\image\\";
        lbLogoApp.setIcon(new ImageIcon(directResource + "thepharmacy.png"));
        lbIconLogin.setIcon(new ImageIcon(directResource + "login.png"));
        lbIconDrug.setIcon(new ImageIcon(directResource + "pill.png"));
        lbIconPharmacist.setIcon(new ImageIcon(directResource + "pharmacist.png"));
        lbIconSupplier.setIcon(new ImageIcon(directResource + "supplier.png"));
        lbIconCustomer.setIcon(new ImageIcon(directResource + "customer.png"));
        lbIconReceipt.setIcon(new ImageIcon(directResource + "receipt.png"));
        lbIconImport.setIcon(new ImageIcon(directResource + "import.png"));
        lbIconReport.setIcon(new ImageIcon(directResource + "report.png"));
    }

    private void setView() {
        for (Component c : this.pnCategory.getComponents()) {
            if (c instanceof JPanel) {
                ((JPanel) c).addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        ((JPanel) c).setBackground(new Color(124, 144, 156));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        ((JPanel) c).setBackground(new Color(79, 102, 107));
                    }
                });
            }
        }

    }

    public HomeFrm() {
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
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIcon();
        this.setView();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        pnContainer.setLayout(new CardLayout());

        pnDrug.setVisible(true);
        pnPharmacist.setVisible(true);
        pnCustomer.setVisible(true);
        pnSupplier.setVisible(true);
        pnReceipt.setVisible(true);
        pnImportVoucher.setVisible(true);
        pnReport.setVisible(true);
        pnContainer.setVisible(false);
        pnContainer.add(pnDrug);
        this.setVisible(true);

        System.out.println(DrugController.getInstance().getList().size());
        System.out.println(PharmacistController.getInstance().getList().size());
        System.out.println(CustomerController.getInstance().getList().size());
        System.out.println(SupplierController.getInstance().getList().size());
        System.out.println(ReceiptController.getInstance().getList().size());
        System.out.println(ImportVoucherController.getInstance().getList().size());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLogoTitle = new javax.swing.JPanel();
        lbLogoApp = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        pnCategory = new javax.swing.JPanel();
        btnLogin = new javax.swing.JPanel();
        lbIconLogin = new javax.swing.JLabel();
        lbLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnDrug = new javax.swing.JPanel();
        lbIconDrug = new javax.swing.JLabel();
        lbDrug = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JPanel();
        lbIconCustomer = new javax.swing.JLabel();
        lbCustomer = new javax.swing.JLabel();
        btnSupplier = new javax.swing.JPanel();
        lbIconSupplier = new javax.swing.JLabel();
        lbSupplier = new javax.swing.JLabel();
        btnPharmacist = new javax.swing.JPanel();
        lbIconPharmacist = new javax.swing.JLabel();
        lbPharmacist = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnReceipt = new javax.swing.JPanel();
        lbIconReceipt = new javax.swing.JLabel();
        lbReceipt = new javax.swing.JLabel();
        btnImportVoucher = new javax.swing.JPanel();
        lbIconImport = new javax.swing.JLabel();
        lbImport = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnReport = new javax.swing.JPanel();
        lbIconReport = new javax.swing.JLabel();
        lbReport = new javax.swing.JLabel();
        pnContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QLNT demo");
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnLogoTitle.setPreferredSize(new java.awt.Dimension(1300, 70));

        lbLogoApp.setBackground(new java.awt.Color(255, 255, 255));
        lbLogoApp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        lbLogoApp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbLogoApp.setOpaque(true);
        lbLogoApp.setPreferredSize(new java.awt.Dimension(300, 70));

        lbTitle.setBackground(new java.awt.Color(57, 79, 85));
        lbTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle.setText("MÀN HÌNH CHÍNH");
        lbTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        lbTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbTitle.setOpaque(true);
        lbTitle.setPreferredSize(new java.awt.Dimension(1000, 70));

        javax.swing.GroupLayout pnLogoTitleLayout = new javax.swing.GroupLayout(pnLogoTitle);
        pnLogoTitle.setLayout(pnLogoTitleLayout);
        pnLogoTitleLayout.setHorizontalGroup(
            pnLogoTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoTitleLayout.createSequentialGroup()
                .addComponent(lbLogoApp, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnLogoTitleLayout.setVerticalGroup(
            pnLogoTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoTitleLayout.createSequentialGroup()
                .addGroup(pnLogoTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogoApp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnCategory.setBackground(new java.awt.Color(57, 79, 85));
        pnCategory.setPreferredSize(new java.awt.Dimension(300, 650));

        btnLogin.setBackground(new java.awt.Color(79, 102, 107));
        btnLogin.setPreferredSize(new java.awt.Dimension(300, 50));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        lbIconLogin.setBackground(new java.awt.Color(79, 102, 107));
        lbIconLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbLogin.setBackground(new java.awt.Color(79, 102, 107));
        lbLogin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbLogin.setText("Đăng nhập");

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbIconLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIconLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbLogin.getAccessibleContext().setAccessibleName("lbLogin");

        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setPreferredSize(new java.awt.Dimension(300, 10));

        btnDrug.setBackground(new java.awt.Color(79, 102, 107));
        btnDrug.setPreferredSize(new java.awt.Dimension(300, 50));
        btnDrug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDrugMouseClicked(evt);
            }
        });

        lbIconDrug.setBackground(new java.awt.Color(79, 102, 107));
        lbIconDrug.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconDrug.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbDrug.setBackground(new java.awt.Color(79, 102, 107));
        lbDrug.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbDrug.setForeground(new java.awt.Color(255, 255, 255));
        lbDrug.setText("Thuốc");

        javax.swing.GroupLayout btnDrugLayout = new javax.swing.GroupLayout(btnDrug);
        btnDrug.setLayout(btnDrugLayout);
        btnDrugLayout.setHorizontalGroup(
            btnDrugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDrugLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbIconDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        btnDrugLayout.setVerticalGroup(
            btnDrugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDrugLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnDrugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIconDrug, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDrug, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnCustomer.setBackground(new java.awt.Color(79, 102, 107));
        btnCustomer.setPreferredSize(new java.awt.Dimension(300, 50));
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerMouseClicked(evt);
            }
        });

        lbIconCustomer.setBackground(new java.awt.Color(79, 102, 107));
        lbIconCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbCustomer.setBackground(new java.awt.Color(79, 102, 107));
        lbCustomer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lbCustomer.setText("Khách hàng");

        javax.swing.GroupLayout btnCustomerLayout = new javax.swing.GroupLayout(btnCustomer);
        btnCustomer.setLayout(btnCustomerLayout);
        btnCustomerLayout.setHorizontalGroup(
            btnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCustomerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbIconCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnCustomerLayout.setVerticalGroup(
            btnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCustomerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbIconCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btnCustomerLayout.createSequentialGroup()
                .addComponent(lbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnSupplier.setBackground(new java.awt.Color(79, 102, 107));
        btnSupplier.setPreferredSize(new java.awt.Dimension(300, 50));
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
        });

        lbIconSupplier.setBackground(new java.awt.Color(79, 102, 107));
        lbIconSupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconSupplier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbSupplier.setBackground(new java.awt.Color(79, 102, 107));
        lbSupplier.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbSupplier.setForeground(new java.awt.Color(255, 255, 255));
        lbSupplier.setText("Nhà cung cấp");

        javax.swing.GroupLayout btnSupplierLayout = new javax.swing.GroupLayout(btnSupplier);
        btnSupplier.setLayout(btnSupplierLayout);
        btnSupplierLayout.setHorizontalGroup(
            btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSupplierLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbIconSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        btnSupplierLayout.setVerticalGroup(
            btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSupplierLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbIconSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btnSupplierLayout.createSequentialGroup()
                .addComponent(lbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnPharmacist.setBackground(new java.awt.Color(79, 102, 107));
        btnPharmacist.setPreferredSize(new java.awt.Dimension(300, 50));
        btnPharmacist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPharmacistMouseClicked(evt);
            }
        });

        lbIconPharmacist.setBackground(new java.awt.Color(79, 102, 107));
        lbIconPharmacist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconPharmacist.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbPharmacist.setBackground(new java.awt.Color(79, 102, 107));
        lbPharmacist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbPharmacist.setForeground(new java.awt.Color(255, 255, 255));
        lbPharmacist.setText("Nhân viên Dược sĩ");

        javax.swing.GroupLayout btnPharmacistLayout = new javax.swing.GroupLayout(btnPharmacist);
        btnPharmacist.setLayout(btnPharmacistLayout);
        btnPharmacistLayout.setHorizontalGroup(
            btnPharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPharmacistLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbIconPharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbPharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        btnPharmacistLayout.setVerticalGroup(
            btnPharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPharmacistLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbIconPharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btnPharmacistLayout.createSequentialGroup()
                .addComponent(lbPharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setPreferredSize(new java.awt.Dimension(300, 5));

        btnReceipt.setBackground(new java.awt.Color(79, 102, 107));
        btnReceipt.setPreferredSize(new java.awt.Dimension(300, 50));
        btnReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReceiptMouseClicked(evt);
            }
        });

        lbIconReceipt.setBackground(new java.awt.Color(79, 102, 107));
        lbIconReceipt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconReceipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbReceipt.setBackground(new java.awt.Color(79, 102, 107));
        lbReceipt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbReceipt.setForeground(new java.awt.Color(255, 255, 255));
        lbReceipt.setText("Hoá đơn bán thuốc");

        javax.swing.GroupLayout btnReceiptLayout = new javax.swing.GroupLayout(btnReceipt);
        btnReceipt.setLayout(btnReceiptLayout);
        btnReceiptLayout.setHorizontalGroup(
            btnReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReceiptLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbIconReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnReceiptLayout.setVerticalGroup(
            btnReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReceiptLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbIconReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btnReceiptLayout.createSequentialGroup()
                .addComponent(lbReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnImportVoucher.setBackground(new java.awt.Color(79, 102, 107));
        btnImportVoucher.setPreferredSize(new java.awt.Dimension(300, 50));
        btnImportVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImportVoucherMouseClicked(evt);
            }
        });

        lbIconImport.setBackground(new java.awt.Color(79, 102, 107));
        lbIconImport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconImport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbImport.setBackground(new java.awt.Color(79, 102, 107));
        lbImport.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbImport.setForeground(new java.awt.Color(255, 255, 255));
        lbImport.setText("Phiếu nhập thuốc");

        javax.swing.GroupLayout btnImportVoucherLayout = new javax.swing.GroupLayout(btnImportVoucher);
        btnImportVoucher.setLayout(btnImportVoucherLayout);
        btnImportVoucherLayout.setHorizontalGroup(
            btnImportVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnImportVoucherLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbIconImport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbImport, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnImportVoucherLayout.setVerticalGroup(
            btnImportVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnImportVoucherLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbIconImport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btnImportVoucherLayout.createSequentialGroup()
                .addComponent(lbImport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator3.setPreferredSize(new java.awt.Dimension(300, 5));

        btnReport.setBackground(new java.awt.Color(79, 102, 107));
        btnReport.setPreferredSize(new java.awt.Dimension(300, 50));
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportMouseClicked(evt);
            }
        });

        lbIconReport.setBackground(new java.awt.Color(79, 102, 107));
        lbIconReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbReport.setBackground(new java.awt.Color(79, 102, 107));
        lbReport.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbReport.setForeground(new java.awt.Color(255, 255, 255));
        lbReport.setText("Thống kê doanh thu");

        javax.swing.GroupLayout btnReportLayout = new javax.swing.GroupLayout(btnReport);
        btnReport.setLayout(btnReportLayout);
        btnReportLayout.setHorizontalGroup(
            btnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbIconReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbReport, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnReportLayout.setVerticalGroup(
            btnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIconReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout pnCategoryLayout = new javax.swing.GroupLayout(pnCategory);
        pnCategory.setLayout(pnCategoryLayout);
        pnCategoryLayout.setHorizontalGroup(
            pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCategoryLayout.createSequentialGroup()
                .addGroup(pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDrug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnCategoryLayout.createSequentialGroup()
                .addGroup(pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCategoryLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCategoryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReceipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImportVoucher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnCategoryLayout.setVerticalGroup(
            pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCategoryLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnDrug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnPharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnImportVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        btnLogin.getAccessibleContext().setAccessibleParent(pnCategory);

        pnContainer.setPreferredSize(new java.awt.Dimension(1000, 650));

        javax.swing.GroupLayout pnContainerLayout = new javax.swing.GroupLayout(pnContainer);
        pnContainer.setLayout(pnContainerLayout);
        pnContainerLayout.setHorizontalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        pnContainerLayout.setVerticalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnLogoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnLogoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setEnabled(false);
        new LoginFrm().setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        new LoginFrm().setVisible(true);
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnDrugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDrugMouseClicked
        setPanel(pnDrug, "DANH SÁCH THUỐC");

    }//GEN-LAST:event_btnDrugMouseClicked

    private void btnPharmacistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPharmacistMouseClicked
        setPanel(pnPharmacist, "DANH SÁCH DƯỢC SĨ");
    }//GEN-LAST:event_btnPharmacistMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        setPanel(pnSupplier, "DANH SÁCH NHÀ CUNG CẤP");
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseClicked
        setPanel(pnCustomer, "DANH SÁCH KHÁCH HÀNG");
    }//GEN-LAST:event_btnCustomerMouseClicked

    private void btnReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceiptMouseClicked
        setPanel(pnReceipt, "DANH SÁCH HOÁ ĐƠN");
    }//GEN-LAST:event_btnReceiptMouseClicked

    private void btnImportVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportVoucherMouseClicked
        setPanel(pnImportVoucher, "DANH SÁCH PHIẾU NHẬP THUỐC");
    }//GEN-LAST:event_btnImportVoucherMouseClicked

    private void btnReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseClicked
        setPanel(pnReport, "THỐNG KÊ DOANH THU");
    }//GEN-LAST:event_btnReportMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        // garbage colletor : 
        HomeFrm.getInstance();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCustomer;
    private javax.swing.JPanel btnDrug;
    private javax.swing.JPanel btnImportVoucher;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JPanel btnPharmacist;
    private javax.swing.JPanel btnReceipt;
    private javax.swing.JPanel btnReport;
    private javax.swing.JPanel btnSupplier;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbCustomer;
    private javax.swing.JLabel lbDrug;
    private javax.swing.JLabel lbIconCustomer;
    private javax.swing.JLabel lbIconDrug;
    private javax.swing.JLabel lbIconImport;
    private javax.swing.JLabel lbIconLogin;
    private javax.swing.JLabel lbIconPharmacist;
    private javax.swing.JLabel lbIconReceipt;
    private javax.swing.JLabel lbIconReport;
    private javax.swing.JLabel lbIconSupplier;
    private javax.swing.JLabel lbImport;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbLogoApp;
    private javax.swing.JLabel lbPharmacist;
    private javax.swing.JLabel lbReceipt;
    private javax.swing.JLabel lbReport;
    private javax.swing.JLabel lbSupplier;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel pnCategory;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnLogoTitle;
    // End of variables declaration//GEN-END:variables
}
