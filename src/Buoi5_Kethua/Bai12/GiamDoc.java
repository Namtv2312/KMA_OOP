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
public class GiamDoc extends Person{
    public double  tienTieuHangThang;

    public double getTienTieuHangThang() {
        return tienTieuHangThang;
    }

    public void setTienTieuHangThang(double tienTieuHangThang) {
        this.tienTieuHangThang = tienTieuHangThang;
    }
    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap tien tieu hang thang : ");
        tienTieuHangThang= sc .nextDouble();
    }
    public void show(){
        super.show();
        System.out.println("Tien tieu hang thang: "+ this.getTienTieuHangThang());
        
    }
}
