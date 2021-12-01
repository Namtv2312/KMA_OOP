/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH2_BTH3_Bai1NC;

import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 *
 * @author Administrator
 */
public class TamGiac extends DaGiac {

    public double[] sizeCanh = new double[3];

    public TamGiac() {
        soCanh = 3;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size moi canh: ");
        for (int i = 0; i < soCanh; i++) {
            System.out.printf("Size canh %d: ", i);
            sizeCanh[i] = sc.nextDouble();
        }
    }

    public double tinhChuvi() {
        return DoubleStream.of(sizeCanh).sum();
    }
    public double dientich(){
        return Math.sqrt(tinhChuvi()/2*(tinhChuvi()/2-sizeCanh[0])*(tinhChuvi()/2-sizeCanh[1])*(tinhChuvi()/2-sizeCanh[2]));
    }

    public void show() {
        System.out.println("Show size canh");
        for (int i = 0; i < soCanh; i++) {
            System.out.printf("Size canh %f", sizeCanh[i]);
        }
        System.out.println("\nChu vi " + tinhChuvi());
        System.out.println("Dien tich "+dientich());
    }
    
}
