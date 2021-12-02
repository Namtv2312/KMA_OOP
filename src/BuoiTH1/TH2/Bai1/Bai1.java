/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1.TH2.Bai1;

import com.sun.org.apache.xerces.internal.impl.xs.ElementPSVImpl;
import static java.lang.String.valueOf;
import java.util.Scanner;
import sun.security.ec.ECPublicKeyImpl;

/**
 *
 * @author Administrator
 */
public class Bai1 {
    static int i;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap I:");
        i= sc.nextInt();
        System.out.println("Gia tri tang :"+ valueOf(i+1)+"\nGia tri giam i: "+valueOf(i-1));
    }
}
