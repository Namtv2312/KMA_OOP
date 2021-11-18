/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Bai11;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String[] args) {
        Employee nv1= new Employee();
        System.out.println("Nhap thong tin employee 1");
        nv1.nhap(); 
        System.out.println("Thong tin em 1");
        nv1.show();
        
        Manager m1= new Manager();
        System.out.println("Nhap thong tin manager 1");
        m1.nhap();  
        System.out.println("Thong tin manager 1");
        m1.show();
        
        Student s1= new Student();
        System.out.println("Nhap thong tin hoc sinh 1");
        s1.nhap();
        System.out.println("Thong tin hoc sinh 1 la");
        s1.show();
        
        Programmer p1= new Programmer();
        System.out.println("Nhap thong tin pr 1");
        p1.nhap();
        System.out.println("Thong tin pr 1 la");
        p1.show();
    }
}
