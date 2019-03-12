package Actividades.A5_2_Varios.Velas;
/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        VelasNormales vela1 = new VelasNormales("roja", 8);
        VelasAromaticas vela2 = new VelasAromaticas("blanca", 10);
        vela1.printPrecio();
        vela2.printPrecio();
    }
}