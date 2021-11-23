/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6_Overriding.Bai13;

/**
 *
 * @author Administrator
 */
public class TenNguoiNuocNgoai extends TenNguoiViet{

    public TenNguoiNuocNgoai(String ho, String ten) {
        super(ho, ten);
    }

    
    public void showTen(){
        System.out.printf("%s %s",ten,ho);
    }
}
