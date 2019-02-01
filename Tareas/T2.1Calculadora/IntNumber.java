public class IntNumber {
    
    private int theIntNumber;

    public IntNumber(){
        System.out.println("Sin parámetros.");
    }

    public IntNumber(int theIntNumber){
        this.theIntNumber=theIntNumber;
    }

    public int getIntNumber(){
        return theIntNumber;
    }

    public void printNumber(){
        System.out.println(theIntNumber);
    }

    public IntNumber intSum(IntNumber otherInt){

        int sum=0;

        sum=theIntNumber+otherInt.getIntNumber();
        IntNumber result=new IntNumber(sum);
    
        return result;

    }

    public IntNumber intSubstraction(IntNumber otherInt2){

        int sub=0;

        sub=theIntNumber-otherInt2.getIntNumber();
        IntNumber result=new IntNumber(sub);

        return result;

    }

    public IntNumber intMultiplication(IntNumber otherInt3){

        int mul=0;

        mul=theIntNumber*otherInt3.getIntNumber();
        IntNumber result=new IntNumber(mul);

        return result;

    }

    public IntNumber intDivision(IntNumber otherInt4){

        int div=0;

        div=theIntNumber/otherInt4.getIntNumber();
        IntNumber result=new IntNumber(div);

        return result;
        
    }

    public IntNumber intSquareRoot(){

        if(theIntNumber==0||theIntNumber==1){
            IntNumber result=new IntNumber(theIntNumber);
            
            return result;

        }

        int any;
	    int squareRoot = theIntNumber / 2;

    	do {
    		any = squareRoot;
    		squareRoot = (any + (theIntNumber / any)) / 2;
    	} while ((any - squareRoot) != 0);
        IntNumber resultt=new IntNumber(squareRoot);
 
    	return resultt;

    }

    public IntNumber powerOfTwoInt(){

        int pow=0;

        pow=theIntNumber*theIntNumber;
        IntNumber result=new IntNumber(pow);

        return result;

    }

}