package Tareas.T5_2_Pizzeria;

public class Repartidor extends Empleado {
	public Repartidor(String nombre, String puesto) {
		super(nombre, puesto);
	}

	public void repartirOrden(TiposDePizza pizza) {
		System.out.println("Repart� la orden.");
	}

}
