/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi12_Exeption.Bai3;

import java.util.Date;

/**
 *
 * @author NAM SYSTEM
 */
public class NhanVien extends  Person{
    private String phongBan;
    private double hsLuong;
    private int thamNien;
    private double luongCB;

    public NhanVien(String phongBan, double hsLuong, int thamNien, double luongCB, String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.hsLuong = hsLuong;
        this.thamNien = thamNien;
        this.luongCB = luongCB;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHsLuong() {
        return hsLuong;
    }

    public void setHsLuong(double hsLuong) {
        this.hsLuong = hsLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    
    
    double luongThucLinh()
    {
       return luongCB*hsLuong*(1+thamNien/100);
    }

    @Override
    public String toString() {
        return "NhanVien{"+super.toString() + "phongBan=" + phongBan + ", hsLuong=" + hsLuong + ", thamNien=" + thamNien + ", luongCB=" + luongCB + '}';
    }
    
}
