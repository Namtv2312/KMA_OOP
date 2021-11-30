/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1.Bai2NC;

import static java.lang.Float.hashCode;
import static java.lang.String.valueOf;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main {
    public static float a;
    public static double b;
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap a:");
        a= sc.nextFloat();
        System.out.println("Nhap b:");
        b= sc.nextDouble();
        System.out.println("Tong :"+ valueOf(a+b));
        System.out.println("Hieu: "+ valueOf(a-b));
        System.out.println("Tich: "+ valueOf(a*b));
        System.out.println("Thuong: "+ valueOf(a/b));
        System.out.println("Phan du: "+ valueOf(a%b));
    }
}
