/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH3.BTH4_Package_Class_Interface.EXample;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Students st1= new Students(18);
        st1.Nhap();
        st1.In();
        st1.Tinhluong();
        Teacher tc1= new Teacher (35);
        tc1.Nhap();
        tc1.In();
        tc1.Tinhluong();
    }
}
