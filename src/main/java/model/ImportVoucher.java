package model;

import java.util.Date;

public class ImportVoucher {
    private String sMaPN;
    private Date dNgayNhapPhieu;
    private String sMaNV;
    private String sMaNCC;
    private float fTONGGT;

    public ImportVoucher() {
    }

    public ImportVoucher(String sMaPN, Date dNgayNhapPhieu, String sMaNV, String sMaNCC, float fTONGGT) {
        this.sMaPN = sMaPN;
        this.dNgayNhapPhieu = dNgayNhapPhieu;
        this.sMaNV = sMaNV;
        this.sMaNCC = sMaNCC;
        this.fTONGGT = fTONGGT;
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


    public float getfTONGGT() {
        return fTONGGT;
    }

    public void setfTONGGT(float fTONGGT) {
        this.fTONGGT = fTONGGT;
    }

}
