/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_Thuchanh_Contructor.Bai9;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String[] args) {
        SoNguyenTo sn1= new SoNguyenTo();
        sn1.setA(5);
        System.out.println("so nguyen to tiep theo:"+sn1.nextPrime());
        
        SoNguyenTo sn2 = new  SoNguyenTo(4);
        sn2.setA(4);
    }
}
