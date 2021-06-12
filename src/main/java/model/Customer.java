package model;

public class Customer {

    private String sMaKH;
    private String sHoten;
    private String sGioiTinh;
    private String sNamSinh;
    private String sSdtKH;

    public Customer(String sMaKH, String sHoten, String sGioiTinh, String sNamSinh, String sSdtKH) {
        this.sMaKH = sMaKH;
        this.sHoten = sHoten;
        this.sGioiTinh = sGioiTinh;
        this.sNamSinh = sNamSinh;
        this.sSdtKH = sSdtKH;
    }

    public Customer() {
    }

    public String getsMaKH() {
        return sMaKH;
    }

    public void setsMaKH(String sMaKH) {
        this.sMaKH = sMaKH;
    }

    public String getsHoten() {
        return sHoten;
    }

    public void setsHoten(String sHoten) {
        this.sHoten = sHoten;
    }

    public String getsGioiTinh() {
        return sGioiTinh;
    }

    public void setsGioiTinh(String sGioiTinh) {
        this.sGioiTinh = sGioiTinh;
    }

    public String getsNamSinh() {
        return sNamSinh;
    }

    public void setsNamSinh(String sNamSinh) {
        this.sNamSinh = sNamSinh;
    }

    public String getsSdtKH() {
        return sSdtKH;
    }

    public void setsSdtKH(String sSdtKH) {
        this.sSdtKH = sSdtKH;
    }
}
