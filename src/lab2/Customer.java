package lab2;

public abstract class Customer {
	private String name;
	private String address;
	private String id;

	public Customer(String name, String address, String id) {
		this.name = name;
		this.address = address;
		this.id = id;
	}

	public abstract long charge();

	public abstract long chargeByTime(int fromDay, int fromMonth, int fromYear,
			int toDay, int toMonth, int toYear);

	public abstract void printReport();

	public abstract void printReading();

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getId() {
		return id;
	}

}
