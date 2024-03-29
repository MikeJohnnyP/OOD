package lab3.ex2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String id;
	private String address;
	private List<RentItem> rentItems;
	private List<RentItem> rentalHistoryList;

	public Customer(String name, String id, String address) {
		this.name = name;
		this.id = id;
		this.address = address;
		rentItems = new ArrayList<>();
		rentalHistoryList = new ArrayList<RentItem>();
	}

	public void addRentItem(RentItem item) {
		rentItems.add(item);
	}

	public void removeItem(RentItem rentItem) {
		rentItems.remove(rentItem);
	}

	public void removeRentHistory(RentItem rentItem) {
		rentalHistoryList.remove(rentItem);
	}

	public RentItem getRentItem(String title) {
		for (RentItem y : rentItems) {
			if (y.getMovie().getTitle().equals(title)) {
				return y;
			}
		}
		return null;
	}

	public void addRentHistory(RentItem rentItem) {
		rentalHistoryList.add(rentItem);
	}

	public void addRentHistory(List<RentItem> rentList) {
		for (RentItem y : rentList) {
			addRentHistory(y);
		}
	}

	public String fee() {
		StringBuffer result = new StringBuffer();
		result.append("Ho va ten: " + getName() + "\nId: " + getId() + "\nDia chi: " + getAddress() + "\n");

		for (RentItem y : rentItems) {
			result.append(y.getMovie().getTitle() + "\t" + y.getCharge() + '\n');

		}

		result.append("Tong tien: " + getTotalCharge() + '\n');
		result.append("Diem Thuong: " + getTotalFrequentRenterPoint() + "\n");

		return result.toString();
	}

	public double getTotalCharge() {
		double result = 0;
		for (RentItem y : rentItems) {
			result += y.getCharge();
		}
		return result;

	}

	public double getTotalHistoryCharge() {
		double result = 0;
		for (RentItem y : rentalHistoryList) {
			if (y.getEndDate() != null) {
				result += y.getChargeWithEndDay();
			} else
				result += y.getCharge();
		}
		return result;

	}

	public double getTotalFrequentRenterPoint() {
		double result = 0;
		for (RentItem y : rentItems) {
			result += y.getFrequentRenterPointers();
		}
		return result;
	}

	public double getTotalHistoryFrequentRenterPoint() {
		double result = 0;
		for (RentItem y : rentalHistoryList) {
			if (y.getEndDate() != null) {
				result += y.getFrequentRenterPointersWithEndDay();
			} else
				result += y.getFrequentRenterPointers();
		}
		return result;
	}

	public void printHistory() {
		for (RentItem y : rentalHistoryList) {

			if (y.getEndDate() == null) {
				System.out.print(y.getMovie().getTitle() + "\t" + y.getSdf().format(y.getStartDate()) + "\t\t\t");
				System.out.println(y.getCharge());
			} else {
				System.out.print(y.getMovie().getTitle() + "\t" + y.getSdf().format(y.getStartDate()) + "\t"
						+ y.getSdf().format(y.getEndDate()) + "\t");
				System.out.println(y.getChargeWithEndDay());
				
			}

		}
		System.out.println("--------------------------");
	}
	

	@Override
	public String toString() {
		return getName() + "\t" + getId() + "\t" + getAddress();
	}

	public List<RentItem> getRentalHistoryList() {
		return rentalHistoryList;
	}

	public void setRentalHistoryList(List<RentItem> rentalHistoryList) {
		this.rentalHistoryList = rentalHistoryList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<RentItem> getRentItems() {
		return rentItems;
	}

	public void setRentItems(List<RentItem> rentItems) {
		this.rentItems = rentItems;
	}

}
