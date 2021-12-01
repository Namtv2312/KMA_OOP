/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1.TH2.Bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main {
    static Scanner sc = new Scanner(System.in);
    public static int n;
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen n: ");
        n= sc.nextInt();
        System.out.println("Binary: "+ Integer.toBinaryString(n));
    }
}
