package Evaluaciones.E2_2_Primos;
/**
 * Tuple
 */
public class Tuple <N1, N2> {
    protected N1 n1;
    protected N2 n2;
    public Tuple(N1 n1, N2 n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public N1 getN1(){
        return n1;
    }
    public N2 getN2(){
        return n2;
    }
    public String toString(){
        return "<"+n1+", "+n2+">";
    }
}