/**
 * Trapecio
 */

public class Trapecio implements RelatedThings{
    protected double baseMa;
    protected double baseMe;
    protected double height;
    public Trapecio(){baseMa=0;baseMe=0;height=0;}
    public Trapecio(double baseMa, double baseMe, double height){
        this.baseMa = baseMa;
        this.baseMe = baseMe;
        this.height = height;
    }
    public double getArea(){
        return height*(((baseMa+baseMe)/2));
    }
    public double getPerimeter(){
        double a = 0;
        double c = 0;
        double b = height;
        a = (baseMa-baseMe)/2;
        c = Math.sqrt((a*a)+(b*b));
        return (baseMa+baseMe+2*(c));
    }
}