/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NAM SYSTEM
 */
public class ThiSinh {

    private String hoTen;
    private Date ngaySinh;
    private String diaChi;

    public ThiSinh(String hoTen, Date ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public double tong() {
        return 0;
    }

    public ThiSinh() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ho ten thi sinh: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngay sinh: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh = sdf.parse(sc.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(ThiSinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Nhập địa chỉ");
        diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
