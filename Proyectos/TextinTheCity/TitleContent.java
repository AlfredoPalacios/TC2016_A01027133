
public class TitleContent <Title, Content> {
    protected Title noteTitle;
    protected Content noteContent;
    
    public TitleContent(Title noteTitle, Content noteContent){
        this.noteTitle = noteTitle;
        this.noteContent = noteContent;
    }

    public Title getTitle(){
        return noteTitle;
    }
    public Content getContent(){
        return noteContent;
    }
    public String titleToString(){
        return ""+noteTitle+"";
    }
    public String contentToString(){
        return ""+noteContent+"";
    }
}