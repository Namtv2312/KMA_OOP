/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_thuchanhClass;

/**
 *
 * @author Administrator
 */
public class Date {
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
    
    
    public void showDate(){
        System.out.println("Date: "+String.valueOf(getDay()+"/")+String.valueOf(getMonth()+"/")+String.valueOf(getYear()));
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
