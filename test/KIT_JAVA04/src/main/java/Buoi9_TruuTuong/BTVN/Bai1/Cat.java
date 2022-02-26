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
public class Cat extends Animal{

    private static int popuCat=0;
    @Override
    public void name() {
        super.name(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String makeAsound() {
        return "Mew mew"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Introduce() {
        super.Introduce(); //To change body of generated methods, choose Tools | Templates.
    }
    public Cat() {
        System.out.println("cat is called");
        popuCat++;
    }
    public void finalize() throws Throwable{
            popuCat--;
    }
    static int getPopuCat() {
        return popuCat;
    }

    @Override
    public String giveBirth() {
        return super.getName()+"'s baby";
    }
  
}
