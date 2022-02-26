/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Dahinh.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class QuanliNV {
    ArrayList<NhanVien> nhanvienLst = new ArrayList<>();
    NhanVien suaongNuoc = new SuaOngNuoc();
    NhanVien giaoHang= new GiaoHang();
    NhanVien xeOm= new XeOm();
    Scanner sc= new Scanner(System.in);
    
    public void menu()
    {
          System.out.println("\t \t \t Quản lý hệ thống ");
        System.out.println("1.Nhập nhan vien");
        System.out.println("2. Xuat nhan vien");
        System.out.println("Mời bạn chọn ");
    }
    public void nhap()
    {
        System.out.println("Nhap so tho sua ong nuoc");
        int so=sc.nextInt();
        for(int i=0;i<so;i++)
        {
            System.out.println("Nhap thong tin tho so"+i+1);
            suaongNuoc.nhap();
        }
          System.out.println("Nhap so nguoi giao hang");
        int so0=sc.nextInt();
        for(int i=0;i<so0;i++)
        {
            System.out.println("Nhap thong tin nguoi thu"+i+1);
           giaoHang.nhap();
        }
          System.out.println("Nhap so Xe om");
        int so00=sc.nextInt();
        for(int i=0;i<so00;i++)
        {
            System.out.println("Nhap thong tin xe om so"+i+1);
          xeOm.nhap();
        }
        
    }
    public void xuat()
    {
        System.out.println("Danh sach tho sua");
        for(int i=0;i<nhanvienLst.size();i++)
        {
            if(nhanvienLst.get(i) instanceof SuaOngNuoc)
               nhanvienLst.get(i).xuat();
        }
        System.out.println("Danh sach giao hang");
        for(int i=0;i<nhanvienLst.size();i++)
        {
            if(nhanvienLst.get(i) instanceof GiaoHang)
                nhanvienLst.get(i).xuat();
        }
        System.out.println("Danh sach xe om");
        for(int i=0;i<nhanvienLst.size();i++)
        {
            if(nhanvienLst.get(i) instanceof XeOm)
               nhanvienLst.get(i).xuat();
        }
    }
    public void tongtien(){
            int luongSON=0,luongGH=0,luongXO=0;
    
        
        for(int i=0;i<nhanvienLst.size();i++)
        {
            if(nhanvienLst.get(i) instanceof SuaOngNuoc)
                luongSON+=suaongNuoc.tienluong();
        }
        
        for(int i=0;i<nhanvienLst.size();i++)
        {
            if(nhanvienLst.get(i) instanceof GiaoHang)
               luongGH+= giaoHang.tienluong();
        }
      
        for(int i=0;i<nhanvienLst.size();i++)
        {
            if(nhanvienLst.get(i) instanceof XeOm)
             luongXO+=xeOm.tienluong();
        }
        System.out.println("Luong hang thang cua xe om"+luongXO);
        System.out.println("Luong hang thang cua giao hang"+luongGH);
        System.out.println("Luong hang thang cua sua ong nuoc"+luongSON);
    
    
    
}
    public void sapxep()
    {
        System.out.println("Danh sach xe om");
        
    }
    
}
