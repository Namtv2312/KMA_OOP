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
public class TailLieu {
    protected String maTailieu;
    protected String tenNhaXB;
    protected int soBanPH;
    public TailLieu()
    {
        
    }
    public void xuat()
    {
        System.out.println(toString());
    }
        
        
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma tai lieu: ");
        maTailieu=sc.nextLine();
        System.out.println("Nhap ten nha xuat ban");
        tenNhaXB= sc.nextLine();
        System.out.println("Nhap so ban phat hanh");
        soBanPH= sc.nextInt();
    }

    @Override
    public String toString() {
        return "TailLieu{" + "maTailieu=" + maTailieu + ", tenNhaXB=" + tenNhaXB + ", soBanPH=" + soBanPH + '}';
    }
    
}
