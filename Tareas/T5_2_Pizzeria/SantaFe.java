package Tareas.T5_2_Pizzeria;

public class SantaFe extends Sucursal {
    protected Ingredientes[] ingredientes;
    protected Gerente g;
    protected Chef chef;
    protected AyudanteChef ayudanteChef;
    protected Cajero cajero;
    protected Repartidor repartidor;

    public SantaFe(Ingredientes[] ingredientes, Chef chef, AyudanteChef ayudanteChef, Cajero cajero,
            Repartidor repartidor) {
        this.ingredientes = ingredientes;
        this.chef = chef;
        this.ayudanteChef = ayudanteChef;
        this.cajero = cajero;
        this.repartidor = repartidor;
        this.ingredientes = ingredientes;
    }

    public void recibirOrden(TiposDePizza pizza) {
        cajero.recibirOrden2(pizza, chef, ayudanteChef, repartidor);
    }

    public void crearGerente(String nombre, String puesto, int pizzasHechas, Ingredientes[] ingredientes) {
        g = Gerente.getInstance(nombre, puesto, pizzasHechas, ingredientes);
    }

    protected static SantaFe instance = null;

    public static SantaFe getInstance(Ingredientes[] ingredientes, Chef chef, AyudanteChef ayudanteChef, Cajero cajero,
            Repartidor repartidor) {
        if (instance == null) {
            instance = new SantaFe(ingredientes, chef, ayudanteChef, cajero, repartidor);
        }
        return instance;
    }

    public void imprimirPizzas(int cont) {
        g.pizzasHechas(cont);
    }

    public void calcularPrecioPizza(Ingredientes[] ingredientes) {
        g.calcularPrecioPizza(ingredientes);
    }
}
