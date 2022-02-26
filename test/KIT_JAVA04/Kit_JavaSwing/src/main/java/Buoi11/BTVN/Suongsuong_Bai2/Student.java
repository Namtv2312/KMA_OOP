/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai2;

/**
 *
 * @author NAM SYSTEM
 */
public class Student extends Person{
    private String msv;
    private String email;
    private double diemTk;

    public Student(String msv, String email, double diemTk, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.msv = msv;
        this.email = email;
        this.diemTk = diemTk;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemTk() {
        return diemTk;
    }

    public void setDiemTk(double diemTk) {
        this.diemTk = diemTk;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+ "msv=" + msv + ", email=" + email + ", diemTk=" + diemTk + '}';
    }
    
    
}
