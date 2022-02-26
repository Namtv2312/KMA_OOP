/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai4;

import java.util.Date;


/**
 *
 * @author NAM SYSTEM
 */
public class Man extends Person{
    private boolean watchingFootball;
    public void watchFoootball(){
        
    }
    public boolean isWatchingFootball() {
        return watchingFootball;
    }

    public void setDateOfBirth(Object dob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAgeAsDays() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDateOfBirth(Date dob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
