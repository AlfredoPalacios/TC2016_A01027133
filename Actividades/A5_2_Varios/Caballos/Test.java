package Actividades.A5_2_Varios.Caballos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        GregorianCalendar date1 = new GregorianCalendar(2000, Calendar.MARCH, 8);
        GregorianCalendar date2 = new GregorianCalendar(2003, Calendar.JANUARY, 10);
        Caballo caballoNormal = new Caballo("Diego", "cafe", date1);
        CaballoDeCarrera caballoRapido = new CaballoDeCarrera("Javier", "naranja", date2, 20, 17);
        caballoRapido.printData();
    }
}