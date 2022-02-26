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
public class XeOm extends NhanVien {

    private int soKm;

    public int tinhtienluong() {
        return soKm * 10000;
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so km: ");
        soKm = sc.nextInt();
    }

    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "XeOm{" + super.toString() + "soKm=" + soKm + '}';
    }

    public XeOm() {
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

}
