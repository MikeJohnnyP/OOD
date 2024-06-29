package lab7.ex4;

public class CompanyDatabase extends Core {

    @Override
    public void init() {
        addKey("NHANVIEN");

        addValue("NHANVIEN", new NhanVien("Ta Hoang Phuc", "London, UK", "TP.HCM", "31-12-2021"));
        addValue("NHANVIEN", new NhanVien("Nguyen Van A", "Hanoi, Vietnam", "TP.HCM", "31-12-2021"));
        addValue("NHANVIEN", new NhanVien("Tran Van B", "Hanoi, Vietnam", "TP.HCM", "31-12-2021"));
        addValue("NHANVIEN", new NhanVien("Le Van C", "Hanoi, Vietnam", "TP.HCM", "31-12-2021"));
        addValue("NHANVIEN", new NhanVien("Pham Van D", "Hanoi, Vietnam", "TP.HCM", "31-12-2021"));

        addKey("GIOLAM");
        addValue("GIOLAM", new GioLam("3453", "124354", "56"));
        addValue("GIOLAM", new GioLam("3453", "432566", "13"));
        addValue("GIOLAM", new GioLam("3453", "754365", "567"));
        addValue("GIOLAM", new GioLam("3453", "325513", "1000"));
        addValue("GIOLAM", new GioLam("3453", "4325324", "infinite"));

    }

    @Override
    protected boolean instanceOf(Object obj) {
        return false;
    }

}
