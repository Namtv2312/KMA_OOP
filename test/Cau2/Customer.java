/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2;

/**
 *
 * @author Administrator
 */
public class Customer extends Person {

    public String tenCTY;
    public double triGiaHD;

    public void nhap() {
        super.nhap();
        System.out.println("Nhap ten CTY");
        tenCTY = sc.nextLine();
        System.out.println("Nhap tri gia hd: ");
        triGiaHD = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() + "tenCTY=" + tenCTY + ", triGiaHD=" + triGiaHD + '}';
    }

}
