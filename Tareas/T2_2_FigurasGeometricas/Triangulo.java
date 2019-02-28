/**
 * Triangulo
 */
public class Triangulo implements RelatedThings{
    protected String figura;
    public Triangulo(String figura){
        this.figura=figura;
    }
    public int getNumLados(){
        return 3;
    }
    public int getBaseMa(){
        return 3;
    }
    public int getBaseMe(){
        return 0;
    }
    public int getAltura(){
        return 4;
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