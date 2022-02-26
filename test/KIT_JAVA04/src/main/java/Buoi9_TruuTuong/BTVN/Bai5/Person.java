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
public abstract class Person {
    private String name;
    private String address;
    private String department;
    
public abstract void print();
        
    

    public Person() {
    }

    public Person(String name, String address, String department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name= sc.nextLine();
        System.out.println("Nhap dia chi :");
        address= sc.nextLine();
        System.out.println("Nhap chuc vu: ");
        department= sc.nextLine();
    }

    @Override
    public String toString() {
        return "name=" + name + ", address=" + address + ", department=" + department ;
    }   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}

