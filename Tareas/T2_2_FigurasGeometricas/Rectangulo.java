/**
 * Rectangulo
 */
public class Rectangulo implements RelatedThings{
    protected double base;
    protected double height;
    public Rectangulo(){base=0;height=0;}
    public Rectangulo(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return base*height;
    }
    public double getPerimeter(){
        return ((base*2)+(height*2));
    }
}