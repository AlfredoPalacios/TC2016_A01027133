package Tareas.T4_2_TableroDeInformacion;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Institution instit = new Institution();
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();
        instit.postMessage(new Message("Hoy ceremonia de graduacion.", "18 de abril"));
        System.out.println("----------------------------------");
        System.out.println("MENSAJE POSTEADO");
        System.out.println("----------------------------------");
        System.out.println();
        st1.getLastMessage(instit);
        st2.getLastMessage(instit);
        st3.getLastMessage(instit);
        System.out.println("----------------------------------");
        System.out.println();
        instit.postMessage(new Message("Cancelada la ceremonia.", "3 de mayo"));
        System.out.println("----------------------------------");
        System.out.println("MENSAJE POSTEADO");
        System.out.println("----------------------------------");
        System.out.println();
        st4.getLastMessage(instit);
        System.out.println("---------get last message---------");
        System.out.println();
        st5.getAllMessages(instit);
        System.out.println("---------get all messages---------");
        System.out.println();
        st5.getMessageByDate(instit, "18 de abril");
        System.out.println("----------messae by date----------");
    }
}