package more_lab10_02.Controller;

import more_lab10_02.model.BeatModelInterface;
import more_lab10_02.view.DJView;

public class BeatController implements ControllerInterface {
    BeatModelInterface model;
    DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControl();
        model.initilize();
        view.run();
    }

    @Override
    public void start() {
        model.on();
    }

    @Override
    public void stop() {
        model.off();
    }

    @Override
    public void increaseBPM() {
        model.setBPM(model.getBPM() + 1);
    }

    @Override
    public void decreaseBPM() {
        model.setBPM(model.getBPM() - 1);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }

}
