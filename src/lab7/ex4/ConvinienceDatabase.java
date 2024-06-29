package lab7.ex4;

public class ConvinienceDatabase extends Core {

    @Override
    public void init() {
        addKey("BANHANG");
        addValue("BANHANG", new BanHang("45634", "Nuoc Giai Khat", "Coca Cola"));
        addValue("BANHANG", new BanHang("56547", "Khoai tay Lays", "Lays inc"));
        addValue("BANHANG", new BanHang("4563", "Banh Oreo", "Oreo inc"));
        addValue("BANHANG", new BanHang("65465", "Banh mi", "Nha lam inc"));
        addValue("BANHANG", new BanHang("5344235", "Monster", "Monster inc"));

        addKey("NHANVIEN");
        addValue("NHANVIEN", new NhanVien("Nguyen Van A", "Ha Noi", "Ha Noi", "12/12/2012"));
        addValue("NHANVIEN", new NhanVien("Nguyen Van B", "Ha Noi", "Ha Noi", "12/12/2012"));
        addValue("NHANVIEN", new NhanVien("Nguyen Van C", "Ha Noi", "Ha Noi", "12/12/2012"));
        addValue("NHANVIEN", new NhanVien("Nguyen Van D", "Ha Noi", "Ha Noi", "12/12/2012"));
        addValue("NHANVIEN", new NhanVien("Nguyen Van E", "Ha Noi", "Ha Noi", "12/12/2012"));

        addKey("DOANHSO");
        addValue("DOANHSO", new DoanhSo("45634", "Nuoc Giai Khat", "100", "10000"));
        addValue("DOANHSO", new DoanhSo("56547", "Khoai tay Lays", "65", "10000"));
        addValue("DOANHSO", new DoanhSo("4563", "Banh Oreo", "34", "5000"));
        addValue("DOANHSO", new DoanhSo("65465", "Banh mi", "70", "140000"));
        addValue("DOANHSO", new DoanhSo("5344235", "Monster", "234", "30000"));

    }

    @Override
    protected boolean instanceOf(Object obj) {
        return false;
    }

}
