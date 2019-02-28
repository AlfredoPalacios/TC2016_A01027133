/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado("cuadrado");
        Rectangulo rectangulo1 = new Rectangulo("rectangulo");
        Rombo rombo1 = new Rombo("rombo");
        Romboide romboide1 = new Romboide("romboide");
        Trapecio trapecio1 = new Trapecio("trapecio");
        Triangulo triangulo1 = new Triangulo("triangulo");

        System.out.println("Area del cuadrado es: "+cuadrado1.getArea(cuadrado1));
        System.out.println("Area del rectangulo es: "+rectangulo1.getArea(rectangulo1));
        System.out.println("Area del rombo es: "+rombo1.getArea(rombo1));
        System.out.println("Area del romboide es: "+romboide1.getArea(romboide1));
        System.out.println("Area del trapecio es: "+trapecio1.getArea(trapecio1));
        System.out.println("Area del triangulo es: "+triangulo1.getArea(triangulo1));

        System.out.println("Perimetro del cuadrado es: "+cuadrado1.getPerimetro(cuadrado1));
        System.out.println("Perimetro del rectangulo es: "+rectangulo1.getPerimetro(rectangulo1));
        System.out.println("Perimetro del rombo es: "+rombo1.getPerimetro(rombo1));
        System.out.println("Perimetro del romboide es: "+romboide1.getPerimetro(romboide1));
        System.out.println("Perimetro del trapecio es: "+trapecio1.getPerimetro(trapecio1));
        System.out.println("Perimetro del triangulo es: "+triangulo1.getPerimetro(triangulo1));
    }
}