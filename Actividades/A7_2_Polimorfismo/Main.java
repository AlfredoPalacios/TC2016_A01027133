package Actividades.A7_2_Polimorfismo;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        Bird miPajaro = new Bird();
        Animal elPajaro = new Bird();
        arr[0] = miPajaro;
        arr[1] = elPajaro;
        arr[2] = new Bear();
        ((Bird)arr[1]).sing("cancion");
        if(elPajaro instanceof Bird){
            ((Bird)elPajaro).sing("El Ansioso");
        } else 
            elPajaro.doHisStuff();
        System.out.println("-----------------------------");
        miPajaro.eat();
        elPajaro.eat();
    }
}