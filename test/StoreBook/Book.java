/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StoreBook;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Book {
    public String ID;
    public String name;
    public double price;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setAll(String ID, String name, double  price)
    {
        this.ID= ID;
        this.name= name;
        this.price= price;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
Scanner sc = new Scanner(System.in);
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void nhap()
    {
        System.out.println("Nhap ID sách: ");
        ID= sc.nextLine();
        System.out.println("Nhập tên sách: ");
        name= sc.nextLine();
        System.out.println("Nhap gia sach  :");
        price= sc.nextDouble();
    }
    public void xuat(){
        System.out.println("ID: "+ID);
        System.out.println("Name: "+ name);
        System.out.println("Price "+price);
    }
    
    
}
