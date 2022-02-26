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
public class Bai11 {
    static Scanner sc= new Scanner(System.in);
    static void nhap(int [][]a, int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("a[%d][%d]= ",i+1,j+1);
                a[i][j]= sc.nextInt();
            }
        }
    }
    static void xuat(int [][]a, int m, int n)
    {
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%5d",a[i][j]);
            }
            System.out.println();
        }
    }
    static void tich(int [][]a, int [][]b, int [][]c, int m, int n, int p)
    {
        for(int i=0;i<m;i++)
        {
            for(int k=0;k<p;k++)
            {
                int s=0;
                for(int j=0;j<n;j++)
                {
                    s+=a[i][j]*b[j][k];
                }
                c[i][k]=s;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap m,n,p");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        int a[][]= new int [m][n];
        int b[][]= new int [n][p];
        int c[][]= new int [m][p];
        
        System.out.println("Nhap ma tran A: ");
        nhap(a,m,n);
        System.out.println("Nhap ma tran B: ");
        nhap(b,n,p);
        System.out.println("Tich hai ma tran la: ");
        tich(a,b,c,m,n,p);
        xuat(c,m,p);
    }
        
}
