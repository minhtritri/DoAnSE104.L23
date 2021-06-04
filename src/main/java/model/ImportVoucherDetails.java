
package model;

/**
 *
 * @author anhha
 */
public class ImportVoucherDetails {
    private String sMaCTPN;
    private int iSL;
    private String sMaPN;
    private String sMaThuoc;
    private float fDonGia;

    public ImportVoucherDetails() {
    }

    public ImportVoucherDetails(String sMaCTPN, int iSL, String sMaPN, String sMaThuoc, float fDonGia) {
        this.sMaCTPN = sMaCTPN;
        this.iSL = iSL;
        this.sMaPN = sMaPN;
        this.sMaThuoc = sMaThuoc;
        this.fDonGia = fDonGia;
    }

    public String getsMaCTPN() {
        return sMaCTPN;
    }

    public void setsMaCTPN(String sMaCTPN) {
        this.sMaCTPN = sMaCTPN;
    }

    public int getiSL() {
        return iSL;
    }

    public void setiSL(int iSL) {
        this.iSL = iSL;
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

    public float getfDonGia() {
        return fDonGia;
    }

    public void setfDonGia(float fDonGia) {
        this.fDonGia = fDonGia;
    }
    
}