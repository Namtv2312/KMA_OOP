/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai4;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class TS_KhoiC extends ThiSinh {

    private double diem_Van;
    private double diem_Su;
    private double diem_Dia;

    public TS_KhoiC() {
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        diem_Van = sc.nextDouble();
        diem_Su = sc.nextDouble();
        diem_Dia = sc.nextDouble();
    }

    public TS_KhoiC(double diem_Van, double diem_Su, double diem_Dia, String hoTen, Date ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diem_Van = diem_Van;
        this.diem_Su = diem_Su;
        this.diem_Dia = diem_Dia;
    }

    @Override
    public double tong() {
        return diem_Dia + diem_Su + diem_Van;//To change body of generated methods, choose Tools | Templates.
    }

    public double getDiem_Van() {
        return diem_Van;
    }

    public void setDiem_Van(double diem_Van) {
        this.diem_Van = diem_Van;
    }

    public double getDiem_Su() {
        return diem_Su;
    }

    public void setDiem_Su(double diem_Su) {
        this.diem_Su = diem_Su;
    }

    public double getDiem_Dia() {
        return diem_Dia;
    }

    public void setDiem_Dia(double diem_Dia) {
        this.diem_Dia = diem_Dia;
    }

    @Override
    public String toString() {
        return "TS_KhoiC{" + super.toString() + "diem_Van=" + diem_Van + ", diem_Su=" + diem_Su + ", diem_Dia=" + diem_Dia + '}';
    }

}
