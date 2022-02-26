/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.btvn;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai8 {
    static Scanner sc= new Scanner(System.in);
    static void nhap(int []a)
    {
        a[0]=0;a[1]=1;
        for(int i=2;i<a.length;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
    }
    static void xuat(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("%5d",a[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n= sc.nextInt();
        int []a= new int [n];
        System.out.println("Day fibonacci la: ");
        nhap(a);
        xuat(a);
        
    }
}
