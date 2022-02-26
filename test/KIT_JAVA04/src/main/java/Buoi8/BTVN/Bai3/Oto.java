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
public class Oto extends PhuongTienGiaoThong{
    private int soChongoi;
    private String kieudongCo;
     
   public  void nhap()
    {
        super.nhap();
        Scanner sc=  new Scanner(System.in);
        System.out.println("Kieu dong co o to la : ");
        kieudongCo= sc.nextLine();
        System.out.println("So cho ngoi cua o to la:");
        soChongoi= sc.nextInt();               
    }
   public void xuat()
   {
       System.out.println(toString());
   }

    public Oto() {
    }

    @Override
    public String searchColor() {
        return getColor(); //To change body of generated methods, choose Tools | Templates.
    }
   

    @Override
    public String toString() {
        return "Oto{" +super.toString()+ "soChongoi=" + soChongoi + ", kieudongCo=" + kieudongCo + '}';
    }
   
}
