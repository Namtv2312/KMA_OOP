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
public class SinhVienHTTT extends SinhVien  implements Serializable{
    private float hocPhi;

    public SinhVienHTTT() {
    }

    public SinhVienHTTT(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienHTTT(float hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diem) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diem);
        this.hocPhi = hocPhi;
    }

    

    public float getHocPhi() {
        return hocPhi;
    }
    
    
    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    
    public String xuat() {
        return "SinhVienHTTT{" + super.toString()+", hocPhi=" + hocPhi + '}';
    }

    
}
