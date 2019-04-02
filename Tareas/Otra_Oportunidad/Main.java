package Tareas.Otra_Oportunidad;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Tuple<Integer, Integer> par1 = new Tuple<>(5, 7);
        Tuple<Integer, Integer> par2 = new Tuple<>(37, 41);
        CousinPrime cousinPrime = CousinPrime.getInstance();
        TwinPrime twinPrime = TwinPrime.getInstance();
        try{
            twinPrime.isPrime(par1.getN1().intValue(), par1.getN2().intValue());
        } catch (NotPrimeNumberException e) {
            System.out.println(e.toString());
        }
        twinPrime.nPrime(5);

        //n2.isPrime(37, 41);
    }
}