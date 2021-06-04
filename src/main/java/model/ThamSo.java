/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author anhha
 */
public class ThamSo {
    private int iSoLuongItNhat = 100;
    private float fVAT = (float) 1.1;
    private int iThoiHanHDToiThieu = 6;
    private LocalDate dNgayHienTai = java.time.LocalDate.now();
    private int iTuoiKHToiThieu = 16;

    public ThamSo() {
    }

    public int getiSoLuongItNhat() {
        return iSoLuongItNhat;
    }

    public void setiSoLuongItNhat(int iSoLuongItNhat) {
        this.iSoLuongItNhat = iSoLuongItNhat;
    }

    public float getfVAT() {
        return fVAT;
    }

    public void setfVAT(float fVAT) {
        this.fVAT = fVAT;
    }

    public int getiThoiHanHDToiThieu() {
        return iThoiHanHDToiThieu;
    }

    public void setiThoiHanHDToiThieu(int iThoiHanHDToiThieu) {
        this.iThoiHanHDToiThieu = iThoiHanHDToiThieu;
    }

    public LocalDate getdNgayHienTai() {
        return dNgayHienTai;
    }

    public void setdNgayHienTai(LocalDate dNgayHienTai) {
        this.dNgayHienTai = dNgayHienTai;
    }

    public int getiTuoiKHToiThieu() {
        return iTuoiKHToiThieu;
    }

    public void setiTuoiKHToiThieu(int iTuoiKHToiThieu) {
        this.iTuoiKHToiThieu = iTuoiKHToiThieu;
    }
    
}
