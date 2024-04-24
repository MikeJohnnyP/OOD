package lab2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

public class BusinessCustomer extends Customer {

	private long bankAccountNumber;
	private TreeMap<Calendar, ThreeReading> reading;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public BusinessCustomer(String name, String address, String id, long bankAccountNumber) {
		super(name, address, id);
		reading = new TreeMap<>();
		this.bankAccountNumber = bankAccountNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public TreeMap<Calendar, ThreeReading> getReading() {
		return this.reading;
	}

	@Override
	public long charge() {
		if (!(reading.isEmpty())) {
			ThreeReading temp = reading.lastEntry().getValue();
			long highIndex = temp.getHighIndex();
			long lowIndex = temp.getLowIndex();
			long nomalIndex = temp.getIndex() - highIndex - lowIndex;

			return highIndex * 1480 + lowIndex * 505 + nomalIndex * 895;

		}
		return 0;
	}

	public void addReading(int day, int month, int year, ThreeReading threeReading) {
		Calendar cal = Calendar.getInstance();
		if (day <= 0 || day > 31 || month <= 0 || month > 12 || year < 0) {
			System.out.println("Nhap sai du lieu ngay thang");
			return;
		}

		if ((month == 2 && day > 29)) {
			return;
		}
		cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		reading.put(cal, threeReading);
	}

	public void printReading() {
		for (Map.Entry<Calendar, ThreeReading> y : reading.entrySet()) {
			System.out.print(sdf.format(y.getKey().getTime()) + "\t");
			System.out.println(
					y.getValue().getIndex() + "\t" + y.getValue().getHighIndex() + "\t" + y.getValue().getLowIndex());
		}
	}

	@Override
	public long chargeByTime(int fromDay, int fromMonth, int fromYear, int toDay, int toMonth, int toYear) {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.YEAR, fromYear);
		cal1.set(Calendar.MONTH, fromMonth - 1);
		cal1.set(Calendar.DAY_OF_MONTH, fromDay);

		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, toYear);
		cal2.set(Calendar.MONTH, toMonth - 1);
		cal2.set(Calendar.DAY_OF_MONTH, toDay);

		long result = 0;
		int totalMonth = 0;
		for (Map.Entry<Calendar, ThreeReading> y : reading.entrySet()) {
			Calendar calTemp = y.getKey();
			if (calTemp.after(cal1) && calTemp.before(cal2)) {
				ThreeReading readingCurrent = y.getValue();
				long highIndex = readingCurrent.getHighIndex();
				long lowIndex = readingCurrent.getLowIndex();
				long nomalIndex = readingCurrent.getIndex() - highIndex - lowIndex;

				result += highIndex * 1480 + lowIndex * 505 + nomalIndex * 895;
				totalMonth++;

			}

		}

		return (long) result / totalMonth;
	}

	@Override
	public void printReport() {
		System.out.println("-----------------------------------");
		System.out.println("Ho va ten: " + getName() + "  Dia chi: " + getAddress()
				+ "  Ma khach hang: " + getId());
		ThreeReading readingCurrent = reading.lastEntry().getValue();
		Calendar calCurrent = reading.lastEntry().getKey();
		long highIndex, lowIndex, nomalIndex;
		highIndex = readingCurrent.getHighIndex();
		lowIndex = readingCurrent.getLowIndex();
		nomalIndex = readingCurrent.getIndex() - highIndex - lowIndex;
		System.out.println();
		System.out.printf("%-16s%-10s%-10s%-10s%-27s%-15s\n", "Ngay ghi dien", "Gio cao", "Gio thap", "Gio BT",
				"Luong dien tieu thu(Kw/h)", "Thanh Tien");
		System.out.printf("%-16s%-10d%-10d%-10d%-27d%-15d\n", sdf.format(calCurrent.getTime()), highIndex, lowIndex,
				nomalIndex,
				readingCurrent.getHighIndex(), charge());
		System.out.println("-----------------------------------");

	}

	@Override
	public String toString() {
		return getName() + "\t" + getId();
	}

}
