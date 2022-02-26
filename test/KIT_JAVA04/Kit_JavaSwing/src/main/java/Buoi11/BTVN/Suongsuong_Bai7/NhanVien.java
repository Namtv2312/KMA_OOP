/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai7;

import java.util.Date;

/**
 *
 * @author NAM SYSTEM
 */
public class NhanVien extends Person{
    private String phongBan;
    private double  hesoLuong;
    private double luongcoban;
    private int thamnien;

    public NhanVien(String phongBan, double hesoLuong, double luongcoban, int thamnien, String hoTen, Date ngaysinh, String diachi, String gioitinh) {
        super(hoTen, ngaysinh, diachi, gioitinh);
        this.phongBan = phongBan;
        this.hesoLuong = hesoLuong;
        this.luongcoban = luongcoban;
        this.thamnien = thamnien;
    }

    public NhanVien(String phongBan, double hesoLuong, double luongcoban, int thamnien) {
        this.phongBan = phongBan;
        this.hesoLuong = hesoLuong;
        this.luongcoban = luongcoban;
        this.thamnien = thamnien;
    }

   

    public NhanVien( double hesoLuong, double luongcoban, int thamnien) {
        this.hesoLuong = hesoLuong;
        this.luongcoban = luongcoban;
        this.thamnien = thamnien;
    }

    public NhanVien() {
    }


    public double tinhLuong()
    {
        return luongcoban*(hesoLuong)*(1+thamnien/100);
    }
    @Override
    public String toString() {
        return "NhanVien{" +super.toString()+ "phongBan=" + phongBan + ", hesoLuong=" + hesoLuong + ", luongcoban=" + luongcoban + ", thamnien=" + thamnien + '}';
    }
    public void nhap()
    {
        System.out.println(toString());
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHesoLuong() {
        return hesoLuong;
    }

    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }
    
}
