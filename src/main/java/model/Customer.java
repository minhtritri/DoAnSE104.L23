package model;

public class Customer {
    private String sMaKH;
    private String sHoten;
    private String sGioiTinh;
    private String sDiaChi;

    public Customer(String sMaKH, String sHoten, String sGioiTinh, String sDiaChi) {
        this.sMaKH = sMaKH;
        this.sHoten = sHoten;
        this.sGioiTinh = sGioiTinh;
        this.sDiaChi = sDiaChi;
    }
    
    public Customer(){ 
    }

    public String getsMaKH() {
        return sMaKH;
    }

    public String getsHoten() {
        return sHoten;
    }

    public String getsGioiTinh() {
        return sGioiTinh;
    }

    public String getsDiaChi() {
        return sDiaChi;
    }

    public void setsMaKH(String sMaKH) {
        this.sMaKH = sMaKH;
    }

    public void setsHoten(String sHoten) {
        this.sHoten = sHoten;
    }

    public void setsGioiTinh(String sGioiTinh) {
        this.sGioiTinh = sGioiTinh;
    }

    public void setsDiaChi(String sDiaChi) {
        this.sDiaChi = sDiaChi;
    }
    
    
}
