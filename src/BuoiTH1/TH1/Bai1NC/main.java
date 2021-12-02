/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1.TH1.Bai1NC;

import static java.lang.String.valueOf;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main {

    private static int soCanh;
    private static int chieudai;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so canh::");
        soCanh = sc.nextInt();
        System.out.println("Nhap chieu dai moi canh( g/s da giac deu:");
        chieudai = sc.nextInt();
        System.out.println("Thong tin da giac: ");
        System.out.println("So canh" + valueOf(soCanh));
        System.out.println("chieu dai moi canh:" + valueOf(chieudai));
        System.out.println("Chu vi :" + valueOf(soCanh * chieudai));
    }
}
