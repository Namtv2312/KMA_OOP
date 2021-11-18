/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Bai12;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Person {
      public String hoTen;
    public int namSinh;
    public String maThe;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen= sc.nextLine();
        System.out.println("Nhap nam sinh");
        namSinh= sc.nextInt();sc.nextLine();
        System.out.println("Nhap ma the: ");
        maThe= sc.nextLine();
    }
    public void show(){
        System.out.println("Ho ten: "+ this.getHoTen());
        System.out.println("Nam sinh: "+ this.getNamSinh());
        System.out.println("Ma the: "+ this.getMaThe());
    }
    
}
