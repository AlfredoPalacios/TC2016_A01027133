/**
 * Trapecio
 */

public class Trapecio implements RelatedThings{
    protected String figura;
    public Trapecio(String figura){
        this.figura=figura;
    }
    public int getNumLados(){
        return 4;
    }
    public int getBaseMa(){
        return 8;
    }
    public int getBaseMe(){
        return 5;
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
        return 8.0;
    }
    public double getLado2(){
        return 5.0;
    }
    public double getLado3(){
        return Math.sqrt(5.25);
    }
    public double getLado4(){
        return Math.sqrt(5.25);
    }
}