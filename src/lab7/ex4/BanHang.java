package lab7.ex4;

import java.util.List;

public class BanHang implements Table {
    private String idHang, tenHang, nhaCC;

    public BanHang(String idHang, String tenHang, String nhaCC) {
        this.idHang = idHang;
        this.tenHang = tenHang;
        this.nhaCC = nhaCC;
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

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nIdHang:" + idHang + ", TenHang: " + tenHang + ", NhaCC: " + nhaCC);
        return builder.toString();
    }

    @Override
    public void update(String[] text, Table table) {
        switch (text[0]) {
            case "idhang" -> {
                if (this.getIdHang().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setIdHang(((BanHang) table).getIdHang());
                }
            }
            case "tenhang" -> {
                if (this.getTenHang().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setTenHang(((BanHang) table).getTenHang());
                }
            }
            case "nhacc" -> {
                if (this.getNhaCC().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setNhaCC(((BanHang) table).getNhaCC());
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
            case "nhacc" -> {
                if (this.getNhaCC().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            default -> {
                System.out.println("Khong tim thay");
            }
        }

    }

}
