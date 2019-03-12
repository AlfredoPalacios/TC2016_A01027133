package Actividades.A6_2_Exceptions;

/**
 * InsufficientFundsException
 */
public class InsufficientFundsException extends Exception {
    protected double missing;
    public InsufficientFundsException(){}
    public InsufficientFundsException(double missing){
        this.missing = missing;
    }
    public String toString(){
        return new String("Te faltan: "+missing+" pesos");
    }
}