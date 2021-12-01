/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH2.BTH3.Bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Nguoi {
    public String hoTen;
    public String diaChi;
    public int namSinh;
    
    //method
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        
        System.out.println("Nhap dia chi: ");
        diaChi= sc.nextLine();
        
        System.out.println("Nhap nam sinh: ");
        namSinh= sc.nextInt();
        
       
        
    }
    public void inTT()
    {
        System.out.println("Thong tin :");
        System.out.println("Ho ten :"+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Nam sinh: "+ namSinh);
        // the "this" keyword allows you to specify that
        // you mean "this type" and reference the members
        // of this type - in this instance it is allowing
        // you to disambiguate between the private member
        // "bar" and the parameter "bar" passed into the
        // constructor
    }

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
}
