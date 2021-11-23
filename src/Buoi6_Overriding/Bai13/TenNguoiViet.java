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
public class TenNguoiViet {
    public String ho;
    public String ten;

    public TenNguoiViet(String ho, String ten) {
        this.ho = ho;
        this.ten = ten;
    }
    public TenNguoiViet(){
        
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public void showTen(){
        System.out.printf("%s, %s",ho,ten);
    }
}
