/**
 * Labio
 */
public class Labio {

    private int[] numLabios;
    private String colorLabios;

    public Labio() {
    }

    public int[] getNumLabios() {
        return numLabios;
    }

    public void setNumLabios(int[] numLabios) {
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