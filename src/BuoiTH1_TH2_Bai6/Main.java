/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1_TH2_Bai6;

import static java.lang.String.valueOf;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        TinhToan t1 = new TinhToan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        while (true) {
            System.out.printf("\n%30s|__________________Menu_____________|\n", "");
            System.out.printf("%30s|1. Tong day 1                      |\n", "");
            System.out.printf("%30s|2. Tong day 2                      |\n", "");
            System.out.printf("%30s|3. Tong day 3                      |\n", "");
            System.out.printf("%30s|3. Tong day 4                      |\n", "");
            System.out.printf("%30s|3. Tong day nang cao               |\n", "");
            System.out.printf("%30s Moi ban chon chuc nang             \n", "");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Tong A= " + valueOf(t1.tongA(n)));
                    break;
                case 2:
                    System.out.println("Tong giai thua: " + valueOf(t1.tongB(n)));

                    break;
                case 3:
                    System.out.println("Tong 3: " + valueOf(t1.tongC(n)));
                    break;
                case 4:
                    System.out.println("Tong 4: " + (t1.tongD(n)));
                    break;
                case 5:
                    System.out.println("Tong Nang cao :" + valueOf(t1.tongNC(n, 1, 1)));
                    break;
                case 6:
                    exit(0);
                    break;
            }
        }
    }
}
