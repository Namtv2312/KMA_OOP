/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1.TH2.Bai4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main_b_while {

    public static boolean isPrime(int m) {

        int i = 2;
        while (i <= sqrt(m)) {
            if (m % i++ == 0) {

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m: ");
        m = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon m: ");
        int j = 2;
        while (j <= m) {
            if (isPrime(j++)) {
                System.out.println(j - 1);
            }
        }
    }
}
