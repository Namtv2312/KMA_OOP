/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BTVN.Bai2;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {

    public static void main(String[] args) {
        QuanLiNhanVien manageEX = new QuanLiNhanVien();
        Scanner sc = new Scanner(System.in);
        while (true) {
            manageEX.Menu();

            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    manageEX.nhapSuaongnuoc();
                    break;
                case 2:
                    manageEX.xuatOngnuoc();
                    break;
                case 3:
                    manageEX.nhapShiper();
                    break;
                case 4:
                    manageEX.shiper();
                case 5:
                    manageEX.xeOm();
                    break;
                case 6:
                    manageEX.xuatxeom();
                    break;
                case 7:
                    manageEX.tongtien();
                    break;
                case 8:
                    manageEX.xuatALL();
                    break;
                case 9:
                    manageEX.thongKeLuongGiamDan();
                    break;

            }
        }

    }
}
