/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH_END.Exception.QLKH;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class KhachHang {
    String hoten;
    int tuoi;
    String diachi;
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap tuoi ");
        tuoi= sc.nextInt();sc.next();
        System.out.println("Nhap dia chi: ");
        diachi= sc.nextLine();
    }
    public void xuat()
    {
        System.out.println("Ho ten khach hang: "+ hoten);
        System.out.println("Tuoi khach hang :"+ tuoi);
        System.out.println("Dia chi khach hang: "+diachi);
    }
}
