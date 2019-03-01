/**
 * Rombo
 */
public class Rombo implements RelatedThings{
    protected double diag1;
    protected double diag2;
    public Rombo(){diag1=0;diag2=0;}
    public Rombo(double diag1, double diag2){
        this.diag1 = diag1;
        this.diag2 = diag2;
    }
    public double getArea(){
        return (diag1*diag2)/2;
    }
    public double getPerimeter(){
        double a = diag1/2;
        double b = diag2/2;
        double c = 0;
        c = Math.sqrt((a*a)+(b*b));
        return (c*4);
    }
}