package Evaluaciones.E2_2_Primos;
/**
 * CousinPrime
 */
public class CousinPrime {
    private static CousinPrime instance = null;
    public CousinPrime(){
    }
    public boolean isPrime(int number){
        if((number1-number2)==4){
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
            return new NotPrimeNumberException(n, "cousin prime number");
        }
        return new NotPrimeNumberException(n, "cousin prime number");
    }
    public PrimeNumbers nPrime(int n){
        int n1 = n;
        int n2 = n+4;
        int i2 = 1;
        for(int i=1; i<=n; n++){
            if(isPrime(i)&&isPrime(i+4)){
                i2++;
                if(i2==n){
                    return new PrimeNumbers<Integer, Integer>(n1, n2);
                }
            }
        }
        return null;
    }
    public static CousinPrime getInstance(){
        if(instance == null){
            return new CousinPrime();
        }
        else
            return instance;
    }
}