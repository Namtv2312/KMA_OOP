/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_Thuchanh_Contructor.Bai8;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String[] args) {
        MyPoint p2= new MyPoint();
        p2.setXY(5, 5);
        System.out.println(p2.toString());
        System.out.println(p2.distance(0, 0));
        MyPoint p1= new MyPoint(0, 0);
        System.out.println(p2.distance(p1));
    }
}
