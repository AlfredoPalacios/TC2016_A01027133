package Actividades.A3_3_Tablas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 * Table
 */
public class Table extends JPanel {
    protected Object[][] dataFields;
    public Table() {
        super(new GridLayout(1,1));
        String line = null;
        List<String> dataLines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("File.txt"));
            while((line=br.readLine())!= null) {
                dataLines.add(line);
            }
            br.close();
            dataFields = new Object[dataLines.size()][4];
            for(int i=0; i<dataLines.size(); i++) {
                dataFields[i] = dataLines.get(i).split(",");
            }
        } catch(IOException e) {
            System.out.println(e.toString());
        }
        
        String[] titles = new String[]{"Name", "Last name", "Phone number", "Genre"};
        JTable data = new JTable(dataFields, titles);

        JScrollPane scroll = new JScrollPane(data);
        add(scroll);
        repaint();
    }
    public static void main(String[] args) {
        JFrame window = new JFrame("Tabla");
        Table dataTable = new Table();
        window.setContentPane(dataTable);
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}