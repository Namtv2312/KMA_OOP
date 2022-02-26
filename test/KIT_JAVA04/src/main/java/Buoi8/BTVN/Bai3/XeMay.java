/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.BTVN.Bai3;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class XeMay extends PhuongTienGiaoThong{
    private int congSuat;
     public void nhap()
     {
         super.nhap();
         Scanner sc= new Scanner(System.in); 
         System.out.println("Nhap cong suat cua xe: ");
         congSuat= sc.nextInt();
     }
     public void xuat()
     {
         System.out.println(toString());
     }

    public XeMay() {
    }

    @Override
    public String searchColor() {
        return getColor(); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public String toString() {
        return "XeMay{" +super.toString()+ "congSuat=" + congSuat + '}';
    }
     
}

