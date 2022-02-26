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
public class TreEm extends DocGia{
    private String thongTinhoten;
    
    void nhap()
    {
        super.nhap();
        Scanner SC= new Scanner(System.in);
        System.out.println("Nhap thong tin ho ten nguoi dai dien: ");
        thongTinhoten= SC.nextLine();
        
    }
    void xuat()
    {
        System.out.println(toString());
    }

    @Override
    int tienlamthe() {
        return sothangcohieuluc*5000; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public String toString() {
        return "TreEm{"+super.toString() + "thongTinhoten=" + thongTinhoten + '}';
    }
    
        
}
