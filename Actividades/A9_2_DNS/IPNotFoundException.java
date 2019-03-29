package Actividades.A9_2_DNS;
/**
 * IPNotFoundException
 */
public class IPNotFoundException extends Exception {
    String message;
    public IPNotFoundException(String message){
        this.message = message;
    }
    public String toString(){
        return "Domain: "+message+" not found.";
    }
}