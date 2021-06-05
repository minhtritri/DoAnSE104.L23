package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Pharmacist;

/**
 *
 * @author THAONGAN
 */
public class PharmacistPanel extends javax.swing.JPanel {

    public void setTitle(String str) {
        this.lbTitle.setText(str);
    }

    private List<Pharmacist> pharmacists;
    private DefaultTableModel tblModel;

    public PharmacistPanel() {
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

        pharmacists = new ArrayList<>();
        tblModel = (DefaultTableModel) tblListPharmacist.getModel();

    }

    public void addPharmacist(Pharmacist pharma) {
        pharmacists.add(pharma);
        tblModel.setRowCount(0);
        for (Pharmacist pharmacist : pharmacists) {
            tblModel.addRow(new Object[]{pharmacist.getsMaNV(), pharmacist.getsHoTen(),
                pharmacist.getsGioiTinh(), pharmacist.getiNamSinh(), pharmacist.getSDT(),
                pharmacist.getsDiaChi(), pharmacist.getdNGAYVL(), pharmacist.getiCALV()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListPharmacist = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAddPharmacist = new javax.swing.JButton();
        btnDeletePharmacist = new javax.swing.JButton();
        btnEditPharmacist = new javax.swing.JButton();
        btnSearchPharmacist = new javax.swing.JButton();
        txtSearchBarPharmacist = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();

        tblListPharmacist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaNV", "Họ tên", "Giới tính", "Năm sinh", "SĐT", "Địa chỉ", "Năm vào làm", "Ca"
            }
        ));
        jScrollPane1.setViewportView(tblListPharmacist);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAddPharmacist.setText("Thêm");
        btnAddPharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPharmacistActionPerformed(evt);
            }
        });

        btnDeletePharmacist.setText("Xoá");

        btnEditPharmacist.setText("Sửa");

        btnSearchPharmacist.setText("Tìm kiếm");
        btnSearchPharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPharmacistActionPerformed(evt);
            }
        });

        txtSearchBarPharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBarPharmacistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddPharmacist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletePharmacist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditPharmacist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchBarPharmacist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchPharmacist)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPharmacist)
                    .addComponent(btnDeletePharmacist)
                    .addComponent(btnEditPharmacist)
                    .addComponent(btnSearchPharmacist)
                    .addComponent(txtSearchBarPharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        lbTitle.setText("Dược sĩ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPharmacistActionPerformed
        if (HomeFrm.getInstance().getTgbtnPharmacist().isSelected()) {
            new AddPharmacistFrm().setVisible(true);
        }
    }//GEN-LAST:event_btnAddPharmacistActionPerformed

    private void btnSearchPharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPharmacistActionPerformed

    }//GEN-LAST:event_btnSearchPharmacistActionPerformed

    private void txtSearchBarPharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBarPharmacistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarPharmacistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPharmacist;
    private javax.swing.JButton btnDeletePharmacist;
    private javax.swing.JButton btnEditPharmacist;
    private javax.swing.JButton btnSearchPharmacist;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable tblListPharmacist;
    private javax.swing.JTextField txtSearchBarPharmacist;
    // End of variables declaration//GEN-END:variables
}
