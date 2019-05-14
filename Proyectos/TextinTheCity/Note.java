/**
 * Note
 */
public class Note {
    protected String noteTitle;
    protected String noteContent;
    protected int noteCounter;
    protected TitleContent[] noteList;
    public Note(String noteTitle, String noteContent){
        this.noteTitle = noteTitle;
        this.noteContent = noteContent;
        noteCounter = 1;
    }
    public void addNote(){
        TitleContent<String, String> note1 = new TitleContent<>(noteTitle+noteCounter, noteContent);
        noteCounter++;
    }
    public void listNotes(){

    }
    public Note findNote(Note noteToFind){
        return null;
    }
}