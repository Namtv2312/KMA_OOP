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
public class Bai4 {
    static Scanner sc=new Scanner(System.in);
    static void nhap(int []a, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]= ",i+1);
            a[i]= sc.nextInt();
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử mảng: ");
        int n= sc.nextInt();
        int []a= new int[n];
        System.out.println("Nhập dãy số: ");
        nhap(a,n);
        System.out.println("Nhap k: ");
        int k= sc.nextInt();
        int d=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]== k)
                d++;
        }
        if(d==0)
            System.out.println("Không có số k nào trong dãy");
        else
        System.out.printf("Có %d số k trong dãy vừa nhập",d);
    }
    
}
