/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1.TH2.Bai5;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String[] args) {
        ToanHoc th1= new ToanHoc();
        System.out.println(th1.isPrime(29));
        System.out.println(th1.testPerfect(8128));
        System.out.println("So chinh phuong nho hon n");th1.inSCP(40);
        System.out.println("\nSo fibonaci thu n: ");
        System.out.println(th1.fibonaci(5));
    }
   
}
