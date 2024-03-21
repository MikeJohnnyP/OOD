package lab2;

public class ThreeReading extends Reading {
	private long highIndex;
	private long lowIndex;

	public ThreeReading(long sumOfIndex, long highIndex, long lowIndex) {
		super(sumOfIndex, KindOfReading.THREE_READING);
		if (sumOfIndex < (lowIndex + highIndex)) {
			System.err.println("Tong so dien khong be hon tong so dien gio cao va gio thap");
			System.exit(1);
		}
		this.highIndex = highIndex;
		this.lowIndex = lowIndex;
	}

	public long getHighIndex() {
		return highIndex;
	}

	public long getLowIndex() {
		return lowIndex;
	}

}
