package Actividades.A8_2_Generics;
import java.util.Scanner;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Tuple<Integer, String> intString = new Tuple<>(4, "Dave");
        Tuple<String, String> stringString = new Tuple<>("Pepe", "Pedro");
        Tuple<Scanner, Scanner> scannerScanner = new Tuple<>(new Scanner(System.in), new Scanner(System.in));
        Tuple[] arr = new Tuple[3];
        arr[0] = intString;
        arr[1] = stringString;
        arr[2] = scannerScanner;
        System.out.println(intString);
        for(int i=0; i<3; i++){
            System.out.println(arr[i].getValue());
        }
        Dog perro1 = new Dog(5);
        Dog perro2 = new Dog(3);
        System.out.println(perro1.compare2(perro2));
    }
}