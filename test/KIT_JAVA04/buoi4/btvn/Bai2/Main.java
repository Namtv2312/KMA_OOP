/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4.btvn.Bai2;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) { 
        SinhVien sv= new SinhVien();
        System.out.println("Nhap thong tin sinh vien: ");
        sv.Nhap();
        sv.DiemTrungBinh();
        System.out.println("");
        System.out.println("So tien thi lai: "+sv.TienThiLai()+"Dong");
        
    }
   
}
