/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KITbai2;

import java.io.ObjectStreamConstants;
import static java.lang.System.exit;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {
    public static void main(String[] args) {
        DanhsachHs list = new DanhsachHs();
        
        while (true)
        {
            list.menu();
            int chon;
            chon= new Scanner(System.in).nextInt();
            switch (chon)
            {
                case 1: list.them();break;
                case 2:  list.xuatALL();break;
                case 3: list.xuatyc3();break;
                case 4: list.xuatyc4();break;
                case 5:
                case 6: exit(0);
                    default: System.out.println("nHAP LAI di");
            }
        }
    }
}
