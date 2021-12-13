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
public class Employee extends Person {

    public double hsLuong;

    public double tinhluong() {
        return hsLuong * 111111;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap he so luong; ");
        hsLuong = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + "hsLuong=" + hsLuong + "Luong " + tinhluong() + '}';
    }

}
