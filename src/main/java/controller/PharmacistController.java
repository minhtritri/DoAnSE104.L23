package controller;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Pharmacist;

/**
 *
 * @author THAONGAN
 */
public class PharmacistController {

    private ArrayList<Pharmacist> pharmacists = new ArrayList<>();
    private static PharmacistController instance = new PharmacistController();

    private PharmacistController() {
    }

    public static PharmacistController getInstance() {
        return instance;
    }

    public ArrayList<Pharmacist> getList() {
        return pharmacists;
    }

    public String[] getHeaders() {
        //mảng chuỗi có giá trị khởi tạo ban đầu
        return new String[]{"Mã NV", "Họ tên", "Giới tính", "Năm sinh", "SĐT",
            "Địa chỉ", "Ngày vào làm", "Ca"};
    }

    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i=0; i<pharmacists.size(); i++){
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }

    public Vector toVector(int index) {
        Vector vt = new Vector();
        vt.add(pharmacists.get(index).getsMaNV());
        vt.add(pharmacists.get(index).getsHoTen());
        vt.add(pharmacists.get(index).getsGioiTinh());
        vt.add(pharmacists.get(index).getiNamSinh());
        vt.add(pharmacists.get(index).getSDT());
        vt.add(pharmacists.get(index).getsDiaChi());
        vt.add(pharmacists.get(index).getiNamVaoLam());
        vt.add(pharmacists.get(index).getiCALV());
        return vt;
    }
}

