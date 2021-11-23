/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6_Overriding.Bai15;

/**
 *
 * @author Administrator
 */
public class USB {
    public String maHang;
    public double gia;
    public int soLuong;
    
    public double tongTien(){
        return gia*soLuong;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public USB(String maHang, double gia, int soLuong) {
        this.maHang = maHang;
        this.gia = gia;
        this.soLuong = soLuong;
    }
    
    public void showInfo(){
       
        System.out.println("Ma hang:"+ this.getMaHang());
        System.out.println("Gia: "+ this.getGia());
        System.out.println("So luong: "+ this.getSoLuong());
        System.out.println("Tong tien: "+ String.valueOf(tongTien()));
    }
}
