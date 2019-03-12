package Actividades.A5_2_Varios.Baloncesto;

/**
 * Normales
 */
public abstract class Jugadores {
    protected String nombre;
    protected String apellido;
    protected int numero;
    protected int canasta;
    public Jugadores(){}
    public Jugadores(String nombre, String apellido, int numero, int canasta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.canasta = canasta;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getNumero(){
        return numero;
    }
    public int getCanasta(){
        return canasta;
    }
}