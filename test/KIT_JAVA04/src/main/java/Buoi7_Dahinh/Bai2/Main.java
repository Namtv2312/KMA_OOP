/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Dahinh.Bai2;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {
    public static void main(String[] args) {
        QuanliNV ql = new QuanliNV();
        while(true)
        {
            ql.menu();
            int chon=new Scanner(System.in).nextInt();
            switch(chon)
            {
                case 1:ql.nhap();
                case 2: ql.xuat();
            }
        }
            
    }
}
