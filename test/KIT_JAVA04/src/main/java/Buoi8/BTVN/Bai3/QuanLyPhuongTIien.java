/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.BTVN.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class QuanLyPhuongTIien {

    ArrayList<PhuongTienGiaoThong> tfLst = new ArrayList<>();
    PhuongTienGiaoThong xemay = new XeMay();
    PhuongTienGiaoThong oto = new Oto();
    PhuongTienGiaoThong xetai = new XeTai();

    public void nhap() {
        while (true) {
            System.out.println("Nhap loai phuong tien dang ki");
            String type = new Scanner(System.in).nextLine().toLowerCase();
            switch (type) {
                case "xe tai":
                    xetai.nhap();
                    tfLst.add(xetai);
                    break;
                case "xe may":
                    xemay.nhap();
                    tfLst.add(xemay);
                    break;
                case "o to":
                    oto.nhap();
                    tfLst.add(oto);
                    break;
                default:
                    System.out.println("Nhap lai di");
            }
            System.out.println("Co nhap nua khong");
            String chon = new Scanner(System.in).nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public void timmau() {
        System.out.println("Nhap mau xe can tim : ");
        String color= new Scanner(System.in).nextLine();
        for(int i=0;i<tfLst.size();i++)
        {
            if(tfLst.get(i).getColor().equalsIgnoreCase(color) == true)
                tfLst.get(i).xuat();
            else System.out.println("Khong tim thay");
        }
    }
}
