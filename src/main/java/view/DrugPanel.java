/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Drug;

/**
 *
 * @author THAONGAN
 */
public class DrugPanel extends javax.swing.JPanel {
    private List<Drug> drug ;
    private DefaultTableModel tblDrug;
    private int selectedIndex ;
    public void setTitle(String str) {
        this.lbTitle.setText(str);
        
    }

    public DrugPanel() {
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
        drug = new ArrayList<Drug>();
        tblDrug = (DefaultTableModel) tblListDrug.getModel();
      
        
        
        
    }
    public void AddDrug(Drug d){
        drug.add(d); // Them thuoc vao danh sach
        showData();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListDrug = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAddDrug = new javax.swing.JButton();
        btnDeleteDrug = new javax.swing.JButton();
        btnEditDrug = new javax.swing.JButton();
        btnSearchDrug = new javax.swing.JButton();
        txtSearchBarDrug = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();

        tblListDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaThuoc", "Tên thuốc", "Nhóm", "Loại", "Thành phần", "HSD", "ĐVT", "MaNCC", "Ngày tiếp nhận"
            }
        ));
        jScrollPane1.setViewportView(tblListDrug);

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

        btnAddDrug.setText("Thêm");
        btnAddDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrugActionPerformed(evt);
            }
        });

        btnDeleteDrug.setText("Xoá");
        btnDeleteDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDrugActionPerformed(evt);
            }
        });

        btnEditDrug.setText("Sửa");
        btnEditDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDrugActionPerformed(evt);
            }
        });

        btnSearchDrug.setText("Tìm kiếm");
        btnSearchDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDrugActionPerformed(evt);
            }
        });

        txtSearchBarDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBarDrugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddDrug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteDrug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditDrug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchBarDrug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchDrug)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDrug)
                    .addComponent(btnDeleteDrug)
                    .addComponent(btnEditDrug)
                    .addComponent(btnSearchDrug)
                    .addComponent(txtSearchBarDrug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        lbTitle.setText("Thuốc");

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

    private void btnAddDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrugActionPerformed
        if (HomeFrm.getInstance().getTgbtnDrug().isSelected()) {
            AddDrugFrm AddDrugFrm = new AddDrugFrm(this);
            AddDrugFrm.setVisible(true);
        }
     
        
    }//GEN-LAST:event_btnAddDrugActionPerformed

    private void btnSearchDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDrugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchDrugActionPerformed

    private void txtSearchBarDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBarDrugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarDrugActionPerformed

    private void btnEditDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDrugActionPerformed
        // TODO add your handling code here:
        selectedIndex = tblListDrug.getSelectedRow();
        if(drug.size() == 0){
            JOptionPane.showMessageDialog(jPanel2, "Hay Nhap Them Thong Tin"); 
        }else if(selectedIndex == -1 ){
            JOptionPane.showMessageDialog(jPanel2, "Hay Chon Dong De Sua "); 
        }else{
            EditDrugFrm editDrugFrm = new EditDrugFrm(this);
            editDrugFrm.setEditData(drug.get(selectedIndex));
            editDrugFrm.setVisible(true);
        }
        
        
        
        
    }//GEN-LAST:event_btnEditDrugActionPerformed

    private void btnDeleteDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDrugActionPerformed
        // TODO add your handling code here:
        int removeIndex = tblListDrug.getSelectedRow();
        if(drug.size() == 0){
            JOptionPane.showMessageDialog(jPanel2, "Hay Them Thong Tin Truoc Khi Xoa");
        }else if(removeIndex == -1){
            JOptionPane.showMessageDialog(jPanel2, "Hay Chon Mot Dong Roi An Nut Xoa");
        }else {
            drug.remove(removeIndex);
            showData();
        }
    }//GEN-LAST:event_btnDeleteDrugActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDrug;
    private javax.swing.JButton btnDeleteDrug;
    private javax.swing.JButton btnEditDrug;
    private javax.swing.JButton btnSearchDrug;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable tblListDrug;
    private javax.swing.JTextField txtSearchBarDrug;
    // End of variables declaration//GEN-END:variables

    public void EditDrug(Drug d) {
        drug.remove(selectedIndex);
        this.AddDrug(d);
    }

    private void showData() {
        tblDrug.setRowCount(0);
        for (Drug drug: drug){
            tblDrug.addRow(new Object[]{drug.getsMathuoc(),drug.getsTenthuoc(), drug.getsPhannhom(), drug.getsPhanloai(), drug.getsThanhphan(),
            drug.getsHansudung(),drug.getsDVT(), drug.getsMancc(), drug.getsNgaytiepnhan()});
        }
    }
}
