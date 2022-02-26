/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KITbai1;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {
    public static void main(String[] args) {
        SoPhuc sp1 = new SoPhuc();
        System.out.println("Nhap so phuc thu nhat");
        sp1.nhap();
        SoPhuc sp2 = new SoPhuc();  
        System.out.println("Nhap so phuc thu 2:");
        sp2.nhap();
        System.out.println("Tong hai so phuc");
        sp1.cong(sp2);
        System.out.println();
        System.out.println("Hieu hai so phuc");
        sp1.tru(sp2);
        System.out.println();
        System.out.println("Nhan hai so phuc");
        sp1.nhan(sp2);
        System.out.println();
        System.out.println("Chia hai so phuc");
        sp1.chia(sp2);
     
    }
}
