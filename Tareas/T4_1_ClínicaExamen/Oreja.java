/**
 * Oreja
 */
public class Oreja {

    private int[] numOrejas;
    private String tamanoOrejas;

    public Oreja(){}

    public Oreja(int[] numOrejas, String tamanoOrejas){
        for(int i=0; i<=1; i++){
            numOrejas[i]=1;
        }
        this.numOrejas=numOrejas;
        this.tamanoOrejas=tamanoOrejas;
    }

    public void escuchar(){
        System.out.println("Estoy escuchando.");
    }

}