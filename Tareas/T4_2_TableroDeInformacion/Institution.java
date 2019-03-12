package Tareas.T4_2_TableroDeInformacion;

/**
 * Institution
 */
public class Institution {
    Board board;
    public Institution(){
        board = Board.getInstance();
    }
    public void postMessage(Message message){
        board.postMessage(message);
    }
    public void getLastMessage(){
        board.getLastMessage();
    }
    public void getMessageByDate(String date){
        board.getMessageByDate(date);
    }
    public void getAllMessages(){
        board.getAllMessages();
    }
}