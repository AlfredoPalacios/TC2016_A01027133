/**
 * Persona
 */
public class Persona {

    private String nombre;

    public Persona(){}

    private Cabeza miCabeza;

    public Persona(String nombre){
        miCabeza=new Cabeza();
        this.nombre=nombre;
    }

    public String getName(){
        return nombre;
    }

    public void estarViendo(Persona j){

        System.out.print("Soy "+getName()+" y ");
        miCabeza.getOjos().mirar(j);
        
    }

}