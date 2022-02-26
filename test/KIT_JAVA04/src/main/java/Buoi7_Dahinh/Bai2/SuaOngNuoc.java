/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Dahinh.Bai2;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class SuaOngNuoc extends NhanVien{
    private int soGioSua;
     public void nhap()
     {
         super.nhap();
         Scanner sc = new Scanner(System.in);
         soGioSua= sc.nextInt();
                
     }
     public void xuat()
     {
         System.out.println(toString());
     }

    @Override
    public int tienluong() {
        return soGioSua*50000; //To change body of generated methods, choose Tools | Templates.
    }
     

    @Override
    public String toString() {
        return "SuaOngNuoc{"+super.toString() + "soGioSua=" + soGioSua + '}';
    }
     
         
         
}
