/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai1;

/**
 *
 * @author NAM SYSTEM
 */
public class Cow extends Animal{
    private static int pupuCow=0;

    public static int getPupuCow() {
        return pupuCow;
    }
    
     @Override
    public void name() {
        super.name(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String makeAsound() {
        return "ohhhhhh"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Introduce() {
        super.Introduce(); //To change body of generated methods, choose Tools | Templates.
    }

    

    public Cow() {
        System.out.println("cow is called");
        pupuCow++;
    }

    @Override
    public String giveBirth() {
        return super.getName()+"'s baby";
    }
}
