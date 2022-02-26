/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.TrenLop.Bai1;

/**
 *
 * @author NAM SYSTEM
 */
public class Employee extends Person{
    private int salary;

    public Employee(int salary, String name, String address) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void Display() {
        System.out.println("Employee name: "+super.getName());
        System.out.println("Employee address: "+super.getAddress());
        System.out.println("Employee salary: "+salary);
    }
    
    
}
