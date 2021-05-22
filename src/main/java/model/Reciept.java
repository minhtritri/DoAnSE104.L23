package model;

import java.util.Date;

public class Reciept {
    private String sMaPBH;
    private String sMaKH;
    private String sMaNV;
    private String sMaThuoc;
    private int iSL;
    private float fTongGT;
    private Date dNgayBan;
    
    public Reciept(String sMaPBH, String sMaKH, String sMaNV, String sMaThuoc,
            int iSL, float fTongGT, Date dNgayBan) {
        this.sMaPBH = sMaPBH;
        this.sMaKH = sMaKH;
        this.sMaNV = sMaNV;
        this.sMaThuoc = sMaThuoc;
        this.iSL = iSL;
        this.fTongGT = fTongGT;
        this.dNgayBan = dNgayBan;
    }
    
    public Reciept() {
        
    }
    
    public String getsMaPBH() {
        return sMaPBH;
    }
    
    public void setsMaPBH(String sMaPBH) {
        this.sMaPBH = sMaPBH;
    }
    
    public String getsMaKH() {
        return sMaPBH;
    }
    
    public void setsMaKH(String sMaKH) {
        this.sMaKH = sMaKH;
    }
    
    public String getsMaNV() {
        return sMaNV;
    }
    
    public void setsMaNV(String sMaNV) {
        this.sMaNV = sMaNV;
    }
    
    public String getsMaThuoc() {
        return sMaThuoc;
    }
    
    public void setsMaThuoc(String sMaThuoc) {
        this.sMaThuoc = sMaThuoc;
    }
    
    public int getiSL() {
        return iSL;
    }
    
    public void setiSL(int iSL) {
        this.iSL = iSL;
    }
    
    public float getfTongGT() {
        return fTongGT;
    }
    
    public void setfTongGT(float fTongGT) {
        this.fTongGT = fTongGT;
    }
    
    public Date getdNgayBan() {
        return dNgayBan;
    }
    
    public void setdNgayBan(Date dNgayBan) {
        this.dNgayBan = dNgayBan;
    }
}
