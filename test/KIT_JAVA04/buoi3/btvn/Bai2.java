/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.btvn;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {
    static Scanner sc= new Scanner(System.in);
    static void nhap(int []a, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]= ",i+1);
            a[i]= sc.nextInt();
        }
    }
    static int tong(int []a, int n)
    {
        int s=0;
        for(int i=0;i<n;i++)
        {
           s+=a[i]; 
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        int n=sc.nextInt();
        int []a= new int[n];
        while(true){
        System.out.printf("\n%30s|______________Menu__________________|\n","");
        System.out.printf("%30s|1. Tong                               |\n","");
        System.out.printf("%30s|2. Exit                               |\n","");
        System.out.printf("%30s Moi ban chon chuc nang             \n","");
        int chon= sc.nextInt();
        switch(chon)
        {
            case 1:
                System.out.println("Nhap day:");
                nhap(a,n);
                System.out.printf("Tong cac phan tu thuoc mang la: %d",tong(a,n));               
            break;
            case 2: exit(0);
        }
    }
    }
}
