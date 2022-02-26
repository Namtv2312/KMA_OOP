/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BTVN.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class QuanLyThe {
    ArrayList<Treem> Treemlst = new ArrayList<>();
    ArrayList<NguoiLon> Nguoilonlst = new ArrayList<>();

    public void menu()
    {
        System.out.println("\t\t\tQUẢN LÝ THƯ VIỆN");
        System.out.println("1. Nhập độc giả trẻ em");
        System.out.println("2. Nhập độc giả người lớn");
        System.out.println("3. Xuất độc giả trẻ em");
        System.out.println("4. Xuất độc giả người lớn");
        System.out.println("5. Tính tổng tiền làm thẻ");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }

    public QuanLyThe() {
        Treemlst = new ArrayList<>();
        Nguoilonlst= new ArrayList<>();
    }
    public void nhapNguoilon()
    {
        Scanner sc= new Scanner(System.in);
        int i=0;
        while (true)
        {
            System.out.println("Nhap nguoi lon thu"+(++i));
            NguoiLon tmp= new NguoiLon();
            tmp.nhap();
            Nguoilonlst.add(tmp);
            System.out.println("Co nhap nua khong(Y/N)");
            String s= sc.nextLine();
            if(s.equalsIgnoreCase("N"))
                break;
        }   
    }
    public void nhapTreem()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tre em: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Treem tmp = new Treem();
            tmp.nhap();
            Treemlst.add(tmp);
        }
            
    }
    public void xuatTreem()
    {
        System.out.println("Danh sach doc gia tre em");
        for(int i=0;i<Treemlst.size();i++)
        {
            System.out.print(i+1+".");
            Treemlst.get(i).xuat();
        }
            
    }
    public void xuatNl()
    {
        System.out.println("Danh sach doc gia nguoi lon");
        int i=1;
        Nguoilonlst.forEach(tmp -> {
            System.out.printf("%d.",i);
            tmp.xuat();
        });
            
    }
     
    public void tongtien()
    {
        int tongtien=0;
        for(Treem tmp :Treemlst)
        {
            tongtien+=tmp.tienlamathe();
        }
        for(NguoiLon tmp : Nguoilonlst)
        {
            tongtien+=tmp.tienlamthe();
        }
        System.out.println("Tong so tien lam the: "+tongtien);
            
    }
        
        

    
   
    
}
