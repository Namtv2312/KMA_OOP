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
public class Mouse extends USB{

    public Mouse(String maHang, double gia, int soLuong) {
        super(maHang, gia, soLuong);
    }
    @Override
    public double tongTien(){
        return  gia*0.8*soLuong;
    }
    @Override
    public void showInfo(){
        System.out.println("Show in for khach hang mua chuot:");
        super.showInfo();
        System.out.println("Tong tien "+String.valueOf(tongTien()));
    }
    
}
