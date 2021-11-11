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
public class Student {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showSudent(){
        System.out.println(""+this.getName());
        
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + '}';
    }
    
}
