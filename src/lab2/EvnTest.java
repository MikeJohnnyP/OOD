package lab2;

import java.util.Scanner;

public class EvnTest {
    public static void main(String[] args) {
        EVNComDivision evn = new EVNComDivision();
        boolean isRunning = true;
        while (isRunning) {
            Customer getCus;
            System.out.println("-----------------------------");
            System.out.println("1. Danh sach ho gia dinh");
            System.out.println("2. Danh sach doanh nghiep");
            System.out.println("3. Thoat");
            System.out.print("Ban chon: ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    evn.printResCustomer();
                    System.out.print("Chon STT khach hang in don gia: ");
                    x = sc.nextInt();
                    if (x > evn.getResCustomerList().size() || x <= 0) {
                        System.out.println("Khong co trong danh sach!!!");
                        break;
                    }
                    getCus = evn.getResCustomer(x);
                    getCus.printReport();
                    break;
                case 2:
                    evn.printBusinessCustomer();
                    System.out.print("Chon STT khach hang in don gia: ");
                    x = sc.nextInt();
                    if (x > evn.getBusinessCustomerList().size() || x <= 0) {
                        System.out.println("Khong co trong danh sach!!!");
                        break;
                    }
                    getCus = evn.getBusinessCustomer(x);
                    getCus.printReport();
                    break;
                case 3:
                    isRunning = false;
                    sc.close();
                    break;
                default:
                    System.out.println("Nhap sai");
                    break;
            }
        }

    }
}
