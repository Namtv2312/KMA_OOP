/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6_Overriding.Bai14;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        HocSinh hs1= new HocSinh("Tran Van Nam", "AT", 9, 10, 10);
        HocSinhChuyenToan hst1= new HocSinhChuyenToan("Tran Van nam", "AT16G",10,9, 10);
        
        System.out.println(hs1.diemTB());
        System.out.println(hst1.diemTB());
    }
}
