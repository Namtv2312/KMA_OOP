/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_Book;

import Bai1_Book.Controlers.Book_Controler;
import Bai1_Book.Views.Book_View;
import Bai1_Book.Views.Table_View;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {

    public static void main(String[] args) {
        Book_View view = new Book_View();
        Table_View view1 = new Table_View();
        Book_Controler bc= new Book_Controler(view, view1);
    }

}
