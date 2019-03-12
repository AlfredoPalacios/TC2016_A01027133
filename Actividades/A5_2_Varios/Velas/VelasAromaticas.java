package Actividades.A5_2_Varios.Velas;
/**
 * VelasAromaticas
 */
public class VelasAromaticas extends VelasNormales {
    private double precio;
    public VelasAromaticas(){}
    public VelasAromaticas(String color, double altura){
        super(color, altura);
    }
    public void setAltura(double altura){
        precio = altura * 8;
    }
    public void printPrecio(){
        System.out.println(precio);
    }
}