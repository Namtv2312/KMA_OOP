/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi12_Exeption.Bai9;

/**
 *
 * @author NAM SYSTEM
 */
public class Number {
    private double value;
    private double min;
    private double max;

    public Number(double value, double min, double max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }

    public Number() {
    }
    

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
    public boolean soNguyento(double value)
    {
        int d=0;
        for(int i=1;i<=value;i++)
        {
            if(value%i==0)
                d++;
        }
       if(d==2) return true;
       return false;
        
    
    }

    @Override
    public String toString() {
        return "Number{" + "value=" + value + ", min=" + min + ", max=" + max + '}';
    }
    
        
    
    
}
