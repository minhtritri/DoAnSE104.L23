
package model;

public class Supplier {
    private String sMaNCC;
    private String sTenNCC;
    private String sDiaChi;
    private int iDienThoai;
    private String sSoTKNH;
    
    public Supplier(String sMaNCC, String sTenNCC,String sDiaChi,int iDienThoai,
            String sSoTKNH){
        this.sMaNCC = sMaNCC;
        this.sTenNCC = sTenNCC;
        this.sDiaChi = sDiaChi;
        this.iDienThoai = iDienThoai;
        this.sSoTKNH = sSoTKNH;
    }
    
    public Supplier(){
    }
    
    public String getsMaNCC() {
        return sMaNCC;
    }
    
    public void setsMaNCC(String sMaNCC) {
        this.sMaNCC = sMaNCC;
    }
    
    public String getsTenNCC() {
        return sTenNCC;
    }
    
    public void setsTenNCC(String sTenNCC) {
        this.sTenNCC = sTenNCC;
    }
    
    public String getsDiaChi() {
        return sDiaChi;
    }
    
    public void setsDiaChi(String sDiaChi) {
        this.sDiaChi = sDiaChi;
    }
    
    public int getiDienThoai() {
        return iDienThoai;
    }
    
    public void setiDienThoai(int iDienThoai) {
        this.iDienThoai = iDienThoai;
    }
    
    public String getsSoTKNH() {
        return sMaNCC;
    }
    
    public void setsSoTKNH(String sSoTKNH) {
        this.sSoTKNH = sSoTKNH;
    }
}

