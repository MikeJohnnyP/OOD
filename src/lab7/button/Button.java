package lab7.button;

public class Button {
  Switchable switchable;

  public Button(Switchable switchable){
    this.switchable = switchable;
  } 

  public void on(){
    switchable.on();
  }
}
