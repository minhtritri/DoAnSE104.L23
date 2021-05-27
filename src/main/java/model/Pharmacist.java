package model;

import java.util.Date;

public class Pharmacist {
    private String MaNV;
    private String HoTen;
    private Date NgaySinh;
    private String GioiTinh;
    private String DiaChi;
    private String SDT;
    private Date NGAYVL;
    private int CALV;

    public Pharmacist(String MaNV, String HoTen, Date NgaySinh, String GioiTinh, String DiaChi, String SDT, Date NGAYVL, int CALV) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.NGAYVL = NGAYVL;
        this.CALV = CALV;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public Date getNGAYVL() {
        return NGAYVL;
    }

    public int getCALV() {
        return CALV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setNGAYVL(Date NGAYVL) {
        this.NGAYVL = NGAYVL;
    }

    public void setCALV(int CALV) {
        this.CALV = CALV;
    }
    
}
