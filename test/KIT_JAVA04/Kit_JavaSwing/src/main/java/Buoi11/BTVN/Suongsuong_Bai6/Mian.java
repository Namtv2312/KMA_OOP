/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai6;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NAM SYSTEM
 */
public class Mian {

    public static void main(String[] args) {
        processStudent pStudent = new processStudent();
        pStudent.create();
        try {
            pStudent.export();
        } catch (IOException ex) {
            Logger.getLogger(Mian.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pStudent.iport();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
