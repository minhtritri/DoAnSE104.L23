package prj.model;

import java.time.LocalDate;

public class Drug {

    private String sMathuoc;
    private String sTenthuoc;
    private String sPhannhom;
    private String sPhanloai;
    private String sThanhphan;
    private LocalDate dHansudung;
    private String sDVT;
    private String sMancc;

    public Drug() {
    }

    public Drug(String sMathuoc, String sTenthuoc, String sPhannhom, String sPhanloai,
            String sThanhphan, LocalDate dHansudung, String sDVT, String sMancc) {
        this.sMathuoc = sMathuoc;
        this.sTenthuoc = sTenthuoc;
        this.sPhannhom = sPhannhom;
        this.sPhanloai = sPhanloai;
        this.sThanhphan = sThanhphan;
        this.dHansudung = dHansudung;
        this.sDVT = sDVT;
        this.sMancc = sMancc;
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

    public LocalDate getdHansudung() {
        return dHansudung;
    }

    public void setdHansudung(LocalDate sHansudung) {
        this.dHansudung = sHansudung;
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
}
