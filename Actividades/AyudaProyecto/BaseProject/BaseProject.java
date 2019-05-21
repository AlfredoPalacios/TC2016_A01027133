package Actividades.AyudaProyecto.BaseProject;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class BaseProject extends JPanel {

    JTextArea commandPrompt;
    JTable listOfNotes;
    JTextArea noteEditor;
    JSplitPane splitPane;
    JScrollPane scrollPane;

    public BaseProject() {
        super(new BorderLayout());
        commandPrompt = new JTextArea("prompt:>> ");
        add(commandPrompt, BorderLayout.SOUTH);
        listOfNotes =new JTable(new Object[][]{{"Note 1"}, {"Note 2"}, {"Note 3"}}, new Object[]{"NOTES"});
        scrollPane = new JScrollPane(listOfNotes);
        noteEditor = new JTextArea("Note editor");
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, noteEditor);
        add(splitPane, BorderLayout.CENTER);
        ListSelectionModel lsm = listOfNotes.getSelectionModel();
        lsm.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedColumn = lsm.getMinSelectionIndex()+1;
                noteEditor.setText("Se cambio. Renglon seleccionado: "+ selectedColumn);
            }
        }); 
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Final project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(new BaseProject());
        frame.setBounds(650, 250, 500, 500);
        frame.getContentPane().repaint();
    }

}