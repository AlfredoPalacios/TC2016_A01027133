/**
 * Romboide
 */
public class Romboide implements RelatedThings{
    protected String figura;
    public Romboide(String figura){
        this.figura=figura;
    }
    public int getNumLados(){
        return 4;
    }
    public int getBaseMa(){
        return 10;
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
        return 10.0;
    }
    public double getLado2(){
        return Math.sqrt(19);
    }
    public double getLado3(){
        return 10.0;
    }
    public double getLado4(){
        return Math.sqrt(19);
    }
}