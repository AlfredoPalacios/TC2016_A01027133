/**
 * Persona
 */
public class Persona {

    private Cabeza miCabeza;
    private String nombre;

    public Persona(){
        miCabeza=new Cabeza();
    }

    public String getNombre()
    {
        return nombre;
    }

    public Persona(){}

    public Persona(String nombre)
    {
        this.nombre = nombre;
    }

}