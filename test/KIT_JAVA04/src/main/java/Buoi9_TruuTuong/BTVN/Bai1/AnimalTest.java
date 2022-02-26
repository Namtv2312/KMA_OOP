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
public class AnimalTest {

    public static void main(String[] args) {
        while (true) {
            Cat aj = new Cat();
            System.out.println("Nhap ten meo:");
            aj.name();
            System.out.println("Thong tin ve meo");
            aj.Introduce();
            System.out.println(aj.giveBirth());
            System.out.println("Nhap nua khong: ");
            String i = new Scanner(System.in).nextLine();
            if (i.equalsIgnoreCase("n")) {
                break;
            }
        }
        while (true) {
            Dog kk = new Dog();
            System.out.println("Nhap ten cho:");
            kk.name();
            System.out.println("Thong tin ve cho");
            kk.Introduce();
            System.out.println("Nhap nua khong: ");
            String i = new Scanner(System.in).nextLine();
            if (i.equalsIgnoreCase("n")) {
                break;
            }

        }
        while (true) {
            Cow gg = new Cow();
            System.out.println("Nhap ten bo:");
            gg.name();
            System.out.println("Thong tin ve bo:");
            gg.Introduce();
            System.out.println("Nhap nua khong: ");
            String i = new Scanner(System.in).nextLine();
            if (i.equalsIgnoreCase("n")) {
                break;
            }

        }

        System.out.println("So luong annimal:"+Animal.getPopulation());
        Cat c= new Cat();
        c = null;
        System.gc();
        System.out.println("so luong annimal: "+ Cat.getPopuCat());
    }
}
