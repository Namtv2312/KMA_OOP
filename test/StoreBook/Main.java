/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StoreBook;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        Store st1 = new Store();
        while (true) {
            st1.menu();
           String chon = new Scanner(System.in).nextLine();
            switch (chon) {
                case "1":
                    st1.add();
                    break;
                case "2":
                    st1.edit();
                    break;
                case "3":
                    st1.Delete();
                    break;
                case "4":
                    st1.find();
                    break;
                case "5":
                    st1.list();
                    break;
                case "6":
                    st1.sort(st1.bookLst);
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Bạn chọn sai rồi");

            }
        }
    }
}
