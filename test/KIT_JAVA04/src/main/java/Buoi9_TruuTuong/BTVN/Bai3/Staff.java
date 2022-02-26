/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai3;

import java.util.ArrayList;

/**
 *
 * @author NAM SYSTEM
 */
public class Staff {
    ArrayList<StaffMember> staffList = new ArrayList<>();
    public void payday(){
        
    }

    public Staff() {
    }

    public ArrayList<StaffMember> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<StaffMember> staffList) {
        this.staffList = staffList;
    }
    public void addnumber(StaffMember sm)
            
    {
           staffList.add(sm);
    }
    
}
