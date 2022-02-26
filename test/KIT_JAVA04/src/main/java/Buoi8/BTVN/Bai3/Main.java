/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.BTVN.Bai3;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {
    public static void main(String[] args) {
        
    int chon= 0;
    QuanLyPhuongTIien mntf= new QuanLyPhuongTIien();
    Scanner sc= new Scanner(System.in);
    while(true)
    {
        System.out.println("1. Nhap dang ki phuong tien");
        System.out.println("2. Tim xe theo mau");
        switch(chon)
        {
            case 1: mntf.nhap();break;
            case 2: mntf.timmau();break;
            default:System.out.println("Nhap lai di");
        }
    }
}
}
