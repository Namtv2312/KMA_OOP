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
public class bai0 {
    static Scanner sc= new Scanner(System.in);
    public static void nhap(int[][] a, int sodong, int socot)
    {
        for(int i=0;i<sodong;i++)
        {
            for (int j=0;j<socot;j++)
            {
                System.out.printf("a[%d][%d]= ",i,j);
                a[i][j]= sc.nextInt();
            }  
        }
    
    }
    public static void xuat(int[][] a, int sodong, int socot)
    {
          for(int i=0;i<sodong;i++)
        {
            for (int j=0;j<socot;j++)
            {
                System.out.printf("%5d",a[i][j]);
            } 
            System.out.println();
            
        }
    }
    public static int tong(int[][] a, int sodong, int socot)
    {
        int s=0;
        for(int i=0;i<sodong;i++)
        {
            for (int j=0;j<socot;j++)
            {
                s=s+a[i][j];
            } 
        }
        return s;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sodong=3;
       int socot =3;
       int[][] a = new int[sodong][socot];
       nhap(a, sodong,socot);
       xuat(a, sodong,socot);
       System.out.println("tong la:"+tong(a, sodong, socot));
    }
}
