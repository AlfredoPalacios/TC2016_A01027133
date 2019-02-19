/**
 * Ojo
 */
public class Ojo {

    private int numParpado;
    private int[] numParpados;
    private String colorOjos;

    public Ojo(){}

    public Ojo(String colorOjos){
        numParpado=4;
        for(int i=0; i<=3; i++){
            numParpados[i]=1;
        }
        this.numParpados=numParpados;
        this.colorOjos=colorOjos;
    }

    public void parpadear(){
        System.out.println("Parpadeo.");
    }

    public void mirar(Persona j){
        System.out.println("estoy viendo a "+j.getName());
    }

}