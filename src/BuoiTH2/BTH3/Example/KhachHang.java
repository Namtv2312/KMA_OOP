/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH2.BTH3.Example;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class KhachHang {

    String hoTen;
    String diaChi;
    String sdt;
    String email;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public KhachHang() {

    }

    public void nhapKH() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        sdt = sc.nextLine();
        System.out.println("Nhap email :");
        email = sc.nextLine();
    }

    public void inKH() {
        System.out.println("--Ho ten:" + this.hoTen);
        System.out.println("--Dia chi:" + this.diaChi);
        System.out.println("--So dien thoai:" + this.sdt);
        System.out.println("--Email:" + this.email);
    }

}
