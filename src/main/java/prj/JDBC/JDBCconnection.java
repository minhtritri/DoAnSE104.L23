package prj.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhha
 */
public class JDBCconnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try {
                return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                        + "databaseName=QuanLyNhaThuoc;integratedSecurity=false;"
                        + "user=sa;password=123456;");
            } catch (SQLException ex) {
                Logger.getLogger(JDBCconnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
//     public static void main(String[] args) {
//        
//        Connection conn = JDBCconnection.getConnection();
//        try {
//            Statement st  = conn.createStatement();
//            ResultSet rs =  st.executeQuery("SELECT * FROM THUOC");
//            while(rs.next()){
//                String MaThuoc = rs.getString("MATHUOC");
//                String TenThuoc = rs.getString("TENTHUOC");
//                String PhanNhom = rs.getString("PHANNHOM");
//                String PhanLoai = rs.getString("PHANLOAI");
//                String ThanhPhan = rs.getString("THANHPHAN");
//                String DVT = rs.getString("DVT");
//                LocalDate HanSuDung = rs.getDate("HANSUDUNG").toLocalDate();
//                String Mancc = rs.getString("MANCC");
//                Drug d = new Drug(MaThuoc, TenThuoc, PhanNhom, PhanLoai, ThanhPhan, HanSuDung,DVT, Mancc);
//                System.err.println(MaThuoc + TenThuoc + PhanNhom + PhanLoai + ThanhPhan + DVT + HanSuDung + Mancc) ;
//            
//           
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DrugController.class.getName()).log(Level.SEVERE, null, ex);
//        }

//    }
}
