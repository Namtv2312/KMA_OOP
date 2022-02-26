package TranVanNam_AT160632;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class SinhVien {
   private String maSV;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private double diem;
    public SinhVien(String maSV, String hoTen, Date ngaySinh, String gioiTinh, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

   
    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void nhap()
    {
        
    }
    @Override
    public String toString() {
        return "maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + ", gioiTinh=" + gioiTinh + ", diem=" + diem;
    }

}
