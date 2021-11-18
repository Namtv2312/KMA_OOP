/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Bai11;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Programmer extends Student{
    public int namKN;

    public int getNamKN() {
        return namKN;
    }

    public void setNamKN(int namKN) {
        this.namKN = namKN;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Nhap nam kinh nghiem: ");
        Scanner sc= new Scanner(System.in);
        namKN= sc.nextInt();
    }
    public void show(){
        super.show();
        System.out.println("So nam kinh nghiem: "+ this.getNamKN());
    }
}
