package Actividades.A2_3_Listas;

import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        GenericList<String> listaStrings = new GenericList<>();
        listaStrings.add("hola");
        listaStrings.add("que onda");
        listaStrings.add("que haces");
        listaStrings.add("ajajajaja");
        listaStrings.add("que haceeeeeeess");
        listaStrings.add("que son treeeeceeeeeeeee");
        listaStrings.print();
    }
}