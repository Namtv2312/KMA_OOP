/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi10.BTVN.Bai1;

import static java.lang.Math.sqrt;

/**
 *
 * @author NAM SYSTEM
 */
public class Bai_1 {
    private double A;
    private double B;
    private double C;

    public Bai_1(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }
     
    public String giaiPtr(){
        double delta = sqrt(B * B - 4 * A * C);
        if (A == 0) {
            if (B == 0) {
               return("Phương trình vô nghiệm");
            } else {
                return(String.valueOf(-C / B));
            }
        } else {
            if (B * B - 4 * A * C < 0) {
                return("Phương trình vô nghiệm");
            } else if (B * B - 4 * A * C == 0) {
                return("Phương trình có nghiệm kép:" + String.valueOf((-B / (2 * A))));
            } else {
                return ("x1= " + String.valueOf((-B + delta) /( 2*A))+"____và____" + "x2= " + String.valueOf((-B - delta) /( 2*A)));
            }
        }
    }
}
        

    
    

