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
public class QLKhachHang {

    int soKH;
    KhachHang[] mkh;

    public QLKhachHang() {
    }

    public QLKhachHang(int soKH) {
        this.soKH = soKH;
    }
    public Scanner sc = new Scanner(System.in);

    public void nhapKH() {
        System.out.println("Nhap so khach hang");

        try {
            soKH = sc.nextInt();
            if (soKH < 0) {
                throw new java.lang.Error("So khach hang phai lon hon 0");
            }
        } catch (Exception ex) {
            System.out.println("So khach hang INT & \n" + ex.getMessage());
        } catch (Error ex) {
            System.out.println(ex.getMessage());
        }
        this.soKH = soKH;
        this.mkh = new KhachHang[soKH];
        for (int i = 0; i < soKH; i++) {
            System.out.println("------------------------");
            System.out.println(" * Khach hang thu " + i);
            this.mkh[i] = new KhachHang();
            this.mkh[i].nhap();
        }
    }

    public void inMangKH() {
        System.out.println("\n\nIN MANG KHACH HANG\n");
        for (int i = 0; i < this.soKH; i++) {
            System.out.println("------------------------");
            System.out.println(" + Khach hang thu " + i);
            this.mkh[i].xuat();
        }
        System.out.println("========================");
    }

    public void timTenHo() {
        String ten;
        int n = this.soKH;
        boolean danhDau[];
        danhDau = new boolean[n];
        System.out.print("\n\n -->>> Nhap Ten hoac Ho can tim : ");
        ten = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (this.mkh[i].hoten.lastIndexOf(ten) >= 0) {
                danhDau[i] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (danhDau[i]) {
                System.out.println();
                this.mkh[i].xuat();
            }
        }
    }

    public void timDiachi() {
        String dchi;
        int n = this.soKH;
        boolean danhDau[];
        danhDau = new boolean[n];
        System.out.print("\n\n -->>> Nhap Dia Chi can tim : ");
        dchi = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (this.mkh[i].diachi.lastIndexOf(dchi) >= 0) {
                danhDau[i] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (danhDau[i]) {
                System.out.println();
                this.mkh[i].xuat();
            }
        }

    }

    public static void main(String[] args) {
        QLKhachHang q = new QLKhachHang();
        q.nhapKH();
        q.inMangKH();
        q.timDiachi();
        q.timDiachi();

    }
}
