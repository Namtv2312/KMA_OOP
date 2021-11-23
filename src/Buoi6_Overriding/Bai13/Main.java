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
public class Main {
    public static void main(String[] args) {
        TenNguoiViet v1= new TenNguoiViet("Tran","Nam");
        TenNguoiNuocNgoai t1 = new TenNguoiNuocNgoai("Tran","Nam");
        
        v1.showTen();
        System.out.println("");
        t1.showTen();
    }
}
