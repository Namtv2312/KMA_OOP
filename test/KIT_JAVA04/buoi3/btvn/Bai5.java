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
public class Bai5 {
    static Scanner sc=new Scanner(System.in);
    static void nhap(int []a, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]= ",i+1);
            a[i]=sc.nextInt();
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử: ");
        int n=sc.nextInt();
        int []a= new int[n];
        System.out.println("Nhập dãy só: ");
        nhap(a,n);
        System.out.println("Nhập vị trí k: ");
        int k=sc.nextInt();
        System.out.printf("Phần tử tại vị trí k trong mảng: ");
        for(int i=0;i<n;i++)
        {
            if(i==k-1)
                System.out.printf("%3d",a[i]);
        }       
    }
    
}
