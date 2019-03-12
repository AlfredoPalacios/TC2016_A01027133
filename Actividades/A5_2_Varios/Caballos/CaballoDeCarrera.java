package Actividades.A5_2_Varios.Caballos;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.*;

/**
 * CballoDeCarrera
 */
public class CaballoDeCarrera extends Caballo {
    protected int carreras;
    protected int carrerasGanadas;
    public CaballoDeCarrera(){}
    public CaballoDeCarrera(String nombre, String color, GregorianCalendar fecha, int carreras, int carrerasGanadas){
        super(nombre, color, fecha);
        this.carreras = carreras;
        this.carrerasGanadas = carrerasGanadas;
    }
    public void printData(){
        System.out.println("Se llama: "+nombre+" es de color: "+color+" nacio el: "+fecha.toZoneDateTime().format(DateTimeFormatter.ofPattern("d MMM uuuu"))+" ha participado en: "+carreras+" carreras y ha ganado: "+carrerasGanadas+".");
    }
}