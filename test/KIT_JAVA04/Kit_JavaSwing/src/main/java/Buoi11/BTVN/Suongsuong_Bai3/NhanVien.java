/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai3;

/**
 *
 * @author NAM SYSTEM
 */
public class NhanVien extends Person{
    private String phongBan;
    private double heSoluong;
    private int thamnien;
    private double luongcoban;

    public NhanVien(String phongBan, double heSoluong, int thamnien, double luongcoban, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoluong = heSoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHeSoluong() {
        return heSoluong;
    }

    public void setHeSoluong(double heSoluong) {
        this.heSoluong = heSoluong;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }
    private  double luong()
    {
        return luongcoban*heSoluong*(1+thamnien/100);
    }
    

    @Override
    public String toString() {
        return "NhanVien{"+super.toString() + "phongBan=" + phongBan + ", heSoluong=" + heSoluong + ", thamnien=" + thamnien + ", luongcoban=" + luongcoban + '}';
    }
    
    
}
