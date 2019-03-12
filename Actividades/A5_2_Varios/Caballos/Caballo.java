package Actividades.A5_2_Varios.Caballos;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Caballo
 */
public class Caballo {
    protected String nombre;
    protected String color;
    protected GregorianCalendar fecha;
    public Caballo(){}
    public Caballo(String nombre, String color, GregorianCalendar fecha){
        this.nombre = nombre;
        this.color = color;
        this.fecha = fecha;
    }
    public String getNombre(){
        return nombre;
    }
    public String getColor(){
        return color;
    }
    public GregorianCalendar getFecha(){
        return fecha;
    }
}