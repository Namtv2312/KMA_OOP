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
public class Bai9 {
    static Scanner sc= new Scanner(System.in);
    static void nhap(int [][]a)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.printf("a[%d][%d]= ",i+1,j+1);
                a[i][j]= sc.nextInt();
            }                               
        }
    }
    static void snt(int [][]a)
    {
       for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {int d=0;
                for(int k=1;k<=a[i][j];k++)
                {
                    if(a[i][j]%k==0)    
                        d++;
                }
                if(d==2)
                System.out.printf("%3d",a[i][j]);
            }
            
        } 
    }
        
    public static void main(String[] args) {
        int [][]a= new int [3][4];
        System.out.println("Nhap day: ");
        nhap(a);
        System.out.println("So nguyen to co trong day: ");
        snt(a);
    }
    
}
