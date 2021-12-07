/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH3.BTH4_Package_Class_Interface.Bai2;

/**
 *
 * @author Administrator
 */
public class Diem {
    double x;
    double y;
    public Diem(){
        
    }
    public Diem(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void inTTdiem(){
        System.out.println(String.format("(%s,%s)",x,y));
    }
    public double tinhKhoangcach(Diem d){
        return Math.sqrt((d.x-x)*(d.x-x)+(d.y-y)*(d.y- y));
    }
}
