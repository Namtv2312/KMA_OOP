/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4.btvn.Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {
    Scanner sc= new Scanner(System.in);
    String maSanpham;
    String tenSanpham;
    float giaMuavao;
    float giaBanra;
    int soLuong;   
    void Nhap()
    {
        System.out.println("Nhap ma san pham: ");
        maSanpham=sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        tenSanpham=sc.nextLine();
        System.out.println("Nhap gia mua vao cua san pham: ");
        giaMuavao=sc.nextFloat();
        System.out.println("Nhap gia ban ra cua san pham: ");
        giaBanra=sc.nextFloat();
        System.out.println("Nhap so luong san pham: ");
        soLuong=sc.nextInt();        
    }
    void all()
    {
        float t=soLuong*giaBanra-soLuong*giaMuavao;
        if(t>0)
            System.out.println("So tien lai la: "+t);
        else System.out.printf("bi lo %.2f" ,t);
    }
    void part()
    {
        float t=soLuong*2/3*giaBanra-soLuong*giaMuavao;
        if(t>0)
        {
            System.out.printf("So tien lai la %.2f",t);
        }
        else System.out.printf("Lo %.2f",t);
    }
            
}
