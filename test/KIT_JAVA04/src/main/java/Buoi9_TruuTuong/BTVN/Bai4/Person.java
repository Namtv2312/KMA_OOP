/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai4;

/**
 *
 * @author NAM SYSTEM
 */
public abstract class Person implements Mammal{
    private String firstName;
    BloodGroup nhomMau;
    Address diaChi;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
}
