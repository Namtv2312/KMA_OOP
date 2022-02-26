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
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1000, "name", "address");
        Customer c = new Customer(1222," name"," address");
         
        e.Display();
        c.Display();
    }
}
