package Actividades.A2_3_Listas;
public interface ListInterface<T> {
    void add(T element);
    void remove(int index);
    int find(T element);
    Object get(int index);
    void print();
}