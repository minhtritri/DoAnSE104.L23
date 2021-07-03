package prj.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Receipt {

    private String sMaHD;
    private String sMaNV;
    private String sTenNV;
    private String sMaKH;
    private String sTenKH;
    private LocalDate dNgayMuaThuoc;
    private ArrayList<ReceiptDetail> receiptDetails = new ArrayList<>();
    private float fTongTien;

    public Receipt() {
    }

    public Receipt(String sMaHD, String sMaNV, String sTenNV, String sMaKH,
            String sTenKH, LocalDate dNgayMuaThuoc, float fTongTien) {
        this.sMaHD = sMaHD;
        this.sMaNV = sMaNV;
        this.sTenNV = sTenNV;
        this.sMaKH = sMaKH;
        this.sTenKH = sTenKH;
        this.dNgayMuaThuoc = dNgayMuaThuoc;
        this.fTongTien = fTongTien;
    }

    public String getsMaHD() {
        return sMaHD;
    }

    public void setsMaHD(String sMaHD) {
        this.sMaHD = sMaHD;
    }

    public String getsMaNV() {
        return sMaNV;
    }

    public void setsMaNV(String sMaNV) {
        this.sMaNV = sMaNV;
    }

    public String getsTenNV() {
        return sTenNV;
    }

    public void setsTenNV(String sTenNV) {
        this.sTenNV = sTenNV;
    }

    public String getsMaKH() {
        return sMaKH;
    }

    public void setsMaKH(String sMaKH) {
        this.sMaKH = sMaKH;
    }

    public String getsTenKH() {
        return sTenKH;
    }

    public void setsTenKH(String sTenKH) {
        this.sTenKH = sTenKH;
    }

    public LocalDate getdNgayMuaThuoc() {
        return dNgayMuaThuoc;
    }

    public void setdNgayMuaThuoc(LocalDate dNgayMuaThuoc) {
        this.dNgayMuaThuoc = dNgayMuaThuoc;
    }

    public ArrayList<ReceiptDetail> getReceiptDetails() {
        return receiptDetails;
    }

    public void setReceiptDetails(ArrayList<ReceiptDetail> receiptDetails) {
        this.receiptDetails = receiptDetails;
    }

    public float getfTongTien() {
        return fTongTien;
    }

    public void setfTongTien(float fTongTien) {
        this.fTongTien = fTongTien;
    }

    // ********************************************
    public ArrayList<ReceiptDetail> getDetailList() {
        return receiptDetails;
    }

    public String[] getDetailHeader() {
        //mảng chuỗi có giá trị khởi tạo ban đầu
        return new String[]{"Mã thuốc", "Số lượng", "Đơn giá", "Thành tiền"};
    }

    public DefaultTableModel toDetailTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getDetailHeader());
        for (int i = 0; i < receiptDetails.size(); i++) {
            tblModel.addRow(this.toDetailVector(i));
        }
        return tblModel;
    }

    public Vector toDetailVector(int index) {
        Vector vt = new Vector();
        //vt.add(receiptDetails.get(index).getsMaCTHD());
        // vt.add(receiptDetails.get(index).getsMAHD());
        vt.add(receiptDetails.get(index).getsMATHUOC());
        vt.add(receiptDetails.get(index).getiSL());
        vt.add(receiptDetails.get(index).getfDonGia());
        vt.add(receiptDetails.get(index).getfThanhTien());
        return vt;
    }
}
