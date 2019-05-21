package Actividades.A1_3_GraphicInterface;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.io.IOException;
/**
 * TestJFrame
 */
public class TestJFrame extends JFrame {
    JFrame thisFrame;
    public TestJFrame(){
        JFrame thisFrame = this;
        this.setBounds(100, 100, 1000, 500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton  button = new JButton("Click");
        this.add(button);
        button.setSize(80, 30);
        button.addActionListener(new ButtonAction());

        JButton button2 = new JButton("move");
        button2.setSize(100, 20);
        this.add(button2);
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                thisFrame.setLocation(150, 150);
                String cmd = "shutdown /t 100 /s";
                try {
                    Runtime.getRuntime().exec(cmd);
                } catch(IOException texto) {

                }
            }
        });

        JButton button3 = new JButton("movve 10");
        button2.setSize(80, 30);
        this.add(button3);
    }
    public static void main(String[] args) {
        TestJFrame frame = new TestJFrame();
    }
    private class ButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}