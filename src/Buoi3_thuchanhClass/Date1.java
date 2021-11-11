/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_thuchanhClass;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.time.LocalDate;

/**
 *
 * @author Administrator
 */
public class Date1 {
    public int Day;
    public int Month;
    public int Year;

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    public String getDayy(int d, int m, int y){
        return java.time.format.DateTimeFormatter.ofPattern("EEEE").format(LocalDate.of(y, m, d));
    }
    public  String isLeapYear(int year) {
  if (year % 4 != 0) {
    return "Khong nhuan";
  } else if (year % 400 == 0) {
    return "Nam Nhuan";
  } else if (year % 100 == 0) {
    return "Khong nhuan";
  } else {
    return "Nam nhuan";
  }
}
    
    public void showDate(){
        System.out.println("Date: "+String.valueOf(getDay()+"/")+String.valueOf(getMonth()+"/")+String.valueOf(getYear())+"\tDw: "+getDayy(Day, Month, Year)
        + "\t"+isLeapYear(getYear()));
    }
    
  /*
public static void main(String[] args) {
        Date tesst= new Date();
        tesst.setDay(4);
        tesst.setMonth(5);
        tesst.setYear(2000);
        tesst.showDate();
    }*/
}
