package Actividades.A9_2_DNS;
import java.util.Scanner;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        DNS dns = new DNS();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the page you want to find:");
        String dominio = kb.next();
        try {
            IPDom responseIP = dns.search(dominio);
            System.out.println(responseIP.getIp());
        } catch (IPNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}