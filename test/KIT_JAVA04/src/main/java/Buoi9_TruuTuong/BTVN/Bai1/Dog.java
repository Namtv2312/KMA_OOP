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
public class Dog extends Animal{
    private static int popuDog=0;

    public static int getPopuDog() {
        return popuDog;
    }
    
     @Override
    public void name() {
        super.name(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String makeAsound() {
        return "Go go"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Introduce() {
        super.Introduce(); //To change body of generated methods, choose Tools | Templates.
    }

    

    public Dog() {
        System.out.println("dog is called");
        popuDog++;
    }

    @Override
    public String giveBirth() {
        return super.getName()+"'s baby";
    }
    
}
