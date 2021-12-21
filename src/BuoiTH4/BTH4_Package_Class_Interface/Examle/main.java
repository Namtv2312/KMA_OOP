/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH4.BTH4_Package_Class_Interface.Examle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String[] args) {
        try {
            System.out.println(5/0);
        } catch (RuntimeException e) {
            System.out.println(e);
        
        }
        finally{
            System.out.println("ok");
        }
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Administrator\\Desktop\\ok.txt")));
            bw.write("p,");
            bw.newLine();
            bw.write("pokk");
            
          bw.close();
          
        } catch (IOException ex) {
            System.out.println("loi"+ex);
        }
        try {
            BufferedReader bw = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\ok.txt"));
            System.out.println(bw.readLine());

            
            Object[] lie= bw.lines().toArray();
            for(int i=0;i<lie.length;i++){
                System.out.println(lie[i]);
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile("C:\\Users\\Administrator\\Desktop\\ok.txt", "rw");
            randomAccessFile.writeUTF("OK");
            randomAccessFile.seek(0);
            System.out.println(randomAccessFile.readUTF());
        } catch (Exception e) {
        }
    }
}
