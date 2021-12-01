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
public class KhachHang extends BienLai {

    public String hoTen;
    public String sonha;
    public int maSoCongto;

    public KhachHang(String hoTen, String sonha, int maSoCongto) {
        this.hoTen = hoTen;
        this.sonha = sonha;
        this.maSoCongto = maSoCongto;
    }

    public KhachHang() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public int getMaSoCongto() {
        return maSoCongto;
    }

    public void setMaSoCongto(int maSoCongto) {
        this.maSoCongto = maSoCongto;
    }

    public void nhapTT() {
        System.out.println("Nhap thong tin ten chu ho:");
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        System.out.println("Nhap so nha :");
        sonha = sc.nextLine();
        System.out.println("Nhap ma so cong to: ");
        maSoCongto = sc.nextInt();
        super.nhapTT();
    }

    public void xuatTT() {
        System.out.println("Ten chu ho: " + hoTen);
        System.out.println("So nha: " + sonha);
        System.out.println("Ma so cong to: " + maSoCongto);
        System.out.println("So nha : " + sonha);
        super.xuatTT();
    }
}
