/**
 * Marianita
 */
public class Marianita extends Persona{

    private Juanito j=null;
    private Lucecita l=null;

    private Marianita(){}

    private Marianita(String name){
        super(name);
    }

    public void verAlguien(){
        System.out.println("Soy " + getNombre() + " y estoy viendo a " + j.getNombre());
    }

    public void pedirUnBeso(){
        System.out.println(getNombre() + " dice: " + j.getNombre() + ", ¿me das un beso?");
    }

    public void besar(){
        System.out.println("Soy " + getNombre() + " y estoy besando a " + j.getNombre());
    }

    public void noSeDeja(){
        System.out.println("Soy " + getNombre() + " y " + l.getNombre() + " no se deja besuquear.");
    }
    
}