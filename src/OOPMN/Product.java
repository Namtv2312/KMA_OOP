/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPMN;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class Product {

    public String maSanpham;
    public String tenSanpham;
    public Double donGia;
    public Date ngaySanxuat;
    Scanner sc = new Scanner(System.in);

    public Product() {
    }

    public void setALL(String maSanpham, String tenSanpham, Double donGia, Date ngaySanxuat) {
        this.maSanpham = maSanpham;
        this.tenSanpham = tenSanpham;
        this.donGia = donGia;
        this.ngaySanxuat = ngaySanxuat;
    }

    public Product(String maSanpham, String tenSanpham, Double donGia, Date ngaySanxuat) {
        this.maSanpham = maSanpham;
        this.tenSanpham = tenSanpham;
        this.donGia = donGia;
        this.ngaySanxuat = ngaySanxuat;
    }

    public void nhapmaSP() {
        System.out.println("Nhap ma san pham: ");
        maSanpham = sc.nextLine();
    }

    public void nhaptenSP() {
        System.out.println("Nhap ten san pham: ");
        tenSanpham = sc.nextLine();
    }

    public void nhapdongiaSP() {
        while (true) {

            try {
                System.out.println("Nhap don gia: ");
                donGia = sc.nextDouble();
                if (donGia <= 0) {
                    System.out.println("Don gia phai lon hon 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Nhap type double");
                sc.nextLine();
            }

        }
        sc.nextLine();
    }

    public void nhapngaySX() {

        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        while (Boolean.TRUE) {
            try {
                System.out.println("Nhap ngay san xuat: ");
                String tmp = sc.nextLine();
                ngaySanxuat = fm.parse(tmp);
                break;
            } catch (ParseException ex) {
                System.out.println("Ngay phai dung dinh dang dd/MM/yyyy");
            }
        }
    }

    public void xuatSP() {
        System.out.println("MA SP: " + maSanpham);
        System.out.println("TEN SP: " + tenSanpham);
        System.out.println("DON GIA: " + donGia);
        //DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("NGAY SX:" + (new SimpleDateFormat("dd/MM/yyyy")).format(ngaySanxuat));
       
    }
}
