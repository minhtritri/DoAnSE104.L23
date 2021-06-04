package model;

public class ReceiptDetails {
    private String sMaCTHD;
    private String sMAHD;
    private String sMATHUOC;
    private int iSL;
    private float fDonGia;

    public ReceiptDetails() {
    }

    public ReceiptDetails(String sMaCTHD, String sMAHD, String sMATHUOC, int iSL, float fDonGia) {
        this.sMaCTHD = sMaCTHD;
        this.sMAHD = sMAHD;
        this.sMATHUOC = sMATHUOC;
        this.iSL = iSL;
        this.fDonGia = fDonGia;
    }

    public String getsMaCTHD() {
        return sMaCTHD;
    }

    public void setsMaCTHD(String sMaCTHD) {
        this.sMaCTHD = sMaCTHD;
    }

    public String getsMAHD() {
        return sMAHD;
    }

    public void setsMAHD(String sMAHD) {
        this.sMAHD = sMAHD;
    }

    public String getsMATHUOC() {
        return sMATHUOC;
    }

    public void setsMATHUOC(String sMATHUOC) {
        this.sMATHUOC = sMATHUOC;
    }

    public int getiSL() {
        return iSL;
    }

    public void setiSL(int iSL) {
        this.iSL = iSL;
    }

    public float getfDonGia() {
        return fDonGia;
    }

    public void setfDonGia(float fDonGia) {
        this.fDonGia = fDonGia;
    }
    
   
}
