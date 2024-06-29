package lab7.button;

public class Test {
  public static void main(String[] args) {

    Light light = new Light();
    Switchable sw = new LightAdapter(light);
    Button b = new Button(sw);

    b.on();
    System.out.println(light.isOn());
  }
}
