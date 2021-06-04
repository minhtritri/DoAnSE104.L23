package model;

import java.util.Date;

public class Receipt {
    private String sMaHD;
    private Date dNgayMuaThuoc;
    private String sMaNV;
    private String sMaKH;

    public Receipt() {
    }

    public Receipt(String sMaHD, Date dNgayMuaThuoc, String sMaNV, String sMaKH) {
        this.sMaHD = sMaHD;
        this.dNgayMuaThuoc = dNgayMuaThuoc;
        this.sMaNV = sMaNV;
        this.sMaKH = sMaKH;
    }

    public String getsMaHD() {
        return sMaHD;
    }

    public void setsMaHD(String sMaHD) {
        this.sMaHD = sMaHD;
    }

    public Date getdNgayMuaThuoc() {
        return dNgayMuaThuoc;
    }

    public void setdNgayMuaThuoc(Date dNgayMuaThuoc) {
        this.dNgayMuaThuoc = dNgayMuaThuoc;
    }

    public String getsMaNV() {
        return sMaNV;
    }

    public void setsMaNV(String sMaNV) {
        this.sMaNV = sMaNV;
    }

    public String getsMaKH() {
        return sMaKH;
    }

    public void setsMaKH(String sMaKH) {
        this.sMaKH = sMaKH;
    }
    
    
}
