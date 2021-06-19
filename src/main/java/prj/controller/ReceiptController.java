package prj.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import prj.model.Receipt;

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

}
