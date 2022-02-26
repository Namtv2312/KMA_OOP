/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BTVN.Bai2;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class NhanVien {
    protected String Hoten;
    protected int tuoi;
    protected String gioiTinh;
    protected int soDienthoai;
    protected String diaChi;
    protected int chieuCao;
    protected int canNang;
    
 public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ho ten nhan vien");
        Hoten=sc.nextLine();
        System.out.println("Nhap tuoi nhan vien");
        tuoi=sc.nextInt();
        System.out.println("Nhap gioi tinh nhan vien");
        sc.nextLine();
        gioiTinh=sc.nextLine();
        System.out.println("Nhap so dien thoai nhan vien");
        soDienthoai=sc.nextInt();
        System.out.println("Nhap dia chi nhan vien");
        sc.nextLine();
        diaChi=sc.nextLine();
        System.out.println("Nhap chieu cao nhan vien");
        chieuCao=sc.nextInt();
        System.out.println("Nhap can nang nhan vien");
        canNang=sc.nextInt();
    }
 public void xuat()
    {
        System.out.println(toString());
    }
 public NhanVien() {
    }
      @Override
    public String toString() {
        return "NhanVien{" + "Hoten=" + Hoten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", soDienthoai=" + soDienthoai + ", diaChi=" + diaChi + ", chieuCao=" + chieuCao + ", canNang=" + canNang + '}';
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoDienthoai() {
        return soDienthoai;
    }

    public void setSoDienthoai(int soDienthoai) {
        this.soDienthoai = soDienthoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }
     
     
}
