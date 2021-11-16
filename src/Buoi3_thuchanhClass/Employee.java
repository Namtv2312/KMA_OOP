/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_thuchanhClass;

/**
 *
 * @author Administrator
 */
public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public float salaryMonthly;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalaryMonthly() {
        return salaryMonthly;
    }

    public void setSalaryMonthly(float salaryMonthly) {
        this.salaryMonthly = salaryMonthly;
    }
    
    public String getFullName(){
        return (lastName+"  "+firstName);
        
    }
    public float getSalaryYearly()
    {
        return salaryMonthly*12;
    }
    public void showInformation()
    {
        System.out.println("ID: "+ getId());
        System.out.println("Name: "+getFullName());
        System.out.println("Salary Month: "+getSalaryMonthly());
        System.out.println("Salary Yearly: "+getSalaryYearly());
       
    }

}
