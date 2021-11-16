/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_Thuchanh_Contructor.Bai8;

/**
 *
 * @author Administrator
 */
public class MyPoint {
    public int x;
    public int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this.x= 0;
        this.y=0;
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY( int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return String.format("(%s,%s)",x,y);
    }
    public double distance(int x, int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y- y));
    }
    public double distance(MyPoint poi1){
        return Math.sqrt((poi1.x-x)*(poi1.x-x)+(poi1.y-y)*(poi1.y- y));
    }
    
    
}
