/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1_TH2_Bai3_ngaythangnam;

import static java.lang.String.valueOf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class time {
    public static void main(String[] args) {

    SimpleDateFormat myFormat= new SimpleDateFormat("dd/MM/yyyy");
    String inputString1= "1/12/2021";
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ngay dd/MM/YYYY");
        inputString1= sc.nextLine();

    Date date1,date2;
        try {
            date1 = myFormat.parse(inputString1);
            LocalDate localDate = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            date2= myFormat.parse("0/1/"+valueOf(localDate.getYear()));
            System.out.println("Ngay so trong nam: "+ TimeUnit.DAYS.convert(date1.getTime()-date2.getTime(), TimeUnit.MILLISECONDS));
        } catch (ParseException ex) {
            Logger.getLogger(time.class.getName()).log(Level.SEVERE, null, ex);
        }
            
}
} 
