package model;

import java.util.Date;

public class Pharmacist {

    private String sMaNV;
    private String sHoTen;
    private String sGioiTinh;
    private int iNamSinh;
    private String SDT;
    private String sDiaChi;
    private Date dNGAYVL;
    private int iCALV;

    public Pharmacist() {
    }

    public Pharmacist(String sMaNV, String sHoTen, String sGioiTinh, int iNamSinh,
            String SDT, String sDiaChi, Date dNGAYVL, int iCALV) {
        this.sMaNV = sMaNV;
        this.sHoTen = sHoTen;
        this.iNamSinh = iNamSinh;
        this.sGioiTinh = sGioiTinh;
        this.sDiaChi = sDiaChi;
        this.SDT = SDT;
        this.dNGAYVL = dNGAYVL;
        this.iCALV = iCALV;
    }

    public String getsMaNV() {
        return sMaNV;
    }

    public void setsMaNV(String sMaNV) {
        this.sMaNV = sMaNV;
    }

    public String getsHoTen() {
        return sHoTen;
    }

    public void setsHoTen(String sHoTen) {
        this.sHoTen = sHoTen;
    }

    public int getiNamSinh() {
        return iNamSinh;
    }

    public void setiNamSinh(int iNamSinh) {
        this.iNamSinh = iNamSinh;
    }

    public String getsGioiTinh() {
        return sGioiTinh;
    }

    public void setsGioiTinh(String sGioiTinh) {
        this.sGioiTinh = sGioiTinh;
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

    public Date getdNGAYVL() {
        return dNGAYVL;
    }

    public void setdNGAYVL(Date dNGAYVL) {
        this.dNGAYVL = dNGAYVL;
    }

    public int getiCALV() {
        return iCALV;
    }

    public void setiCALV(int iCALV) {
        this.iCALV = iCALV;
    }

}
