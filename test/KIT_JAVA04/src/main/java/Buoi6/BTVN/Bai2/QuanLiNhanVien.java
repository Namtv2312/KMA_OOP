/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BTVN.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class QuanLiNhanVien {

    Scanner sc = new Scanner(System.in);
    private ArrayList<NhanVien> nhanVienlst = new ArrayList<>();
    private ArrayList<SuaOngNuoc> suaOngNuoclst = new ArrayList<>();
    private ArrayList<XeOm> xeOmlst = new ArrayList<>();
    private ArrayList<Shiper> shiperlst = new ArrayList<>();

    public void Menu() {
        System.out.println("\t \t \t Quản lý hệ thống ");
        System.out.println("1.Nhập thợ sửa ống nước");
        System.out.println("2.Xuất thowr sửa ống nước");
        System.out.println("3.nhập shipper");
        System.out.println("4.Xuất shipper");
        System.out.println("5.nhập NVXeOm");
        System.out.println("6.Xuất NVXeOm");
        System.out.println("7.tính tiền ");
        System.out.println("8.Xuat toan bo nhan vien");
        System.out.println("9.Thống kê lương giảm dần`");
        System.out.println("0.exit");
        System.out.println("Mời bạn chọn ");
    }

    public void xuatALL() {
        for (NhanVien tmp : nhanVienlst) {
            tmp.xuat();
        }
    }

    public QuanLiNhanVien() {
        this.nhanVienlst = new ArrayList<>();
    }

    public void nhapSuaongnuoc() {
        System.out.println("Nhap so tho :");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println("Nhap tho sua so" + i + 1);
            SuaOngNuoc tmp = new SuaOngNuoc();
            tmp.nhap();
            nhanVienlst.add(tmp);
            suaOngNuoclst.add(tmp);
        }
    }

    public void nhapShiper() {
        System.out.println("Nhap so shiper :");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println("Nhap shiper so" + i + 1);
            Shiper tmp = new Shiper();
            tmp.nhap();
            nhanVienlst.add(tmp);
            shiperlst.add(tmp);
            shiperlst.add(tmp);
        }
    }

    public void xeOm() {
        System.out.println("Nhap so xe om :");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println("Nhap xe om so" + i + 1);
            XeOm tmp = new XeOm();
            tmp.nhap();
            nhanVienlst.add(tmp);
        }
    }

    public void xuatOngnuoc() {
        for (int i = 0; i < nhanVienlst.size(); i++) {
            if (nhanVienlst.get(i) instanceof SuaOngNuoc) {
                nhanVienlst.get(i).xuat();
            }
        }
    }

    public void xuatxeom() {
        for (int i = 0; i < nhanVienlst.size(); i++) {
            if (nhanVienlst.get(i) instanceof XeOm) {
                nhanVienlst.get(i).xuat();
            }
        }
    }

    public void shiper() {
        for (int i = 0; i < nhanVienlst.size(); i++) {
            if (nhanVienlst.get(i) instanceof Shiper) {
                nhanVienlst.get(i).xuat();
            }
        }
    }

    public void tongtien() {
        int tongtien = 0;
     
        for (int i = 0; i < suaOngNuoclst.size(); i++) {
            tongtien += suaOngNuoclst.get(i).tinhtienLuong();
        }

        for (int i = 0; i < xeOmlst.size(); i++) {
            tongtien += xeOmlst.get(i).tinhtienluong();
        }

        for (int i = 0; i < shiperlst.size(); i++) {
            tongtien += shiperlst.get(i).tinhtienluong();
        }
        System.out.println("Tong tien" + tongtien);
    }

    public void thongKeLuongGiamDan() {
        System.out.println("\t\tNhanVienOngNUOc");
        // sắp xếp mảng giảm dần theo lương
        SapXepLuongNVOngNuocGiamDan();
        for (SuaOngNuoc tmp : suaOngNuoclst) {

            tmp.xuat();
        }
        System.out.println("\t\tNhanVienXeOm");
        // sắp xếp mảng giảm dần theo lương
        SapXepLuongNVXeOmGiamDan();
        for (XeOm tmp : xeOmlst) // xuat danh sach nv ong nuoc
        {

            tmp.xuat();
        }
        System.out.println("\t\tNhanVienShipper");
        // sắp xếp mảng giảm dần theo lương
        SapXepLuongShipperGiamDan();
        for (Shiper tmp : shiperlst) // xuat danh sach nv ong nuoc
        {

            tmp.xuat();
        }
    }

    private void SapXepLuongNVOngNuocGiamDan() {
        for (int i = 0; i < suaOngNuoclst.size() - 1; i++) {
            for (int j = i + 1; j < suaOngNuoclst.size(); j++) {
                if (suaOngNuoclst.get(i).tinhtienLuong() < suaOngNuoclst.get(j).tinhtienLuong()) {
                    SuaOngNuoc tmp;
                    tmp = suaOngNuoclst.get(i);//tmp = a;
                    suaOngNuoclst.set(i, suaOngNuoclst.get(j)); //a=b;
                    suaOngNuoclst.set(j, tmp); //b=tmp;
                }
            }
        }
    }

    private void SapXepLuongNVXeOmGiamDan() {
        for (int i = 0; i < xeOmlst.size() - 1; i++) {
            for (int j = i + 1; j < xeOmlst.size(); j++) {
                if (xeOmlst.get(i).tinhtienluong() < xeOmlst.get(j).tinhtienluong()) {
                    XeOm tmp;
                    tmp = xeOmlst.get(i);//tmp = a;
                    xeOmlst.set(i, xeOmlst.get(j)); //a=b;
                    xeOmlst.set(j, tmp); //b=tmp;
                }
            }
        }
    }

    private void SapXepLuongShipperGiamDan() {
        for (int i = 0; i < shiperlst.size() - 1; i++) {
            for (int j = i + 1; j < shiperlst.size(); j++) {
                if (shiperlst.get(i).tinhtienluong() < shiperlst.get(j).tinhtienluong()) {
                    Shiper tmp;
                    tmp = shiperlst.get(i);//tmp = a;
                    shiperlst.set(i, shiperlst.get(j)); //a=b;
                    shiperlst.set(j, tmp); //b=tmp;
                }
            }
        }
    }

}
