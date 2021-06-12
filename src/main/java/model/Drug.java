package model;

import java.util.Date;

public class Drug {

    private String sMathuoc;
    private String sTenthuoc;
    private String sPhannhom;
    private String sPhanloai;
    private String sThanhphan;
    private String sHansudung;
    private String sDVT;
    private String sMancc;
    private String sNgaytiepnhan;

    public Drug() {
    }

    public Drug(String sMathuoc, String sTenthuoc, String sPhannhom, String sPhanloai, String sThanhphan, String sHansudung, String sDVT, String sMancc, String sNgaytiepnhan) {
        this.sMathuoc = sMathuoc;
        this.sTenthuoc = sTenthuoc;
        this.sPhannhom = sPhannhom;
        this.sPhanloai = sPhanloai;
        this.sThanhphan = sThanhphan;
        this.sHansudung = sHansudung;
        this.sDVT = sDVT;
        this.sMancc = sMancc;
        this.sNgaytiepnhan = sNgaytiepnhan;
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

    public String getsPhanloai() {
        return sPhanloai;
    }

    public void setsPhanloai(String sPhanloai) {
        this.sPhanloai = sPhanloai;
    }

    public String getsThanhphan() {
        return sThanhphan;
    }

    public void setsThanhphan(String sThanhphan) {
        this.sThanhphan = sThanhphan;
    }

    public String getsHansudung() {
        return sHansudung;
    }

    public void setsHansudung(String sHansudung) {
        this.sHansudung = sHansudung;
    }

    public String getsDVT() {
        return sDVT;
    }

    public void setsDVT(String sDVT) {
        this.sDVT = sDVT;
    }

    public String getsMancc() {
        return sMancc;
    }

    public void setsMancc(String sMancc) {
        this.sMancc = sMancc;
    }

    public String getsNgaytiepnhan() {
        return sNgaytiepnhan;
    }

    public void setsNgaytiepnhan(String sNgaytiepnhan) {
        this.sNgaytiepnhan = sNgaytiepnhan;
    }
}
