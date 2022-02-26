/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai3;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {
    public static void main(String[] args) {
        Staff s= new Staff(); 

    Employee e= new Employee("2", 0, "nam", "vinh phuc", "0326577918");
    s.addnumber(e);
    s.payday();
    }
}
