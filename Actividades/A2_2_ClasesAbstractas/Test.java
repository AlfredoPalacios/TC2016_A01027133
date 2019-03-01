/**
 * Test
 */
package Actividades.A2_2_ClasesAbstractas;

public class Test {
    public static void main(String[] args) {
        Button b = new Button();
        b.click(100, 100);
        b.setLocation(new Point(200, 200));
        b.setBackgroundColor(new Color(20, 10, 15));
        b.drawComponent();
    }
}