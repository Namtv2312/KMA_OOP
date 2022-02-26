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
public class XeOm extends NhanVien{
    private  int soKM;
    
    public void nhap()
    {
        super.nhap();
        Scanner sc= new Scanner(System.in);
        soKM= sc.nextInt();
    }
    public void xuat()
    {
        System.out.println(toString());
    }

    public XeOm() {
    }

    @Override
    public int tienluong() {
        return soKM*10000; //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public String toString() {
        return "XeOm{"+super.toString() + "soKM=" + soKM + '}';
    }
    
        
}
