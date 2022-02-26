/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Dahinh.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class QuanLy {
    DocGia tm = new NguoiLon();
    Scanner sc= new Scanner(System.in);
    DocGia tmp = new TreEm();
    ArrayList<DocGia> docgiaLst = new ArrayList<>();
public void nhap()
{
    System.out.println("Nhap so doc gia tre em: ");
   int so= sc.nextInt();
   for(int i=0;i<so;i++)
   {
       System.out.println("Nhap thong tin doc gia tre em thu"+i+1);
      
       tmp.nhap();
       docgiaLst.add(tmp);
   }
   System.out.println("Nhap so doc gia nguoi lon: ");
   int s= sc.nextInt();
   for(int i=0;i<s;i++)
   {
       System.out.println("Nhap thong tin doc gia nguoi lon thu"+i+1);
      
       tm.nhap();
       docgiaLst.add(tm);
   }
       
}
public void xuattreem()
{
    for(int i=0;i<docgiaLst.size();i++)
    {
        if(docgiaLst.get(i) instanceof  TreEm)
            tmp.xuat();
    }
        
}
  public void xuatnguoilon()
  {
      for(int i=0;i<docgiaLst.size();i++)
    {
        if(docgiaLst.get(i) instanceof  NguoiLon )
            tm.xuat();
    }
  }
  public void tongtien(){
      int tien=0;
      for(int i=0;i<docgiaLst.size();i++)
      {
          if(docgiaLst.get(i) instanceof  NguoiLon)
              tien+=tm.tienlamthe();
          else if(docgiaLst.get(i) instanceof  TreEm)
              tien+=tmp.tienlamthe();
      }
      System.out.println("Tong tien lam the"+tien);
          
  }

    public QuanLy() {
    }
      
    
     public void menu()
    {
        System.out.println("\t\t\tQUẢN LÝ THƯ VIỆN");
        System.out.println("1. Nhập độc giả");
        System.out.println("2. Xuất độc giả trẻ em");
        System.out.println("3. Xuất độc giả người lớn");
        System.out.println("4. Tính tổng tiền làm thẻ");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }
}

