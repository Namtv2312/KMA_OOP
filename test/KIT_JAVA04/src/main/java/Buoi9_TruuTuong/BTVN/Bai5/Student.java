/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai5;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Student extends Person{
    private String lop;
    public void nhap()
    {
        super.nhap();
        lop= new Scanner(System.in).nextLine();
    }

    public Student(String lop) {
        this.lop = lop;
    }

    public Student(String lop, String name, String address, String department) {
        super(name, address, department);
        this.lop = lop;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{"+super.toString() + "lop=" + lop + '}';
    }

    
    @Override
    public void print() {
        System.out.println(toString());
    }
    
}
