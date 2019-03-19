package pizzería;


public class Polanco extends Sucursal {
	protected Ingredientes[] ingredientes;
	protected Gerente g;
	protected Chef chef;
	protected AyudanteChef ayudanteChef;
	protected Cajero cajero;
	protected Repartidor repartidor;
	public Polanco() {
		Ingredientes[] ingredientes = new Ingredientes[5];
		Empleado chef = new Chef("Santiago Viloria", "chef");
		Empleado ayudanteChef = new AyudanteChef("Pepe Olloqui", "ayudante del chef");
		Empleado cajero = new Cajero("Paco Pulido", "cajero");
		Empleado repartidor = new Repartidor("Esteban Robles", "repartidor");
		g = Gerente.getInstance();
		this.ingredientes = ingredientes;
	}
	public void recibirOrden(TiposDePizza pizza, Sucursal sucursal) {
		cajero.recibirOrden(pizza, chef, ayudanteChef, repartidor);
	}
}
