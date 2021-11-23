/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6_Overriding.Bai15;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        USB u1= new USB("U22", 10000, 10);
        Mouse m1= new Mouse("m2", 1000, 10);
        
         System.out.println("Thong tin don hang mua USB");
         u1.showInfo();
         
         m1.showInfo();
    }
}
