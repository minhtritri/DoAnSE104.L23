package controller;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Supplier;

/**
 *
 * @author TRIET
 */
public class SupplierController {
    private ArrayList<Supplier> suppliers = new ArrayList<>();
    private static SupplierController instance = new SupplierController();
    
    private SupplierController() {}
    
    public static SupplierController getInstance() {
        return instance;
    }
    
    public ArrayList<Supplier> getList() {
        return suppliers;
    }

    public String[] getHeaders() {
        return new String[]{"MaNCC", "Tên NCC", "SĐT", "Địa chỉ", "Email",
            "Ngày đăng ký HD", "Thời hạn HD"};
    }

    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i=0; i<suppliers.size(); i++){
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }
    public Vector toVector(int index) {
        Vector vt = new Vector();
        vt.add(suppliers.get(index).getsMaNCC());
        vt.add(suppliers.get(index).getsTenNCC());
        vt.add(suppliers.get(index).getSDT());
        vt.add(suppliers.get(index).getsDiaChi());
        vt.add(suppliers.get(index).getsEmail());
        vt.add(suppliers.get(index).getdNgayDangKyHD());
        vt.add(suppliers.get(index).gettThoiHanHD());
        return vt;
    }
}
