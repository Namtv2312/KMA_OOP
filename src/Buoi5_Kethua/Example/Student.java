/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.Example;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Student extends Person {
    public int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap diem");
        Scanner sc = new Scanner(System.in);
        score= sc.nextInt();
    }
    @Override
    public void showinfor(){
        super.showinfor();
        System.out.println("Diem: "+ this.getScore());
    }
    
    public static void main(String[] args) {
        Student s1= new Student();
        s1.nhap();
        s1.showinfor();
    }
}
