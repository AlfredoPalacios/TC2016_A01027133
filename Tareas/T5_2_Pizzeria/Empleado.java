package Tareas.T5_2_Pizzeria;

public class Empleado {
	protected String nombre;
	protected String puesto;

	public Empleado(String nombre, String puesto) {
		this.nombre = nombre;
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public String getNombre() {
		return nombre;
	}
}
