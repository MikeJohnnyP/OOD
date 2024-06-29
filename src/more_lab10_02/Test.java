package more_lab10_02;

import more_lab10_02.Controller.BeatController;
import more_lab10_02.Controller.ControllerInterface;
import more_lab10_02.model.BeatModel;
import more_lab10_02.model.BeatModelInterface;

public class Test {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}