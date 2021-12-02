/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1.TH1.Bai3;

import static java.lang.String.valueOf;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main {

    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;

    public static void main(String[] args) {
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b:");
        b = sc.nextInt();
        System.out.println("Tong a b: " + valueOf(a + b));
        System.out.println("Hieu a b: " + valueOf(a - b));

    }
}
