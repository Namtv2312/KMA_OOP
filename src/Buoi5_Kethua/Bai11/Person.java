/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Bai11;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Person {
    public String name;
    public int age;
    public String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public void nhap(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        
        age= sc.nextInt();
        System.out.println("Nhap gioi tinh: ");
        sex= sc.nextLine();sc.nextLine();
        
    }
    public void show(){
        System.out.println("Ten: "+ this.getName());
        System.out.println("Tuoi: "+ this.getAge());
        System.out.println("Gioi tinh: "+ this.getSex());
    }
}
