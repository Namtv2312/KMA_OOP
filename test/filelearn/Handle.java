package filelearn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Handle {

    ArrayList<NhanVien> lss = new ArrayList<>();

    public void nhap() {
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            lss.add(new NhanVien("Tran Van Nam", df.parse("23/12/2001"), "Vp", "Nam", "HACK", 10., 10, 1000000));
            lss.add(new NhanVien("Tran Van a", df.parse("23/12/2001"), "Vp", "Nam", "HACK", 10., 10, 1000000));
            lss.add(new NhanVien("Tran Van am", df.parse("23/12/2001"), "Vp", "Nam", "HACK", 10., 10, 1000000));
            lss.add(new NhanVien("Tran Van Nm", df.parse("23/12/2001"), "Vp", "Nam", "HACK", 10., 10, 1000000));
            lss.add(new NhanVien("Tran Van Na", df.parse("23/12/2001"), "Vp", "Nam", "HACK", 10., 10, 1000000));
        } catch (ParseException ex) {
            Logger.getLogger(Handle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fil() {

        try {
            File file = new File("E:\\KMA_OOP\\test\\filelearn\\FILETES.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < lss.size(); i++) {
                bw.write("Hacker thu" + (i + 1) + "{");
                bw.newLine();
                bw.write(lss.get(i).toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Handle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void outfil() {
        try {
            File file = new File("E:\\KMA_OOP\\test\\filelearn\\FILETES.txt");
            FileReader fw = new FileReader(file);
            BufferedReader bw = new BufferedReader(fw);

            String s;
            while ((s = bw.readLine()) != null) {
                System.out.println(s);
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Handle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
