/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj.controller;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import pri.JDBCconnect.JDBCconnection;
import prj.model.Drug;
import prj.view.PanelDrug;

/**
 *
 * @author anhha
 */
public class DrugController {

  
    private ArrayList<Drug> drugs = new ArrayList<>();
    private static DrugController instance = new DrugController();

    public DrugController() {
    }

    public ArrayList<Drug> getList() {
        return drugs;
    }

    public static DrugController getInstance() {
        return instance;
    }

    public String[] getHeaders() {
        return new String[]{"Mã Thuốc", "Tên thuốc", "Phân nhóm", "Phân loại",
            "Thành phần", "Hạn sử dụng", "ĐVT", "Mã NCC"};
    }

    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i = 0; i < drugs.size(); i++) {
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }

    public Vector toVector(int index) {
        Vector vt = new Vector();
        vt.add(drugs.get(index).getsMathuoc());
        vt.add(drugs.get(index).getsTenthuoc());
        vt.add(drugs.get(index).getsPhannhom());
        vt.add(drugs.get(index).getsPhanloai());
        vt.add(drugs.get(index).getsThanhphan());
        LocalDate dHanSuDung = LocalDate.parse(drugs.get(index).getdHansudung().toString(),
                DateTimeFormatter.ofPattern("yyyy'-'MM'-'dd"));
        vt.add(dHanSuDung.format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy")));
        vt.add(drugs.get(index).getsDVT());
        vt.add(drugs.get(index).getsMancc());
        return vt;
    }
    public static void Insert(String mathuoc, String tenthuoc, String phannhom, String phanloai, String thanhphan, String hansudung,
            String dvt, String mncc){
             
            Connection conn = JDBCconnection.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "";
            if(mncc == null){
            
                 sql ="insert into THUOC values('"+mathuoc+"','"+tenthuoc+"', '"+phannhom+"','"+phanloai+"','"+thanhphan+"','"+hansudung+"','"+dvt+"',NULL)";
            }
            else{
                 sql ="insert into THUOC values('"+mathuoc+"','"+tenthuoc+"', '"+phannhom+"','"+phanloai+"','"+thanhphan+"','"+hansudung+"','"+dvt+"','"+mncc+"')";
            }
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public static void Delete(String id){
        Connection conn = JDBCconnection.getConnection();
        String sql = "DELETE FROM THUOC WHERE MATHUOC = '"+id+"'";
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
            ResultSet rs =  st.executeQuery("SELECT COUNT(*) AS SL FROM THUOC");
            while(rs.next()){
                row = rs.getInt("SL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return row;
        }
}
