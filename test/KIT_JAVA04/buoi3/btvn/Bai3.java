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
public class Bai3 {
    static Scanner sc=new Scanner(System.in);
    static void nhap(int []a, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]= ",i+1);
            a[i]=sc.nextInt();
        }
    }
    static void snt(int []a, int n)
    {
        for(int i=0;i<n;i++)
        {
            int d=0;
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                    d++;
            }
            if(d==2)
            {
                System.out.printf("%3d",a[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu: ");
        int n= sc.nextInt();
        int []a= new int [n];
        System.out.println("Nhap day: ");
        nhap(a,n);
        System.out.println("So nguyen to la: ");
        snt(a,n);
    }
}
