package prj.view.panel;

import prj.controller.PharmacistController;
import prj.model.Pharmacist;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import prj.main.HomeFrm;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import prj.JDBC.JDBCconnection;
import prj.image.ImageUtilities;
import prj.view.dialog.AddPharmacistFrm;

/**
 *
 * @author THAONGAN
 */
public class PanelPharmacist extends javax.swing.JPanel {

    private static PanelPharmacist instance = new PanelPharmacist();

    public static PanelPharmacist getInstance() {
        return instance;
    }

    public JTable getTable() {
        return tblList;
    }

    private void setIcon() {
        lbLogoInsert.setIcon(ImageUtilities.getInsertIcon());
        lbLogoDelete.setIcon(ImageUtilities.getDeleteIcon());
        lbLogoEdit.setIcon(ImageUtilities.getEditIcon());
        lbLogoSearch.setIcon(ImageUtilities.getSearchIcon());
    }

    // singleton nên modifier access là private
    private PanelPharmacist() {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        this.setIcon();
        this.JDBC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        pnButton = new javax.swing.JPanel();
        txtSearchBar = new javax.swing.JTextField();
        btnInsert = new javax.swing.JPanel();
        lbLogoInsert = new javax.swing.JLabel();
        btnDelete = new javax.swing.JPanel();
        lbLogoDelete = new javax.swing.JLabel();
        btnEdit = new javax.swing.JPanel();
        lbLogoEdit = new javax.swing.JLabel();
        btnSearch = new javax.swing.JPanel();
        lbLogoSearch = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 650));

        tblList.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Họ tên", "Giới tính", "Năm sinh", "SĐT", "Địa chỉ", "Năm vào làm", "Ca"
            }
        ));
        jScrollPane1.setViewportView(tblList);

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTableLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnButton.setPreferredSize(new java.awt.Dimension(950, 127));

        txtSearchBar.setText("Tìm kiếm...");
        txtSearchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchBarFocusLost(evt);
            }
        });
        txtSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBarActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(214, 217, 223));
        btnInsert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnInsert.setPreferredSize(new java.awt.Dimension(66, 86));
        btnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertMouseExited(evt);
            }
        });

        lbLogoInsert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogoInsert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnInsertLayout = new javax.swing.GroupLayout(btnInsert);
        btnInsert.setLayout(btnInsertLayout);
        btnInsertLayout.setHorizontalGroup(
            btnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInsertLayout.createSequentialGroup()
                .addComponent(lbLogoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnInsertLayout.setVerticalGroup(
            btnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInsertLayout.createSequentialGroup()
                .addComponent(lbLogoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        btnDelete.setBackground(new java.awt.Color(214, 217, 223));
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnDelete.setPreferredSize(new java.awt.Dimension(66, 86));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });

        lbLogoDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogoDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnDeleteLayout = new javax.swing.GroupLayout(btnDelete);
        btnDelete.setLayout(btnDeleteLayout);
        btnDeleteLayout.setHorizontalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addComponent(lbLogoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnEdit.setBackground(new java.awt.Color(214, 217, 223));
        btnEdit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnEdit.setPreferredSize(new java.awt.Dimension(66, 86));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
        });

        lbLogoEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogoEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnEditLayout = new javax.swing.GroupLayout(btnEdit);
        btnEdit.setLayout(btnEditLayout);
        btnEditLayout.setHorizontalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditLayout.createSequentialGroup()
                .addComponent(lbLogoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEditLayout.setVerticalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnSearch.setBackground(new java.awt.Color(214, 217, 223));
        btnSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnSearch.setPreferredSize(new java.awt.Dimension(66, 86));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });

        lbLogoSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogoSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnSearchLayout = new javax.swing.GroupLayout(btnSearch);
        btnSearch.setLayout(btnSearchLayout);
        btnSearchLayout.setHorizontalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSearchLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbLogoSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        btnSearchLayout.setVerticalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pnButtonLayout = new javax.swing.GroupLayout(pnButton);
        pnButton.setLayout(pnButtonLayout);
        pnButtonLayout.setHorizontalGroup(
            pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonLayout.createSequentialGroup()
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnButtonLayout.setVerticalGroup(
            pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonLayout.createSequentialGroup()
                .addGroup(pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnButtonLayout.createSequentialGroup()
                .addGroup(pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarActionPerformed

    private void btnInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseClicked
        new AddPharmacistFrm().setVisible(true);

    }//GEN-LAST:event_btnInsertMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked

        int[] selectedMultiRows = tblList.getSelectedRows();
        int selectedIndex = tblList.getSelectedRow();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(null, "Hãy chọn ít nhất một dòng rồi nhấn nút Xoá");
            return;
        } else {
            int confimed = JOptionPane.showConfirmDialog(null, "Xác nhận xoá?", "Xoá thông tin", JOptionPane.YES_NO_OPTION);
            if (confimed == 0) {//YES_OPTION
                for (int i = selectedMultiRows.length - 1; i >= 0; i--) {
                    PharmacistController.getInstance().deleteFromDatabase(
                            PharmacistController.getInstance().getList().get(selectedMultiRows[i])
                    );

                    PharmacistController.getInstance().getList().remove(selectedMultiRows[i]);
                    tblList.setModel(PharmacistController.getInstance().toTable());
                }

                // PharmacistController.getInstance().Delete(PharmacistController.getInstance().getList().get(selectedIndex).getsMaNV());
            }
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        int selectedIndex = tblList.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(null, "Hãy chọn một dòng rồi nhấn nút Sửa");
            return;
        } else {
            AddPharmacistFrm addPharmaFrm = new AddPharmacistFrm(selectedIndex);

            addPharmaFrm.setVisible(true);
        }    }//GEN-LAST:event_btnEditMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        boolean isFound = false;
        String text = txtSearchBar.getText();
        for (int i = 0; i < tblList.getRowCount(); i++) {
            for (int j = 0; j < tblList.getColumnCount(); j++) {
                if (tblList.getModel().getValueAt(i, j).toString().equals(text)) {
                    isFound = true;
                    tblList.setRowSelectionInterval(i, i);
                }
            }
        }
        if (!isFound) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin.",
                    "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnInsertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseEntered
        btnInsert.setBackground(new Color(242, 242, 242));
        btnInsert.setToolTipText("Thêm");
    }//GEN-LAST:event_btnInsertMouseEntered

    private void btnInsertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseExited
        btnInsert.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_btnInsertMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(new Color(242, 242, 242));
        btnDelete.setToolTipText("Xoá");
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setBackground(new Color(242, 242, 242));
        btnEdit.setToolTipText("Sửa");
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        btnSearch.setBackground(new Color(242, 242, 242));
        btnSearch.setToolTipText("Tìm kiếm");
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        btnSearch.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_btnSearchMouseExited

    private void txtSearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchBarFocusGained
        if (txtSearchBar.getText().equals("Tìm kiếm...")) {
            txtSearchBar.setText("");
            txtSearchBar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtSearchBarFocusGained

    private void txtSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchBarFocusLost
        if (txtSearchBar.getText().isEmpty()) {
            txtSearchBar.setText("Tìm kiếm...");
            txtSearchBar.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtSearchBarFocusLost

    private void JDBC() {
        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM NHANVIEN");
            while (rs.next()) {
                String MaNV = rs.getString("MANV").trim();
                String HoTen = rs.getString("HOTEN").trim();
                String GioiTinh = rs.getString("GIOITINH").trim();
                int NamSinh = Integer.parseInt(rs.getString("NAMSINH"));
                String SDT = rs.getString("SDT").trim();
                String DiaChi = rs.getString("DIACHI".trim());
                int NamVL = rs.getInt("NAMVL");
                int CaLV = rs.getInt("CALV");
                Pharmacist p = new Pharmacist(MaNV, HoTen, GioiTinh, NamSinh, SDT, DiaChi, NamVL, CaLV);
                PharmacistController.getInstance().getList().add(p);
                tblList.setModel(
                        PharmacistController.getInstance().toTable());

            }
        } catch (SQLException ex) {
            Logger.getLogger(PharmacistController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDelete;
    private javax.swing.JPanel btnEdit;
    private javax.swing.JPanel btnInsert;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLogoDelete;
    private javax.swing.JLabel lbLogoEdit;
    private javax.swing.JLabel lbLogoInsert;
    private javax.swing.JLabel lbLogoSearch;
    private javax.swing.JPanel pnButton;
    private javax.swing.JPanel pnTable;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables

}
