/**
 * MatrizFlotantes
 */
public class MatrizFlotantes {
    protected Flotantes[][] matrizValues;
    protected int columns;
    protected int rows;
    public MatrizFlotantes(int columns, int rows){
        matrizValues = new Flotantes[columns][rows];
    }
    public void setXY(int x, int y, Flotantes value){
        matrizValues[x][y] = value;
    }
    public Flotantes[][] getMatrizFlotantes(){
        return matrizValues;
    }
    public String toString(int x, int y){
        float value = matrizValues[x][y].getValue();
        return (""+value+"");
    }
}