/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH2_BTH3_Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import static java.time.LocalTime.parse;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TheThuVien extends SinhVien {

    public int SoPhieuMuon;
    public Date NgayMuon;
    public int hanTra;
    public String soHieuSach;

    public TheThuVien(int SoPhieuMuon, Date NgayMuon, int hanTra, String soHieuSach) {
        this.SoPhieuMuon = SoPhieuMuon;
        this.NgayMuon = NgayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public int getSoPhieuMuon() {
        return SoPhieuMuon;
    }

    public void setSoPhieuMuon(int SoPhieuMuon) {
        this.SoPhieuMuon = SoPhieuMuon;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public int getHanTra() {
        return hanTra;
    }

    public void setHanTra(int hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public TheThuVien() {
    }

    public void nhapTT() {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phieu muon: ");
        SoPhieuMuon = sc.nextInt();
        System.out.println("Nhap ngay muon");
        String timeString = sc.next();

        try {
            NgayMuon = myFormat.parse(timeString);
        } catch (ParseException ex) {
            Logger.getLogger(TheThuVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Nhap han tra");
        hanTra = sc.nextInt();

        System.out.println("Nhap so hieu sach");
        sc.next();
        soHieuSach = sc.nextLine();
        System.out.println("Nhap thong tin sinh vien");
        super.nhapTT();
    }

    public void inTt() {
        System.out.println("Thong tin the thu vien: ");
        System.out.println("So phieu muon: " + SoPhieuMuon);
        System.out.println("ngay muon: " + NgayMuon);
        System.out.println("Han tra: " + hanTra);
        System.out.println("So hieu sach:  " + soHieuSach);
        super.xuatTT();
    }
}
