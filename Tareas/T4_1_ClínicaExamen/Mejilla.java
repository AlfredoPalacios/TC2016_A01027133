/**
 * Mejilla
 */
public class Mejilla {

    private boolean conPecas;
    private int[] numMejilla;

    public Mejilla(){}

    public Mejilla(int[] numMejilla, boolean conPecas){
        for(int i=0; i<=1; i++){
            numMejilla[i]=1;
        }
        this.numMejilla=numMejilla;
        this.conPecas=conPecas;
    }

}