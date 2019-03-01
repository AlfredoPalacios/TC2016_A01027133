/**
 * Triangulo
 */
public class Triangulo implements RelatedThings{
    protected double base;
    protected double height;
    public Triangulo(){base=0;height=0;}
    public Triangulo(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return (base*height)/2;
    }
    public double getPerimeter(){
        double a = 0;
        double c = 0;
        a = base/2;
        c = Math.sqrt((a*a)+(height*height));
        return (c+base+height);
    }
}