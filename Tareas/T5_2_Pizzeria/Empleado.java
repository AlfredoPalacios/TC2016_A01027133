
public class Empleado {
	protected String nombre;
	protected String puesto;
	protected String accion;
	public Empleado(String nombre, String puesto, String accion) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.accion = accion;
	}
	public String getPuesto() {
		return puesto;
	}
	public String getNombre() {
		return nombre;
	}
	public String getAccion() {
		return accion;
	}
}
