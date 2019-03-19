package pizzería;


public class Chef extends Empleado {
	public Chef(String nombre, String puesto) {
		super(nombre, puesto);
	}
	public void prepararPizza(TiposDePizza pizza, AyudanteChef ayudanteChef, Repartidor repartidor) {
		ayudanteChef.ayudarChef();
		System.out.println("Prepar� la pizza y le ped� ayuda a mi ayudante");
		System.out.println("Amas� la pizza");
		System.out.println("Agregu� los ingredientes");
		System.out.println("Horne� la pizza");
		System.out.println("Emaqu� la pizza");
		regresarPizza(pizza, repartidor);
	}
	public void regresarPizza(TiposDePizza pizza, Repartidor repartidor) {
		System.out.println("Le regres� la pizza al cajero");
	}
}
