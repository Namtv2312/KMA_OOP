/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2;

/**
 *
 * @author Administrator
 */
public class Student extends Person {

    public double diemMH1;
    public double diemMH2;

    public double avg() {
        return (diemMH1 + diemMH2) / 2;

    }

    public Student(double diemMH1, double diemMH2) {
        this.diemMH1 = diemMH1;
        this.diemMH2 = diemMH2;
    }

    public Student() {
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap diem mh1: ");
        diemMH1 = sc.nextDouble();
        System.out.println("Nhap diem MH2: ");
        diemMH2 = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()
                + "diemMH1=" + diemMH1 + ", diemMH2=" + diemMH2 + " Diem TB" + avg() + '}';
    }

}
