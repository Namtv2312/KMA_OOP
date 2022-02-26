/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.btvn;

import static buoi3.btvn.Bai1.sc;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai6 {
    static Scanner sc=new Scanner(System.in);
    static void nhap(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("a[%d]= ",i+1);
            a[i]= sc.nextInt();
        }
    }
    static void xuat(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("%5d",a[i]);
        }
    }
    
    static void sx_tang(int []a, int n)
    {
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(a[i]>a[j])
               {
                   int tmp=a[i];
                   a[i]=a[j];
                   a[j]=tmp;
               }
           }
       }
    }
    static void sx_giam(int []a, int n)
    {
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(a[i]<a[j])
               {
                   int tmp=a[i];
                   a[i]=a[j];
                   a[j]=tmp;
               }
           }
       }
    }
    static void ghep(int []a, int []b, int[]c,int sd, int sa)
    {
        int j=0,k=0;
        for(int i=0;i<sd;i++)
        {
            a[i]=b[j++];
        }
        for(int i=sd;i<a.length;i++)
        {
            a[i]=c[k++];
        }
    }
    static void sx(int []a)
    {
        int j=0,k=0;
        int []b= new int[100];
        int []c= new int [100];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                c[k++]=a[i];
            }
            else
                b[j++]=a[i];
        }
        sx_tang(b,j);
        sx_giam(c,k);
        ghep(a,b,c,j,k);
        xuat(a);
    }
    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu: ");
        int n=sc.nextInt();
        int []a= new int[n];       
        System.out.println("Nhap day: ");
        nhap(a);  
        System.out.println("Day duoc sap xep la: ");
        sx(a);
        System.out.println();
    }
    
}
