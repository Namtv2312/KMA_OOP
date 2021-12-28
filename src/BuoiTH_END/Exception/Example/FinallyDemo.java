/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH_END.Exception.Example;

/**
 *
 * @author Administrator
 */
public class FinallyDemo {
    String name;
 int no1,no2;
 FinallyDemo(String args[])
 {
 try
 {
 name=new String("Aptech Limited");
 no1=Integer.parseInt(args[1]);
 no2=Integer.parseInt(args[2]);
 System.out.println(name);
 System.out.println("Division Result is" + no1/no2);
 }
 catch(ArithmeticException i)
 {
 System.out.println("Cannot Divide by zero");
 }
 finally
 {
 name=null; // clean up code
 System.out.println("Finally executed");
 }
 }
 public static void main(String args[])
 {
 new FinallyDemo(args);
 } 
}
