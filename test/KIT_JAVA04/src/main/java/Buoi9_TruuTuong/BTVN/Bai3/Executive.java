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
public class Executive extends  Employee{
    private double bonus;
    

    @Override
    public double pay() {
        return super.pay()+this.bonus; 
    }

 
  

    public Executive(double bonus, String socialSecurityNumber, double payRate, String name, String address, String phone) {
        super(socialSecurityNumber, payRate, name, address, phone);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    
    
    public void awardBonus(double execBonus)
    {
        this.bonus= execBonus;
        System.out.println("Lanh bonus: "+this.bonus);
    }
    
    
}
