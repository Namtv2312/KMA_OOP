package filelearn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class NhanVien {

    String hoTen;
    private Date ngaySinh;
    private String diaChi;
    private String gioiTinh;
    private String phongBan;
    private double hsLuong;
    private int thamNien;
    private double luongCB;

    public NhanVien() {
    }

    public NhanVien(String hoTen, Date ngaySinh, String diaChi, String gioiTinh, String phongBan, double hsLuong, int thamNien, double luongCB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.phongBan = phongBan;
        this.hsLuong = hsLuong;
        this.thamNien = thamNien;
        this.luongCB = luongCB;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoTen=" + hoTen + ", ngaySinh=" +  new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", phongBan=" + phongBan + ", hsLuong=" + hsLuong + ", thamNien=" + thamNien + ", luongCB=" + luongCB + '}';
    }

    public String getPhongBan() {

        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHsLuong() {
        return hsLuong;
    }

    public void setHsLuong(double hsLuong) {
        this.hsLuong = hsLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    double luongThucLinh() {
        return luongCB * hsLuong * (1 + thamNien / 100);
    }

    public static void ok() {
        System.out.println("s");
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
