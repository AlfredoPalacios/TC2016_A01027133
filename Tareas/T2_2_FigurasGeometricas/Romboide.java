/**
 * Romboide
 */
public class Romboide implements RelatedThings{
    protected double base;
    protected double height;
    public Romboide(){base=0;height=0;}
    public Romboide(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return base*height;
    }
    public double getPerimeter(){
        double a = 0;
        double b = height;
        double c = 0;
        a = 1;
        c = Math.sqrt((a*a)+(b*b));
        return ((base*2)+(c*2));
    }
}