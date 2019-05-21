import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Commit
 */
public class Commit <ID, Message> {
    protected int commitID;
    protected String commitMsg;
    public Commit(ID id, Message message){
        this.commitID = commitID;
        this.commitMsg = commitMsg;
    }
    public int getCommitID(){
        return commitID;
    }
    public String getCommitMsg(){
        return commitMsg;
    }
    public String commitIdToString(){
        return ""+commitID+"";
    }
    public String commitMsgToString(){
        return ""+commitMsg+"";
    }
    public void saveTemporal(Note note, int notesAdded) {
        for(int i = 0; i<notesAdded; i++){
            File file = new File("\\Users\\alfre\\Desktop\\Progra orientada a objetos\\Proyectos\\TextinTheCity\\Commit", note.getNoteList()[i].titleToString()+".txt");
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