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
public class Customer extends Person{
    private int balance;

    public Customer(int balance, String name, String address) {
        super(name, address);
        this.balance = balance;
    }
    
    

    @Override
    public void Display() {
        System.out.println("Custemer name"+super.getName());
        System.out.println("Custemer address: "+super.getAddress());
        System.out.println("Balance: "+ balance);
    }
    
}
