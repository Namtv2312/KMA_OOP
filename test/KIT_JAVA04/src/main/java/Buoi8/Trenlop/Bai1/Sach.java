/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.Trenlop.Bai1;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Sach extends TailLieu{
    protected String tenTacgia;
    protected int soTrang;
    
    public void nhap()
    {
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten tac gia ");
        tenTacgia= sc.nextLine();
        System.out.println("Nhap so trang");
        soTrang= sc.nextInt();
    }
    public void xuat()
    {
        System.out.println(toString());
    }
        

    @Override
    public String toString() {
        return "Sach{" + super.toString()+ "tenTacgia=" + tenTacgia + ", soTrang=" + soTrang + '}';
    }
    
}
