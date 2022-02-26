/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Handle {

    ArrayList<NhanVien> nvlst = new ArrayList<>();

    public void handl() {
        File file = new File("dsnv.dat");
        int[] a= {1,2,3}; 
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            br.readLine().trim().split("\\$");
            Object[] lines = br.lines().toArray();
            ass:
            for (int i = 0; i < lines.length; i++) {
                
                String[] in4 = lines[i].toString().trim().split("\\$");
                String name = in4[0];
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(in4[1]);
                String address = in4[2];
                String sex = in4[3];
                String phongBan = in4[4];
                double hesoluong = Double.valueOf(in4[5]);
                int thamnien = Integer.valueOf(in4[6]);
                double luong = Double.valueOf(in4[7]);
                NhanVien nhanVien = new NhanVien(phongBan, hesoluong, thamnien, luong, name, date, address, sex);
                nvlst.add(nhanVien);
                System.out.println(nhanVien.toString());

            }
        } catch (ParseException ex) {
            Logger.getLogger(Handle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Handle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Handle.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
}
