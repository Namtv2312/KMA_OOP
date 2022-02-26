/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.Trenlop.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class QuanLyTaiLieu {
    //quan li bao sach ,,
    ArrayList<TailLieu> tailieulst= new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void menu()
    {
        System.out.println("\t\t\tQUẢN LÝ TAI LIEU");
        System.out.println("1. Nhap thong tin ve cac tai lieu");
        System.out.println("2. Hien thi thong tin ve cac tai lieu");
        System.out.println("3. Xuất ra man hinh cac tai lieu theo loai");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }

    public QuanLyTaiLieu() {
    }
    public void nhap()
    {
        System.out.println("Nhap loai tai lieu can dien thong tin: ");
        String type = sc.nextLine().toLowerCase();
        TailLieu tmp= null;
        switch(type)
        {
            case "sach": tmp = new Sach(); break;
            case "tapchi": tmp= new TapChi();break;
            case "bao": tmp=new Bao();break;
            default:System.out.println("Nhap lai di");
        }
        tmp.nhap();
        tailieulst.add(tmp);
    }
        public void xuat()
         {
             System.out.println("/t/t Danh sach tai lieu");
             for(int i=0;i<tailieulst.size();i++)
             {
                 tailieulst.get(i).xuat();  
             }
         }
        public void xuattype()
        {
            System.out.println("Nhap loai tai lieu (sach/tap chi/bao)");
            String type= sc.nextLine().toLowerCase();
            if(type.equalsIgnoreCase("sach"))
            {
                for(int i=0;i<tailieulst.size();i++)
                {
                    if(tailieulst.get(i) instanceof Sach== true)
                        tailieulst.get(i).xuat();
                }
            }   
            if(type.equalsIgnoreCase("tap chi"))
            {
                for(int i=0;i<tailieulst.size();i++)
                {
                    if(tailieulst.get(i) instanceof TapChi== true)
                        tailieulst.get(i).xuat();
                }
            }   
            if(type.equalsIgnoreCase("bao"))
            {
                for(int i=0;i<tailieulst.size();i++)
                {
                    if(tailieulst.get(i) instanceof Bao== true)
                        tailieulst.get(i).xuat();
                }
            }   
        }
}
        
        

