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
public class Manager  extends Employee{
    public double  luongTN;

    public double getLuongTN() {
        return luongTN;
    }

    public void setLuongTN(double luongTN) {
        this.luongTN = luongTN;
    }
    public void nhap()
    {super.nhap();
        System.out.println("Nhap luong trach nhiem: ");
        Scanner sc= new Scanner(System.in);
        luongTN= sc.nextDouble();
        
    }
    public double tinhluong(){
       return super.tinhLuong() + luongTN;
    }
    public void show(){
        super.show();
        System.out.println("Luong trach nhiem: "+ this.getLuongTN());
        System.out.printf("Tien luong :%f ",this.tinhLuong());
    }
}
