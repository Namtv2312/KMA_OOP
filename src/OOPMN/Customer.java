/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPMN;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Customer {

    public String maKhachhang;
    public String tenKhachhang;
    public int namSinh;
    public String diaChi;
    Scanner sc = new Scanner(System.in);

    public Customer() {
    }

    public Customer(String maKhachhang, String tenKhachhang, int namSinh, String diaChi) {
        this.maKhachhang = maKhachhang;
        this.tenKhachhang = tenKhachhang;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public void setALL(String maKhachhang, String tenKhachhang, int namSinh, String diaChi) {
        this.maKhachhang = maKhachhang;
        this.tenKhachhang = tenKhachhang;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public void nhapmaKH() {
        System.out.println("Nhap ma khach hang: ");

        maKhachhang = sc.nextLine();
    }

    public void nhaptenKH() {
        System.out.println("Nhap ten khach hang: ");
        tenKhachhang = sc.nextLine();
    }

    public void nhapnamsinhKH() {
        while (true) {

            try {
                System.out.println("Nhap nam sinh khach hang: ");
                namSinh = sc.nextInt();
                if (namSinh <= 0) {
                    System.out.println("Nam sinh phai lon hon 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Nhap type int");
                sc.nextLine();
            }

        }
        sc.nextLine();
    }

    public void nhapdcKH() {
        System.out.println("Nhap dia chi khach hang; ");
        diaChi = sc.nextLine();

    }

    public void xuatKH() {
        System.out.println("MA KHACH HANG" + maKhachhang);
        System.out.println("TEN KHACH HANG: " + tenKhachhang);
        System.out.println("NAM SINH: " + namSinh);
        System.out.println("DIA CHI: " + diaChi);
    }
}
