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
import prj.model.Customer;

/**
 *
 * @author anhha
 */
public class CustomerController {

    private ArrayList<Customer> customers = new ArrayList<>();
    
    //singleton
    private static CustomerController instance = new CustomerController();

    private CustomerController() {
    }

    public ArrayList<Customer> getList() {
        return customers;
    }

    public static CustomerController getInstance() {
        return instance;
    }

    public String[] getHeaders() {
        return new String[]{"Mã KH", "Họ tên", "Giới tính", "Năm tinh", "SĐT"};
    }

    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i = 0; i < customers.size(); i++) {
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }

    public Vector toVector(int index) {
        Vector vt = new Vector();
        vt.add(customers.get(index).getsMaKH());
        vt.add(customers.get(index).getsHoten());
        vt.add(customers.get(index).getsGioiTinh());
        vt.add(customers.get(index).getsNamSinh());
        vt.add(customers.get(index).getsSdtKH());
        return vt;
    }
//==========================================================================
    /*
    JDBC with SQL
    */
    public static void Insert(String makh, String hoten, String gioitinh, int namsinh, String sdt) {

        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "";
            sql = "insert into KHACHHANG values('" + makh + "','" + hoten + "', '"
                    + gioitinh + "'," + namsinh + ",'" + sdt + "')";
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Delete(String id) {
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM KHACHHANG WHERE MAKH = '" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int CountingRow() {
        int row = 0;
        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS SL FROM KHACHHANG");
            while (rs.next()) {
                row = rs.getInt("SL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return row;
    }

    //==========================================================================
    public void insertToDatabase(Customer c) {

        String makh = c.getsMaKH();
        String hoten = c.getsHoten();
        String gioitinh = c.getsGioiTinh();
        int namsinh = c.getsNamSinh();
        String sdt = c.getsSdtKH();

        Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "insert into KHACHHANG values('" + makh + "', '" + hoten + "', '"
                    + gioitinh + "', " + namsinh + ", '" + sdt + "')";
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteFromDatabase(Customer c) {
        String id = c.getsMaKH();
        System.out.println("id: " + id);
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM KHACHHANG WHERE MAKH = '" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
