package Tareas.T3_2_RedesSociales;

/**
 * Twitter
 */
public class Twitter extends SocialNetwork implements Session {
    public void addUser(Users u){
        twitterUsers[contT] = u;
        contT++;
    }
    public void post(String message){
        byte[] mensaje;
        mensaje = message.getBytes();
        sendData(mensaje);
        System.out.println("***** "+message+" *****");
    }
    public boolean logIn(Users u) {
        for(int i=0; i<10; i++) {
            if(twitterUsers[i].equalsUser(u)) {
                return true;
            }
        }
        return false;
    }
}