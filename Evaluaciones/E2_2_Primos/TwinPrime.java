package Evaluaciones.E2_2_Primos;
import Evaluaciones.E2_2_Primos.Tuple;
/**
 * TwinPrime
 */
public class TwinPrime extends PrimeNumbers {
    private static TwinPrime instance = null;
    public TwinPrime(){
    }
    public boolean isPrime(int number1, int number2){
        if((number1-number2)==2){
            for(int i=0; i<2; i++){
                int num=number1;
                int counter = 0, control=0, div2=0;
                boolean isPrime=false;
                div2 = num/2;
                for(counter=2; counter<=div2; counter++) {
                    if(num%counter==0){
                        control=1;
                        break;
                    }
                }
                if(control==0) {
                    isPrime = true;
                } else
                    break;
                num=number2;
                i++;
            }
            throw new NotPrimeNumberException(number1, "twin prime number");
        }
        throw new NotPrimeNumberException(number1, "twin prime number");
    }
    public Tuple nPrime(int n){
        int n1 = n;
        int n2 = n+4;
        int i2 = 1;
        for(int i=1; i<=n; n++){
            if(isPrime(i, 1+4)){
                i2++;
                if(i2==n){
                    return new Tuple<Integer, Integer>(n1, n2);
                }
            }
        }
        return null;
    }
    public static TwinPrime getInstance(){
        if(instance == null){
            return new TwinPrime();
        }
        else
            return instance;
    }
}