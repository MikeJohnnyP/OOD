package lab2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

public class ResidentalCustomer extends Customer {

	private TreeMap<Calendar, OneReading> reading;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ResidentalCustomer(String name, String address, String id) {
		super(name, address, id);
		reading = new TreeMap<Calendar, OneReading>();
	}

	public TreeMap<Calendar, OneReading> getReading() {
		return reading;
	}

	public long getOldIndex() {
		if (!(reading.isEmpty())) {
			if (reading.size() == 1)
				return 0;
			else {
				Map.Entry<Calendar, OneReading> temp = reading.lowerEntry(reading.lastKey());
				return temp.getValue().getIndex();
			}

		} else
			return 0;
	}

	public long getCurrentIndex() {
		if (!(reading.isEmpty())) {
			if (reading.size() > 0) {
				Map.Entry<Calendar, OneReading> temp = reading.lastEntry();
				return temp.getValue().getIndex();

			} else
				return reading.firstEntry().getValue().getIndex();
		}
		return 0;
	}

	public void setReading(TreeMap<Calendar, OneReading> reading) {
		this.reading = reading;
	}

	@Override
	public long charge() {
		long y1, y2, y3, y4, y5;
		long oldIndex = getOldIndex();
		long currentIndex = getCurrentIndex();
		if (oldIndex > 0 || currentIndex > 0) {
			long electricUsed = Math.abs(currentIndex - oldIndex);
			y1 = (electricUsed >= 100) ? 100 : electricUsed;
			y2 = (electricUsed >= 150) ? 50 : electricUsed - y1;
			y3 = (electricUsed >= 200) ? 50 : electricUsed - y1 - y2;
			y4 = (electricUsed >= 300) ? 100 : electricUsed - y1 - y2 - y3;
			y5 = (electricUsed >= 301) ? electricUsed - y1 - y2 - y3 - y4 : 0;

			return y1 * 550 + y2 * 900 + y3 * 1210 + y4 * 1340 + y5 * 1400;

		}
		return 0;
	}

	public long getChargeForAEntry(OneReading currentReading, OneReading beforeReading) {

		long y1, y2, y3, y4, y5;
		long oldIndex = beforeReading.getIndex();
		long currentIndex = currentReading.getIndex();
		if (oldIndex > 0 || currentIndex > 0) {
			long electricUsed = Math.abs(currentIndex - oldIndex);
			y1 = (electricUsed >= 100) ? 100 : electricUsed;
			y2 = (electricUsed >= 150) ? 50 : electricUsed - y1;
			y3 = (electricUsed >= 200) ? 50 : electricUsed - y1 - y2;
			y4 = (electricUsed >= 300) ? 100 : electricUsed - y1 - y2 - y3;
			y5 = (electricUsed >= 301) ? electricUsed - y1 - y2 - y3 - y4 : 0;

			return y1 * 550 + y2 * 900 + y3 * 1210 + y4 * 1340 + y5 * 1400;

		}
		return 0;
	}

	@Override
	public long chargeByTime(int fromDay, int fromMonth, int fromYear,
			int toDay, int toMonth, int toYear) {
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
		for (Map.Entry<Calendar, OneReading> y : reading.entrySet()) {
			Calendar calTemp = y.getKey();
			if (calTemp.after(cal1) && calTemp.before(cal2)) {
				OneReading readingCurrent = y.getValue();
				OneReading readingBefore;
				if (!(reading.lowerEntry(y.getKey()) == null)) {
					readingBefore = reading.lowerEntry(y.getKey()).getValue();
					result += getChargeForAEntry(readingCurrent, readingBefore);
					totalMonth++;
				} else {

					long y1, y2, y3, y4, y5;
					long currentIndex = readingCurrent.getIndex();
					y1 = (currentIndex >= 100) ? 100 : currentIndex;
					y2 = (currentIndex >= 150) ? 50 : currentIndex - y1;
					y3 = (currentIndex >= 200) ? 50 : currentIndex - y1 - y2;
					y4 = (currentIndex >= 300) ? 100 : currentIndex - y1 - y2 - y3;
					y5 = (currentIndex >= 301) ? currentIndex - y1 - y2 - y3 - y4 : 0;

					result += y1 * 550 + y2 * 900 + y3 * 1210 + y4 * 1340 + y5 * 1400;
					totalMonth++;
				}
			}

		}

		return (long) result / totalMonth;
	}

	public void addReading(int day, int month, int year, OneReading oneReading) {
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
		reading.put(cal, oneReading);
	}

	@Override
	public void printReading() {
		for (Map.Entry<Calendar, OneReading> y : reading.entrySet()) {
			System.out.print(sdf.format(y.getKey().getTime()) + "\t");
			System.out.println(y.getValue().getIndex());
		}
	}

	@Override
	public void printReport() {
		System.out.println("-----------------------------------");
		System.out.println("Ho va ten: " + getName() + "  Dia chi: " + getAddress()
				+ "  Ma khach hang: " + getId());
		OneReading readingCurrent = reading.lastEntry().getValue();
		OneReading readingBefore = reading.lowerEntry(reading.lastKey()).getValue();
		Calendar calCurrent = reading.lastEntry().getKey();
		System.out.printf("%-16s%-27s%-10s\n", "Ngay ghi dien", "Luong dien tieu thu(Kw/h)", "Thanh Tien");
		System.out.printf("%-16s%-27d%-10d\n", sdf.format(calCurrent.getTime()),
				Math.abs(readingCurrent.getIndex() - readingBefore.getIndex()),
				getChargeForAEntry(readingCurrent, readingBefore));
		System.out.println("-----------------------------------");
	}

	@Override
	public String toString() {
		return getName() + "\t" + getId();
	}
}
