/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2.TrenLop;

/**
 *
 * @author Administrator
 */
public class Cat {
    public String name;
    public String country;
    public int age;
    
    // create method

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void showInfo()
    {
        System.out.println("Ten meo:"+ this.getName());
        System.out.println("Country: "+ this.getCountry());
        System.out.println("Age: "+ this.getAge());
    }
}
