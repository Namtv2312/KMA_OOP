/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_thuchanhClass;

/**
 *
 * @author Administrator
 */
public class Circle {
    public float Radius;
    public String Color;

    public Circle(float Radius, String Color) {
        this.Radius = Radius;
        this.Color = Color;
    }
    public Circle(float Radius){
        this.Color= "Red";
        this.Radius= Radius;
    }
    public Circle(){
        this.Radius= 1;
        this.Color= "rED";
    }

    public float getRadius() {
        return Radius;
    }

    public void setRadius(float Radius) {
        this.Radius = Radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    public void showCircle()
    {
        System.out.println("Radius: "+ getRadius());
        System.out.println("Color: "+ getColor());
    }
}
