import java.util.Scanner;

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
        noteList = new TitleContent[100];
        noteCounter = 0;
    }
    public TitleContent[] getNoteList(){
        return noteList;
    }
    public void addNote(String noteTitle, String noteContent){
        //System.out.println(noteTitle+" adding note "+noteContent);
        TitleContent<String, String> note1 = new TitleContent<>(noteTitle+noteCounter, noteContent);
        noteList[noteCounter] = note1;
        noteCounter++;
        //System.out.println(noteCounter);
        //System.out.println(noteTitle+" adding to array "+noteContent);
    }
    public void listNotes(){
        for(int i = 0; i<noteCounter; i++){
            //System.out.println(i);
            System.out.println("List No. "+(i+1));
            System.out.println("Title: "+noteList[i].titleToString()+"\nContent: "+noteList[i].contentToString());
            System.out.println("\n-------------------------------------------------------------------------------\n");
        }
    }
    public int findNote(String title){
        boolean foundNote=false;
        //System.out.println(noteList[0].titleToString()+" lo impimio");
        for(int i = 0; i<noteList.length; i++){
            if((noteList[i].titleToString()).equals(title+i)){
                System.out.println("Note you're looking for is:");
                System.out.println("Title: "+noteList[i].titleToString()+"\nContent: "+noteList[i].contentToString());
                foundNote = true;
                return i;
            } else {
            foundNote = false;
            System.out.println("No note found with a matching title");
            return -1;
            }
        }
        return -1;
    }
    public String getTitle(){
        return noteTitle;
    }
    public String getContent(){
        return noteContent;
    }
    public void setContent(String content){
        this.noteContent = content;
    }
}