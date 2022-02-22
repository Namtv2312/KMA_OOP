/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPMN;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        Management st1 = new Management();
        while (true) {
            st1.menu();
            String chon = new Scanner(System.in).nextLine();
            switch (chon) {
                case "1":
                    st1.nhapSPs();
                    break;
                case "2":
                    st1.addKHs();
                    break;
                case "3":
                    st1.editKHs();
                    break;
                case "4":
                    st1.editSPs();
                    break;
                case "5":
                    st1.inSPs();
                    break;
                case "6":
                    st1.buySPs();
                    break;
                case "7":
                    st1.listKHsUP();
                    break;
                case "8":
                    st1.maxKHs();
                    break;

                case "0":
                    return;
                default:
                    System.out.println("Bạn chọn sai rồi");

            }
        }
    }
}
