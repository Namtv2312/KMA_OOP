/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_namarchtv;

/**
 *
 * @author Administrator
 */
class Msg {

    public Msg() {
        System.out.println("Hello");
    }
    

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }

}

class Test extends Msg {

    public Test() {
        super();
        System.out.println("Hello Java");
    }

    public void sayGoodbye() {
        System.out.println("Goodbye Java");
    }
}

public class TestContructor {

    public static void main(String[] args) {
        Msg m1 = new Msg();
        Msg m2 = new Test();
        m1.sayGoodbye();
        m2.sayGoodbye();
        
        
    }
}
