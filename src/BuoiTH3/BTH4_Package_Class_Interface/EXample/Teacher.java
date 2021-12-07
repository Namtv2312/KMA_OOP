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
public class Teacher extends Person{

    public Teacher(int age) {
        super(age);
    }
    int Makhoa;
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap ma khoa");
        Makhoa=sc.nextInt();
    }
    
    
    @Override
    public void In() {
        System.out.println("ho ten: "+ hoten);
        System.out.println("Dia chi: "+diachi);
        System.out.println("Ma khoa: "+ Makhoa);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Tinhluong() {
        return 500000;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
