/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH2.BTH3.Bai1NC;

import static java.lang.Integer.BYTES;
import static java.lang.Integer.signum;
import java.util.Scanner;
import java.util.stream.*;

/**
 *
 * @author Administrator
 */
public class DaGiac {

    public int soCanh;
    public double[] sizeCanh = new double[soCanh];

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public double[] getSizeCanh() {
        return sizeCanh;
    }

    public void setSizeCanh(double[] sizeCanh) {
        this.sizeCanh = sizeCanh;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so canh: ");
        soCanh = sc.nextInt();
        System.out.println("Nhap size moi canh: ");
        for (int i = 0; i < soCanh; i++) {
            System.out.printf("Size canh %d: ", i);
            sizeCanh[i] = sc.nextDouble();
        }
    }

    public double tinhChuvi() {
        return DoubleStream.of(sizeCanh).sum();
    }

    public void show() {
        System.out.println("Show size canh");
        for (int i = 0; i < soCanh; i++) {
            System.out.printf("Size canh %f", sizeCanh[i]);
        }
    }
}
