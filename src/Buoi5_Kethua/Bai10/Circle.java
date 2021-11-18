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
public class Circle {
    public double radius;
    public String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap radius: ");
        radius= sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap color: ");
        color= sc.nextLine();
    }
    
    public double getArea(){
        return 3.14 * radius*radius;
    }
    public String toString(){
      return "Radius: "+ this.getRadius()+"\nColor: "+ this.getColor()+        "\nArea: "+ this.getArea();
    }
}
