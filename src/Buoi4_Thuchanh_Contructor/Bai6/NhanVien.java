/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_Thuchanh_Contructor.Bai6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVien {

    public String ten;
    public int tuoi;
    public String Diachi;
    public double luong;
    public int totalGio;

    public NhanVien(String ten, int tuoi, String Diachi, double luong, int totalGio) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.Diachi = Diachi;
        this.luong = luong;
        this.totalGio = totalGio;
    }

    public NhanVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTotalGio() {
        return totalGio;
    }

    public void setTotalGio(int totalGio) {
        this.totalGio = totalGio;
    }

    public void inputInfo() {
        System.out.println("Nhap thong tin Nhan vien");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien");
        ten = sc.nextLine();
        System.out.println("Nhap tuoi nhan vien");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi nhan vien");
        Diachi = sc.nextLine();
        System.out.println("Nhap luong nhan vien");
        luong = sc.nextDouble();
        System.out.println("Nhap tong so gio lam ");
        totalGio = sc.nextInt();

    }

    public void printInfo() {
        System.out.println("Thong tin nhan vien");
        System.out.println("Ten: " + getTen());
        System.out.println("Tuoi: " + getTuoi());
        System.out.println("Dia chi: " + getDiachi());
        System.out.println("Luong: " + getLuong());
        System.out.println("Tong so gio lam: " + getTotalGio());

    }

    public double tinhTHuong() {
        double thuong;
        if (totalGio >= 200) {

            thuong = luong / 5;

        } else if (totalGio < 200 && totalGio >= 100) {
            thuong = luong / 10;
        } else {
            thuong = 0;
        }
        return thuong;
    }

}
