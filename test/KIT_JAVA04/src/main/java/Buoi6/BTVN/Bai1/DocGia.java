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
public class DocGia {
    private String hoTen;
    private int ngayLapthe;
    private int soThangcoHieuluc;
    
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen= sc.nextLine();
        System.out.println("Nhap ngay lap the: ");
        ngayLapthe=sc.nextInt(); 
        System.out.println("Nhap so thang co hieu luc");
        soThangcoHieuluc= sc.nextInt();
    }

    public DocGia() {
    }

    @Override
    public String toString() {
        return "DocGia{" + "hoTen=" + hoTen + ", ngayLapthe=" + ngayLapthe + ", soThangcoHieuluc=" + soThangcoHieuluc + '}';
    }

    public int getSoThangcoHieuluc() {
        return soThangcoHieuluc;
    }
    
}
