package TranVanNam_AT160632;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class SinhVienMatMa extends SinhVien {

    private String donVi;
    private int luong;

    public SinhVienMatMa(String donVi, int luong, String maSV, String hoTen, Date ngaySinh, String gioiTinh, double diem) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diem);
        this.donVi = donVi;
        this.luong = luong;
    }

    public SinhVienMatMa(String donVi, int luong) {
        this.donVi = donVi;
        this.luong = luong;
    }

    public SinhVienMatMa() {
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "SinhVienMatMa{" + super.toString() + ", donVi=" + donVi + ", luong=" + luong + '}';
    }

}
