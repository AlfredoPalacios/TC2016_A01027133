package Actividades.A7_2_Polimorfismo;

/**
 * Bear
 */
public class Bear extends Animal {
    public void eat(){
        System.out.println("Bear is eating.");
    }
    public void wakeUp(){
        System.out.println("Wake up, bear");
    }
    public void run(){
        System.out.println("Run, bear, run!");
    }
    public void sleep(){
        System.out.println("Bear is asleep");
    }
}