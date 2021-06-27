package prj.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import pri.JDBCconnect.JDBCconnection;
import prj.model.ImportVoucher;
import prj.model.ImportVoucherDetail;

/**
 *
 * @author THAONGAN
 */
public class ImportVoucherController {

    private ArrayList<ImportVoucher> importVouchers = new ArrayList<>();
    private static ImportVoucherController instance = new ImportVoucherController();
    private ArrayList<ImportVoucherDetail> importVoucherDetails = new ArrayList<>();
    
    public ArrayList<ImportVoucherDetail> getListIVD(){
        return importVoucherDetails;
    }
    public ImportVoucherController() {
    }

    public static ImportVoucherController getInstance() {
        return instance;
    }

    public ArrayList<ImportVoucher> getList() {
        return importVouchers;
    }

    public String[] getHeader() {
        //mảng chuỗi có giá trị khởi tạo ban đầu
        return new String[]{"Mã Phiếu nhập", "Mã NV", "Tên NV", "Mã NCC", "Tên NCC",
            "Ngày lập phiếu", "Tổng tiền"};
    }
    public DefaultTableModel toTableReceiptDetails(){
        DefaultTableModel tblModelReceiptDetails = new DefaultTableModel();
        for(int i =0; i< importVoucherDetails.size(); i++){
            tblModelReceiptDetails.addRow(this.toVectorImportVoucherDetails(i));
        }
        return tblModelReceiptDetails;
    }
    
    public Vector toVectorImportVoucherDetails(int index){
        Vector vt = new Vector();
        vt.add(importVoucherDetails.get(index).getsMaCTPN());
        vt.add(importVoucherDetails.get(index).getsMaPN());
        vt.add(importVoucherDetails.get(index).getsMaThuoc());
        vt.add(importVoucherDetails.get(index).getiSL());
        vt.add(importVoucherDetails.get(index).getfDonGia());
        vt.add(importVoucherDetails.get(index).getfThanhTien());
        return vt;
    }
    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeader());
        for (int i = 0; i < importVouchers.size(); i++) {
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }

    public Vector toVector(int index) {
        Vector vt = new Vector();
        LocalDate dNgayNhapPhieu = LocalDate.parse(importVouchers.get(index).getdNgayNhapPhieu().toString(),
                DateTimeFormatter.ofPattern("yyyy'-'MM'-'dd"));
        vt.add(importVouchers.get(index).getsMaPN());
        vt.add(importVouchers.get(index).getsMaNV());
        vt.add(importVouchers.get(index).getsTenNV());
        vt.add(importVouchers.get(index).getsMaNCC());
        vt.add(importVouchers.get(index).getsTenNCC());
        vt.add(dNgayNhapPhieu.format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy")));
        vt.add(importVouchers.get(index).getfTongTien());
        return vt;
    }
    public static void InsertImportVoucher(String mapn, String manv, String tennv, String mancc, String tenncc, LocalDate ngaymua,
            float thanhtien){
             
            Connection conn = JDBCconnection.getConnection();
            
        try {
            Statement st = conn.createStatement();
            String sql = "";
            String sql_cthd = "";
            sql ="insert into PHIEUNHAPHANG values('"+mapn+"','"+manv+"', '"+tennv+"','"+mancc+"','"+tenncc+"','"+ngaymua+"',"+thanhtien+")";
            //sql_cthd ="insert into HOADON values('"+receiptdetail.get(index)+"','"+manv+"', '"+tennv+"','"+makh+"','"+tenkh+"','"+ngaymua+"',"+tongtien+")";
            
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public void Delete(String id){
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM PHIEUNHAPHANG WHERE MAPN = '"+id+"'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void DeleteIVD(String id){
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM CTPN WHERE MAPN = '"+id+"'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static int CountingRow(){
            int row = 0;
            Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs =  st.executeQuery("SELECT COUNT(*) AS SL FROM PHIEUNHAPHANG");
            while(rs.next()){
                row = rs.getInt("SL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return row;
        }
        public static void InsertImportVoucherDetails(String mactpn, String mapn, String mathuoc, int sl, float gia, float tongtien){
             
            Connection conn = JDBCconnection.getConnection();
            
        try {
            Statement st = conn.createStatement();
            String sql = "";
            String sql_cthd = "";
            sql ="insert into CTPN values('"+mactpn+"','"+mapn+"', '"+mathuoc+"',"+sl+","+gia+","+tongtien+")";
     
            
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
        public static void UpdateImportVoucher(String id, float tongtien){
            Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "update PHIEUNHAPHANG set TRIGIA = " + tongtien +"WHERE MAPN = '"+id+"'";
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ReceiptController.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        public int CountingRowIVD(){
            int row = 0;
            Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs =  st.executeQuery("SELECT COUNT(*) AS SL FROM CTPN");
            while(rs.next()){
                row = rs.getInt("SL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReceiptController.class.getName()).log(Level.SEVERE, null, ex);
        }
            return row;
        }
        public String getPharmacisName(String id){
            String pharmacisName = "";
            Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs =  st.executeQuery("SELECT TOP(1) HOTEN FROM NHANVIEN WHERE MANV like '%"+ id +"%'");
            while(rs.next()){
                pharmacisName = rs.getString("HOTEN");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReceiptController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pharmacisName;
        }
        public String getSupplierName(String id){
            String cuatomerName = "";
            Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs =  st.executeQuery("SELECT TOP(1) TENNCC FROM NHACUNGCAP WHERE MANCC like '%"+ id +"%'");
            while(rs.next()){
                cuatomerName = rs.getString("TENNCC");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReceiptController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuatomerName;
        }
    
}
