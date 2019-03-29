package Evaluaciones.E2_2_Primos;
/**
 * PrimeNumbers
 */
public abstract class PrimeNumbers <N1, N2> {
    protected N1 n1;
    protected N2 n2;
    public PrimeNumbers(N1 n1, N2 n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public N1 getN1(){
        return n1;
    }
    public N2 getN2(){
        return n2;
    }
    public String toString(){
        return "<"+n1+", "+n2+">";
    }
    public void isPrime(int num){
        int counter = 0, control=0, div2=0;
		div2=num/2;
		for(counter=2; counter<=div2; counter++){
			if(num%counter==0){
				control=1;
				break;
			}
        }
        if(control==0)
            System.out.println("false");
        System.out.println("true");
    }
    public abstract PrimeNumbers nPrime();
}