package pizzería;


public class TiposDePizza {
	private String tipo;
	private Ingredientes[] ingredientes;
	public TiposDePizza(String tipo, Ingredientes[] ingredientes) {
		this.tipo = tipo;
		this.ingredientes = ingredientes;
	}
	public String getTipo() {
		return tipo;
	}
	public Ingredientes[] getIngredientes() {
		return ingredientes;
	}
}