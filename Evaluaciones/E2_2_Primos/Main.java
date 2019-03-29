package Evaluaciones.E2_2_Primos;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        PrimeNumbers n1 = new TwinPrime();
        PrimeNumbers n2 = new CousinPrime();
        n1.isPrime(5, 7);
        n2.isPrime(37, 41);
    }
}