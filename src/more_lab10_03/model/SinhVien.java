package more_lab10_03.model;

public class SinhVien implements ISinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String khoa;
    private String diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String lop, String khoa, String diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.khoa = khoa;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "MaSV: " + maSV + ", Hovaten: " + hoTen + ", lop: " + lop + ", khoa: " + khoa + ", DiemTB: " + diemTB;
    }

    @Override
    public String getMaSV() {
        return maSV;
    }

    @Override
    public String getHoTen() {
        return hoTen;
    }

    @Override
    public String getLop() {
        return lop;
    }

    @Override
    public String getKhoa() {
        return khoa;
    }

    @Override
    public String getDiemTB() {
        return diemTB;
    }

    @Override
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public void setDiemTB(String diemTB) {
        this.diemTB = diemTB;
    }

}
