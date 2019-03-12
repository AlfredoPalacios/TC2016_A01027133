package Actividades.A5_2_Varios.Baloncesto;

/**
 * CapitanBasket
 */
public class CapitanBasket extends Jugadores {
    public CapitanBasket(){}
    public CapitanBasket(String nombre, String apellido, int numero, int canasta){
        super(nombre, apellido, numero, canasta);
    }
    public void darOrdenes(Normales normal){
            System.out.println("Soy "+getNombre()+" y le estoy dando ordenes a "+normal.getNombre());
    }

    protected static CapitanBasket instanciaCapi = null;
    public static CapitanBasket getInstance(String nombre, String apellido, int numero, int canasta) {
        if (instanciaCapi == null) {
            instanciaCapi = new CapitanBasket(nombre, apellido, numero, canasta);
        }
        return instanciaCapi;
    }
}