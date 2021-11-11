/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVN_buoi1.ATM;

/**
 *
 * @author Administrator
 */
public class calcTien {
    private int tien;
    private int so500;
    private int so200;
    private int so50;

    public calcTien(int so500, int so200, int so50) {
        this.so500 = so500;
        this.so200 = so200;
        this.so50 = so50;
    }
    

    public calcTien(int tien) {
        this.tien = tien;
    }

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }

    public int getSo500() {
        return so500;
    }

    public void setSo500(int so500) {
        this.so500 = so500;
    }

    public int getSo200() {
        return so200;
    }

    public void setSo200(int so200) {
        this.so200 = so200;
    }

    public int getSo50() {
        return so50;
    }

    public void setSo50(int so50) {
        this.so50 = so50;
    }
    
    public int Tinhtien500(){
        so500=(int) Math.floor(tien/500000);
        return so500;
    }
    public int Tinhtien200(){
      
        so200=(int) Math.floor((tien-so500*500000)/200000);

        return so200;
    }
    public int Tinhtien50(){

        so50=(int) Math.floor((tien-so500*500000-so200*200000)/50000);
        return so50;
    }
}
