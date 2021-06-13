package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        return new String[]{"Mã Phiếu nhập", "Mã NV", "Tên NV", "Mã NCC", "Tên NCC",
            "Ngày lập phiếu", "Tổng tiền"};
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
        LocalDate dNgayNhapPhieu = LocalDate.parse(importVouchers.get(index).getdNgayNhapPhieu().toString(),
                DateTimeFormatter.ofPattern("yyyy'-'MM'-'dd"));
        vt.add(importVouchers.get(index).getsMaPN());
        vt.add(importVouchers.get(index).getsMaNV());
        vt.add(importVouchers.get(index).getsTenNV());
        vt.add(importVouchers.get(index).getsMaNCC());
        vt.add(importVouchers.get(index).getsTenNCC());
        vt.add(dNgayNhapPhieu.format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy")));
        vt.add(importVouchers.get(index).getfTongTien());
        return vt;
    }
}
