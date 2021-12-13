/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2;

import com.sun.istack.internal.NotNull;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Person {

    public String hoten;
    public String diachi;

    public String getHoten() {
        return hoten;
    }
    Scanner sc = new Scanner(System.in);

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void nhap() {
        System.out.println("Nhap ho ten: ");

        hoten = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();

    }

    @Override
    public String toString() {
        return "Person{" + "hoten=" + hoten + ", diachi=" + diachi + '}';
    }

}
