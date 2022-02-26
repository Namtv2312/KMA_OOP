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
public class TapChi extends TailLieu{
    protected int soPhatHanh;
    protected int thangPhathanh;

public void nhap()

{
    super.nhap();
    Scanner sc= new Scanner(System.in);
    System.out.println("Nhap so phat hanh");
    soPhatHanh= sc.nextInt();
    System.out.println("Nhap thang phat hanh");
    thangPhathanh=sc.nextInt();    
}
public TapChi()
        
{
    
}
    
public void xuat()
{
    System.out.println(toString());
}
    @Override
    public String toString() {
        return "TapChi{" + "soPhatHanh=" + soPhatHanh + ", thangPhathanh=" + thangPhathanh + '}';
    }

}