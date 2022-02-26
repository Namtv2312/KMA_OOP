/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai5;

/**
 *
 * @author NAM SYSTEM
 */
public class GiangVien {
    private String hoTen;
    private String maGiangvien;
    private String diachi;
    private String gioiTinh;
    private String khoa;

    public GiangVien(String hoTen, String maGiangvien, String diachi, String gioiTinh, String khoa) {
        this.hoTen = hoTen;
        this.maGiangvien = maGiangvien;
        this.diachi = diachi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

 
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaGiangvien() {
        return maGiangvien;
    }

    public void setMaGiangvien(String maGiangvien) {
        this.maGiangvien = maGiangvien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    
    
}
