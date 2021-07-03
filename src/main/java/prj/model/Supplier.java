package prj.model;

import java.time.LocalDate;

public class Supplier {

    private String sMaNCC;
    private String sTenNCC;
    private String SDT;
    private String sDiaChi;
    private String sEmail;
    private LocalDate dNgayDangKyHD;
    private int tThoiHanHD;

    public Supplier(String sMaNCC, String sTenNCC, String SDT, String sDiaChi,
            String sEmail, LocalDate dNgayDangKyHD, int tThoiHanHD) {
        this.sMaNCC = sMaNCC;
        this.sTenNCC = sTenNCC;
        this.sDiaChi = sDiaChi;
        this.SDT = SDT;
        this.dNgayDangKyHD = dNgayDangKyHD;
        this.tThoiHanHD = tThoiHanHD;
        this.sEmail = sEmail;
    }

    public Supplier() {
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

    public String getsDiaChi() {
        return sDiaChi;
    }

    public void setsDiaChi(String sDiaChi) {
        this.sDiaChi = sDiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public LocalDate getdNgayDangKyHD() {
        return dNgayDangKyHD;
    }

    public void setdNgayDangKyHD(LocalDate dNgayDangKyHD) {
        this.dNgayDangKyHD = dNgayDangKyHD;
    }

    public int gettThoiHanHD() {
        return tThoiHanHD;
    }

    public void settThoiHanHD(int tThoiHanHD) {
        this.tThoiHanHD = tThoiHanHD;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

}
