import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class Interface extends JPanel implements KeyListener {

    JTextArea commandPrompt;
    JTable listOfNotes;
    JTextArea noteEditor;
    JSplitPane splitPane;
    JScrollPane scrollPane;
    JScrollPane commandPromptScroll;
    JScrollPane noteEditorScroll;
    Note note;
    DefaultTableModel tableModel;
    int notesAdded;
    int commitCounter;
    protected Commit[] commitList;
    Commit commit;
    Push push;

    public Interface() {
        super(new BorderLayout());

        notesAdded = 0;
        commitCounter = 0;

        commitList = new Commit[100];
        note = new Note("", "");
        commit = new Commit(0, "");
        push = new Push();

        commandPrompt = new JTextArea(10, 5);
        commandPrompt.setLineWrap(true);
        commandPrompt.setWrapStyleWord(true);
        commandPrompt.setForeground(Color.white);
        commandPrompt.setBackground(Color.black);
        commandPromptScroll = new JScrollPane(commandPrompt);
        add(commandPromptScroll, BorderLayout.SOUTH);
        commandPrompt.addKeyListener(this);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("NOTES");
        listOfNotes =new JTable(tableModel);
        scrollPane = new JScrollPane(listOfNotes);
        noteEditor = new JTextArea("Note editor");
        noteEditor.setLineWrap(true);
        noteEditor.setWrapStyleWord(true);
        noteEditorScroll = new JScrollPane(noteEditor);
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, noteEditorScroll);
        add(splitPane, BorderLayout.CENTER);
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER) {
            String instruction = commandPrompt.getText();
            String[] instructionThing;
            instructionThing = instruction.split("/");
            if(instructionThing[0].equalsIgnoreCase("addNote")){
                    note.addNote(instructionThing[1].toString(), instructionThing[2].toString());
                    //System.out.println(instructionThing[2]);
                    //System.out.println(note.getNoteList()[notesAdded].titleToString());
                    System.out.println("Note added");
                    commandPrompt.selectAll();
                    commandPrompt.replaceSelection("Note added");
                    tableModel.addRow(new Object[]{note.getNoteList()[notesAdded].titleToString()});
                    notesAdded++;
                    ListSelectionModel lsm = listOfNotes.getSelectionModel();
                    lsm.addListSelectionListener(new ListSelectionListener(){
                        @Override
                        public void valueChanged(ListSelectionEvent e) {
                            int selectedColumn = lsm.getMinSelectionIndex()+1;
                            noteEditor.setText("\n"+note.getNoteList()[selectedColumn-1].contentToString());
                        }
                    });
//-------------------------------------------------------------------------------------------------------                    
            } else if(instruction.equalsIgnoreCase("listNotes")){
                note.listNotes();
                for(int i = 0; i<notesAdded; i++){
                    commandPrompt.setText("Note No. "+(i+1)+
                    "\nTitle: "+note.getNoteList()[i].titleToString()+"\nContent: "+note.getNoteList()[i].contentToString()+
                    "\n-------------------------------------------------------------------------------\n"+"Notes listed");
                }
                System.out.println("Notes listed");
//-------------------------------------------------------------------------------------------------------         
            } else if(instructionThing[0].equalsIgnoreCase("findNote")){
                int position = note.findNote(instructionThing[1]);
                    if(position!=-1){
                        commandPrompt.selectAll();
                        commandPrompt.replaceSelection("Note you're looking for is: \n"+
                        "Title: "+note.getNoteList()[position].getTitle()+"\nContent: "+note.getNoteList()[position].getContent());
                    } else {
                        commandPrompt.selectAll();
                        commandPrompt.replaceSelection("Note not found with a matching title :(");
                    }
//-------------------------------------------------------------------------------------------------------         
            } else if(instructionThing[0].equalsIgnoreCase("commit")){
                String commitMsg;
                commitMsg = instructionThing[1];
                System.out.println(commitMsg);
                Commit<Integer, String> commit1 = new Commit<>(commitCounter, commitMsg);
                commitList[commitCounter] = commit1;
                commitCounter++;
                
                    commit.saveTemporal(note, notesAdded);
                
                commandPrompt.selectAll();
                commandPrompt.replaceSelection("Commit done");
                System.out.println("Commit done");
//-------------------------------------------------------------------------------------------------------         
            } else if(instructionThing[0].equalsIgnoreCase("push")){
                
                    push.push(note, notesAdded);
                
                commandPrompt.selectAll();
                commandPrompt.replaceSelection("Push done");
                System.out.println("Push done");
//-------------------------------------------------------------------------------------------------------         
            } else if(instructionThing[0].equalsIgnoreCase("saveChanges")){
                
//-------------------------------------------------------------------------------------------------------         
            } else if(instructionThing[0].equalsIgnoreCase("log")){
                for(int i = 0; i<commitCounter; i++){
                    commandPrompt.setText("Log "+(i+1)+"\nID: "+commitList[i].commitIdToString()+"\nMessage: "+commitList[i].commitMsgToString()+
                    "\n------------------------------------------------------------------------\n");
                }
            }
        } else if(e.getKeyCode()==KeyEvent.VK_F1){
            commandPrompt.selectAll();
            commandPrompt.replaceSelection("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    /*
    public static void main(String[] args) {
        JFrame frame = new JFrame("Final project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(new BaseProject());
        frame.setBounds(650, 250, 500, 500);
        frame.getContentPane().repaint();
    }
    */

}