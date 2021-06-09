package controller;

import java.util.ArrayList;
import java.util.Set;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Receipt;

/**
 *
 * @author THAONGAN
 */
public class ReceiptController {
    
    private ArrayList<Receipt> receipts = new ArrayList<>();
    private static ReceiptController instance = new ReceiptController();
    
    public ReceiptController() {
    }
    
    public static ReceiptController getInstance() {
        return instance;
    }
    
    public ArrayList<Receipt> getList() {
        return receipts;
    }
    
    public String[] getHeader() {
        //mảng chuỗi có giá trị khởi tạo ban đầu
        return new String[]{"MaHD", "MaNV", "Tên NV", "MaKH", "Tên KH",
            "Ngày mua"};
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
        vt.add(receipts.get(index).getsMaHD());
        vt.add(receipts.get(index).getsMaNV());
        vt.add(receipts.get(index).getsMaKH());
        vt.add(receipts.get(index).getdNgayMuaThuoc());
        
        return vt;
    }
}
