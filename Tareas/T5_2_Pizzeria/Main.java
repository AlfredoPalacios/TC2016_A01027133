package pizzería;


public class Main {
    public static void main(String[] args) {
        Polanco p;
        SantaFe f;
        
        Chef chef = new Chef("Santiago Viloria", "chef");
        AyudanteChef ayudanteChef = new AyudanteChef("Pepe Olloqui", "ayudante del chef");
        Cajero cajero = new Cajero("Paco Pulido", "cajero");
        Repartidor repartidor = new Repartidor("Esteban Robles", "repartidor");
        
        Ingredientes[] listaIngPolanco = new Ingredientes[2];
        Ingredientes verduras = new Ingredientes("verduras", 3.5);
        Ingredientes quesoBajoGrasa = new Ingredientes("Queso bajo en grasa", 40.6);
        listaIngPolanco[0] = verduras;
        listaIngPolanco[1] = quesoBajoGrasa;
        TiposDePizza vegetariana = new TiposDePizza("vegetariana", listaIngPolanco);
        Ingredientes[] ingVeg = new Ingredientes[2];
        ingVeg = listaIngPolanco;
        
        p = Polanco.getInstance(ingVeg, chef, ayudanteChef, cajero, repartidor);
        int contP = 0;
        System.out.println("Pizza vegetariana: \n");
        p.crearGerente("Alfredo Palacios", "gerente", contP, ingVeg);
        p.recibirOrden(vegetariana);
        contP++;
        p.imprimirPizzas(contP);
        p.calcularPrecioPizza(ingVeg);
        
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
        
        Ingredientes[] listaIngSantaFe = new Ingredientes[4];
        Ingredientes queso = new Ingredientes("queso", 28.6);
        Ingredientes frijoles = new Ingredientes("frijoles", 10.2);
        Ingredientes piña = new Ingredientes("piña", 11.0);
        Ingredientes chorizo = new Ingredientes("chorizo", 25.3);
        listaIngSantaFe[0] = queso;
        listaIngSantaFe[1] = frijoles;
        listaIngSantaFe[2] = piña;
        listaIngSantaFe[3] = chorizo;
        Ingredientes[] ingMex = new Ingredientes[4];
        ingMex = listaIngSantaFe;
        Ingredientes[] ingHaw = new Ingredientes[2];
        ingHaw[0] = queso;
        ingHaw[1] = piña;
        TiposDePizza mexicana = new TiposDePizza("mexicana", ingMex);
        TiposDePizza hawaiana = new TiposDePizza("hawaiana", ingHaw);
        
        f = SantaFe.getInstance(listaIngSantaFe, chef, ayudanteChef, cajero, repartidor);
        int contF = 0;
        System.out.println("Pizza mexicana: \n");
        f.crearGerente("Ariel Lucien", "gerente", contF, ingMex);
        f.recibirOrden(mexicana);
        contF++;
        f.imprimirPizzas(contF);
        f.calcularPrecioPizza(ingMex);
        
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
        
        System.out.println("Pizza hawaiana: \n");
        f.crearGerente("Ariel Lucien", "gerente", contF, ingHaw);
        f.recibirOrden(hawaiana);
        contF++;
        f.imprimirPizzas(contF);
        f.calcularPrecioPizza(ingHaw);
        
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
        
        Ingredientes[] listaIngMiPizza = new Ingredientes[3];
        listaIngMiPizza[0] = queso;
        listaIngMiPizza[1] = frijoles;
        listaIngMiPizza[2] = chorizo;
        TiposDePizza miPizza = new TiposDePizza("mi creación", listaIngMiPizza);
        
        System.out.println("Pizza mi creación: \n");
        p.crearGerente("Alfredo Palacios", "gerente", contF, listaIngMiPizza);
        p.recibirOrden(miPizza);
        contP++;
        p.imprimirPizzas(contP);
        p.calcularPrecioPizza(listaIngMiPizza);
	}
}
