/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.BTVN.Bai3;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class XeTai extends PhuongTienGiaoThong{
    private int trongTai;
    public void nhap()
    {
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap trong tai cua xe");
        trongTai= sc.nextInt();
    }
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String searchColor() {
        return getColor(); //To change body of generated methods, choose Tools | Templates.
    }
    

    public XeTai() {
    }

    @Override
    public String toString() {
        return "XeTai{"+super.toString() + "trongTai=" + trongTai + '}';
    }
    
    
}
