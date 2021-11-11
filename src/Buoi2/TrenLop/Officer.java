/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2.TrenLop;

import java.util.Calendar;

/**
 *
 * @author Administrator
 */
public class Officer {
    public String name;
    public String country;
    public String gender;
    public int year;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void showInfo(){
        System.out.println("Name :"+this.getName());
        System.out.println("Country: "+this.getCountry());
        System.out.println("Gender: "+ this.getGender());
        System.out.println("Address: "+this.getAddress());
        System.out.println("Age: "+ String.valueOf((int)Calendar.getInstance().get(Calendar.YEAR)-year));
    }
}
