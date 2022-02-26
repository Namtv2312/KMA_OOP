/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai4;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class TS_KhoiA extends ThiSinh {

    private double diem_TOAN;
    private double diem_Ly;
    private double diem_Hoa;

    public TS_KhoiA() {
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        diem_TOAN = sc.nextDouble();
        diem_Ly = sc.nextDouble();
        diem_Hoa = sc.nextDouble();
    }

    @Override
    public double tong() {
        return diem_Hoa + diem_Ly + diem_TOAN;
    }

    public double getDiem_TOAN() {
        return diem_TOAN;
    }

    public void setDiem_TOAN(double diem_TOAN) {
        this.diem_TOAN = diem_TOAN;
    }

    public double getDiem_Ly() {
        return diem_Ly;
    }

    public void setDiem_Ly(double diem_Ly) {
        this.diem_Ly = diem_Ly;
    }

    public double getDiem_Hoa() {
        return diem_Hoa;
    }

    public void setDiem_Hoa(double diem_Hoa) {
        this.diem_Hoa = diem_Hoa;
    }

    @Override
    public String toString() {
        return "TS_KhoiA{" + super.toString() + "diem_TOAN=" + diem_TOAN + ", diem_Ly=" + diem_Ly + ", diem_Hoa=" + diem_Hoa + '}';
    }

}
