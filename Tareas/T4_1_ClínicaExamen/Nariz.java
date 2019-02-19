/**
 * Nariz
 */
public class Nariz {

    private String tamanoNariz;
    private boolean conMocos;

    public Nariz(){}

    public Nariz(String tamanoNariz, boolean conMocos){
        this.tamanoNariz=tamanoNariz;
        this.conMocos=conMocos;
    }

    public void inhalar(){
        System.out.println("Estoy inhalando.");
    }

    public void exhalar(){
        System.out.println("Estoy exhalando.");
    }

}