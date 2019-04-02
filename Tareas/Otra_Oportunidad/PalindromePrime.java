package Tareas.Otra_Oportunidad;
import Tareas.Otra_Oportunidad.Tuple;
/**
 * PalindromePrime
 */
public class PalindromePrime extends PrimeNumbers {
    public int nPrime(int n){
        boolean flag = false;
        boolean paliPrime = false;
        int paliNum;
        int temPrime;
        int i2 = 0;
        for(int i=2; i2<n; i2++){
            while(!paliPrime){
                while(!flag){
                    int counter = 0, control=0, div2=0;
                    div2=i/2;
                    for(counter=2; counter<=div2; counter++){
                        if(i%counter==0){
                            flag = false;
                            control=1;
                            i++;
                            break;
                        }
                    }
                    if(control==0){
                        flag = true;
                        temPrime = i;
                    }
                }
                if(flag){
                    theNumber=Integer.toString(i);
                    boolean pali = false;
                    String reversed="";
                    int size=0, count=0;
                    size=theNumber.length()-1;
                    for(count=size; count>=0; count--){
                        reversed+=theWord.charAt(count);
                    }
                    if(reversed.equals(theNumber))
                        pali = true;
                    else
                        pali = false;
                    if(pali){
                        paliNum=i;
                        paliPrime=true;
                    }
                }
            }
        }
        return paliNum;
    }
    public boolean isPrime(int n) throws NotPrimeNumberException {
        int number2 = 0;
        boolean pprime = false;
        int num = 0, counter = 0, control=0, div2=0;
		System.out.println("Enter any number.");
		num=kb.nextInt();
		div2=num/2;
		for(counter=2; counter<=div2; counter++){
			if(num%counter==0){
				throw new NotPrimeNumberException(number1, number2, "twin prime number");
				control=1;
				break;
			}
        }//end of for
		if(control==0)
            prime = true;
        if(prime){
            String reversed="";
            int size=0, count=0;
            theNumber=Integer.toString(n);
            size=theWord.length()-1;
            for(count=size; count>=0; count--){
                reversed+=theWord.charAt(count);
            }//here ends for loop
            if(reversed.equals(theWord))
                return true;
            else
                throw new NotPrimeNumberException(n, number2, "twin prime number");
        }
    }
}