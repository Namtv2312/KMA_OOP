/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Example;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Teacher extends Person{
    public String monhoc;

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Nhap mon hoc");
        Scanner sc = new Scanner(System.in);
        monhoc= sc.nextLine();
    }
    public void showinfor(){
        super.showinfor();
        System.out.println("Mon hoc "+ this.getMonhoc());
    }
    public static void main(String[] args) {
        Teacher t1= new Teacher()   ;
        t1.nhap();
        t1.showinfor();
    }
    
    
    
}
