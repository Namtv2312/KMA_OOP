/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Dahinh.Bai1;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class DocGia {
    protected String hoTen;
    protected int ngayLapthe;
    protected int sothangcohieuluc;
    
    void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen= sc.nextLine();
        System.out.println("Nhap ngay lap the: ");
        ngayLapthe=sc.nextInt(); 
        System.out.println("Nhap so thang co hieu luc");
        sothangcohieuluc= sc.nextInt();
    }
    void xuat()       
    {
        System.out.println(toString());
    }
    int tienlamthe()
    {
        return 0;
    }

    @Override
    public String toString() {
        return "DocGia{" + "hoTen=" + hoTen + ", ngayLapthe=" + ngayLapthe + ", sothangcohieuluc=" + sothangcohieuluc + '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgayLapthe() {
        return ngayLapthe;
    }

    public void setNgayLapthe(int ngayLapthe) {
        this.ngayLapthe = ngayLapthe;
    }

    public int getSothangcohieuluc() {
        return sothangcohieuluc;
    }

    public void setSothangcohieuluc(int sothangcohieuluc) {
        this.sothangcohieuluc = sothangcohieuluc;
    }
    
        
        
        
        
}
