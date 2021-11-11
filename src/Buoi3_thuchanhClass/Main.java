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
public class Main {
    public static void main(String[] args) {
        //Circle
        Circle cir = new Circle();
        System.out.println("CIRCLE");
        cir.setColor("Red");
        cir.setRadius(5);
        cir.showCircle();
        
        //Rectangle()
        Rectangle rec= new Rectangle();
        System.out.println("\nRECTANGLE");
        rec.setLength(4);
        rec.setWidth(5);
        rec.showRectangle();
        
        //Employee
        Employee emp = new Employee();
        System.out.println("\nEMPLOYEE");
        emp.setFirstName("Nam");
        emp.setLastName("Tran");
        emp.setId(632);
        emp.setSalaryMonthly(99999999);
        emp.showInformation();
        
        //Account
        Acoount ac = new Acoount();
        System.out.println("\nACCOUNT");
        ac.setBalance(1000);
        ac.setId(10);
        ac.setName("ADMIN");
        ac.showInformation();
        System.out.println("CREDIT: "+ac.credit(5));
        System.out.println("DEBIT: "+ac.debit(55));
        
        //DATE
        Date1 d = new Date1();
        System.out.println("\nDATE");
        d.setDay(23);
        d.setMonth(12);
        d.setYear(2001);
        d.showDate();
        Date1 d1 = new Date1()  ;
        System.out.println("\nToday");
        d1.setDay(11);
        d1.setMonth(11);
        d1.setYear(2020);
        d1.showDate();
    }
}
