package more_lab10_02.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import more_lab10_02.BPMObserver;
import more_lab10_02.BeatObserver;
import more_lab10_02.model.BeatModelInterface;
import more_lab10_02.Controller.ControllerInterface;

public class DJView implements BeatObserver, BPMObserver {
    JFrame control, viewCurrent;
    JTextField bpmTextField;
    JPanel enterBpmPanel;
    JLabel enterBpmLabel, showBpm;
    JButton setBpmButton, increaseBPMButton, decreaseBPMButton;
    ControllerInterface controller;
    BeatModelInterface model;

    public DJView(ControllerInterface controller, BeatModelInterface model) {
        this.controller = controller;
        this.model = model;
        model.registerObserver((BeatObserver) this);
        model.registerObserver((BPMObserver) this);
    }

    @Override
    public void upadateBeat() {
        int currentBpm = model.getBPM();
        showBpm.setText("Current BPM: " + currentBpm);
    }

    @Override
    public void updateBPM() {
        Integer currentBpm = model.getBPM();
        bpmTextField.setText(currentBpm.toString());
    }

    public void createView() {
        viewCurrent = new JFrame();
        showBpm = new JLabel("CurrentBpm: ");
        viewCurrent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewCurrent.setSize(200, 100);
        viewCurrent.add(showBpm);
        // viewCurrent.pack();
        viewCurrent.setVisible(true);
    }

    public void createControl() {
        control = new JFrame("Control");
        control.setSize(200, 200);
        control.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        control.setLocationRelativeTo(null);
        setBpmButton = new JButton("Set Bpm");
        setBpmButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (bpmTextField.getText() != null) {
                    Integer i = Integer.parseInt(bpmTextField.getText());
                    controller.setBPM(i);
                }
            }

        });
        increaseBPMButton = new JButton(">>");
        increaseBPMButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (bpmTextField.getText() != null) {
                    controller.increaseBPM();
                }
            }

        });
        decreaseBPMButton = new JButton("<<");
        decreaseBPMButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.decreaseBPM();
            }

        });
        enterBpmPanel = new JPanel();
        enterBpmLabel = new JLabel("Enter BPM:");
        bpmTextField = new JTextField(20);
        control.setLayout(new GridLayout(4, 0));
        enterBpmPanel.add(enterBpmLabel);
        enterBpmPanel.add(bpmTextField);
        control.add(enterBpmPanel);
        control.add(setBpmButton);
        control.add(increaseBPMButton);
        control.add(decreaseBPMButton);
        control.pack();
        control.setVisible(true);

    }

    public void run() {
        controller.start();
    }

    public void stop() {
        controller.stop();
    }

}
