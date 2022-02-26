/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KITbai2;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class HocSinh {
    protected int id;
    protected String HoTen;
    protected int namSinh;
    protected String queQuan;
     public void nhap()
             
     {
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhap id hoc sinh :");
         id= sc.nextInt();
         System.out.println("Nhap ho ten hoc sinh: ");
         sc.nextLine();
         HoTen= sc.nextLine();
         System.out.println("Nhap nam sinh: ");
         namSinh= sc.nextInt();
         sc.nextLine();
         System.out.println("Nhap que quan: ");
         queQuan= sc.nextLine();
         
     }

    public HocSinh() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
     public void xuat()
     {
         System.out.println(toString());
     }

    public int getNamSinh() {
        return namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }
     

    @Override
    public String toString() {
        return "HocSinh{" + "id=" + id + ", HoTen=" + HoTen + ", namSinh=" + namSinh + ", queQuan=" + queQuan + '}';
    }
         
     
}
