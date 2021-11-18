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
public class Student extends Person{
    public String maSV;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Nhap ma sinh vien");
        Scanner sc = new Scanner(System.in);
        maSV=sc.nextLine();
    }
    public void show(){
        super.show();
        System.out.println("Ma sinh vien "+ this.getMaSV());
    }
}
