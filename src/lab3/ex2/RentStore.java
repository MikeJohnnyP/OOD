package lab3.ex2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class RentStore {
	private List<Customer> customer;

	public RentStore() {
		customer = new ArrayList<Customer>();
		init();
	}

	public void init() {
		Movie movie1 = new Movie("The Matrix", new RegularPrice());
		Movie movie2 = new Movie("The Godfather", new RegularPrice());
		Movie movie3 = new Movie("The Dark Knight", new ChildrenPrice());
		Movie movie4 = new Movie("Pulp Fiction", new ChildrenPrice());
		Movie movie5 = new Movie("Schindler's List", new NewReleasePrice());
		Movie movie6 = new Movie("Dune: Last Chance", new SerialPrice());
		Movie movie7 = new Movie("Forrest Gump", new SerialPrice());
		Movie movie8 = new Movie("Inception", new NewReleasePrice());
		Movie movie9 = new Movie("Fight Club", new NewReleasePrice());
		Movie movie10 = new Movie("The Matrix", new NewReleasePrice());

		RentItem rentItem1 = new RentItem(movie1, createDate(2024, Calendar.MARCH, 1));
		RentItem rentItem2 = new RentItem(movie2, createDate(2024, Calendar.MARCH, 5));
		RentItem rentItem3 = new RentItem(movie3, createDate(2024, Calendar.MARCH, 10));
		RentItem rentItem4 = new RentItem(movie4, createDate(2024, Calendar.MARCH, 15));
		RentItem rentItem5 = new RentItem(movie5, createDate(2024, Calendar.MARCH, 20));
		RentItem rentItem6 = new RentItem(movie6, createDate(2024, Calendar.MARCH, 25));
		RentItem rentItem7 = new RentItem(movie7, createDate(2024, Calendar.MARCH, 1));
		RentItem rentItem8 = new RentItem(movie8, createDate(2024, Calendar.MARCH, 5));
		RentItem rentItem9 = new RentItem(movie9, createDate(2024, Calendar.MARCH, 10));
		RentItem rentItem10 = new RentItem(movie10, createDate(2024, Calendar.MARCH, 15));

		RentItem rentItem11 = new RentItem(movie1, createDate(2024, Calendar.MARCH, 1));
		rentItem11.setEndDate(new GregorianCalendar(2024, Calendar.MARCH, 3).getTime());
		RentItem rentItem12 = new RentItem(movie2, createDate(2024, Calendar.MARCH, 5));
		rentItem12.setEndDate(new GregorianCalendar(2024, Calendar.MARCH, 6).getTime());
		RentItem rentItem13 = new RentItem(movie3, createDate(2024, Calendar.MARCH, 10));
		rentItem13.setEndDate(new GregorianCalendar(2024, Calendar.MARCH, 15).getTime());
		RentItem rentItem14 = new RentItem(movie4, createDate(2024, Calendar.MARCH, 15));
		rentItem14.setEndDate(new GregorianCalendar(2024, Calendar.MARCH, 18).getTime());
		RentItem rentItem15 = new RentItem(movie5, createDate(2024, Calendar.MARCH, 20));
		rentItem15.setEndDate(new GregorianCalendar(2024, Calendar.MARCH, 21).getTime());
		RentItem rentItem16 = new RentItem(movie6, createDate(2024, Calendar.MARCH, 25));
		rentItem16.setEndDate(new GregorianCalendar(2024, Calendar.MARCH, 26).getTime());
		RentItem rentItem17 = new RentItem(movie7, createDate(2024, Calendar.MARCH, 1));
		rentItem17.setEndDate(new GregorianCalendar(2024, Calendar.MARCH, 3).getTime());
		RentItem rentItem18 = new RentItem(movie8, createDate(2024, Calendar.MARCH, 5));
		rentItem18.setEndDate(new GregorianCalendar(2024, Calendar.MARCH, 4).getTime());
		RentItem rentItem19 = new RentItem(movie9, createDate(2024, Calendar.MARCH, 10));
		rentItem19.setEndDate(new GregorianCalendar(2024, Calendar.MARCH, 12).getTime());
		RentItem rentItem20 = new RentItem(movie10, createDate(2024, Calendar.MARCH, 15));
		rentItem20.setEndDate(new GregorianCalendar(2024, Calendar.MARCH, 19).getTime());

		Customer cus1 = new Customer("Ta Hoang Phuc", "45ti456", "Trang Bom, Dong Nai");
		Customer cus2 = new Customer("Tran Hoang Oanh", "56yz345", "Bien Hoa");
		Customer cus3 = new Customer("Le Hong Thanh", "23rt565", "Quan 1, TP.HCM");
		Customer cus4 = new Customer("Dinh Thanh Nha", "23ti546", "Long Thanh, Dong Nai");
		Customer cus5 = new Customer("Le Thi Lan", "78hu546", "Tan Trieu, Dong Nai");

		cus1.addRentItem(rentItem1);
		cus1.addRentItem(rentItem2);
		cus2.addRentItem(rentItem3);
		cus2.addRentItem(rentItem4);
		cus3.addRentItem(rentItem5);
		cus3.addRentItem(rentItem6);
		cus4.addRentItem(rentItem7);
		cus4.addRentItem(rentItem8);
		cus5.addRentItem(rentItem9);
		cus5.addRentItem(rentItem10);

		cus1.addRentHistory(rentItem11);
		cus1.addRentHistory(rentItem12);
		cus2.addRentHistory(rentItem13);
		cus2.addRentHistory(rentItem14);
		cus3.addRentHistory(rentItem15);
		cus3.addRentHistory(rentItem16);
		cus4.addRentHistory(rentItem17);
		cus4.addRentHistory(rentItem18);
		cus5.addRentHistory(rentItem19);
		cus5.addRentHistory(rentItem20);

		cus1.addRentHistory(cus1.getRentItems());
		cus2.addRentHistory(cus2.getRentItems());
		cus3.addRentHistory(cus3.getRentItems());
		cus4.addRentHistory(cus4.getRentItems());
		cus5.addRentHistory(cus4.getRentItems());

		customer.add(cus1);
		customer.add(cus2);
		customer.add(cus3);
		customer.add(cus4);
		customer.add(cus5);

	}

	private static Date createDate(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		return calendar.getTime();
	}

	public Customer getCustomer(String id) {
		for (Customer y : customer) {
			if (y.getId().equalsIgnoreCase(id)) {
				return y;
			}
		}
		return null;
	}

	public String choiceForUpdate() {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("1. Thay doi ten\n2. Thay doi ID\n3.Thay doi dia chi\n" + "4. Thay doi tat ca\n");
		return strBuffer.toString();

	}

	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("--------------------------");
	}
	

	public void updateInformation(String id, Scanner sc, Customer temp) {
		boolean isRunning2 = true;
		if (temp != null) {
			while (isRunning2) {
				System.out.print(choiceForUpdate());
				System.out.print("Ban chon: ");
				int x = sc.nextInt();
				sc.nextLine();
				switch (x) {
				case 1: {
					System.out.print("Ten ban nhap: ");
					String name = sc.nextLine();
					customer.remove(temp);
					temp.setName(name);
					customer.add(temp);
					System.out.println("Thay doi thanh cong");
					isRunning2 = false;
					break;
				}
				case 2:
					System.out.print("ID ban nhap: ");
					String idChange = sc.nextLine();
					customer.remove(temp);
					temp.setId(idChange);
					customer.add(temp);
					System.out.println("Thay doi thanh cong");
					isRunning2 = false;
					break;
				case 3:
					System.out.print("Dia chi ban nhap: ");
					String address = sc.nextLine();
					customer.remove(temp);
					temp.setAddress(address);
					customer.add(temp);
					System.out.println("Thay doi thanh cong");
					isRunning2 = false;
					break;

				case 4:
					System.out.print("Ten ban nhap: ");
					String name = sc.nextLine();
					System.out.print("ID ban nhap: ");
					String idChange2 = sc.nextLine();
					System.out.print("Dia chi ban nhap: ");
					String address2 = sc.nextLine();
					customer.remove(temp);
					temp.setAddress(address2);
					temp.setName(name);
					temp.setId(idChange2);
					customer.add(temp);
					System.out.println("Thay doi thanh cong");
					isRunning2 = false;
					break;
				default:
					throw new IllegalArgumentException("Nhap sai x");
				}

			}
		} else {
			System.out.println("Khong tim thay!!!");
		}
	}

	public void printHistoryList(Customer customer) {
		customer.printHistory();

	}
	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	
	public void printCharge() {
		for(Customer cus : customer) {
			System.out.println(cus.fee());
		}
	}

	public static void main(String[] args) {
		RentStore rentStore = new RentStore();
		rentStore.printCharge();
	}

	
}
