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
public class Stack {

    Node top;
    private int size;

    public Stack(Node top) {
        this.top = null;
    }

    Stack() {

    }

    String isEmty() {
        if (this.top == null) {
            return "true";
        } else {
            return "false";
        }
    }

    public void Push(int item) {
        Node p = new Node(item, null);

        if (isEmty().equalsIgnoreCase("true")) {
            this.top = p;
        } else {
            p.setNext(this.top);
            this.top = p;
        }
    }

    public int peek() {
        return this.top.getData();
    }

    public int pop() {
        if (isEmty().equalsIgnoreCase("false")) {
            int x = this.top.getData();
            this.top = this.top.getNext();
            return x;
        } else {
            return -1;
        }
    }

    public int NumOfElement() {
        Node a;
        size = 0;
        if (isEmty().equalsIgnoreCase("true")) {
            return 0;
        } else {
            for (a = top; a != null; a = a.getNext()) {
                size++;
            }
            return size;
        }
    }

    public void Display() {
        Node p;
        if (isEmty().equalsIgnoreCase("true")) {
            System.out.println("List blank");

        } else {
            for (p = top; p != null; p = p.getNext()) {
                System.out.println(p.getData());
            }

        }

    }

    public int Search(int x) {
        Node a;
        int i = 0;
        for (a = top; a != null; a = a.getNext()) {
            i++;
            if (a.getData() == x) {
                return i;
            }
        }
        return 0;

    }
}
