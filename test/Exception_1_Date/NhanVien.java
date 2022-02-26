/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_1_Date;

import static java.lang.Double.parseDouble;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVien {

    public String Hoten;
    public Date ngaySih;
    public double luong;

    public NhanVien() {
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public Date getNgaySih() {
        return ngaySih;
    }

    public void setNgaySih(Date ngaySih) {
        this.ngaySih = ngaySih;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ho ten: ");
            Hoten = sc.nextLine();
            if (Hoten.length() == 0) {
                System.out.println("Phai nhap chuoi khong rong: ");

            } else {
                break;
            }
        }
        while (true) {
            XDate format = new XDate();
            System.out.println("Nhap ngay sinh ;F");
            String date1 = sc.nextLine();
            try {
                ngaySih = format.parse(date1);
                break;
            } catch (RuntimeException e) {
                System.out.println("Nhap lai ngay sinh: not null, dd-MM-yyyy");
            }
        }
        while (true) {
            System.out.println("Nhap luong: ");
            String salary = sc.nextLine();
            try {
                luong = parseDouble(salary);
                if (luong <= 0) {
                    System.out.println("Luong phai lon hon khong, notnull");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Luong phai lon hon khong, notnull");
            }

        }

    }

    @Override
    public String toString() {
        return "NhanVien{" + "Hoten=" + Hoten + ", ngaySih=" + ngaySih + ", luong=" + luong + '}';
    }

}
