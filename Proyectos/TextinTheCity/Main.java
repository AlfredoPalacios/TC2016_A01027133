import javax.swing.JFrame;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Final project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(new Interface());
        frame.setBounds(650, 250, 500, 500);
        frame.getContentPane().repaint();
    }
}