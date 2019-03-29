package Actividades.A9_2_DNS;
import Actividades.A9_2_DNS.IPDom;
/**
 * Net
 */
public class Net {
    protected IPDom netList[];
    private static Net instance = null;
    public Net(){
        netList = new IPDom[5];
        netList[0] = bungie;
        netList[1] = blizzard;
        netList[2] = discord;
        netList[3] = mercadolibre;
        netList[4] = playstation;
    }
    IPDom<String, String> bungie = new IPDom<String, String>("www.bungie.net", "144.144.1.1");
    IPDom<String, String> blizzard = new IPDom<>("www.blizzard.net", "126.156.2.4");
    IPDom<String, String> discord = new IPDom<>("www.discord.net", "176.156.3.3");
    IPDom<String, String> mercadolibre = new IPDom<>("www.mercadolibre.net", "123.123.1.2");
    IPDom<String, String> playstation = new IPDom<>("www.playstation.net", "178.185.6.3");
    public IPDom searchDomain(String dominio) throws IPNotFoundException {
        for(int i=0; i<netList.length; i++){
            if(netList[i].getDominio().equals(dominio)){
                //System.out.println("Net");
                return netList[i];
            }
        }
        throw new IPNotFoundException(dominio);
    }
    public static Net getInstance(){
        if(instance == null){
            return new Net();
        }
        else
            return instance;
    }
}