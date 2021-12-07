/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH3.BTH4_Package_Class_Interface.Bai2;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Diem d1 = new Diem(3, 7);
        Diem d2= new Diem(9,3);
        d1.inTTdiem();
        d2.inTTdiem();
        System.out.println(d1.tinhKhoangcach(d2));
        
    }
}
