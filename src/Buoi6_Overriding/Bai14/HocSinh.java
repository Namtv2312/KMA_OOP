/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6_Overriding.Bai14;

/**
 *
 * @author Administrator
 */
public class HocSinh {
    public String hoTen;
    public String lop;
    public double Toan;
    public double Ly;
    public double Hoa;

    public HocSinh(String hoTen, String lop, double Toan, double Ly, double Hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }
    
    public double diemTB()
    {
        return (Toan+Ly+Hoa)/3;
    }
}
