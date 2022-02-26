/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4.trenlop.Bai1;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         PhanSo ps = new PhanSo();
         while(true){
             System.out.printf("\n%30s_____________________________\n","");
             System.out.printf("%30s|_____________MENU__________|\n","");
             System.out.printf("%30s|1. Nhap phan so va hien thi|\n","");
             System.out.printf("%30s|2. Hien thi dang rut gon   |\n","");
             System.out.printf("%30s|3. Cong tru nhan chia ps   |\n","");
             System.out.printf("%30s|4. In ra dang thap phan    |\n","");
             System.out.printf("%30s|5. Exit                    |\n","");
             System.out.println("Moi ban chon chuc nang");
             int chon= sc.nextInt();
             switch(chon)
             {
                 case 1:  
                             ps.nhap();
                             System.out.println("Phan so vua nhap la: ");
                             ps.xuat();
                             break;
                 case 2: System.out.println("Phan so dang rut gon: ");
                 ps.rutgon(ps.tuso,ps.mauso);
                 break;
                 case 3:
                     PhanSo ps2 = new PhanSo();    
                     System.out.println("Nhap phan so thu hai: ");
                      ps2.nhap();  
                           System.out.println("Tong hai phan so la:");
                          ps.cong(ps2);
                          System.out.println("Hieu hai phan so la:");
                       ps.tru(ps2);
                      System.out.println("Tich hai phan so la:");
                      ps.nhan(ps2);
                      System.out.println("Thuong hai phan so la:");
                       ps.chia(ps2);
                       break;
                 case 4: ps.thapphan();
                 case 5: exit(0);
             }
             System.out.println("NHan phim bat ki de ve menu");

         }     
     }
}
