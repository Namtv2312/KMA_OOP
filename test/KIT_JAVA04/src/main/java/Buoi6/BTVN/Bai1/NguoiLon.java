/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BTVN.Bai1;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class NguoiLon extends DocGia{
    protected int soCCCD;
    
    public int tienlamthe()
    {
        return getSoThangcoHieuluc()*10000;
    }
    public void nhap()
    {
        super.nhap();
        Scanner sc=  new Scanner(System.in);
        System.out.println("Nhap so can cuoc cong dan: ");
        soCCCD= sc.nextInt();
    }

    public NguoiLon() {
    }
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "NguoiLon{" +super.toString()+ "soCCCD=" + soCCCD + '}';
    }
    
}
