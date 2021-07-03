package prj.model;

public class Customer {

    private String sMaKH;
    private String sHoten;
    private String sGioiTinh;
    private int sNamSinh;
    private String sSdtKH;

    public Customer() {
    }

    public Customer(String sMaKH, String sHoten, String sGioiTinh, int sNamSinh, String sSdtKH) {
        this.sMaKH = sMaKH;
        this.sHoten = sHoten;
        this.sGioiTinh = sGioiTinh;
        this.sNamSinh = sNamSinh;
        this.sSdtKH = sSdtKH;
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

    public int getsNamSinh() {
        return sNamSinh;
    }

    public void setsNamSinh(int sNamSinh) {
        this.sNamSinh = sNamSinh;
    }

    public String getsSdtKH() {
        return sSdtKH;
    }

    public void setsSdtKH(String sSdtKH) {
        this.sSdtKH = sSdtKH;
    }

}
