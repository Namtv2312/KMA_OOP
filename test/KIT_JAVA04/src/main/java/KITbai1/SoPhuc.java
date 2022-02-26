/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KITbai1;

import java.lang.ref.PhantomReference;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class SoPhuc {
    protected double PhanThuc;
    protected double PhanAo;


    
     
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan thuc");
        PhanThuc= sc.nextDouble();
        System.out.println("Nhap phan ao");
        PhanAo= sc.nextDouble();
    }
    public void xuat()
    {
        System.out.printf("%.2f + %.2fi",PhanThuc,PhanAo);
    }
    public void cong(SoPhuc sp)
    {
       PhanThuc=this.PhanThuc+ sp.PhanThuc;
       PhanAo= this.PhanAo +sp.PhanAo;
        xuat();
    }
      public void tru(SoPhuc sp)
    {
       PhanThuc=this.PhanThuc- sp.PhanThuc;
       PhanAo= this.PhanAo +sp.PhanAo;
        xuat();
    }
       public void nhan(SoPhuc sp)
    {
       PhanThuc=this.PhanThuc*sp.PhanThuc-this.PhanAo* sp.PhanAo;
       PhanAo= this.PhanThuc*sp.PhanAo +this.PhanAo*sp.PhanThuc;
        xuat();
    }
        public void chia(SoPhuc sp)
    {
       PhanThuc=(this.PhanThuc*sp.PhanThuc+ this.PhanAo*sp.PhanAo)/(sp.PhanAo*sp.PhanAo+sp.PhanThuc*sp.PhanThuc);
       PhanAo= (sp.PhanThuc*this.PhanAo-sp.PhanAo*this.PhanThuc)/(sp.PhanAo*sp.PhanAo+sp.PhanThuc*sp.PhanThuc);
       xuat();
               
    }
        
        
    
}
