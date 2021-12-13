/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Management {

    ArrayList<Employee> Emlst = new ArrayList<>();
    ArrayList<Student> Stlst = new ArrayList<>();
    ArrayList<Customer> Cuslst = new ArrayList<>();

    public void menu() {
        System.out.println("\t\t\tQUẢN LÝ NGƯỜI");
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. Nhập thông tin nhân viên");
        System.out.println("3. Nhập thông tin khách hàng");
        System.out.println("4. Xuất thông tin sinh viên");
        System.out.println("5. Xuất thông tin nhân viên");

        System.out.println("6. Xuất thông tin khách hàng");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }

    public Management() {
        Emlst = new ArrayList<>();
        Stlst = new ArrayList<>();
        Cuslst = new ArrayList<>();
    }

    public void nhapSinhvien() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("Nhap sinh vien thu" + (++i));
            Student tmp = new Student();
            tmp.nhap();
            Stlst.add(tmp);
            System.out.println("Co nhap nua khong(Y/N)");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void nhapNhanvien() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("Nhap nhan vien thu" + (++i));
            Employee tmp = new Employee();
            tmp.nhap();
            Emlst.add(tmp);
            System.out.println("Co nhap nua khong(Y/N)");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void nhapKhachhang() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("Nhap khach hang thu" + (++i));
            Customer tmp = new Customer();
            tmp.nhap();
            Cuslst.add(tmp);
            System.out.println("Co nhap nua khong(Y/N)");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuatHocsinh() {
        System.out.println("Danh sach hoc sinh");
        for (int i = 0; i < Stlst.size(); i++) {
            System.out.print(i + 1 + ".");
            System.out.println(Stlst.get(i).toString());
        }

    }
    public void xuatNhanvien() {
        System.out.println("Danh sach nhan vien");
        for (int i = 0; i < Emlst.size(); i++) {
            System.out.print(i + 1 + ".");
            System.out.println(Emlst.get(i).toString());
        }

    }
    public void xuatKhachhang() {
        System.out.println("Danh sach khach hang");
        for (int i = 0; i < Cuslst.size(); i++) {
            System.out.print(i + 1 + ".");
            System.out.println(Cuslst.get(i).toString());
        }

    }
    public void xoa1Student(String hoten){
        for (int i = 0; i < Stlst.size(); i++) {
            if(Stlst.get(i).hoten.equalsIgnoreCase(hoten)) Stlst.remove(i);
        }
    }
    public void xoa1Emp(String hoten){
        for (int i = 0; i < Emlst.size(); i++) {
            if(Emlst.get(i).hoten.equalsIgnoreCase(hoten)) Emlst.remove(i);
        }
    }
    public void xoa1Custom(String hoten){
        for (int i = 0; i < Cuslst.size(); i++) {
            if(Cuslst.get(i).hoten.equalsIgnoreCase(hoten)) Cuslst.remove(i);
        }
    }
    public void sort(ArrayList<Customer> list){
        list.sort((o1,o2) -> o1.hoten.compareTo(o2.hoten)) ;
    }

}
