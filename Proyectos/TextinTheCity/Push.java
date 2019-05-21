import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Push {
    public Push(){

    }
    public void push(Note note, int notesAdded) {
        for(int i = 0; i<notesAdded; i++){
            File file = new File("\\Users\\alfre\\Desktop\\Progra orientada a objetos\\Proyectos\\TextinTheCity\\Master", note.getNoteList()[i].titleToString()+".txt");
            BufferedWriter myWriter = null;
            try {
                myWriter = new BufferedWriter(new FileWriter(file));
                myWriter.write(note.getNoteList()[i].contentToString());
                myWriter.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
            
            
        }
    }
}