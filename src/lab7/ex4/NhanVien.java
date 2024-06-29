package lab7.ex4;

import java.util.List;

public class NhanVien implements Table {
    String hoTen, diaChi, noiLamViec, ngayVaoLam;

    public NhanVien(String hoTen, String diaChi, String noiLamViec, String ngayVaoLam) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.noiLamViec = noiLamViec;
        this.ngayVaoLam = ngayVaoLam;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNoiLamViec() {
        return noiLamViec;
    }

    public void setNoiLamViec(String noiLamViec) {
        this.noiLamViec = noiLamViec;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nHoTen:" + hoTen + ", DiaChi: " + diaChi + ", NoiLamViec: " + noiLamViec + ", NgayVaoLam: "
                + ngayVaoLam);
        return builder.toString();
    }

    @Override
    public void update(String[] text, Table table) {
        switch (text[0]) {
            case "hoten" -> {
                if (this.gethoTen().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.sethoTen(((NhanVien) table).gethoTen());
                }
            }
            case "diachi" -> {
                if (this.getDiaChi().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setDiaChi(((NhanVien) table).getDiaChi());
                }
            }
            case "noilamviec" -> {
                if (this.getNoiLamViec().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setNoiLamViec(((NhanVien) table).getNoiLamViec());
                }
            }
            case "ngayvaolam" -> {
                if (this.getNgayVaoLam().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setNgayVaoLam(((NhanVien) table).getNgayVaoLam());
                }
            }
            default -> {
                System.out.println("Khong tim thay");
            }
        }
    }

    @Override
    public void query(String[] text, List<Table> list) {
        switch (text[0]) {
            case "hoten" -> {
                if (this.gethoTen().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            case "diachi" -> {
                if (this.getDiaChi().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            case "noilamviec" -> {
                if (this.getNoiLamViec().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            case "ngayvaolam" -> {
                if (this.getNgayVaoLam().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            default -> {
                System.out.println("Khong tim thay");
            }
        }

    }
}
