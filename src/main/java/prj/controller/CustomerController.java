/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pri.JDBCconnect.JDBCconnection;
import prj.model.Customer;
import prj.view.PanelCustomer;

/**
 *
 * @author anhha
 */
public class CustomerController {
    private ArrayList<Customer> customers = new ArrayList<>();
    private static CustomerController instance = new CustomerController();

    public CustomerController() {
    }

    public ArrayList<Customer> getList() {
        return customers;
    }

    
    public static CustomerController getInstance() {
        return instance;
    }

    public String[] getHeaders(){
        return new String[]{"Mã KH", "Họ tên","Giới tính","Năm tinh","SĐT"};
    }
    
    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i=0; i<customers.size(); i++){
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
     public static void Insert(String makh, String hoten, String gioitinh, int namsinh, String sdt){
             
            Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "";
            sql ="insert into KHACHHANG values('"+makh+"','"+hoten+"', '"+gioitinh+"',"+namsinh+",'"+sdt+"')";
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public static void Delete(String id){
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM KHACHHANG WHERE MAKH = '"+id+"'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static int CountingRow(){
            int row = 0;
            Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs =  st.executeQuery("SELECT COUNT(*) AS SL FROM KHACHHANG");
            while(rs.next()){
                row = rs.getInt("SL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return row;
        }
}
