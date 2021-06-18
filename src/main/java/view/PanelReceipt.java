/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PharmacistController;
import controller.ReceiptController;
import java.awt.Color;
import main.HomeFrm;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author THAONGAN
 */
public class PanelReceipt extends javax.swing.JPanel {

    private static PanelReceipt instance = new PanelReceipt();

    public static PanelReceipt getInstance() {
        return instance;
    }

    public JTable getTable() {
        return tblList;
    }

    private void setIcon() {
        String directResource = System.getProperty("user.dir") + "\\image\\";
        lbLogoInsert.setIcon(new ImageIcon(directResource + "add1.png"));
        lbLogoDelete.setIcon(new ImageIcon(directResource + "delete1.png"));
        lbLogoEdit.setIcon(new ImageIcon(directResource + "edit1.png"));
        lbLogoView.setIcon(new ImageIcon(directResource + "view1.png"));
        lbLogoSearch.setIcon(new ImageIcon(directResource + "search1.png"));
    }

    // singleton nên modifier access là private
    private PanelReceipt() {
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
        btnView = new javax.swing.JPanel();
        lbLogoView = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 650));

        tblList.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hoá đơn", "Mã NV", "Tên NV", "Mã KH", "Tên KH", "Ngày mua", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(tblList);

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnButton.setPreferredSize(new java.awt.Dimension(950, 127));

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

        btnView.setBackground(new java.awt.Color(214, 217, 223));
        btnView.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnView.setPreferredSize(new java.awt.Dimension(66, 86));
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewMouseExited(evt);
            }
        });

        lbLogoView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogoView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnViewLayout = new javax.swing.GroupLayout(btnView);
        btnView.setLayout(btnViewLayout);
        btnViewLayout.setHorizontalGroup(
            btnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnViewLayout.createSequentialGroup()
                .addComponent(lbLogoView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnViewLayout.setVerticalGroup(
            btnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogoView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
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
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarActionPerformed

    private void btnInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseClicked
        new AddReceiptFrm().setVisible(true);
    }//GEN-LAST:event_btnInsertMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        int selectedIndex = tblList.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(null, "Hãy chọn một dòng rồi nhấn nút Xoá");
            return;
        } else {
            ReceiptController.getInstance().getList().remove(selectedIndex);
            tblList.setModel(ReceiptController.getInstance().toTable());
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        int selectedIndex = tblList.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(null, "Hãy chọn một dòng rồi nhấn nút Sửa");
            return;
        } else {
            AddReceiptFrm addReceiptFrm = new AddReceiptFrm(selectedIndex, true);
            addReceiptFrm.setVisible(true);
        }    }//GEN-LAST:event_btnEditMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
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

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        int selectedIndex = tblList.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(null, "Hãy chọn một dòng rồi nhấn nút Xem");
            return;
        } else {
            AddReceiptFrm addReceiptFrm = new AddReceiptFrm(selectedIndex, false);
            addReceiptFrm.setVisible(true);
        }
    }//GEN-LAST:event_btnViewMouseClicked

    private void btnViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseEntered
        btnView.setBackground(new Color(242, 242, 242));
        btnView.setToolTipText("Xem");
    }//GEN-LAST:event_btnViewMouseEntered

    private void btnViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseExited
        btnView.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_btnViewMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDelete;
    private javax.swing.JPanel btnEdit;
    private javax.swing.JPanel btnInsert;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JPanel btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLogoDelete;
    private javax.swing.JLabel lbLogoEdit;
    private javax.swing.JLabel lbLogoInsert;
    private javax.swing.JLabel lbLogoSearch;
    private javax.swing.JLabel lbLogoView;
    private javax.swing.JPanel pnButton;
    private javax.swing.JPanel pnTable;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables

}
