/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.Trenlop.Bai1;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {
    public static void main(String[] args) {
        QuanLyTaiLieu tailieulst = new QuanLyTaiLieu();
        while (true) {
            tailieulst.menu();
            int chon = new Scanner(System.in).nextInt();
            switch(chon)
            {
                case 1: tailieulst.nhap();
                break;
                case 2: tailieulst.xuat();
                break;
                case 3: tailieulst.xuattype();
                break;
                case 0: exit(0);
            
            }
        }
    }
}   
