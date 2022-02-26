package TranVanNam_AT160632;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class SinhVienATTT extends SinhVien {

    private float hocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienATTT(float hocPhi, String maSV, String hoTen, Date ngaySinh, String gioiTinh, double diem) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diem);
        this.hocPhi = hocPhi;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public String xuat() {
        return "SinhVienATTT{" + super.toString() + ", hocPhi=" + hocPhi + '}';
    }
}
