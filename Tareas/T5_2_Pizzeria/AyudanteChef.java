package Tareas.T5_2_Pizzeria;

public class AyudanteChef extends Empleado {
	public AyudanteChef(String nombre, String puesto) {
		super(nombre, puesto);
	}

	public void ayudarChef() {
		System.out.println("Ayude al chef a preparar la pizza");
	}

	public void ayudarEmpacar() {
		System.out.println("Ayude a empacar la pizza");
	}
}
