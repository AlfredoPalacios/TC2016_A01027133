/**
 * Note
 */
public class Note {
    protected String noteTitle;
    protected String noteContent;
    protected TitleContent[] noteList;
    public Note(String noteTitle, String noteContent){
        this.noteTitle = noteTitle;
        this.noteContent = noteContent;
    }
    public void addNote(){
        TitleContent<String, String> note1 = new TitleContent<>(noteTitle, noteContent);
    }
    public void listNotes(){

    }
    public Note findNote(Note noteToFind){
        
    }
}