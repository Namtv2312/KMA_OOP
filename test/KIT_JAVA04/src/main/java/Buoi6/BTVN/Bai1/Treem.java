/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BTVN.Bai1;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Treem extends DocGia{
    private String Hoten;
    public int tienlamathe()
    {
        return getSoThangcoHieuluc()*5000;
    }
        
     public void nhap()
     {
         super.nhap();
         Scanner cs= new Scanner(System.in);
         System.out.println("Nhap ho ten nguoi giam ho: ");
         Hoten=cs.nextLine();
     }

    public Treem() {
    }

    public void xuat()
    {
        System.out.println(toString());
    }
        
    @Override
    public String toString() {
        return "Treem{"+ super.toString()+ "Hoten=" + Hoten + '}';
    }
     
    
}
