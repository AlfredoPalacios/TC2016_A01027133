/**
 * Lucecita
 */
public class Lucecita extends Persona{

    private Juanito j=null;
    private Marianita m=null;

    private Lucecita(){}

    private Lucecita(String name){
        super(name);
    }

    public void verAlguien(){
        System.out.println("Soy " + getNombre() + " y estoy viendo a " + j.getNombre());
    }

    public void pedirUnBeso(){
        System.out.println(getNombre() + " dice: " + m.getNombre() + ", ¿me das un beso?");
    }

    public void besar(){
        System.out.println("Soy " + getNombre() + " y estoy besando a " + m.getNombre());
    }

    public void noSeDeja(){
        System.out.println("Soy " + getNombre() + " y " + j.getNombre() + " no se deja besuquear.");
    }
    
}