package lab2;

public class Reading {
	private long index;
	private KindOfReading kindOfReading;

	public Reading(long index, KindOfReading kindOfReading) {
		this.index = index;
		this.kindOfReading = kindOfReading;

	}

	public long getIndex() {
		return index;
	}

	public KindOfReading getKindOfReading() {
		return kindOfReading;
	}

	public void setKindOfReading(KindOfReading kind) {
		this.kindOfReading = kind;
	}

}
