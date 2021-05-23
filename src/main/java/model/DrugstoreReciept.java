package model;

import java.util.Date;

public class DrugstoreReciept {
    private String sMAMH;
    private String sMATHUOC;
    private String sMANV;
    private String sMANCC;
    private int iSL;
    private float fTONGGT;
    private Date dNGAYMUA;
    
    public DrugstoreReciept(String sMAMH, String sMATHUOC, String sMANV,String sMANCC, int iSL, float fTONGGT, Date dNGAYMUA) {
        this.sMAMH = sMAMH;
        this.sMATHUOC = sMATHUOC;
        this.sMANV = sMANV;
        this.sMANCC = sMANCC;
        this.iSL = iSL;
        this.fTONGGT = fTONGGT;
        this.dNGAYMUA = dNGAYMUA;
    }
    
    public DrugstoreReciept() {
    }
    
    public String getsMAMH() {
        return sMAMH;
    }

    public void setsMAMH(String sMAMH) {
        this.sMAMH = sMAMH;
    }

    public String getsMATHUOC() {
        return sMATHUOC;
    }

    public void setsMATHUOC(String sMATHUOC) {
        this.sMATHUOC = sMATHUOC;
    }

    public String getsMANV() {
        return sMANV;
    }

    public void setsMANV(String sMANV) {
        this.sMANV = sMANV;
    }

    public String getsMANCC() {
        return sMANCC;
    }

    public void setsMANCC(String sMANCC) {
        this.sMANCC = sMANCC;
    }

    public int getiSL() {
        return iSL;
    }

    public void setiSL(int iSL) {
        this.iSL = iSL;
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
