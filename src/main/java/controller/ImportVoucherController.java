package controller;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.ImportVoucher;

/**
 *
 * @author THAONGAN
 */
public class ImportVoucherController {
    
        private ArrayList<ImportVoucher> importVouchers = new ArrayList<>();
    private static ImportVoucherController instance = new ImportVoucherController();
    
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
        return new String[]{"MaPN", "MaNV", "Tên NV", "MaNCC", "Tên NCC",
            "Ngày lập phiếu"};
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
        vt.add(importVouchers.get(index).getsMaPN());
        vt.add(importVouchers.get(index).getsMaNV());
        vt.add(importVouchers.get(index).getsMaNCC());
        vt.add(importVouchers.get(index).getdNgayNhapPhieu());
        
        return vt;
    }
}
