/**
 * Cuadrado
 */
public class Cuadrado implements RelatedThings{
    protected double base;
    protected double height;
    public Cuadrado(){base=0;height=0;}
    public Cuadrado(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return base*height;
    }
    public double getPerimeter(){
        return (base*4);
    }
}