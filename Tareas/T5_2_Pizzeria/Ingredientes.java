package pizzería;


public class Ingredientes {
	private String nombre;
	private double precio;
	public Ingredientes() {}
	public Ingredientes(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getTipo() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
}
