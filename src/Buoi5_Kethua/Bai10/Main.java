/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Bai10;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
       Cylinder c1= new Cylinder();
        System.out.println("Nhap hinh tru 1");
        c1.nhap();
        System.out.println("Thong tin hinh tru 1");
        c1.show();
        
        Circle ci1= new Circle();
        System.out.println("Nhap circle1 :");
        ci1.nhap();
        System.out.println("Thong tin circle 1");
        System.out.println(ci1.toString());
    }
}
