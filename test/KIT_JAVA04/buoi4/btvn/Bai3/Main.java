/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4.btvn.Bai3;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        SanPham sp= new SanPham();
        System.out.println("Nhap thong tin san pham: ");
        sp.Nhap();
        sp.all();
        System.out.println("");
        System.out.println("Ban 2/3 san pham");
        sp.part();
    }
}
