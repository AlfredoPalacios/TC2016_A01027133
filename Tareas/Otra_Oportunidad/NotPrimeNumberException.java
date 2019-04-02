package Tareas.Otra_Oportunidad;
/**
 * NotPrimeNumberException
 */
public class NotPrimeNumberException extends Exception {
    int n1;
    int n2;
    String type;
    public NotPrimeNumberException(int n1, int n2, String type){
        this.n1 = n1;
        this.n2 = n2;
        this.type = type;
    }
    public String toString(){
        return "Numbers: "+n1+", "+n2+" not prime of type: "+type+".";
    }
}