/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        Management mg1 = new Management();
        while (true) {
            mg1.menu();
            int chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                    mg1.nhapSinhvien();
                    break;
                case 2:
                    mg1.nhapNhanvien();
                    break;
                case 3:
                    mg1.nhapKhachhang();
                    break;
                case 4:
                    mg1.xuatHocsinh();break;
                case 5:
                    mg1.xuatNhanvien();break;
                    case 6: mg1.xuatKhachhang(); break;
                    case 7 : mg1.xoa1Custom("nam"); break;
                    case 8: mg1.xoa1Emp(""); break;
                    case 9: mg1.xoa1Custom(""); break;
                    case 10: mg1.sort(mg1.Cuslst);break;
                case 0:
                    return;
                default:
                    System.out.println("Bạn chọn sai rồi");
            }
        }

    }
}
