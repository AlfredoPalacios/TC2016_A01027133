/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(1.2, 1.2);
        Rectangulo rectangulo1 = new Rectangulo(38, 21);
        Rombo rombo1 = new Rombo(5.4, 3);
        Romboide romboide1 = new Romboide(5, 4);
        Trapecio trapecio1 = new Trapecio(15, 12, 6);
        Triangulo triangulo1 = new Triangulo(10, 42);

        System.out.println("Area del cuadrado es: "+cuadrado1.getArea());
        System.out.println("Area del rectangulo es: "+rectangulo1.getArea());
        System.out.println("Area del rombo es: "+rombo1.getArea());
        System.out.println("Area del romboide es: "+romboide1.getArea());
        System.out.println("Area del trapecio es: "+trapecio1.getArea());
        System.out.println("Area del triangulo es: "+triangulo1.getArea());

        System.out.println("Perimetro del cuadrado es: "+cuadrado1.getPerimeter());
        System.out.println("Perimetro del rectangulo es: "+rectangulo1.getPerimeter());
        System.out.println("Perimetro del rombo es: "+rombo1.getPerimeter());
        System.out.println("Perimetro del romboide es: "+romboide1.getPerimeter());
        System.out.println("Perimetro del trapecio es: "+trapecio1.getPerimeter());
        System.out.println("Perimetro del triangulo es: "+triangulo1.getPerimeter());
    }
}