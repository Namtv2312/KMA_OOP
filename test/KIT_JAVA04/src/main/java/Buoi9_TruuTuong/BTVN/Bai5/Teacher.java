/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai5;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Teacher extends Person{
    private String rank;
    public void nhap()
    {
        rank= new Scanner(System.in).nextLine();
    }

    public Teacher() {
    }

    public Teacher(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Teacher{"+super.toString() + "rank=" + rank + '}';
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void print() {
        System.out.println(toString());
    
    
}}
