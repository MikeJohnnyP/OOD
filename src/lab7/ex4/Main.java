package lab7.ex4;

public class Main {
    public static void main(String[] args) {
        Core dt2 = new CompanyDatabase();
        dt2.init();

        dt2 = new ConvinienceDatabase();
        dt2.init();

        Database t = new MyDatabase(dt2);
        t.updateData(Core.createEntry("NHANVIEN", new NhanVien(null, null, null, null)), "diachi = Hanoi");
        t.insertData(Core.createEntry("NHANVIEN", new NhanVien("1", "2", "3", "4")));
        t.deleteData("NHANVIEN", "diachi = Hanoi");
        t.printDatabase();

        AnotherDatabase t2 = new MyAnotherDatabase(dt2);
        t2.updateData(Core.createEntry("NHANVIEN", new NhanVien(null, null, null, null)), "diachi = Hanoi");
        t2.insertData(Core.createEntry("NHANVIEN", new NhanVien("1", "2", "3", "4")));
        t2.deleteData("NHANVIEN", "diachi = Hanoi");
        t2.printDatabase();

        t2 = new MyAnotherDatabaseAdapter(t);
        t2.updateData(Core.createEntry("NHANVIEN", new NhanVien(null, null, null, null)), "diachi = Hanoi");
        t2.insertData(Core.createEntry("NHANVIEN", new NhanVien("1", "2", "3", "4")));
        t2.deleteData("NHANVIEN", "diachi = Hanoi");
        t2.printDatabase();

    }
}
