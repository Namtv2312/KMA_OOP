/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Dahinh.Bai1;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class NguoiLon extends DocGia{
    private int cccd;
     void nhap()
     {
         super.nhap();
         Scanner sc = new Scanner(System.in);
         cccd = sc.nextInt();
     }
     void xuat()
     {
         System.out.println(toString());
     }

    @Override
    int tienlamthe() {
        return sothangcohieuluc*10000; //To change body of generated methods, choose Tools | Templates.
    }
     

    @Override
    public String toString() {
        return "NguoiLon{"+super.toString() + "cccd=" + cccd + '}';
    }
     
         
         
}
