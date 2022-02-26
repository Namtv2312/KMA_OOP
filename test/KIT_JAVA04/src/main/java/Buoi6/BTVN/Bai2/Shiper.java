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
public class Shiper extends NhanVien {

    private int sohanggiao;

    public int tinhtienluong() {
        return sohanggiao * 33500;
    }

    void nhapInfo() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nHAp so hang giao: ");
    }

    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Shiper{" + super.toString() + "sohanggiao=" + sohanggiao + '}';
    }

    public Shiper() {
    }

    public int getSohanggiao() {
        return sohanggiao;
    }

    public void setSohanggiao(int sohanggiao) {
        this.sohanggiao = sohanggiao;
    }

}
