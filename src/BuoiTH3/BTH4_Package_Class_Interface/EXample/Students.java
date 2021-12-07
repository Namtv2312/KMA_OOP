/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH3.BTH4_Package_Class_Interface.EXample;

/**
 *
 * @author Administrator
 */
public class Students extends Person{
    int MaSV, Malop;
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap ma sinh vien: ");
        MaSV= sc.nextInt();
        System.out.println("Nhap ma lop: ");
        Malop= sc.nextInt();
    }
    public Students(int age) {
        super(age);
    }

    @Override
    public void In() {
        System.out.println("Ho ten: "+hoten);
        System.out.println("Dia chi : "+diachi);
        System.out.println("Ma sinh vien : "+MaSV);
        System.out.println("Ma lop : "+Malop);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Tinhluong() {
      // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return 150000;
        }
    
}
