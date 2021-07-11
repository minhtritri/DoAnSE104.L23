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
import prj.JDBC.JDBCconnection;
import prj.model.Receipt;
import prj.model.ReceiptDetail;

/**
 *
 * @author THAONGAN
 */
public class ReceiptController {

    private ArrayList<Receipt> receipts = new ArrayList<>();
    private static ReceiptController instance = new ReceiptController();

    private ReceiptController() {
    }

    public static ReceiptController getInstance() {
        return instance;
    }

    public ArrayList<Receipt> getList() {
        return receipts;
    }

    public String[] getHeader() {
        //mảng chuỗi có giá trị khởi tạo ban đầu
        // chuỗi phải giống y chang header tblList ở Panel
        return new String[]{"Mã Hoá đơn", "Mã NV", "Tên NV", "Mã KH", "Tên KH",
            "Ngày mua", "Tổng tiền"};
    }

    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeader());
        for (int i = 0; i < receipts.size(); i++) {
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }

    public Vector toVector(int index) {
        Vector vt = new Vector();
        LocalDate dNgayMuaThuoc = LocalDate.parse(receipts.get(index).getdNgayMuaThuoc().toString(),
                DateTimeFormatter.ofPattern("yyyy'-'MM'-'dd"));
        vt.add(receipts.get(index).getsMaHD());
        vt.add(receipts.get(index).getsMaNV());
        vt.add(receipts.get(index).getsTenNV());
        vt.add(receipts.get(index).getsMaKH());
        vt.add(receipts.get(index).getsTenKH());
        vt.add(dNgayMuaThuoc.format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy")));
        vt.add(receipts.get(index).getfTongTien());
        return vt;
    }

    //==========================================================================
    public static void InsertReceipt(String mahd, String manv, String tennv, String makh, String tenkh, LocalDate ngaymua,/*ArrayList<ReceiptDetail> receiptdetail ,*/
            float thanhtien) {

        Connection conn = JDBCconnection.getConnection();

        try {
            Statement st = conn.createStatement();
            String sql = "";
            String sql_cthd = "";
            sql = "insert into HOADON values('" + mahd + "','" + manv + "', '" + tennv + "','" + makh + "','" + tenkh + "','" + ngaymua + "'," + thanhtien + ")";
            //sql_cthd ="insert into HOADON values('"+receiptdetail.get(index)+"','"+manv+"', '"+tennv+"','"+makh+"','"+tenkh+"','"+ngaymua+"',"+tongtien+")";

            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Delete(String id) {
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM HOADON WHERE MAHD = '" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeleteRD(String id) {
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM CTHD WHERE MAHD = '" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int CountingRow() {
        int row = 0;
        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS SL FROM HOADON");
            while (rs.next()) {
                row = rs.getInt("SL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return row;
    }

    public static void InsertReceiptDetails(String macthd, String mahd, String mathuoc, int sl, float gia, float tongtien) {

        Connection conn = JDBCconnection.getConnection();

        try {
            Statement st = conn.createStatement();
            String sql = "";
            String sql_cthd = "";
            sql = "insert into CTHD values('" + macthd + "','" + mahd + "', '" + mathuoc + "'," + sl + "," + gia + "," + tongtien + ")";

            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void UpdateReceipt(String id, float tongtien) {
        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "update HOADON set TONGTIEN = " + tongtien + "WHERE MAHD = '" + id + "'";
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ReceiptController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int CountingRowRD() {
        int row = 0;
        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS SL FROM CTHD");
            while (rs.next()) {
                row = rs.getInt("SL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReceiptController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    public String getPharmacisName(String id) {
        String pharmacisName = "";
        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT TOP(1) HOTEN FROM NHANVIEN WHERE MANV like '%" + id + "%'");
            while (rs.next()) {
                pharmacisName = rs.getString("HOTEN");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReceiptController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pharmacisName;
    }

    public String getCustomerName(String id) {
        String cuatomerName = "";
        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT TOP(1) HOTEN FROM KHACHHANG WHERE MAKH like '%" + id + "%'");
            while (rs.next()) {
                cuatomerName = rs.getString("HOTEN");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReceiptController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuatomerName;
    }

    //==========================================================================
    public void insertToDatabase(Receipt r) {
        String mahd = r.getsMaHD();
        String manv = r.getsMaNV();
        String tennv = r.getsTenNV();
        String makh = r.getsMaKH();
        String tenkh = r.getsTenKH();
        LocalDate ngaymua = r.getdNgayMuaThuoc();
        float tongTien = r.getfTongTien();

        Connection conn = JDBCconnection.getConnection();

        try {
            Statement st = conn.createStatement();
            String sql = "insert into HOADON values('" + mahd + "','" 
                    + manv + "', '" + tennv + "','" + makh + "','" + tenkh 
                    + "','" + ngaymua + "'," + tongTien + ")";
            st.executeUpdate(sql);

            for (int i = 0; i < r.getDetailList().size(); i++) {
                String maCthd = r.getDetailList().get(i).getsMaCTHD();
                String maThuoc = r.getDetailList().get(i).getsMATHUOC();
                int sl = r.getDetailList().get(i).getiSL();
                float donGia = r.getDetailList().get(i).getfDonGia();
                float thanhTien = r.getDetailList().get(i).getfThanhTien();

                Statement stDetail = conn.createStatement();
                String sqlDetail = "insert into CTHD values('" + maCthd + "','" 
                        + mahd + "', '" + maThuoc + "'," + sl + "," + donGia + "," 
                        + thanhTien + ")";
                stDetail.executeUpdate(sqlDetail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteFromDatabase(Receipt r) {
        String id = r.getsMaHD();
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM HOADON WHERE MAHD = '" + id + "'";
        String sqlDetail = "DELETE FROM CTHD WHERE MAHD = '" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sqlDetail);
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
