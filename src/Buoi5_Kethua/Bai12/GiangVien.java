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
public class GiangVien extends Person{
    public double tienLuongHangThang;

    public double getTienLuongHangThang() {
        return tienLuongHangThang;
    }

    public void setTienLuongHangThang(double tienLuongHangThang) {
        this.tienLuongHangThang = tienLuongHangThang;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap tien luong hang thang: ");
        tienLuongHangThang= sc.nextDouble();
    }
    public  void show(){
        super.show();
        System.out.println("Tien luong hang thang: "+ this.getTienLuongHangThang());
        
    }
}
