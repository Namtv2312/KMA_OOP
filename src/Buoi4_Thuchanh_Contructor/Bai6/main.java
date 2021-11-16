/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_Thuchanh_Contructor.Bai6;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String[] args) {
        NhanVien nv1= new NhanVien();
        nv1.inputInfo();
        nv1.printInfo();
        System.out.println("Thuong"+ nv1.tinhTHuong());
    }
}
