/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai1;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public abstract class Animal {

    private String name;
    public static int population = 0;

    public void Introduce() {
        System.out.println(makeAsound() + "     I'm :" + name);
    }

    public String makeAsound() {
        return "";

    }

    public void name() {
        System.out.println("Nhap ten: ");
        name = new Scanner(System.in).nextLine();
    }

    public Animal() {
        System.out.println("ANIMAL duoc goi");
    }

    public static int getPopulation() {
        return Cat.getPopuCat() + Dog.getPopuDog() + Cow.getPupuCow();
    }

    public abstract String giveBirth();

    public String getName() {
        return name;
    }

}
