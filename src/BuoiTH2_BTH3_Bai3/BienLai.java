/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH2_BTH3_Bai3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BienLai {

    public int chisoCu;
    public int chisoMoi;
    public double sotienPhaiTra;

    public BienLai() {
    }

    public int getChisoCu() {
        return chisoCu;
    }

    public void setChisoCu(int chisoCu) {
        this.chisoCu = chisoCu;
    }

    public int getChisoMoi() {
        return chisoMoi;
    }

    public void setChisoMoi(int chisoMoi) {
        this.chisoMoi = chisoMoi;
    }

    public double getSotienPhaiTra() {
        return sotienPhaiTra;
    }

    public void setSotienPhaiTra(double sotienPhaiTra) {
        this.sotienPhaiTra = sotienPhaiTra;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chi so cu:: ");
        chisoCu = sc.nextInt();
        System.out.println("Nhap chi so moi: ");
        chisoMoi = sc.nextInt();
        sotienPhaiTra = (chisoMoi - chisoCu) * 850000;
    }

    public void xuatTT() {

        System.out.println("Chi so cu: " + chisoCu);
        System.out.println("Chi so moi: " + chisoMoi);
        System.out.println("So tien phai tra: " + sotienPhaiTra);
    }
}
