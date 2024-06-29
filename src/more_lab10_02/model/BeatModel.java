package more_lab10_02.model;

import java.io.File;
import java.util.ArrayList;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

import more_lab10_02.BPMObserver;
import more_lab10_02.BeatObserver;

public class BeatModel implements BeatModelInterface {
    Sequencer sequencer;
    int bpm = 90;
    ArrayList<BeatObserver> beatList = new ArrayList<>();
    ArrayList<BPMObserver> BPMList = new ArrayList<>();

    @Override
    public void initilize() {
        setUpMidi();
        buildTrackAndStart();
    }

    void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            if (sequencer != null) {
                sequencer.open();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

    }

    void buildTrackAndStart() {
        try {
            File myMidiFile = new File("src/more_lab10_02/1.mid");
            Sequence sq = MidiSystem.getSequence(myMidiFile);
            sequencer.setSequence(sq);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(60);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        if (sequencer.isRunning()) {
            this.bpm = bpm;
            sequencer.setTempoInBPM(bpm);
            notifyObserver();
        } else {
            sequencer.setTickPosition(0);
            this.bpm = bpm;
            sequencer.setTempoInBPM(bpm);
            sequencer.start();
            notifyObserver();
        }
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerObserver(BPMObserver o) {
        BPMList.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        beatList.remove(o);
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatList.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        BPMList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (BPMObserver bpmObserver : BPMList) {
            bpmObserver.updateBPM();
        }

        for (BeatObserver beatObserver : beatList) {
            beatObserver.upadateBeat();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BeatModel model = new BeatModel();
        model.initilize();
        model.on();
        int x = 30;
        while (model.sequencer.isRunning()) {
            // x++;
            model.setBPM(x);
            System.out.println(model.sequencer.getTempoInBPM());
            Thread.sleep(1000);
        }
        model.off();
        model.sequencer.close();
    }

}