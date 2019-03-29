package Actividades.A9_2_DNS;
import Actividades.A9_2_DNS.IPDom;
/**
 * Org
 */
public class Org {
    protected IPDom orgList[];
    private static Org instance = null;
    public Org(){
        orgList = new IPDom[5];
        orgList[0] = otan;
        orgList[1] = greenpeace;
        orgList[2] = onu;
        orgList[3] = rae;
        orgList[4] = wikipedia;
    }
    IPDom<String, String> otan = new IPDom<String, String>("www.otan.org", "155.156.0.1");
    IPDom<String, String> greenpeace = new IPDom<>("www.greenpeace.org", "165.148.2.3");
    IPDom<String, String> onu = new IPDom<>("www.onu.org", "147.168.3.3");
    IPDom<String, String> rae = new IPDom<>("www.rae.org", "154.165.5.5");
    IPDom<String, String> wikipedia = new IPDom<>("www.wikipedia.org", "174.154.2.2");
    public IPDom searchDomain(String dominio) throws IPNotFoundException {
        for(int i=0; i<orgList.length; i++){
            if(orgList[i].getDominio().equals(dominio)){
                return orgList[i];
            }
        }
        throw new IPNotFoundException(dominio);
    }
    public static Org getInstance(){
        if(instance == null){
            return new Org();
        }
        else
            return instance;
    }
}