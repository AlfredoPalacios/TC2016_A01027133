package pizzería;


public class Sucursal {
	private String nombre;
	private Empleado[] empleados;
	private Ingredientes[] ingredientes;
	private Gerente gerente;
	public Sucursal() {}
	public Sucursal(String nombre, Empleado[] empleados, Gerente gerente, Ingredientes[] ingredientes) {
		this.nombre = nombre;
		this.empleados = empleados;
		this.gerente = gerente;
		this.ingredientes = ingredientes;
	}
	public String getNombre() {
		return nombre;
	}
	public Empleado[] getEmpleados() {
		return empleados;
	}
	public Ingredientes[] getIngedientes() {
		return ingredientes;
	}
	public Gerente getGerente() {
		return gerente;
	}
}
