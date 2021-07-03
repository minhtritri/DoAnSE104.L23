package prj.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import prj.JDBC.JDBCconnection;
import prj.model.Pharmacist;

/**
 *
 * @author THAONGAN
 */
public class PharmacistController {

    private ArrayList<Pharmacist> pharmacists = new ArrayList<>();
    private static PharmacistController instance = new PharmacistController();

    private PharmacistController() {
    }

    public static PharmacistController getInstance() {
        return instance;
    }

    public ArrayList<Pharmacist> getList() {
        return pharmacists;
    }

    public String[] getHeaders() {
        //mảng chuỗi có giá trị khởi tạo ban đầu
        return new String[]{"Mã NV", "Họ tên", "Giới tính", "Năm sinh", "SĐT",
            "Địa chỉ", "Ngày vào làm", "Ca"};
    }

    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i = 0; i < pharmacists.size(); i++) {
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }

    public Vector toVector(int index) {
        Vector vt = new Vector();
        vt.add(pharmacists.get(index).getsMaNV());
        vt.add(pharmacists.get(index).getsHoTen());
        vt.add(pharmacists.get(index).getsGioiTinh());
        vt.add(pharmacists.get(index).getiNamSinh());
        vt.add(pharmacists.get(index).getSDT());
        vt.add(pharmacists.get(index).getsDiaChi());
        vt.add(pharmacists.get(index).getiNamVaoLam());
        vt.add(pharmacists.get(index).getiCALV());
        return vt;
    }

    //==========================================================================
    
    public static void Insert(String manv, String hoten, String gioitinh, int namsinh, String sdt, String diachi, int namvl, int calv
    ) {

        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "";
            sql = "insert into NHANVIEN values('" + manv + "','" + hoten + "', '" + gioitinh + "'," + namsinh + ",'" + sdt + "','" + diachi + "'," + namvl + "," + calv + ")";
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Delete(String id) {
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM NHANVIEN WHERE MANV = '" + id + "'";
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
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS SL FROM NHANVIEN");
            while (rs.next()) {
                row = rs.getInt("SL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return row;
    }

    //==========================================================================
    
    public void insertToDatabase(Pharmacist p) {
        String manv = p.getsMaNV();
        String hoten = p.getsHoTen();
        String gioitinh = p.getsGioiTinh();
        int namsinh = p.getiNamSinh();
        String sdt = p.getSDT();
        String diachi = p.getsDiaChi();
        int namvl = p.getiNamVaoLam();
        int calv = p.getiCALV();

        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "insert into NHANVIEN values('" + manv + "','" + hoten 
                    + "', '" + gioitinh + "'," + namsinh + ",'" + sdt + "','" 
                    + diachi + "'," + namvl + "," + calv + ")";
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteFromDatabase(Pharmacist p) {
        String id = p.getsMaNV();
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM NHANVIEN WHERE MANV = '" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
