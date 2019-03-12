package Actividades.A5_2_Varios.Libros;

/**
 * Libro
 */
public abstract class Libro {
    protected String autor;
    protected String titulo;
    protected int anoPub;
    protected int edicion;
    protected double precio;
    public abstract void printDetalles();
}