package lab7.ex4;

import java.util.List;

public class GioLam implements Table {
    private String idGioLam, idNhanVien, luongGio;

    public GioLam(String idGioLam, String idNhanVien, String luongGio) {
        this.idGioLam = idGioLam;
        this.idNhanVien = idNhanVien;
        this.luongGio = luongGio;
    }

    public String getIdGioLam() {
        return idGioLam;
    }

    public void setIdGioLam(String idGioLam) {
        this.idGioLam = idGioLam;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getLuongGio() {
        return luongGio;
    }

    public void setLuongGio(String luongGio) {
        this.luongGio = luongGio;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nIdGioLam:" + idGioLam + ", IdNhanVien: " + idNhanVien + ", LuongGio: " + luongGio);
        return builder.toString();
    }

    @Override
    public void update(String[] text, Table table) {
        switch (text[0]) {
            case "idgiolam" -> {
                if (this.getIdGioLam().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setIdGioLam(((GioLam) table).getIdGioLam());
                }
            }
            case "idnhanvien" -> {
                if (this.getIdNhanVien().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setIdNhanVien(((GioLam) table).getIdNhanVien());
                }
            }
            case "luonggio" -> {
                if (this.getLuongGio().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    this.setLuongGio(((GioLam) table).getLuongGio());
                }
            }
            default -> {
                System.out.println("Invalid field");
            }
        }
    }

    @Override
    public void query(String[] text, List<Table> list) {
        switch (text[0]) {
            case "idgiolam" -> {
                if (this.getIdGioLam().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            case "idnhanvien" -> {
                if (this.getIdNhanVien().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            case "luonggio" -> {
                if (this.getLuongGio().replaceAll(" ", "").equalsIgnoreCase(text[1])) {
                    list.add(this);
                }
            }
            default -> {
                System.out.println("Invalid field");
            }
        }
    }

}
