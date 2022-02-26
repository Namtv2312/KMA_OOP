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
public class Bai7 {
    static Scanner sc= new Scanner(System.in);
    static void nhap(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("a[%d]= ",i+1);
            a[i]= sc.nextInt();
        }
    }
    static void max(int []a)
    {
     
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        for(int i=0;i<a.length;i++)
        {
             if(a[i]==max)
            System.out.printf("Gia tri MAX la: %d. Vi tri: %d",max,i+1);
        }
       
    }
    static void min(int []a)
    {
        
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
                min=a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==min)
            System.out.printf("Gia tri MIN la: %d. Vi tri: %d",min,i+1);
        }
       
    }
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n=sc.nextInt();
        int []a= new int[n];
        System.out.println("Nhap day so: ");
        nhap(a);
        max(a);
        System.out.println();
        min(a);
        
    }
    
}
