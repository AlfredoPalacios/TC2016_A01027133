package Tareas.T3_2_RedesSociales;

/**
 * Instagram
 */
public class Instagram extends SocialNetwork implements Session {
    public void addUser(Users u){
        instaUsers[contI] = u;
        contI++;
    }
    public void post(String message){
        byte[] mensaje;
        mensaje = message.getBytes();
        sendData(mensaje);
        System.out.println("Tu mensaje es:");
        System.out.println(message);
        System.out.println("Gracias por usar instagram");
    }
    public boolean logIn(Users u) {
        for(int i=0; i<10; i++) {
            if(instaUsers[i].equalsUser(u)) {
                return true;
            }
        }
        return false;
    }
}