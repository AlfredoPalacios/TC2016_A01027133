package Tareas.T3_2_RedesSociales;

public interface Session {
    boolean logIn(Users u);
    default void logOut(){
        System.out.println("Logged out.");
    }
}