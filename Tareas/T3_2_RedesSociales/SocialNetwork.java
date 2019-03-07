package Tareas.T3_2_RedesSociales;

import Actividades.A3_2_Latencia.Latency;
/**
 * SocialNetwork
 */
public abstract class SocialNetwork {
    Users[] facebookUsers = new Users[10];
    Users[] twitterUsers = new Users[10];
    Users[] instaUsers = new Users[10];
    int contF = 0;
    int contT = 0;
    int contI = 0;

    public abstract void addUser(Users u);

    public abstract void post(String m);

    public void sendData(byte[] mensaje){
        Latency.simulateLatency(2, 15);
    }
}