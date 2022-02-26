/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KITbai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class DanhsachHs {
    ArrayList<HocSinh> Hocsinhlst = new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    public void menu()
    {
        System.out.println("\t\t\tQUẢN LÝ HOC SINH");
        System.out.println("1. Them hoc sinh moi");
        System.out.println("2. Hien thi toan bo hoc sinh");
        System.out.println("3. Cho biet so luong cac hoc sinh que o Ha Noi");
        System.out.println("4. Sap xep hoc sinh theo ho ten tang dan");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }

    public DanhsachHs() {
        Hocsinhlst = new ArrayList<>();
    }
    
    public void them()
    {
        String chon= "k";
        while (true){
            if(chon.equalsIgnoreCase("N"))
                break;
        System.out.println("Nhap thong tin  hoc sinh them vao: ");
        HocSinh tmp = new HocSinh();
        tmp.nhap();
        Hocsinhlst.add(tmp);
            System.out.println("Co them nua khong");
            chon= sc.nextLine();
        }
    }
    public void xuatALL()
    {
        for(int i= 0; i< Hocsinhlst.size();i++)
        {
            Hocsinhlst.get(i).xuat();
        }
            
    }
    public void xuatyc3()
    {
        System.out.println("Nhap tuoi hoc sinh can hien thi");
        int n= sc.nextInt();
       int  t=2020-n;
        HocSinh tmp = new HocSinh();
        for(int i=0;i< Hocsinhlst.size();i++)
        {
               if( Hocsinhlst.get(i).getNamSinh() == t)
            Hocsinhlst.get(i).xuat();
        }
            
        
     
    }
    public void xuatyc4()
    {
        for(int i=0;i<Hocsinhlst.size();i++)
        {
            if(Hocsinhlst.get(i).getQueQuan().equalsIgnoreCase("Ha Noi"))
                Hocsinhlst.get(i).xuat();
        }
            
    }
    
}
