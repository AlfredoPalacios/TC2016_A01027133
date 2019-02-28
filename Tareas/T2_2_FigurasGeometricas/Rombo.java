/**
 * Rombo
 */
public class Rombo implements RelatedThings{
    protected String figura;
    public Rombo(String figura){
        this.figura=figura;
    }
    public int getNumLados(){
        return 4;
    }
    public int getBaseMa(){
        return 0;
    }
    public int getBaseMe(){
        return 0;
    }
    public int getAltura(){
        return 0;
    }
    public int getDiag1(){
        return 1;
    }
    public int getDiag2(){
        return 1;
    }
    public double getLado1(){
        return Math.sqrt(2);
    }
    public double getLado2(){
        return Math.sqrt(2);
    }
    public double getLado3(){
        return Math.sqrt(2);
    }
    public double getLado4(){
        return Math.sqrt(2);
    }
}