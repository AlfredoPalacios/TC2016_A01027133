package Actividades.A5_2_Varios.Libros;

/**
 * NovelaRomantica
 */
public class NovelaRomantica extends Libro {
    public NovelaRomantica(){}
    public NovelaRomantica(String autor, String titulo, int anoPub, int edicion, double precio){
        this.autor = autor;
        this.titulo = titulo;
        this.anoPub = anoPub;
        this.edicion = edicion;
        this.precio = precio;
    }
    public void printDetalles(){
        System.out.println("Autor: "+autor);
        System.out.println("Titulo: "+titulo);
        System.out.println("Año de publicacion: "+anoPub);
        System.out.println("Edicion numero: "+edicion);
        System.out.println("Precio: "+precio);
    }
}