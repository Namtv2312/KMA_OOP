/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Dahinh.Bai2;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class GiaoHang extends NhanVien{
    private     int soHangGiao;
     public void nhap()
     {
         super.nhap();
         Scanner sc= new Scanner(System.in);
         soHangGiao= sc.nextInt();
     }
     public void xuat()
     {
         System.out.println(toString());
     }

    public GiaoHang() {
    }

    @Override
    public int tienluong() {
        return soHangGiao*33500;//To change body of generated methods, choose Tools | Templates.
    }

    
     
    @Override
    public String toString() {
        return "GiaoHang{"+super.toString() + "soHangGiao=" + soHangGiao + '}';
    }
     
         
}
