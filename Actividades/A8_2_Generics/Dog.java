package Actividades.A8_2_Generics;
/**
 * Dog
 */
public class Dog implements Comparable<Dog> {
    protected int age;

    public Dog(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public int compare2(Dog object1){
        //-1 si es menor, 1 si es mayor, 0 si son iguales
        if(getAge()>object1.getAge()){
            return 1;
        } else if(getAge()<object1.getAge()){
            return -1;
        } else
        return 0;
    }
}