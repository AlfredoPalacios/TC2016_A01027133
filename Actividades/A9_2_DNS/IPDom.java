package Actividades.A9_2_DNS;
/**
 * IPDom
 */
public class IPDom <Dominio, IP> {
    protected IP ip;
    protected Dominio dominio;
    public IPDom(Dominio dominio, IP ip){
        this.ip = ip;
        this.dominio = dominio;
    }
    public IP getIp(){
        return ip;
    }
    public Dominio getDominio(){
        return dominio;
    }
    public String toString(){
        return ""+dominio+", "+ip+"";
    }
}