public class Sucursal {

    private String sucur;
    private Sucursal(){}

    public Sucursal(String sucur){
        this.sucur=sucur;
    }
    
    public void retiro(double cantidad, Cliente c){

        System.out.println("Sucursal: " + sucur + " dando la cantidad de: " + cantidad + " a " + c.getName());

    }
   
}