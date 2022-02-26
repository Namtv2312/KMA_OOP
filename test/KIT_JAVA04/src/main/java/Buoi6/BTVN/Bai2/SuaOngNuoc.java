/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BTVN.Bai2;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class SuaOngNuoc extends NhanVien {

    private int soGioSua;

    public int tinhtienLuong() {
        return soGioSua * 50000;
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so gio sua ong nuoc: ");
        soGioSua = sc.nextInt();
    }

    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SuaOngNuoc{" + super.toString() + "soGioSua=" + soGioSua + '}';
    }

    public SuaOngNuoc() {
    }

    public int getSoGioSua() {
        return soGioSua;
    }

    public void setSoGioSua(int soGioSua) {
        this.soGioSua = soGioSua;
    }

}
