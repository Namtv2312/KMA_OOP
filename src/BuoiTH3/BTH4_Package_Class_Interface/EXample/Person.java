/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH3.BTH4_Package_Class_Interface.EXample;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class Person {
    String hoten;
    Scanner sc = new Scanner(System.in);
    int age;
    String diachi;
    int luong;
    public Person(int age){
        this.age= age;
    }
    public void Nhap(){
        System.out.println("Nhap ho ten: ");
        hoten =sc.nextLine();
        diachi= sc.nextLine();
        
        
    }
    public abstract void In();
    public abstract int Tinhluong();
}
