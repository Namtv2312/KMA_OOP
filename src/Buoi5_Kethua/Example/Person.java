/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Example;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Person {
    public String name;
    public int birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap birthday: ");
        birthday=sc.nextInt();
    }
    public void showinfor(){
        System.out.println("Name: "+ this.getName());
        System.out.println("Birthday: "+ this.getBirthday( ));
    }
}
