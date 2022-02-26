/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {

    ArrayList<ThiSinh> list = new ArrayList<>();

    void test() {
        System.out.println("Nhap số thí sinh khối C");
        int so = new Scanner(System.in).nextInt();
        for (int i = 0; i < so; i++) {
            TS_KhoiC ts = new TS_KhoiC();
            ts.nhap();
            list.add(ts);
        }
        System.out.println("Nhap số thí sinh khối A");
        int o = new Scanner(System.in).nextInt();
        for (int i = 0; i < o; i++) {
            TS_KhoiA ok = new TS_KhoiA();
            ok.nhap();
            list.add(ok);
        }
    }

    void in() {
        for (ThiSinh tmp : list) {
            if (tmp.tong() > 20) {
                System.out.println(tmp.toString());
            }
        }
    }

    public static void main(String[] args) {
        Main te = new Main();
        te.test();
        System.out.println("Danh sach hoc sinh do");
        te.in();

    }
}
