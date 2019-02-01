public class Test{

    public static void main(String[] args){
        
        Fractions a=new Fractions(1, 3);
        Fractions b=new Fractions(1, 2);

        Fractions c=a.sum(b);
        c.simplify();
        System.out.println("The sum is: ");
        c.printFraction();
        c=a.substract(b);
        c.simplify();
        System.out.println("The substraction is: ");
        c.printFraction();
        c=a.multiply(b);
        c.simplify();
        System.out.println("The multiplication is: ");
        c.printFraction();
        c=a.divide(b);
        c.simplify();
        System.out.println("The division is: ");
        c.printFraction();

    }

}