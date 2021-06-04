package model;

import java.util.Date;

public class DrugstoreReceipt {
    private String sMaPN;
    private Date dNgayNhapPhieu;
    private String sMaNV;
    private String sMaNCC;
    private String sMaThuoc;
    private float fTONGGT;
    private Date dNGAYMUA;

    public DrugstoreReceipt() {
    }

    public DrugstoreReceipt(String sMaPN, Date dNgayNhapPhieu, String sMaNV, String sMaNCC, String sMaThuoc, float fTONGGT, Date dNGAYMUA) {
        this.sMaPN = sMaPN;
        this.dNgayNhapPhieu = dNgayNhapPhieu;
        this.sMaNV = sMaNV;
        this.sMaNCC = sMaNCC;
        this.sMaThuoc = sMaThuoc;
        this.fTONGGT = fTONGGT;
        this.dNGAYMUA = dNGAYMUA;
    }

    public String getsMaPN() {
        return sMaPN;
    }

    public void setsMaPN(String sMaPN) {
        this.sMaPN = sMaPN;
    }

    public Date getdNgayNhapPhieu() {
        return dNgayNhapPhieu;
    }

    public void setdNgayNhapPhieu(Date dNgayNhapPhieu) {
        this.dNgayNhapPhieu = dNgayNhapPhieu;
    }

    public String getsMaNV() {
        return sMaNV;
    }

    public void setsMaNV(String sMaNV) {
        this.sMaNV = sMaNV;
    }

    public String getsMaNCC() {
        return sMaNCC;
    }

    public void setsMaNCC(String sMaNCC) {
        this.sMaNCC = sMaNCC;
    }

    public String getsMaThuoc() {
        return sMaThuoc;
    }

    public void setsMaThuoc(String sMaThuoc) {
        this.sMaThuoc = sMaThuoc;
    }

    public float getfTONGGT() {
        return fTONGGT;
    }

    public void setfTONGGT(float fTONGGT) {
        this.fTONGGT = fTONGGT;
    }

    public Date getdNGAYMUA() {
        return dNGAYMUA;
    }

    public void setdNGAYMUA(Date dNGAYMUA) {
        this.dNGAYMUA = dNGAYMUA;
    }
    
   
}
