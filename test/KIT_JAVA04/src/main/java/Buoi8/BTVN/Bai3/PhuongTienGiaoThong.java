/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.BTVN.Bai3;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class PhuongTienGiaoThong {
    private String hsngSX;
    private int namSX;
    private int giaBan;
    private String color;
    
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten hang san xuat: ");
        hsngSX= sc.nextLine();
        System.out.println("Nhap nam san xuat: ");
        namSX= sc.nextInt();
        System.out.println("Nhap gia ban : ");
        giaBan= sc.nextInt();
        System.out.println("Nhap mau xe: ");
        sc.nextLine();
        color= sc.nextLine();
    }
    public void xuat()
    {
        System.out.println(toString());
    }

    public PhuongTienGiaoThong() {
    }
    public String searchColor()
    {
        return "";
    }

    @Override
    public String toString() {
        return "PhuongTienGiaoThong{" + "hsngSX=" + hsngSX + ", namSX=" + namSX + ", giaBan=" + giaBan + ", color=" + color + '}';
    }

    public String getHsngSX() {
        return hsngSX;
    }

    public void setHsngSX(String hsngSX) {
        this.hsngSX = hsngSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
