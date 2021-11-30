/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Bai11;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Employee extends Person{
    public double luongCB;
    public int hsCB;
    public double tinhLuong(){
        return luongCB*hsCB;
    }

    public int getHsCB() {
        return hsCB;
    }

    public void setHsCB(int hsCB) {
        this.hsCB = hsCB;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap lungcb: ");
        Scanner sc = new Scanner(System.in);
        luongCB=sc.nextDouble();
        System.out.println("Nhap heso luong");
        hsCB= sc.nextInt();
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Luongcb: "+ this.getLuongCB());
        System.out.println("He so luong "+ this.getHsCB());
        System.out.println("Tien luong: "+ this.tinhLuong());
    }
        
}
