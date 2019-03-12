package Actividades.A5_2_Varios.Baloncesto;

/**
 * Normales
 */
public class Normales extends Jugadores {
    public Normales(){}
    public Normales(String nombre, String apellido, int numero, int canasta){
        super(nombre, apellido, numero, canasta);
    }
    public void recibirOrdenes(CapitanBasket capitan){
            System.out.println("Soy "+getNombre()+" y estoy recibiendo ordenes de "+capitan.getNombre());
    }
}