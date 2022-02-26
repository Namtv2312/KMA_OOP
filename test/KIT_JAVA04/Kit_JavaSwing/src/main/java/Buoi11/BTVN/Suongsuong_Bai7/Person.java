/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai7;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author NAM SYSTEM
 */
public class Person {
    private String hoTen;
    private Date ngaysinh;
    private String diachi;
    private String gioitinh;
    

    public Person(String hoTen, Date ngaysinh, String diachi, String gioitinh) {
        this.hoTen = hoTen;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public Person() {
    }
    

    @Override
    public String toString() {
        return "Person{" + "hoTen=" + hoTen + ", ngaysinh=" +DateFormat.getDateInstance().format(ngaysinh) + ", diachi=" + diachi + ", gioitinh=" + gioitinh + '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
    
}
