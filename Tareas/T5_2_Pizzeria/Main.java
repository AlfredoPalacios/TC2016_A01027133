package pizzería;


public class Main {
	public static void main(String[] args) {
		Polanco p = new Polanco();
                Ingredientes[] listaIngPolanco = new Ingredientes[2];
                Ingredientes verduras = new Ingredientes("verduras", 3.5);
                Ingredientes quesoBajoGrasa = new Ingredientes("Queso bajo en grasa", 40.6);
                listaIngPolanco[0] = verduras;
                listaIngPolanco[1] = quesoBajoGrasa;
                TiposDePizza hawaiana = new TiposDePizza("hawaiana", listaIngPolanco);
                p.recibirOrden(hawaiana, p);
	}
}
