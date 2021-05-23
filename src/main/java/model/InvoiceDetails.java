package model;

public class InvoiceDetails {
    private String sMABH;
    private String sMATHUOC;
    private int iSL;
    
    public InvoiceDetails (String sMABH, String sMATHUOC, int iSL) {
        this.sMABH = sMABH;
        this.sMATHUOC = sMATHUOC;
        this.iSL = iSL;
    }
    public InvoiceDetails () {  
    }

    public String getsMABH() {
        return sMABH;
    }

    public void setsMABH(String sMABH) {
        this.sMABH = sMABH;
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
}
