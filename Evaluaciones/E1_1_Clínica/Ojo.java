/**
 * Ojo
 */
public class Ojo {

    private int[] numOjos;
    private String colorOjos;

    public Ojo(){}

    public Ojo(int[] numOjos, String colorOjos){
        for(int i=0; i<=1; i++){
            numOjos[i]=1;
        }
        this.numOjos=numOjos;
        this.colorOjos=colorOjos;
    }

    public void parpadear(){
        System.out.println("Parpadeo.");
    }

    public void mirar(){
        System.out.println("Estoy viendo ");
    }

}