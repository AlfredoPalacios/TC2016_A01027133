/**
 * Labio
 */
public class Labio {

    private int numLabio;
    private int[] numLabios;
    private String colorLabios;

    public Labio() {
    }

    public int getNumLabios() {
        return numLabio;
    }

    public void setNumLabios() {
        numLabio=2;
        for(int i=0; i<=1; i++){
            numLabios[i]=1;
        }
        this.numLabios = numLabios;
    }

    public String getColorLabios() {
        return colorLabios;
    }

    public void setColorLabios(String colorLabios) {
        this.colorLabios = colorLabios;
    }

}