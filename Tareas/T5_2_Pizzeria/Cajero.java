package Tareas.T5_2_Pizzeria;

public class Cajero extends Empleado {
	public Cajero(String nombre, String puesto) {
		super(nombre, puesto);
	}

	public void recibirOrden2(TiposDePizza pizza, Chef chef, AyudanteChef ayudanteChef, Repartidor repartidor) {
		System.out.println("Recibi la orden.");
		pedirPreparacion(pizza, chef, ayudanteChef, repartidor);
	}

	public void pedirPreparacion(TiposDePizza pizza, Chef chef, AyudanteChef ayudanteChef, Repartidor repartidor) {
		chef.prepararPizza(pizza, ayudanteChef, repartidor);
		System.out.println("Pedi la preparacion al chef.");
		recibirOrdenDeVuelta(pizza, repartidor);
	}

	public void recibirOrdenDeVuelta(TiposDePizza pizza, Repartidor repartidor) {
		System.out.println("Recibi la pizza ya hecha");
		repartidor.repartirOrden(pizza);
		System.out.println("Pedi al repartidor que reparta la pizza");
	}
}
