/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NAM SYSTEM
 */
public class processStudent implements Serializable {

    ArrayList<Sinhvien> svArrayList = new ArrayList<>();

    public void create() {
        System.out.println("Nhap so luong sinh vien");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            Sinhvien sv = new Sinhvien();
            sv.nhap();
            svArrayList.add(sv);

        }
    }

    public void export() throws FileNotFoundException, IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("student.dat"));

        os.writeObject(svArrayList);
        os.close();

        System.out.println("Done wRITing");
    }

    public void iport() throws ClassNotFoundException {

        try {
            ObjectInputStream oi = new ObjectInputStream(new FileInputStream("student.dat"));

            ArrayList<Sinhvien> deseArrayList = (ArrayList<Sinhvien>) oi.readObject();

            System.out.println(deseArrayList);

            oi.close();
        } catch (IOException ex) {
            Logger.getLogger(processStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
