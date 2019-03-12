package Actividades.A5_2_Varios.Libros;

/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        Ficcion libroF = new Ficcion("Jean Potoki", "Manuscrito en Zaragoza", 1980, 14, 899.99);
        NovelaRomantica libroN = new NovelaRomantica("Michael Molloy", "Montaña de la estrella fugaz", 1996, 3, 249.99);
        libroF.printDetalles();
        System.out.println("-------------------------------------------");
        libroN.printDetalles();
    }
}