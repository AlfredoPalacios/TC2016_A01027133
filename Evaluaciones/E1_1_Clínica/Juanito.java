/**
 * Juanito
 */
public class Juanito extends Persona{

    private Marianita m=null;
    private Lucecita l=null;

    private Juanito(){}

    private Juanito(String name){
        super(name);
    }

    public void verAlguien(){
        System.out.println("Soy " + getNombre() + " y estoy viendo a " + m.getNombre());
    }

    public void pedirUnBeso(){
        System.out.println(getNombre() + " dice: " + m.getNombre() + ", ¿me das un beso?");
    }

    public void besar(){
        System.out.println("Soy " + getNombre() + " y estoy besando a " + m.getNombre());
    }

    public void noSeDeja(){
        System.out.println("Soy " + getNombre() + " y " + l.getNombre() + " no se deja besuquear.");
    }

}