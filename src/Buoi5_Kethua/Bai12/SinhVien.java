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
public class SinhVien extends Person {
  
    public double tienHocPhiConNo;

    public double getTienHocPhiConNo() {
        return tienHocPhiConNo;
    }

    public void setTienHocPhiConNo(double tienHocPhiConNo) {
        this.tienHocPhiConNo = tienHocPhiConNo;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tien hoc phi con no: ");
        tienHocPhiConNo= sc.nextDouble();
    }
    public void show(){
        super.show();
        System.out.println("Tien hoc phi con no:"+ this.getTienHocPhiConNo());
        
        
    }
    
}
