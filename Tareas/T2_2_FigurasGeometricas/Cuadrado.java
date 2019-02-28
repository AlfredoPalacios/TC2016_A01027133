/**
 * Cuadrado
 */
public class Cuadrado implements RelatedThings{
    protected String figura;
    public Cuadrado(String figura){
        this.figura=figura;
    }
    public int getNumLados(){
        return 4;
    }
    public int getBaseMa(){
        return 7;
    }
    public int getBaseMe(){
        return 0;
    }
    public int getAltura(){
        return 7;
    }
    public int getDiag1(){
        return 0;
    }
    public int getDiag2(){
        return 0;
    }
    public double getLado1(){
        return 7.0;
    }
    public double getLado2(){
        return 7.0;
    }
    public double getLado3(){
        return 7.0;
    }
    public double getLado4(){
        return 7.0;
    }
}