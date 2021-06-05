package model;

import java.util.Date;

public class Supplier {

    private String sMaNCC;
    private String sTenNCC;
    private int SDT;
    private String sDiaChi;
    private String sEmail;
    private Date dNgayDangKyHD;
    private int tThoiHanHD;

    public Supplier(String sMaNCC, String sTenNCC, int SDT, String sDiaChi, 
            String sEmail,  Date dNgayDangKyHD, int tThoiHanHD) {
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

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public Date getdNgayDangKyHD() {
        return dNgayDangKyHD;
    }

    public void setdNgayDangKyHD(Date dNgayDangKyHD) {
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
