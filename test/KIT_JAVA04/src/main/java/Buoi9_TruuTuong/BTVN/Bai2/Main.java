/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai2;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.Push(0);
        s.Push(2);
        s.Push(23);
        s.Display();
        System.out.println("vi tri can tim"+s.Search(2));
        System.out.println("So phan tu "+s.NumOfElement());
        
    }
}
