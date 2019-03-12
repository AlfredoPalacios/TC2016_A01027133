package Tareas.T4_2_TableroDeInformacion;

/**
 * Board
 */
public class Board {
    Message[] listOfMessages;
    private int cont;
    private Board(){
        cont = 0;
        listOfMessages = new Message[10];
    }
    protected static Board instance = null;
    public static Board getInstance(){
        if(instance == null){
            instance = new Board();
        }
        return instance;
    }
    public void postMessage(Message message){
        System.out.println(message.getMessage());
        listOfMessages[cont] = message;
        cont++;
    }
    public void getLastMessage(){
        System.out.println(listOfMessages[cont-1].getMessage());
    }
    public void getMessageByDate(String date){
        for(int i=0; i<cont; i++){
            if(date.equals(listOfMessages[i].getDate())){
                System.out.println(listOfMessages[i].getMessage());
                return;
            }
        }
        System.out.println("No hay mensajes en esa fecha.");
    }
    public void getAllMessages(){
        for(int i=0; i<cont; i++){
            System.out.println(listOfMessages[i].getMessage());
        }
    }
}