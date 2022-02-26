/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi10.BTVN.Bai4;

import java.io.Serializable;

/**
 *
 * @author NAM SYSTEM
 */
public class SinhVien implements Serializable{
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private double diem;
    public SinhVien(String maSV, String hoTen, String ngaySinh, String gioiTinh, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

   
    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void nhap()
    {
        
    }
    @Override
    public String toString() {
        return "maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diem=" + diem;
    }

    void setLuong(int parseInt) {
        
    }

    void setDonVi(String text) {
        
    }
    void setHocPhi(float hocPhi){
        
    }
    
    
}
