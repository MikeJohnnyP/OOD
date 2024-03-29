package lab3_extra;

import java.util.Scanner;

import lab3.ex2.*;

public class TestMain {
	public static void main(String[] args) {
		RentStore rentStore = new RentStore();
		RentStore.printList(rentStore.getCustomer());
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao Id: ");
		String id = sc.nextLine();
		Customer temp = rentStore.getCustomer(id);
		if (temp == null) {
			System.out.println("Khong tim thay!!!");
			return;
		}
		boolean isRunning = true;
		while (isRunning) {
			TestMain.choiceYourOption();
			System.out.print("Ban chon: ");
			int x = sc.nextInt();
			switch (x) {
			case 1:
				rentStore.updateInformation(id, sc, temp);
				break;

			case 2:
				rentStore.printHistoryList(temp);
				break;
			case 3:
				System.out.println();
				System.out.println("Tong diem thuong: " + temp.getTotalHistoryFrequentRenterPoint());
				System.out.println();
				break;
			case 4:
				isRunning = false;
				break;

			default:
				System.out.println("Nhap sai!!!");
				break;
			}
		}
	}

	public static void choiceYourOption() {
		System.out.println(
				"1. Thay doi thong tin\n2. Xem lich su thue\n3. Tinh tong diem thuong tu lich su thue\n4. Thoat");
	}
}
