package Actividades.A7_2_Polimorfismo;

/**
 * Bird
 */
public class Bird extends Animal {
    public void eat(){
        System.out.println("The bird is eating.");
    }
    public void wakeUp(){
        System.out.println("Wake up, birdie");
    }
    public void run(){
        System.out.println("Birds don't run, they jump");
    }
    public void sleep(){
        System.out.println("The sleeping bird");
    }
    public void sing(String whichSong){
        System.out.println("Bird is singing "+whichSong);
    }
}