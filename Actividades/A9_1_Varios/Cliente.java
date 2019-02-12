public class Cliente extends Person {

    private Cliente(){}

    public Cliente(String nombre){
        super(nombre);
    }

    public void retirar(double cantidad, Sucursal s){

        s.retiro(cantidad, this);

    }

    public static void main(String[] args) {
        
        Sucursal s = new Sucursal("Aragon");
        Sucursal b = new Sucursal("Benito Juarez");
        Cliente c = new Cliente("Pedro");

        c.retirar(10000, s);

        c.retirar(20000, b);

    }
    
}