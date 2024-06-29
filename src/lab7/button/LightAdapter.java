package lab7.button;

public class LightAdapter implements Switchable {
  Light light;

  public LightAdapter(Light light){
    this.light = light;
  }
  @Override
  public void on() {
    light.on(); 
  }

}
