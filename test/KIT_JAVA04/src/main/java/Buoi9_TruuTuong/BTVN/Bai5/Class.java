/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Class {
    
    private String name;
    private ArrayList<Student> studentList;
    private int numOfStudents;
    private Teacher advisor;

    public Class() {
        studentList = new ArrayList<>();
        numOfStudents = 0;
        advisor = new Teacher();
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp: ");
        name = sc.nextLine();
        System.out.println("Nhập số học sinh của lớp " + name);
        numOfStudents = sc.nextInt();
        for(int i =0; i<numOfStudents;i++)
        {
            System.out.println("Nhập học sinh thứ " + (i+1));
            Student tmp = new Student();
            tmp.nhap();
            studentList.add(tmp);
        }
        advisor.nhap();
    }
    public void printList()
    {
        System.out.println("\t\tTHÔNG TIN LỚP " + name.toUpperCase());
        int i =1;
        System.out.println("Thông tin học sinh: ");
        for(Student tmp : studentList)
        {
            System.out.print((i++)+". ");
            tmp.print();
        }
        System.out.println("Thông tin giáo viên: ");
        advisor.print();
    }
}