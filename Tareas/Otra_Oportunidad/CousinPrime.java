package Tareas.Otra_Oportunidad;
import Tareas.Otra_Oportunidad.Tuple;
/**
 * CousinPrime
 */
public class CousinPrime extends PrimeNumbers {
    private static CousinPrime instance = null;
    public CousinPrime(){
    }
    public boolean isPrime(int number1, int number2) throws NotPrimeNumberException {
        boolean isPrime=false;
        if((number1-number2)==4){
            for(int i=0; i<2; i++){
                int num=number1;
                int counter = 0, control=0, div2=0;
                div2 = num/2;
                for(counter=2; counter<=div2; counter++) {
                    if(num%counter==0){
                        control=1;
                        throw new NotPrimeNumberException(number1, number2, "cousin prime number");
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
    public Tuple nPrime(int n){
        int n1 = n;
        int n2 = n+4;
        int i2 = 1;
        for(int i=1; i<=n; n++){
            try{
                if(isPrime(i, i+4)){
                    i2++;
                    if(i2==n){
                        return new Tuple<Integer, Integer>(n1, n2);
                    }
                }
            } catch (NotPrimeNumberException e) {
                System.out.println(e.toString());
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