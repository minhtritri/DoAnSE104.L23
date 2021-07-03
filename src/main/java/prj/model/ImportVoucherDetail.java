package prj.model;

/**
 *
 * @author anhha
 */
public class ImportVoucherDetail {

    private String sMaCTPN;
    private String sMaPN;
    private String sMaThuoc;
    private int iSL;
    private float fDonGia;
    private float fThanhTien;

    public ImportVoucherDetail() {
    }

    public ImportVoucherDetail(String sMaCTPN, String sMaPN, String sMaThuoc,
            int iSL, float fDonGia, float fThanhTien) {
        this.sMaCTPN = sMaCTPN;
        this.sMaPN = sMaPN;
        this.sMaThuoc = sMaThuoc;
        this.iSL = iSL;
        this.fDonGia = fDonGia;
        this.fThanhTien = fThanhTien;
    }

    public String getsMaCTPN() {
        return sMaCTPN;
    }

    public void setsMaCTPN(String sMaCTPN) {
        this.sMaCTPN = sMaCTPN;
    }

    public String getsMaPN() {
        return sMaPN;
    }

    public void setsMaPN(String sMaPN) {
        this.sMaPN = sMaPN;
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
