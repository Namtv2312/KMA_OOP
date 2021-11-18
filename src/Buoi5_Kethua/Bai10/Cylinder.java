/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Bai10;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Cylinder extends Circle{
    public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return ((radius*radius*height*22)/7);
    }
    public void nhap(){
        super.nhap();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap heigth: ");
        height= sc.nextDouble();
    }
    public void show(){
        System.out.println(super.toString());
    }
 
}
