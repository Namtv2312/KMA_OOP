/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4.trenlop.Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanSo {
        //thuoc tinh
        int tuso ;
        int mauso;   
        
        //phuong thuc
        void nhap()
        {
            Scanner sc = new Scanner(System.in);
             System.out.println("Nhap tu so");
        tuso= sc.nextInt();
        System.out.println("Nhap mau so: ");
        mauso= sc.nextInt();
        }
       int ucln(int a, int b)
    {
        if(b==0)
            return a;
        return ucln(b,a%b);
    }
    void xuat()
    {
        System.out.println(tuso +"/"+ mauso);
    }
    
     void  rutgon(int tu, int mau)
     {
         System.out.println(tu/ucln(tu, mau) +"/"+ mau/ucln(tu, mau));
     }
     void cong(PhanSo ps)
    {
         PhanSo cong= new PhanSo();
         cong.tuso= this.tuso *ps.mauso + ps.tuso*this.mauso;
         cong.mauso= this.mauso*ps.mauso;
         cong.rutgon(cong.tuso, cong.mauso);
    }
    void tru(PhanSo ps)
    {
         PhanSo tru= new PhanSo();
         tru.tuso= this.tuso *ps.mauso - ps.tuso*this.mauso;
         tru.mauso= this.mauso*ps.mauso;
         tru.rutgon(tru.tuso, tru.mauso);
    }
     void nhan(PhanSo ps)
    {
         PhanSo nhan= new PhanSo();
         nhan.tuso= this.tuso *ps.tuso;
         nhan.mauso= this.mauso*ps.mauso;
         nhan.rutgon(nhan.tuso, nhan.mauso);
    }    
     void chia(PhanSo ps)
    {
         PhanSo chia= new PhanSo();
         chia.tuso= this.tuso *ps.mauso ;
         chia.mauso= this.mauso*ps.tuso;
         chia.rutgon(chia.tuso, chia.mauso);
    }
     void thapphan()
     {
         System.out.printf("%f",(float)tuso/mauso);
     }
}
