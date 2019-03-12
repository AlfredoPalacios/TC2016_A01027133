package Actividades.A5_2_Varios.Baloncesto;

/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        Normales jugador1 = new Normales("Kobe", "Bryant", 23, 47);
        Normales jugador2 = new Normales("Michael", "Jordan", 12, 67);
        Normales jugador3 = new Normales("Axel", "Rose", 14, 34);
        Normales jugador4 = new Normales("John", "Johnnson", 3, 58);

        CapitanBasket jugador5 = CapitanBasket.getInstance("Alfredo", "Palacios", 10, 89);
        CapitanBasket jugador6 = CapitanBasket.getInstance("Pepe", "Pedro", 12, 14);

        jugador5.darOrdenes(jugador1);
        jugador2.recibirOrdenes(jugador6);
    }
}