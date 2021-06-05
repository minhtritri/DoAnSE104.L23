package model;

import java.util.Date;

public class Drug {

    private String sMathuoc;
    private String sTenthuoc;
    private String sPhannhom;
    private String sPhanloai;
    private String sThanhphan;
    private Date dHansudung;
    private int iDVT;
    private String sMancc;
    private Date dNgaytiepnhan;

    public Drug() {
    }

    public Drug(String sMathuoc, String sTenthuoc, String sPhannhom, 
            String sPhanloai, String sThanhphan, Date dHansudung, 
            int iDVT, String sMancc, Date dNgaytiepnhan) {
        this.sMathuoc = sMathuoc;
        this.sTenthuoc = sTenthuoc;
        this.sPhannhom = sPhannhom;
        this.sPhanloai = sPhanloai;
        this.sThanhphan = sThanhphan;
        this.sMancc = sMancc;
        this.dNgaytiepnhan = dNgaytiepnhan;
        this.dHansudung = dHansudung;
        this.iDVT = iDVT;
    }

    public String getsMathuoc() {
        return sMathuoc;
    }

    public void setsMathuoc(String sMathuoc) {
        this.sMathuoc = sMathuoc;
    }

    public String getsTenthuoc() {
        return sTenthuoc;
    }

    public void setsTenthuoc(String sTenthuoc) {
        this.sTenthuoc = sTenthuoc;
    }

    public String getsPhannhom() {
        return sPhannhom;
    }

    public void setsPhannhom(String sPhannhom) {
        this.sPhannhom = sPhannhom;
    }

    public String getsMaPhanloai() {
        return sPhanloai;
    }

    public void setsMaPhanloai(String sPhanloai) {
        this.sPhanloai = sPhanloai;
    }

    public String getsThanhphan() {
        return sThanhphan;
    }

    public void setsThanhphan(String sThanhphan) {
        this.sThanhphan = sThanhphan;
    }

    public String getsMancc() {
        return sMancc;
    }

    public void setsMancc(String sMancc) {
        this.sMancc = sMancc;
    }

    public Date getdNgaytiepnhan() {
        return dNgaytiepnhan;
    }

    public void setdNgaytiepnhan(Date dNgaytiepnhan) {
        this.dNgaytiepnhan = dNgaytiepnhan;
    }

    public Date getdHansudung() {
        return dHansudung;
    }

    public void setdHansudung(Date dHansudung) {
        this.dHansudung = dHansudung;
    }

    public int getiSL_DVT() {
        return iDVT;
    }

    public void setiSL_DVT(int iSL_DVT) {
        this.iDVT = iSL_DVT;
    }

}
