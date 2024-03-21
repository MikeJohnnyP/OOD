package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EVNComDivision {

    private List<ResidentalCustomer> resCustomerList;
    private List<BusinessCustomer> businessCustomerList;

    public EVNComDivision() {
        resCustomerList = new ArrayList<>();
        businessCustomerList = new ArrayList<>();
        init();
    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("--------------------------");
    }

    public void init() {
        ResidentalCustomer res1 = new ResidentalCustomer("Ta Hoang Phuc", "112, le Loi", "2345454");
        ResidentalCustomer res2 = new ResidentalCustomer("Nguyen Thi Loi", "456, Tran Nhap Tong", "34532543");
        ResidentalCustomer res3 = new ResidentalCustomer("Hong Thi Ha", "320, Bien Hoa", "456365453");
        ResidentalCustomer res4 = new ResidentalCustomer("Le Uyen Uong", "568, Q.Tan Binh", "56423543");
        BusinessCustomer busi1 = new BusinessCustomer("Xuong cua Le Phong", "345, Nguyen Ngoc Thach", "433435454",
                543654344);
        BusinessCustomer busi2 = new BusinessCustomer("Det may Tien Phat", "4334, Le Loi", "432536644",
                543654344);
        BusinessCustomer busi3 = new BusinessCustomer("Nha hang an lien", "564, Tran Hung Dao", "563454653",
                543654344);
        BusinessCustomer busi4 = new BusinessCustomer("Xuong cua Hai Chu", "678, Tran Nhan Tong", "536534667",
                543654344);

        addRandomReading(res1);
        addRandomReading(res4);
        addRandomReading(res2);
        addRandomReading(res3);

        addRandomReading(busi1);
        addRandomReading(busi2);
        addRandomReading(busi3);
        addRandomReading(busi4);

        addResCustomer(res1);
        addResCustomer(res2);
        addResCustomer(res3);
        addResCustomer(res4);

        addBusinessCustomer(busi1);
        addBusinessCustomer(busi2);
        addBusinessCustomer(busi3);
        addBusinessCustomer(busi4);
    }

    public void addRandomReading(ResidentalCustomer res) {
        Random r = new Random();
        for (int i = 1; i < 13; i++) {
            res.addReading(r.nextInt(i) + 1 + 1, r.nextInt(i) + 1, r.nextInt(2) + 2020, new OneReading(r.nextInt(500)));
        }
    }

    public void addRandomReading(BusinessCustomer business) {
        Random r = new Random();
        for (int i = 1; i < 13; i++) {
            business.addReading(r.nextInt(i) + 1, r.nextInt(i) + 1, r.nextInt(2) + 2020,
                    new ThreeReading(r.nextInt(100) + 400, r.nextInt(50), r.nextInt(100)));
        }
    }

    public void addResCustomer(ResidentalCustomer residentalCustomer) {
        resCustomerList.add(residentalCustomer);
    }

    public void addBusinessCustomer(BusinessCustomer businessCustomer) {
        businessCustomerList.add(businessCustomer);
    }

    public List<ResidentalCustomer> getResCustomerList() {
        return this.resCustomerList;
    }

    public List<BusinessCustomer> getBusinessCustomerList() {
        return this.businessCustomerList;
    }

    public void printResCustomer() {
        for (int i = 0; i < resCustomerList.size(); i++) {
            System.out.println((i + 1) + ". " + resCustomerList.get(i));
        }
    }

    public void printBusinessCustomer() {
        for (int i = 0; i < businessCustomerList.size(); i++) {
            System.out.println((i + 1) + ". " + businessCustomerList.get(i));
        }
    }

    public Customer getResCustomer(int index) {
        return resCustomerList.get(index - 1);
    }

    public Customer getBusinessCustomer(int index) {
        return businessCustomerList.get(index - 1);
    }

    public void timeGetCharge(Customer cus, Scanner sc) {
        System.out.println("chon moc ngay tinh gia: ");
        System.out.println("1. Tu 1/1/2020 -> 1/1/2021");
        System.out.println("2. Tuy chon");
        System.out.print("Ban chon: ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println(cus);
                cus.printReading();
                System.out.println("Gia dien trung binh: " + cus.chargeByTime(1, 1, 2020, 1, 1, 2021));
                break;
            case 2:
                System.out.println("Nhap vao ngay thang nam bat dau: ");
                System.out.print("Ngay bat dau: ");
                int toDay = sc.nextInt();
                System.out.print("Thang bat dau: ");
                int fromMonth = sc.nextInt();
                System.out.println("Nam bat dau: ");
                int fromYear = sc.nextInt();
                System.out.print("Ngay ket thuc: ");
                int fromDay = sc.nextInt();
                System.out.print("Thang ket thuc: ");
                int toMonth = sc.nextInt();
                System.out.print("Nam ket thuc: ");
                int toYear = sc.nextInt();
                if (fromDay <= 0 || fromDay > 31 || fromMonth <= 0 || fromMonth > 12 || fromYear < 0 ||
                        toDay <= 0 || toDay > 31 || toMonth <= 0 || toMonth > 12 || toYear < 0) {
                    System.out.println("Nhap sai du lieu ngay thang");
                    break;
                }
                System.out.println(cus);
                cus.printReading();
                System.out.println("Gia dien trung binh: "
                        + cus.chargeByTime(fromDay, fromMonth, fromYear, toDay, toMonth, toYear));
                break;

            default:
                System.out.println("Nhap sai!!!");
                break;
        }
    }

}
