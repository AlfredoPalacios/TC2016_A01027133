package Tareas.T3_2_RedesSociales;

import Actividades.A3_2_Latencia.Latency;
/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        Facebook f = new Facebook();
        Instagram i = new Instagram();
        Twitter t = new Twitter();
        Users user1 = new Users("Alfredo","1234");
        Users user2 = new Users("Rogelio","5678");
        Users user3 = new Users("Personaje","1010");
        f.addUser(user1);
        i.addUser(user2);
        t.addUser(user3);
        if(f.logIn(user1)) {
            f.post("Un mensaje");
        } else {
            System.out.println("El usuario o password son incorrectos.");
        }
        f.logOut();
        if(t.logIn(user3)) {
            t.post("Un mensaje");
        } else {
            System.out.println("El usuario o password son incorrectos.");
        }
        t.logOut();
        if(i.logIn(user2)) {
            i.post("Un mensaje");
        } else {
            System.out.println("El usuario o password son incorrectos.");
        }
        i.logOut();
    }
}