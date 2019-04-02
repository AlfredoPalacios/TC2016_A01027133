package Tareas.Otra_Oportunidad;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Tuple<Integer, Integer> par1 = new Tuple<>(5, 7);
        Tuple<Integer, Integer> par2 = new Tuple<>(37, 41);
        Tuple<Integer, Integer> twin;
        CousinPrime cousinPrime = CousinPrime.getInstance();
        TwinPrime twinPrime = TwinPrime.getInstance();
        try{
            twinPrime.isPrime(par1.getN1().intValue(), par1.getN2().intValue());
        } catch (NotPrimeNumberException e) {
            System.out.println(e.toString());
        }
        twin = twinPrime.nPrime(5);
        Integer num1, num2;
        num1 = twin.getN1();
        num1 = num1.intValue();
        num2 = twin.getN2();
        num2 = num2.intValue();
        System.out.println(num1+", "+num2);

        //n2.isPrime(37, 41);
    }
}