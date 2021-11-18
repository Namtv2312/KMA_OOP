/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Bai12;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        SinhVien s1= new SinhVien();
        System.out.println("Nhap thong tin sinh vien 1");
        s1.nhap();
        System.out.println("Sinh Vien 1");
        s1.show();
        
        GiangVien gv1 = new GiangVien();
        System.out.println("Nhap thong tin giang vien 1");
        gv1.nhap();
        System.out.println("Giang vien 1: ");
        gv1.show();
        
        GiamDoc gd1= new GiamDoc();
        System.out.println("Nhap thong tin giam doc1 ");
        gd1.nhap();
        System.out.println("thong tin giam doc 1");
        gd1.show();
    }
}
