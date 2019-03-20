package pizzería;


public class Cajero extends Empleado {
	public Cajero(String nombre, String puesto) {
		super(nombre, puesto);
	}
	public void recibirOrden2(TiposDePizza pizza, Chef chef, AyudanteChef ayudanteChef, Repartidor repartidor) {
		System.out.println("Recib� la orden.");
		pedirPreparacion(pizza, chef, ayudanteChef, repartidor);
	}
	public void pedirPreparacion(TiposDePizza pizza, Chef chef, AyudanteChef ayudanteChef, Repartidor repartidor) {
		chef.prepararPizza(pizza, ayudanteChef, repartidor);
		System.out.println("Ped� la preparaci�n al chef.");
		recibirOrdenDeVuelta(pizza, repartidor);
	}
	public void recibirOrdenDeVuelta(TiposDePizza pizza, Repartidor repartidor) {
		System.out.println("Recib� la pizza ya hecha");
		repartidor.repartirOrden(pizza);
		System.out.println("Ped� al repartidor que reparta la pizza");
	}
}
