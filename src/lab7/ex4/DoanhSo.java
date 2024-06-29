package lab7.ex4;

import java.util.List;

public class DoanhSo implements Table {
    private String idHang, tenHang, slBan, donGia;

    public DoanhSo(String idHang, String tenHang, String slBan, String donGia) {
        this.idHang = idHang;
        this.tenHang = tenHang;
        this.slBan = slBan;
        this.donGia = donGia;
    }

    public String getIdHang() {
        return idHang;
    }

    public void setIdHang(String idHang) {
        this.idHang = idHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getSlBan() {
        return slBan;
    }

    public void setSlBan(String slBan) {
        this.slBan = slBan;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(
                "\nIdHang:" + idHang + ", TenHang: " + tenHang + ", SoLuongBan: " + slBan + ", DonGia: " + donGia);
        return builder.toString();
    }

    @Override
    public void update(String[] text, Table table) {
        switch (text[0]) {
            case "idhang" -> {
                if (this.getIdHang().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setIdHang(((DoanhSo) table).getIdHang());
                }
            }
            case "tenhang" -> {
                if (this.getTenHang().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setTenHang(((DoanhSo) table).getTenHang());
                }
            }
            case "slban" -> {
                if (this.getSlBan().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setSlBan(((DoanhSo) table).getSlBan());
                }
            }
            case "dongia" -> {
                if (this.getDonGia().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setDonGia(((DoanhSo) table).getDonGia());
                }
            }
            default -> {
                throw new IllegalArgumentException("Unexpected value: " + text[0]);
            }
        }
    }

    @Override
    public void query(String[] text, List<Table> list) {
        switch (text[0]) {
            case "idhang" -> {
                if (this.getIdHang().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            case "tenhang" -> {
                if (this.getTenHang().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            case "slban" -> {
                if (this.getSlBan().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            case "dongia" -> {
                if (this.getDonGia().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            default -> {
                throw new IllegalArgumentException("Unexpected value: " + text[0]);
            }
        }
    }

}
