package prj.model;

public class ReceiptDetail {

    private String sMaCTHD;
    private String sMAHD;
    private String sMATHUOC;
    private int iSL;
    private float fDonGia;
    private float fThanhTien;

    public ReceiptDetail() {
    }

    public ReceiptDetail(String sMaCTHD, String sMAHD, String sMATHUOC,
            int iSL, float fDonGia, float fThanhTien) {
        this.sMaCTHD = sMaCTHD;
        this.sMAHD = sMAHD;
        this.sMATHUOC = sMATHUOC;
        this.iSL = iSL;
        this.fDonGia = fDonGia;
        this.fThanhTien = fThanhTien;
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

    public float getfThanhTien() {
        return fThanhTien;
    }

    public void setfThanhTien(float fThanhTien) {
        this.fThanhTien = fThanhTien;
    }
}
