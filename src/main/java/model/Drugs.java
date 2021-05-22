package model;

import java.util.Date;

public class Drugs {
    private String sMathuoc;
    private String sTenthuoc;
    private String sPhannhom;
    private int iPhanloai;
    private String sThanhphan;
    private String sMancc;
    private Date dNgaytiepnhan;
    private Date dNgaysanxuat;
    private Date dHansudung;
    private int iSL_DVT;
    private float fGiaban;

    public Drugs(String sMathuoc, String sTenthuoc, String sPhannhom,
            int iPhanloai,String sThanhphan, String sMancc, Date dNgaytiepnhan,
            Date dNgaysanxuat, Date dHansudung, int iSL_DVT, float fGiaban) {
        this.sMathuoc = sMathuoc;
        this.sTenthuoc = sTenthuoc;
        this.sPhannhom = sPhannhom;
        this.iPhanloai = iPhanloai;
        this.sThanhphan = sThanhphan;
        this.sMancc = sMancc;
        this.dNgaytiepnhan = dNgaytiepnhan;
        this.dNgaysanxuat = dNgaysanxuat;
        this.dHansudung = dHansudung;
        this.iSL_DVT = iSL_DVT;
        this.fGiaban = fGiaban;
    }

    public Drugs() {
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

    public int getiPhanloai() {
        return iPhanloai;
    }

    public void setiPhanloai(int iPhanloai) {
        this.iPhanloai = iPhanloai;
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

    public Date getdNgaysanxuat() {
        return dNgaysanxuat;
    }

    public void setdNgaysanxuat(Date dNgaysanxuat) {
        this.dNgaysanxuat = dNgaysanxuat;
    }

    public Date getdHansudung() {
        return dHansudung;
    }

    public void setdHansudung(Date dHansudung) {
        this.dHansudung = dHansudung;
    }

    public int getiSL_DVT() {
        return iSL_DVT;
    }

    public void setiSL_DVT(int iSL_DVT) {
        this.iSL_DVT = iSL_DVT;
    }

    public float getfGiaban() {
        return fGiaban;
    }

    public void setfGiaban(float fGiaban) {
        this.fGiaban = fGiaban;
    }

            
            
}
