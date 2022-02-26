/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi12_Exeption.Bai3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NAM SYSTEM
 */
public class Person {
    private String hoTen;
    private Date ngaySinh;
    private String diaChi;
    private String gioiTinh;

    public Person(String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public Person() {
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

    public String getGioiTinh() {
        return gioiTinh;
    }
    

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return "hoTen=" + hoTen + ", ngaySinh=" + sdf.format(ngaySinh) + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh ;
    }
    
    
}
