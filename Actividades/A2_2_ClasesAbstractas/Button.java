/**
 * Button
 */
package Actividades.A2_2_ClasesAbstractas;

public class Button extends GraphicComponent implements Clickeable {
    public void click(int x , int y){
        System.out.println("Le estas picando en: "+x+", "+y);
    }
    public void setLocation(Point p){
        position = p;
    }
    public void setBackgroundColor(Color c){
        background = c;
    }
    public void drawComponent(){
        System.out.println("Estoy dibujando un boton en la panttalla en la posicion: "+position.x+", "+position.y);
    }
}