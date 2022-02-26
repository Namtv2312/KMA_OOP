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
public class Hourly extends Employee
{
    private int hourseWorked;
    
    public void addHourses(int moreHourse){
        this.hourseWorked= moreHourse;
    }

    @Override
    public String toString() {
        return super.toString()+"- "+this.hourseWorked;
    }

    public int getHourseWorked() {
        return hourseWorked;
    }

    public void setHourseWorked(int hourseWorked) {
        this.hourseWorked = hourseWorked;
    }

    
    @Override
    public double pay() {
        return super.pay()*50; //To change body of generated methods, choose Tools | Templates.
    }

  

    public Hourly(int hourseWorked, String socialSecurityNumber, double payRate, String name, String address, String phone) {
        super(socialSecurityNumber, payRate, name, address, phone);
        this.hourseWorked = hourseWorked;
    }

   
    
    
}
