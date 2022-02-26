/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.trenlop;


import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai1 {
   static Scanner sc= new Scanner(System.in);

    /**
     *
     * @param a
     * @param n
     */
     static void nhap(int[]a, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d] =",i);
            a[i]= sc.nextInt();
        }
    }
     static void xuat(int []a, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
       System.out.println("Nhap n");
       int n= sc.nextInt();
       int []a= new int[n];
        nhap(a,n);
        xuat(a,n);     
    }
}


