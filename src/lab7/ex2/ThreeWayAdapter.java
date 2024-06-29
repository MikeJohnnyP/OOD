package lab7.ex2;

public class ThreeWayAdapter {
	private ThreeWayLight twl;

	public ThreeWayAdapter(ThreeWayLight twl) {
		this.twl = twl;
	}

	public void turnOn() {
		switch (twl.getBrightness()) {
		case 0:
			twl.lo();
			break;
		case 1:
			twl.medium();
			break;
		case 2:
			twl.high();
			break;
		case 3:
			twl.off();
			break;
		}
	}
}
