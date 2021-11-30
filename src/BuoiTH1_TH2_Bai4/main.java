/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1_TH2_Bai4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main {
    public static boolean isPrime(int m){
        for (int i = 2; i <= sqrt(m); i++) {
    if (m % i == 0)
        return false;
}
return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon n: ");
        for (int j = 2; j <=n; j++) {
   if (isPrime(j)) {
       System.out.println(j);
   }
}
    }
}
