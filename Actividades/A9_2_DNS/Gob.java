package Actividades.A9_2_DNS;
import Actividades.A9_2_DNS.IPDom;
/**
 * Gob
 */
public class Gob {
    protected IPDom gobList[];
    private static Gob instance = null;
    public Gob(){
        gobList = new IPDom[5];
        gobList[0] = semarnat;
        gobList[1] = conagua;
        gobList[2] = fepade;
        gobList[3] = banjercito;
        gobList[4] = inegi;
    }
    IPDom<String, String> semarnat = new IPDom<String, String>("www.semarnat.gob", "124.165.2.4");
    IPDom<String, String> conagua = new IPDom<>("www.conagua.gob", "184.196.5.4");
    IPDom<String, String> fepade = new IPDom<>("www.fepade.gob", "153.124.1.9");
    IPDom<String, String> banjercito = new IPDom<>("www.banjercito.gob", "164.158.2.2");
    IPDom<String, String> inegi = new IPDom<>("www.inegi.gob", "175.175.1.8");
    public IPDom searchDomain(String dominio) throws IPNotFoundException {
        for(int i=0; i<gobList.length; i++){
            if(gobList[i].getDominio().equals(dominio)){
                return gobList[i];
            }
        }
        throw new IPNotFoundException(dominio);
    }
    public static Gob getInstance(){
        if(instance == null){
            return new Gob();
        }
        else
            return instance;
    }
}