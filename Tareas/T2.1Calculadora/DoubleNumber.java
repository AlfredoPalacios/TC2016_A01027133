public class DoubleNumber {

    private Double theDoubleNumber;

    public DoubleNumber(){
        System.out.println("Sin parámetros.");
    }

    public DoubleNumber(double theDoubleNumber){
        this.theDoubleNumber=theDoubleNumber;
    }

    public double getDoubleNumber(){
        return theDoubleNumber;
    }

    public void printNumber(){
        System.out.println(theDoubleNumber);
    }

    public DoubleNumber doubleSum(DoubleNumber otherDouble){

        double sum=0.0;

        sum=theDoubleNumber+otherDouble.getDoubleNumber();
        DoubleNumber result=new DoubleNumber(sum);
    
        return result;

    }

    public DoubleNumber doubleSubstraction(DoubleNumber otherDouble2){

        double sub=0.0;

        sub=theDoubleNumber-otherDouble2.getDoubleNumber();
        DoubleNumber result=new DoubleNumber(sub);

        return result;

    }

    public DoubleNumber doubleMultiplication(DoubleNumber otherDouble3){

        double mul=0.0;

        mul=theDoubleNumber*otherDouble3.getDoubleNumber();
        DoubleNumber result=new DoubleNumber(mul);

        return result;

    }

    public DoubleNumber doubleDivision(DoubleNumber otherDouble4){

        double div=0.0;

        div=theDoubleNumber/otherDouble4.getDoubleNumber();
        DoubleNumber result=new DoubleNumber(div);

        return result;
        
    }

    public DoubleNumber doubleSquareRoot(){

        if(theDoubleNumber==0||theDoubleNumber==1){
            DoubleNumber result=new DoubleNumber(theDoubleNumber);
            
            return result;

        }

        double any;
	    double squareRoot = theDoubleNumber / 2;

    	do {
    		any = squareRoot;
    		squareRoot = (any + (theDoubleNumber / any)) / 2;
    	} while ((any - squareRoot) != 0);
        DoubleNumber resultt=new DoubleNumber(squareRoot);
 
    	return resultt;

    }

    public DoubleNumber powerOfTwoDouble(){

        double pow=0;

        pow=theDoubleNumber*theDoubleNumber;
        DoubleNumber result=new DoubleNumber(pow);

        return result;

    }
    
}