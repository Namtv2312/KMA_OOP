/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4.btvn.Bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    Scanner sc= new Scanner(System.in);
    String maSinhvien;
    String tenSinhvien;
    String queQuan;
    float diemA1;
    float diemA3;
    float diemNguyenly1;
    void Nhap()
    {
        System.out.println("Nhap ma sinh vien: ");
        maSinhvien=sc.nextLine();
        System.out.println("Nhap ten sinh vien: ");
        tenSinhvien=sc.nextLine();
        System.out.println("Nhap que quan sinh vien: ");
        queQuan=sc.nextLine();
        System.out.println("Nhap diem A1 sinh vien: ");
        diemA1=sc.nextInt();
        System.out.println("Nhap diem A3 sinh vien: ");
        diemA3=sc.nextInt();
        System.out.println("Nhap diem Nguyen ly 1 sinh vien: ");
        diemNguyenly1=sc.nextInt();
        
    }
    void DiemTrungBinh()
    {
        System.out.println("Diem trung binh cu sinh vien la: ");
        System.out.printf("%.0f",(diemA1+diemA3+diemNguyenly1)/3);
    }
    double TienThiLai()
    {
        double t=0;
        if(diemA1<4)
            t+=90000;
        if(diemA3<4)
            t+=90000;
        if(diemNguyenly1<4)
            t=90000;
        return t;
    }
}
