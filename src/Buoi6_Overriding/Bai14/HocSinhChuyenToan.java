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
public class HocSinhChuyenToan extends HocSinh{
    
    public HocSinhChuyenToan(String hoTen, String lop, double Toan, double Ly, double Hoa) {
        super(hoTen, lop, Toan, Ly, Hoa);
    }
    public double  diemTB(){
        return  (Toan*2+Ly+Hoa)/4;
    }
    
}
