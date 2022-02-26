/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai6;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Sinhvien implements Serializable {

    private String hoTen;
    private int tuoi;

    public Sinhvien(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public Sinhvien() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten");
        hoTen = sc.nextLine();
        System.out.println("Nhap tuoi");
        tuoi = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + '}';
    }

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

}
