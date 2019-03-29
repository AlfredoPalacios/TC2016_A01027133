package Actividades.A9_2_DNS;
import Actividades.A9_2_DNS.IPDom;
/**
 * Com
 */
public class Com {
    protected IPDom[] comList;
    private static Com instance = null;
    public Com(){
        comList = new IPDom[5];
        comList[0] = google;
        comList[1] = facebook;
        comList[2] = instagram;
        comList[3] = amazon;
        comList[4] = ebay;
    }
    IPDom<String, String> google = new IPDom<String, String>("www.google.com", "192.184.2.1");
    IPDom<String, String> facebook = new IPDom<>("www.facebook.com", "186.176.5.1");
    IPDom<String, String> instagram = new IPDom<>("www.instagram.com", "183.135.2.1");
    IPDom<String, String> amazon = new IPDom<>("www.amazon.com", "187.185.1.0");
    IPDom<String, String> ebay = new IPDom<>("www.ebay.com", "193.178.0.1");
    public IPDom searchDomain(String dominio) throws IPNotFoundException {
        for(int i=0; i<comList.length; i++){
            if(comList[i].getDominio().equals(dominio)){
                return comList[i];
            }
        }
        throw new IPNotFoundException(dominio);
    }
    public static Com getInstance(){
        if(instance == null){
            return new Com();
        }
        else
            return instance;
    }
}