package Actividades.A9_2_DNS;
/**
 * DNS
 */
public class DNS {
    Com com;
    Net net;
    Gob gob;
    Org org;
    public DNS(){
        com = com.getInstance();
        net = net.getInstance();
        gob = gob.getInstance();
        org = org.getInstance();
    }
    public IPDom search(String dominio) throws IPNotFoundException {
        String[] domainEnd = dominio.split("\\.");
        String end = domainEnd[domainEnd.length-1];
        if(end.equals("com")){
            return com.searchDomain(dominio);
        } else if(end.equals("net")){
            //System.out.println("Net");
            return net.searchDomain(dominio);
        } else if(end.equals("gob")){
            //System.out.println("Gob");
            return gob.searchDomain(dominio);
        } else if(end.equals("org")){
            return org.searchDomain(dominio);
        } else 
            return null;
    }
}