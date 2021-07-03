package prj.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ImportVoucher {

    private String sMaPN;
    private String sMaNV;
    private String sTenNV;
    private String sMaNCC;
    private String sTenNCC;
    private LocalDate dNgayNhapPhieu;
    private ArrayList<ImportVoucherDetail> importDetails = new ArrayList<>();
    private float fTongTien;

    public ImportVoucher() {
    }

    public ImportVoucher(String sMaPN, String sMaNV, String sTenNV, String sMaNCC,
            String sTenNCC, LocalDate dNgayNhapPhieu, float fTongTien) {
        this.sMaPN = sMaPN;
        this.sMaNV = sMaNV;
        this.sTenNV = sTenNV;
        this.sMaNCC = sMaNCC;
        this.sTenNCC = sTenNCC;
        this.dNgayNhapPhieu = dNgayNhapPhieu;
        this.fTongTien = fTongTien;
    }

    public String getsMaPN() {
        return sMaPN;
    }

    public void setsMaPN(String sMaPN) {
        this.sMaPN = sMaPN;
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

    public String getsMaNCC() {
        return sMaNCC;
    }

    public void setsMaNCC(String sMaNCC) {
        this.sMaNCC = sMaNCC;
    }

    public String getsTenNCC() {
        return sTenNCC;
    }

    public void setsTenNCC(String sTenNCC) {
        this.sTenNCC = sTenNCC;
    }

    public LocalDate getdNgayNhapPhieu() {
        return dNgayNhapPhieu;
    }

    public void setdNgayNhapPhieu(LocalDate dNgayNhapPhieu) {
        this.dNgayNhapPhieu = dNgayNhapPhieu;
    }

    public ArrayList<ImportVoucherDetail> getImportDetails() {
        return importDetails;
    }

    public void setImportDetails(ArrayList<ImportVoucherDetail> importDetails) {
        this.importDetails = importDetails;
    }

    public float getfTongTien() {
        return fTongTien;
    }

    public void setfTongTien(float fTongTien) {
        this.fTongTien = fTongTien;
    }

//*****************************************************************************
    public ArrayList<ImportVoucherDetail> getDetailList() {
        return importDetails;
    }

    public String[] getDetailHeader() {
        //mảng chuỗi có giá trị khởi tạo ban đầu
        return new String[]{"Mã thuốc", "Số lượng", "Đơn giá", "Thành tiền"};
    }

    public DefaultTableModel toDetailTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getDetailHeader());
        for (int i = 0; i < importDetails.size(); i++) {
            tblModel.addRow(this.toDetailVector(i));
        }
        return tblModel;
    }

    public Vector toDetailVector(int index) {
        Vector vt = new Vector();
        //vt.add(receiptDetails.get(index).getsMaCTHD());
        // vt.add(receiptDetails.get(index).getsMAHD());
        vt.add(importDetails.get(index).getsMaThuoc());
        vt.add(importDetails.get(index).getiSL());
        vt.add(importDetails.get(index).getfDonGia());
        vt.add(importDetails.get(index).getfThanhTien());
        return vt;
    }
}
