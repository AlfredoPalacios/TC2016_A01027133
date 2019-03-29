package Evaluaciones.E2_2_Primos;
/**
 * NotPrimeNumberException
 */
public class NotPrimeNumberException extends Exception {
    int n;
    String type;
    public NotPrimeNumberException(int n, String type){
        this.n = n;
        this.type = type;
    }
    public String toString(){
        return "Number: "+n+" not prime of type: "+type+".";
    }
}