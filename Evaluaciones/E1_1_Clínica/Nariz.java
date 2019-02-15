/**
 * Nariz
 */
public class Nariz {

    private String tamañoNariz;
    private boolean conMocos;

    public Nariz(){}

    public Nariz(String tamañoNariz, boolean conMocos){
        this.tamañoNariz=tamañoNariz;
        this.conMocos=conMocos;
    }

    public void inhalar(){
        System.out.println("Estoy inhalando.");
    }

    public void exhalar(){
        System.out.println("Estoy exhalando.");
    }

}