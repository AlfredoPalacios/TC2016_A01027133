import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

/**
 * Main
 */
public class Main {
    protected static boolean windowClosed;
    public Main(){
        windowClosed = false;
    }
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Final project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(new Interface());
        frame.setBounds(650, 250, 500, 500);
        frame.getContentPane().repaint();
        if(windowClosed){
            Path index = Paths.get("\\Users\\alfre\\Desktop\\Progra orientada a objetos\\Proyectos\\TextinTheCity\\Commit");
            if(!Files.exists(index)){
                index = Files.createDirectories(index);
            } else {
                Files.walk(index)
                     .sorted(Comparator.reverseOrder())
                     .forEach(t -> {
                         try {
                             Files.delete(t);
                         } catch (IOException e) {

                         }
                     });
                if(!Files.exists(index)) {
                    index = Files.createDirectories(index);
                }
            }
        }
        WindowListener wl = new WindowListener(){
        
            @Override
            public void windowOpened(WindowEvent e) {
                
            }
        
            @Override
            public void windowIconified(WindowEvent e) {
                
            }
        
            @Override
            public void windowDeiconified(WindowEvent e) {
                
            }
        
            @Override
            public void windowDeactivated(WindowEvent e) {
                
            }
        
            @Override
            public void windowClosing(WindowEvent e) {
                
            }
        
            @Override
            public void windowClosed(WindowEvent e) {
                windowClosed = true;
            }
        
            @Override
            public void windowActivated(WindowEvent e) {
                
            }
        };
        frame.addWindowListener(wl);
    }
}