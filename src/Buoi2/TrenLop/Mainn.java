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
public class Mainn {
    public static void main(String[] args) {

        System.out.println("Hello");
        Student firstStudent = new Student();
        firstStudent.setName("ok");
        firstStudent.showSudent();
        
        Cat meoVn = new Cat();
        meoVn.setName("Meo VN");
        meoVn.setAge(1);
        meoVn.setCountry("vn");
        
        meoVn.showInfo();
        
        
        Officer nv1 =new Officer();
        nv1.setName("T v n");
        nv1.setAddress("VN");
        nv1.setCountry("VN n");
        nv1.setGender("Nam");
        nv1.setYear(2001);
        nv1.showInfo();
    }
    
}

