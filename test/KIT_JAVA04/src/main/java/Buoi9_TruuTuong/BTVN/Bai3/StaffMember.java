/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai3;

/**
 *
 * @author NAM SYSTEM
 */
public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
    
    public abstract double  pay();

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    

    @Override
    public String toString() {
        return "Ten: "+this.getName()+", Dia chi: "+this.getAddress()+", So dien thoai: "+this.getPhone();
    }
    
}
