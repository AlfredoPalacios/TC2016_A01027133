package Actividades.A8_2_Generics;
/**
 * Tuple
 * Generic class
 */
public class Tuple <Key, Value> {
    protected Key key;
    protected Value value;
    protected String name;

    public Tuple(Key key, Value value){
        this.key = key;
        this.value = value;
        name = "tupla";
    }
    public Key getKey(){
        return key;
    }
    public Value getValue(){
        return value;
    }
    public String toString(){
        return "("+key+", "+value+")";
    }
}