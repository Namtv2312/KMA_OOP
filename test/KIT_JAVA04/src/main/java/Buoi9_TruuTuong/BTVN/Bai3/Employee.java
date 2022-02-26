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
public class Employee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    @Override
    public double pay() {
        return 500;
    }

    @Override
    public String toString() {
        return super.toString()+"- "+this.socialSecurityNumber+"- "+this.payRate;
    }

  

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    

    public Employee(String socialSecurityNumber, double payRate, String name, String address, String phone) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }
    
    
    
        
}
