package more_lab10_03.model;

import java.util.ArrayList;
import java.util.List;

public class ListSinhVien implements ISinhVienList {
    List<ISinhVien> list = new ArrayList<>();

    public ListSinhVien() {
        init();
    }

    void init() {
        list.add(new SinhVien("22143455", "Nguyen Van A", "DH2219DTA", "CNTT", "8.0"));
        list.add(new SinhVien("23523245", "Nguyen Van B", "DH2219DTB", "CNTT", "7.0"));
        list.add(new SinhVien("22143534", "Nguyen Van C", "DH2219DTC", "CNTT", "6.0"));
        list.add(new SinhVien("22144355", "Nguyen Van D", "DH2219DTB", "CNTT", "5.0"));
        list.add(new SinhVien("21134356", "Nguyen Van E", "DH2219DTA", "CNTT", "4.0"));
    }

    @Override
    public String getDetailList() {
        StringBuilder sb = new StringBuilder();
        for (ISinhVien sv : list) {
            sb.append(sv.toString()).append("\n");
        }

        return sb.toString();
    }

    @Override
    public String getSimpleList() {
        StringBuilder sb = new StringBuilder();
        for (ISinhVien sv : list) {
            sb.append(sv.getMaSV() + " - " + sv.getHoTen()).append("\n");
        }

        return sb.toString();
    }
}
