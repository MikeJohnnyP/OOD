package lab7.ex2;

public class ThreeWayLight {
	private int brightness = 0;

	public void lo() {
		brightness = 1;
	}

	public void medium() {
		brightness = 2;
	}

	public void high() {
		brightness = 3;
	}

	public void off() {
		brightness = 0;
	}

	public int getBrightness() {
		return brightness;
	}
}
