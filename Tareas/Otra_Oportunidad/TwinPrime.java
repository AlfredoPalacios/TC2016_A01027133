package Tareas.Otra_Oportunidad;
import Tareas.Otra_Oportunidad.Tuple;
/**
 * TwinPrime
 */
public class TwinPrime extends PrimeNumbers {
    private static TwinPrime instance = null;
    public TwinPrime(){
    }
    public boolean isPrime(int number1, int number2) throws NotPrimeNumberException {
        boolean isPrime = false;
        if((number2-number1)==2){
            for(int i=0; i<2; i++){
                int num = number1;
                int counter = 0, control=0, div2=0;
                div2 = num/2;
                for(counter=2; counter<=div2; counter++) {
                    if(num%counter==0){
                        control=1;
                        throw new NotPrimeNumberException(number1, number2, "twin prime number");
                    }
                }
                if(control==0) {
                    isPrime = true;
                    num = number2;
                } else
                    break;
            }
        }
        return isPrime;
    }
    public Tuple<Integer, Integer> nPrime(int n){
        int n1 = n;
        int n2 = n+2;
        int i2 = 1;
        for(int i=2; i<=n; n++){
            try{
                if(isPrime(i, i+2)){
                    i2++;
                    if(i2==n){
                        System.out.println(n1+", "+n2);
                        return new Tuple<Integer, Integer>(n1, n2);
                    }
                }
            } catch (NotPrimeNumberException e) {
                System.out.println(e.toString());
            }
        }
        return new Tuple<Integer, Integer>(n1, n2);
    }
    public static TwinPrime getInstance(){
        if(instance == null){
            return new TwinPrime();
        }
        else
            return instance;
    }
}