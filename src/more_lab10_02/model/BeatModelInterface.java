package more_lab10_02.model;

import more_lab10_02.BPMObserver;
import more_lab10_02.BeatObserver;

public interface BeatModelInterface {
    public void initilize();

    public void on();

    public void off();

    public void setBPM(int bpm);

    public int getBPM();

    public void registerObserver(BPMObserver o);

    public void removeObserver(BeatObserver o);

    public void registerObserver(BeatObserver o);

    public void removeObserver(BPMObserver o);

    public void notifyObserver();
}
