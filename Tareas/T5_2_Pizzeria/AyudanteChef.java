package pizzería;


public class AyudanteChef extends Empleado {
	public AyudanteChef(String nombre, String puesto) {
		super(nombre, puesto);
	}
	public void ayudarChef() {
		System.out.println("Ayud� al chef a preparar la pizza");
	}
	public void ayudarEmpacar() {
		System.out.println("Ayud� a empacar la pizza");
	}
}
