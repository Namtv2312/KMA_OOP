/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH2.BTH3.Bai2;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SinhVien {

    public String hoTen;
    public int tuoi;
    public int namsinh;
    public String lop;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public SinhVien() {
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh sinh vien");
        namsinh = sc.nextInt();
        tuoi = Calendar.getInstance().get(Calendar.YEAR) - namsinh;
        System.out.println("Nhap lop sinh vien: ");
        sc.next();
        lop = sc.nextLine();
    }

    public void xuatTT() {
        System.out.println("Ho ten sv: " + hoTen);
        System.out.println("Nam sinh sinh vien: " + namsinh);
        System.out.println("Tuoi sinh vien : " + tuoi);
        System.out.println("Lop sinh vien : " + lop);
    }

}
