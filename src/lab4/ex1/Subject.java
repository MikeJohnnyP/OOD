package lab4.ex1;

public interface Subject {
    public void registerObserver(Observer ob);

    public void removeObserver(Observer ob);

    public void notifyObserver();
}
