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
import prj.model.Supplier;

/**
 *
 * @author TRIET
 */
public class SupplierController {

    private ArrayList<Supplier> suppliers = new ArrayList<>();
    private static SupplierController instance = new SupplierController();

    private SupplierController() {
    }

    public static SupplierController getInstance() {
        return instance;
    }

    public ArrayList<Supplier> getList() {
        return suppliers;
    }

    public String[] getHeaders() {
        // chuỗi phải giống y chang header tblList ở Panel
        return new String[]{"Mã NCC", "Tên NCC", "SĐT", "Địa chỉ", "Email",
            "Ngày ký Hợp đồng", "Thời hạn Hợp đồng"};
    }

    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i = 0; i < suppliers.size(); i++) {
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }

    public Vector toVector(int index) {
        Vector vt = new Vector();
        LocalDate dNgayDangKyHD = LocalDate.parse(suppliers.get(index).getdNgayDangKyHD().toString(),
                DateTimeFormatter.ofPattern("yyyy'-'MM'-'dd"));
        vt.add(suppliers.get(index).getsMaNCC());
        vt.add(suppliers.get(index).getsTenNCC());
        vt.add(suppliers.get(index).getSDT());
        vt.add(suppliers.get(index).getsDiaChi());
        vt.add(suppliers.get(index).getsEmail());
        vt.add(dNgayDangKyHD.format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy")));
        vt.add(suppliers.get(index).gettThoiHanHD());
        return vt;
    }

    //==========================================================================
    
    public static void Insert(String mancc, String tenncc, String sdt, String diachi, String email, String ngaydk, int thoihanhd) {

        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "";
            sql = "insert into NHACUNGCAP values('" + mancc + "','" + tenncc + "', '" + sdt + "','" + diachi + "','" + email + "','" + ngaydk + "'," + thoihanhd + ")";
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Delete(String id) {
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM NHACUNGCAP WHERE MANCC = '" + id + "'";
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
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS SL FROM NHACUNGCAP");
            while (rs.next()) {
                row = rs.getInt("SL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return row;
    }

    //==========================================================================
    public void insertToDatabase(Supplier s) {
        String mancc = s.getsMaNCC();
        String tenncc = s.getsTenNCC();
        String sdt = s.getSDT();
        String diachi = s.getsDiaChi();
        String email = s.getsEmail();
        String ngaydk = s.getdNgayDangKyHD().toString();
        int thoihanhd = s.gettThoiHanHD();

        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "";
            sql = "insert into NHACUNGCAP values('" + mancc + "','" + tenncc 
                    + "', '" + sdt + "','" + diachi + "','" + email + "','" 
                    + ngaydk + "'," + thoihanhd + ")";
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteFromDatabase(Supplier s) {
        String id = s.getsMaNCC();
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM NHACUNGCAP WHERE MANCC = '" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
