/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.Trenlop.Bai1;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Bao extends TailLieu{
    protected int ngayPhathanh;
    public Bao()
    {
        
    }
     public void nhap()
     {
         super.nhap();
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhap ngay phat hanh");
         ngayPhathanh= sc.nextInt();
     }

     public void xuat()      
     {
         System.out.println(toString());
     }
    @Override
    public String toString() {
        return "Bao{"+super.toString() + "ngayPhathanh=" + ngayPhathanh + '}';
    }
         
}
