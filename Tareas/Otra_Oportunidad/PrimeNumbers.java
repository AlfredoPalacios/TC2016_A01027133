package Tareas.Otra_Oportunidad;
/**
 * PrimeNumbers
 */
public abstract class PrimeNumbers {
    public abstract boolean isPrime(int n1, int n2) throws NotPrimeNumberException;
    public abstract Tuple nPrime(int n);
}