/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_namarchtv;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class OOP_NamArchtv {

    /**
     * @param args the command line arguments
     */
      static Scanner sc= new Scanner(System.in);
    static void nhap(int []a, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]= ",i+1);
            a[i]= sc.nextInt();
        }
    }
    static void xuat(int []a, int n)
    {
         for(int i=0;i<n;i++)
        {
            System.out.printf("%5d",a[i]);
        }
    }
    static void tang(int []a, int n)
    {
        for(int i=0;i<n;i++)
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
    static void giam(int []a, int n)
    {
        for(int i=0;i<n;i++)
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
    public static void main(String[] args) {
         System.out.println("Nhap n:");
        int n=sc.nextInt();
        int []a= new int[n];
        while(true){
        System.out.printf("\n%30s|______________Menu__________________|\n","");
        System.out.printf("%30s|1. Sap xep tang dan                |\n","");
        System.out.printf("%30s|2. Sap xep giam dan                |\n","");
        System.out.printf("%30s|3. Exit                            |\n","");
        System.out.printf("%30s Moi ban chon chuc nang             \n","");
        int chon= sc.nextInt();
        
        switch(chon)
        {
            case 1:
                System.out.println("Nhap day:");
                nhap(a,n);
                tang(a,n);
                System.out.println("Day tang dan la:");
                xuat(a,n);
            break;
            case 2: 
               giam(a,n);
                System.out.println("Day gaim dan la:");
               xuat(a,n);
            break;
            case 3: exit(0);
        }
        } 
    }
    
}
