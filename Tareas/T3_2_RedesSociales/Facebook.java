package Tareas.T3_2_RedesSociales;

/**
 * Facebook
 */
public class Facebook extends SocialNetwork implements Session {
    public void addUser(Users u){
        facebookUsers[contF] = u;
        contF++;
    }
    public void post(String message){
        byte[] mensaje;
        mensaje = message.getBytes();
        //System.out.println(mensaje);
        sendData(mensaje);
        System.out.println("************FACEBOOK*************");
        System.out.println("*                               *");
        System.out.println("*\t"+message+"\t\t*");
        System.out.println("*                               *");
        System.out.println("*********************************");
    }
    public boolean logIn(Users u) {
        for(int i=0; i<10; i++) {
            if(facebookUsers[i].equalsUser(u)) {
                return true;
            }
        }
        return false;
    }
}