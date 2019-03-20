package pizzería;


public class Gerente extends Empleado {
    protected static Gerente instance = null;
    public static Gerente getInstance(String nombre, String puesto, int pizzasHechas, Ingredientes[] ingredientes) {
        if(instance == null) {
            instance = new Gerente(nombre, puesto, pizzasHechas, ingredientes);
        }
        return instance;
    }
    public Gerente(String nombre, String puesto, int pizzasHechas, Ingredientes[] ingredientes) {
        super(nombre, puesto);
    }
    public void pizzasHechas(int cont){
        System.out.println("Se han hecho: "+cont+" pizzas");
    }
    public void calcularPrecioPizza(Ingredientes[] ingredientes){
            double precioPizza = 0;
            for(int i=0; i<ingredientes.length; i++){
                precioPizza+=ingredientes[i].getPrecio();
            }
            System.out.println("El costo de la piiza es de: "+precioPizza);
        }
}
