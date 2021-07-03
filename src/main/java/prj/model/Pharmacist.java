package prj.model;

public class Pharmacist {

    private String sMaNV;
    private String sHoTen;
    private String sGioiTinh;
    private int iNamSinh;
    private String sSDT;
    private String sDiaChi;
    private int iNamVaoLam;
    private int iCALV;

    public Pharmacist() {
    }

    public Pharmacist(String sMaNV, String sHoTen, String sGioiTinh, int iNamSinh,
            String sSDT, String sDiaChi, int iNamVaoLam, int iCALV) {
        this.sMaNV = sMaNV;
        this.sHoTen = sHoTen;
        this.iNamSinh = iNamSinh;
        this.sGioiTinh = sGioiTinh;
        this.sDiaChi = sDiaChi;
        this.sSDT = sSDT;
        this.iNamVaoLam = iNamVaoLam;
        this.iCALV = iCALV;
    }

    public String getsMaNV() {
        return sMaNV;
    }

    public void setsMaNV(String sMaNV) {
        this.sMaNV = sMaNV;
    }

    public String getsHoTen() {
        return sHoTen;
    }

    public void setsHoTen(String sHoTen) {
        this.sHoTen = sHoTen;
    }

    public int getiNamSinh() {
        return iNamSinh;
    }

    public void setiNamSinh(int iNamSinh) {
        this.iNamSinh = iNamSinh;
    }

    public String getsGioiTinh() {
        return sGioiTinh;
    }

    public void setsGioiTinh(String sGioiTinh) {
        this.sGioiTinh = sGioiTinh;
    }

    public String getsDiaChi() {
        return sDiaChi;
    }

    public void setsDiaChi(String sDiaChi) {
        this.sDiaChi = sDiaChi;
    }

    public String getSDT() {
        return sSDT;
    }

    public void setSDT(String sSDT) {
        this.sSDT = sSDT;
    }

    public int getiNamVaoLam() {
        return iNamVaoLam;
    }

    public void setiNamVaoLam(int iNamVaoLam) {
        this.iNamVaoLam = iNamVaoLam;
    }

    public int getiCALV() {
        return iCALV;
    }

    public void setiCALV(int iCALV) {
        this.iCALV = iCALV;
    }

}
