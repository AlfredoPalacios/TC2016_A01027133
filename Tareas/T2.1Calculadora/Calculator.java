public class Calculator {

    public static void main(String[] args) {

        IntNumber a=new IntNumber(1);
        IntNumber b=new IntNumber(9);
        
        System.out.println("Operations with integer numbers");
        System.out.print("The sum of A and B is: ");
        IntNumber c=a.intSum(b);
        c.printNumber();
        System.out.print("The substraction is: ");
        c=a.intSubstraction(b);
        c.printNumber();
        System.out.print("The multiplication is: ");
        c=a.intMultiplication(b);
        c.printNumber();
        System.out.print("The division is (without decimals): ");
        c=a.intDivision(b);
        c.printNumber();
        System.out.print("The square root of A is (only the integer part): ");
        c=a.intSquareRoot();
        c.printNumber();
        System.out.print("The square root of B is (only the integer part): ");
        c=b.intSquareRoot();
        c.printNumber();
        System.out.print("A to the power of two is: ");
        c=a.powerOfTwoInt();
        c.printNumber();
        System.out.print("B to the power of two is: ");
        c=b.powerOfTwoInt();
        c.printNumber();

        //Double

        DoubleNumber d=new DoubleNumber(4.5);
        DoubleNumber e=new DoubleNumber(6.5);
        
        System.out.println("Operations with double numbers");
        System.out.print("The sum of D and E is: ");
        DoubleNumber f=d.doubleSum(e);
        f.printNumber();
        System.out.print("The substraction is: ");
        f=d.doubleSubstraction(e);
        f.printNumber();
        System.out.print("The multiplication is: ");
        f=d.doubleMultiplication(e);
        f.printNumber();
        System.out.print("The division is (without decimals): ");
        f=d.doubleDivision(e);
        f.printNumber();
        System.out.print("The square root of D is: ");
        f=d.doubleSquareRoot();
        f.printNumber();
        System.out.print("The square root of E is: ");
        f=e.doubleSquareRoot();
        f.printNumber();
        System.out.print("D to the power of two is: ");
        f=d.powerOfTwoDouble();
        f.printNumber();
        System.out.print("E to the power of two is: ");
        f=e.powerOfTwoDouble();
        f.printNumber();

    }
    
}