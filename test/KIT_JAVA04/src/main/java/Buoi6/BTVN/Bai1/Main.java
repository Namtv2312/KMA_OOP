/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BTVN.Bai1;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {
    public static void main(String[] args) {
        QuanLyThe quanLyThuVien = new QuanLyThe();
        while (true)
        {
            quanLyThuVien.menu();
            int chon  = new Scanner(System.in).nextInt();
            switch (chon)
            {
                case 1: quanLyThuVien.nhapTreem();break;
                case 2: quanLyThuVien.nhapNguoilon();break;
                case 3: quanLyThuVien.xuatTreem();break;
                case 4: quanLyThuVien.xuatNl();break;
                case 5: quanLyThuVien.tongtien();break;
                case 0: return;
                default:
                    System.out.println("Bạn chọn sai rồi");
            }
        }


    }
    }

