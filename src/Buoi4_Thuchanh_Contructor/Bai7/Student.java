/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_Thuchanh_Contructor.Bai7;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Student {
    public String Masv;
    public double  diemTB;
    public int tuoi;
    public String lop;

    public Student(String Masv, double diemTB, int tuoi, String lop) {
        this.Masv = Masv;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public Student() {
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void inputInfor(){
        System.out.println("Nhap thong tin student: ");
        System.out.println("Nhap Ma sinh vien: ");
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Ma sinh vien chua 8 ki tu: ");
            Masv= sc.nextLine();
        } while (Masv.length()!=8);
        System.out.println("Nhap diem sinh vien");
        do {            
            System.out.println("Diem tu 0.0 den 10: ");
            diemTB= sc.nextDouble();
        } while (diemTB <0 || diemTB >10);
        System.out.println("Nhap tuoi sinh vien : ");
        do {            
            System.out.println("Tuoi sinh vien phai >= 18: ");
            tuoi= sc.nextInt();
        } while (tuoi<18);
        sc.nextLine();
        System.out.println("Nhap lop sinh vien: ");
        
        do {            
            System.out.println("Lop sinh vien chua ki tu dau la 'A' orr 'C': ");
            lop= sc.nextLine();
        } while (!lop.startsWith("A") && !lop.startsWith("C"));
    }
    public  void showInfo(){
        System.out.println("Thong tin student: ");
        System.out.println("Ma sinh vien : "+this.getMasv());
        System.out.println("Diem trung binh: "+ this.getDiemTB());
        System.out.println("Tuoi: "+ this.getTuoi());
        System.out.println("Lop: "+ this.getLop());
        if(xetHB()) System.out.println("Duoc hoc bong");
        else System.out.println("Khong duoc hoc bong");
    }
    public boolean xetHB()
    {
        if( this.diemTB>8.0){
            return  true;
        }
        return false;
    }
    
}
