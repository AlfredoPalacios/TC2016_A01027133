/**
 * Rectangulo
 */
public class Rectangulo implements RelatedThings{
    protected String figura;
    public Rectangulo(String figura){
        this.figura=figura;
    }
    public int getNumLados(){
        return 4;
    }
    public int getBaseMa(){
        return 9;
    }
    public int getBaseMe(){
        return 0;
    }
    public int getAltura(){
        return 3;
    }
    public int getDiag1(){
        return 0;
    }
    public int getDiag2(){
        return 0;
    }
    public double getLado1(){
        return 9.0;
    }
    public double getLado2(){
        return 3.0;
    }
    public double getLado3(){
        return 9.0;
    }
    public double getLado4(){
        return 3.0;
    }
}