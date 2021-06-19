package prj.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import prj.model.Supplier;

/**
 *
 * @author TRIET
 */
public class SupplierController {

    private ArrayList<Supplier> suppliers = new ArrayList<>();
    private static SupplierController instance = new SupplierController();

    private SupplierController() {
    }

    public static SupplierController getInstance() {
        return instance;
    }

    public ArrayList<Supplier> getList() {
        return suppliers;
    }

    public String[] getHeaders() {
        // chuỗi phải giống y chang header tblList ở Panel
        return new String[]{"Mã NCC", "Tên NCC", "SĐT", "Địa chỉ", "Email",
            "Ngày ký Hợp đồng", "Thời hạn Hợp đồng"};
    }

    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i = 0; i < suppliers.size(); i++) {
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }

    public Vector toVector(int index) {
        Vector vt = new Vector();
        LocalDate dNgayDangKyHD = LocalDate.parse(suppliers.get(index).getdNgayDangKyHD().toString(),
                DateTimeFormatter.ofPattern("yyyy'-'MM'-'dd"));
        vt.add(suppliers.get(index).getsMaNCC());
        vt.add(suppliers.get(index).getsTenNCC());
        vt.add(suppliers.get(index).getSDT());
        vt.add(suppliers.get(index).getsDiaChi());
        vt.add(suppliers.get(index).getsEmail());
        vt.add(dNgayDangKyHD.format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy")));
        vt.add(suppliers.get(index).gettThoiHanHD());
        return vt;
    }
}
