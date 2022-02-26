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
public class Bai10 {
    static Scanner sc= new Scanner(System.in);
    static void nhap(int [][]a)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.printf("a[%d][%d]= ",i+1,j+1);
                a[i][j]= sc.nextInt();
            }                               
        }
    }
    static void sap_xep(int [][]a)
    {
        int []b= new int[10];
        int n=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[n]=a[i][j];
                n++;
            }
        }
        for(int i=0;i<9;i++)
        {
            for(int j=i+1;j<9;j++)
            {
                if(b[i]>b[j])
                {
                    int tmp=b[i];
                    b[i]=b[j];
                    b[j]=tmp;
                }
            }                
        }
        n=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=b[n];
                n++;
            }
        }        
    }
    static void xuat(int [][]a)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.printf("%5d",a[i][j]);
            }
            System.out.println();
        }
    }       
    public static void main(String[] args) {
        int [][]a=new int[3][3];
        System.out.println("Nhap ma tran: ");
        nhap(a);
        System.out.println("Ma tran tang dan la: ");
        sap_xep(a);
        xuat(a);
    }    
}
