package Actividades.AyudaProyecto.BaseProject;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BaseProject extends JPanel {
    JTextArea commandPrompt;
    public BaseProject() {
        super(new BorderLayout());
        commandPrompt = new JTextArea("prompt:>>");
        add(commandPrompt, BorderLayout.SOUTH);

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Final project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(new BaseProject());
        frame.pack();
    }
}